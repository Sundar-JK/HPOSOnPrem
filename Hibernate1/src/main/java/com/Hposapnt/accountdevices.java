package com.Hposapnt;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.account_devicess;

public class accountdevices {

	public static void main(String[] args) {
		
		
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(account_devicess.class);
		System.out.println("configuration done");
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("Session factory done");
		Transaction transaction=session.beginTransaction();
		List<account_devicess> Accountdevice = session.createQuery("FROM account_devicess").list();		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     for (account_devicess Accountdevices : Accountdevice) {
	         System.out.println(Accountdevices);
	     }
	}

		
}
