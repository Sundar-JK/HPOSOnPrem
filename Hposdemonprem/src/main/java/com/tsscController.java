package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.tsscPojo;


@RestController
public class tsscController {

	@GetMapping("/tssc")
	public static List<tsscPojo> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(tsscPojo.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<tsscPojo>tsscPojoList = session.createQuery("FROM tsscPojo", tsscPojo.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return tsscPojoList;
	}
}
