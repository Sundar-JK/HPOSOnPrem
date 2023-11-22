package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.StoreConfigurationss;

@RestController
public class StoreConfigurationController {

	@GetMapping("/storeconfiguration")
	public static List<StoreConfigurationss> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(StoreConfigurationss.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<StoreConfigurationss>userList = session.createQuery("FROM StoreConfigurationss", StoreConfigurationss.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return userList;
	}
}
