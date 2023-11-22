package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.PortionCostHierarchiess;


@RestController
public class PortionCostHierarchiesController {

	@GetMapping("/portion_cost_hierarchies")
	public static List<PortionCostHierarchiess> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(PortionCostHierarchiess.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<PortionCostHierarchiess>userList = session.createQuery("FROM PortionCostHierarchiess", PortionCostHierarchiess.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return userList;
	}
}
