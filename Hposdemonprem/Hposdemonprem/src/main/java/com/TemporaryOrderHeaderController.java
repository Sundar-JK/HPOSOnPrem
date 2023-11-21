package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import pojo.TempTrnOrdHeaders;

@RestController
public class TemporaryOrderHeaderController {

	@Autowired
    private SessionFactory sessionFactory; 
	
	@RequestMapping(path = "/TempOrd_Headerss", method = RequestMethod.POST)
	public List<TempTrnOrdHeaders> createHeader(@RequestBody List<TempTrnOrdHeaders> tempTrnOrdHeaders){
		 System.out.println("data coming");
	        Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        cfg.addAnnotatedClass(TempTrnOrdHeaders.class);
	        
	        SessionFactory sessionFactory = cfg.buildSessionFactory();

	        Session session = sessionFactory.openSession();
	        Transaction transaction = session.beginTransaction();
	        try {
	        	for (TempTrnOrdHeaders header : tempTrnOrdHeaders) {
	                session.saveOrUpdate(header);
	            }
//	        	session.save(tempTrnOrdHeaders);
	        	transaction.commit();
	        	return tempTrnOrdHeaders;
	        }catch(Exception e) {
	        	transaction.rollback();
	        	 throw new RuntimeException("Failed to create TempTrnOrdHeaders: " + e.getMessage());
	        }finally {
	        	session.close();
	        }
	}
	
}
