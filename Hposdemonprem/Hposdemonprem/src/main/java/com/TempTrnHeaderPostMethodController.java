package com;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import pojo.ItemModifiersHeaders;
import pojo.ReasonMasterss;
import pojo.TableSetups;
import pojo.TempTrnHeaders;

@RestController
public class TempTrnHeaderPostMethodController {

	@Autowired
    private SessionFactory sessionFactory; 

	@RequestMapping(path = "/TempTrn_Headerss", method = RequestMethod.POST)
	public ResponseEntity<?>   createTransactions(@RequestBody TempTrnHeaders tempTrnHeaders) {
     
        System.out.println("data coming");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(TempTrnHeaders.class);
        cfg.addAnnotatedClass(TableSetups.class);
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        try {
           String post_tableno=tempTrnHeaders.getTable_no();
           
             TableSetups existingTableNo = getTableNo(post_tableno,session);
             
             TempTrnHeaders existingRecord = getTransactionByTableNo(post_tableno, session);
     

             if (existingTableNo != null) {
            	    if (existingRecord != null && existingRecord.getEntry_status() == 1) {
            	        LocalDate systemDate = LocalDate.now();
            	        LocalDate transactionDate = existingRecord.getTransaction_date().toLocalDate();
            	        
            	       
            	        if (existingRecord.getEntry_status() == 1 && systemDate.isEqual(transactionDate)) {
            	           
            	            session.update(existingRecord);
            	            TempTrnHeaders updatedRecord = getTransactionByTableNo(post_tableno, session);
            	            transaction.commit();
            	            return ResponseEntity.ok(updatedRecord);
            	        } else if (shouldInsertRecord(existingRecord)) {
            	        
            	            session.save(tempTrnHeaders);
            	            TempTrnHeaders newRecord = getTransactionByTableNo(post_tableno, session);
            	            transaction.commit();
            	            return ResponseEntity.ok(newRecord);
            	        }
            	} 
             }else {
         	    if (existingTableNo == null) {
        	        Map<String, String> errorResponse = new HashMap<>();
        	        errorResponse.put("message", "No Table found");
        	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        	    }
        	}

            transaction.commit();
            return ResponseEntity.ok(tempTrnHeaders);
        } catch (Exception e) {
            transaction.rollback();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Failed to create TempTrnHeaders: " + e.getMessage());
        } finally {
            session.close();
        }
    }

	private TempTrnHeaders getTransactionByTableNo(String tableNo, Session session) {
	    String hql = "FROM TempTrnHeaders WHERE table_no = :tableNo ORDER BY transaction_date DESC";
	    List<TempTrnHeaders> results = session.createQuery(hql,TempTrnHeaders.class)
	            .setParameter("tableNo", String.valueOf(tableNo))
	            .getResultList();

	    return results.stream()
	            .findFirst()
	            .orElse(null);
	}	
	
	private TableSetups getTableNo(String tableNo,Session session) {
		String sql = "FROM TableSetups WHERE id = :tableNo";
		List<TableSetups> results = session.createQuery(sql,TableSetups.class)
	            .setParameter("tableNo", String.valueOf(tableNo))
	            .setMaxResults(1)
	            .getResultList();
		System.out.println(results);
		return results.stream()
	            .findFirst()
	            .orElse (null);
	}
	
	
	private boolean shouldInsertRecord(TempTrnHeaders existingRecord) {
	    if (existingRecord == null) {
	        
	        return true;
	    } else {
	
	        LocalDate systemDate = LocalDate.now();
	        LocalDate transactionDate = existingRecord.getTransaction_date().toLocalDate();

	       
	        return !systemDate.isEqual(transactionDate) || existingRecord.getEntry_status() != 1;
	    }
	}




	private boolean isRecordOnTodayExists(String tableNo, int entryStatus) {
	    TempTrnHeaders todayRecord = getLatestTransactionByTableNo(tableNo);

	    if (todayRecord == null) {
	        return false;
	    }

	    LocalDate systemDate = LocalDate.now();
	    LocalDate transactionDate = todayRecord.getTransaction_date().toLocalDate();
	    return systemDate.isEqual(transactionDate) && todayRecord.getEntry_status() == entryStatus;
	}


	

private TempTrnHeaders getLatestTransactionByTableNo(String tableNo) {
    String hql = "FROM TempTrnHeaders WHERE table_no = :tableNo ORDER BY transaction_date DESC";
    List<TempTrnHeaders> results = session()
            .createQuery(hql, TempTrnHeaders.class)
            .setParameter("tableNo", tableNo)
            .setMaxResults(1)
            .getResultList();

    return results.stream().findFirst().orElse(null);
}
	private Session session() {
        return sessionFactory.getCurrentSession();
    }
	

}		