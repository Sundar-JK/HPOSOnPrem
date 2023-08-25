package com.Hposapnt;

import org.hibernate.cfg.Configuration;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import pojo.invoice_header;

public class Hposcrudoperations {
public static void main(String[] args) {
	
	
	Configuration cfg =new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(invoice_header.class);
	System.out.println("configuration done");
	
	SessionFactory sessionFactory=cfg.buildSessionFactory();
	Session session = sessionFactory.openSession();
	System.out.println("Session factory done");
	Transaction transaction=session.beginTransaction();
	List<invoice_header> invoiceHeaders = session.createQuery("FROM invoice_header").list();
//	invoice_header invoiceheader=session.get(invoice_header.class, 1);
	
	transaction.commit();
	 session.close();
     sessionFactory.close();
     for (invoice_header invoiceHeader : invoiceHeaders) {
         System.out.println(invoiceHeader);
     }
}

	
}
