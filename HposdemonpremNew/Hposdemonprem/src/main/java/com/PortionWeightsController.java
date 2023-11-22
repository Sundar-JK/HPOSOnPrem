package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.PortionWeightss;


@RestController
public class PortionWeightsController {

	
	@GetMapping("/portion_weights")
	public static List<PortionWeightss> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(PortionWeightss.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<PortionWeightss>userList = session.createQuery("FROM PortionWeightss", PortionWeightss.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return userList;
	}
}
