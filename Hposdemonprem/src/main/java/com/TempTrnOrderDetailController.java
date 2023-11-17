package com;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pojo.TableSetups;
import pojo.TempTrnHeaders;
import pojo.TempTrnOrdDetails;
import pojo.TempTrnOrdHeaders;
import pojo.TempTrnOrdHeaders;



@RestController
public class TempTrnOrderDetailController {

	@Autowired
    private SessionFactory sessionFactory; 
	
	@RequestMapping(path = "/TempOrd_Details", method = RequestMethod.POST)
	public ResponseEntity<?> createorderDetail(@RequestBody List<TempTrnOrdDetails> tempTrnOrdDetails) {
		
		 System.out.println("data coming");
	        Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        cfg.addAnnotatedClass(TempTrnOrdDetails.class);
	        cfg.addAnnotatedClass(TempTrnOrdHeaders.class);
	        cfg.addAnnotatedClass(TableSetups.class);
	        SessionFactory sessionFactory = cfg.buildSessionFactory();
	        Session session = sessionFactory.openSession();
	        Transaction transaction = session.beginTransaction();

	            try {
	                for (TempTrnOrdDetails tempTrnOrdDetailss : tempTrnOrdDetails) {
	                    String post_transtnno = tempTrnOrdDetailss.getTransaction_no();
	                    String post_lineno = tempTrnOrdDetailss.getLine_no();

	                    TempTrnOrdHeaders existingRecord = getExistRecord(post_transtnno, post_lineno, session);

	                    if (existingRecord != null && existingRecord.getTransaction_no().equals(post_transtnno)
	                            && existingRecord.getLine_no().equals(post_lineno)) {
	                    	session.save(tempTrnOrdDetailss);

	                    } else {
	                        Map<String, String> errorResponse = new HashMap<>();
	                        errorResponse.put("message", "No Header found");

	                        transaction.rollback();
	                        return ResponseEntity.status(HttpStatus.NOT_FOUND)
	                                .body(errorResponse);
	                    }
	                }

	                transaction.commit();
	                return ResponseEntity.ok(tempTrnOrdDetails);

	            } catch (Exception e) {
	                transaction.rollback();
	                throw new RuntimeException("Failed to create tempTrnOrdDetails: " + e.getMessage());
	            }
	        }
	        	
	
	private TempTrnOrdHeaders getExistRecord(String trnasctn_no, String line_no, Session session) {
		
	    String hql = "FROM TempTrnOrdHeaders WHERE transaction_no = :TransNo AND line_no = :LineNo";
	        List<TempTrnOrdHeaders> results = session.createQuery(hql)
	                .setParameter("TransNo", trnasctn_no)
	                .setParameter("LineNo", line_no)
	                .getResultList();
	        
	        System.out.println(results);
	        
	        return results.stream()
	                .findFirst()
	                .orElse(null);
	   
	}	

}
