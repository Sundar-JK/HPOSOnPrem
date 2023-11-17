package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.DiscountTypes;


@RestController
public class DiscountController {

	@GetMapping("/discounttypes")
	public static List<DiscountTypes> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(DiscountTypes.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<DiscountTypes>DiscountTypesList = session.createQuery("FROM DiscountTypes", DiscountTypes.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return DiscountTypesList;
	}
}
