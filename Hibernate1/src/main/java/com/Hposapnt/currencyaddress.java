package com.Hposapnt;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.customer_addressess;

public class currencyaddress {

	public static void main(String[] args) {
		
		
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(customer_addressess.class);
		System.out.println("configuration done");
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("Session factory done");
		Transaction transaction=session.beginTransaction();
		List<customer_addressess> custmeraddr = session.createQuery("FROM customer_addressess").list();	
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     for (customer_addressess customerAddress : custmeraddr) {
	         System.out.println(customerAddress);
	     }
	}
}
