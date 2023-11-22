package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.CostingMethods;


@RestController
public class CostingMethodsController {

	@GetMapping("/costingmethods")
	public static List<CostingMethods> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(CostingMethods.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<CostingMethods>CostingMethodsList = session.createQuery("FROM CostingMethods", CostingMethods.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return CostingMethodsList;
	}
}
