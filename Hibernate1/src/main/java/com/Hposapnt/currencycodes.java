package com.Hposapnt;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.currency_codess;

public class currencycodes {
	public static void main(String[] args) {
		
		
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(currency_codess.class);
		System.out.println("configuration done");
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("Session factory done");
		Transaction transaction=session.beginTransaction();
		List<currency_codess> currencycs = session.createQuery("FROM currency_codess").list();
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     for (currency_codess currencycodes : currencycs) {
	         System.out.println(currencycodes);
	     }
	}
}
