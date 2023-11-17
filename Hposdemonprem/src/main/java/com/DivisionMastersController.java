package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.DivisionMasters;

@RestController
public class DivisionMastersController {

	@GetMapping("/division_masters")
	public static List<DivisionMasters> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(DivisionMasters.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<DivisionMasters>DivisionMastersList = session.createQuery("FROM DivisionMasters", DivisionMasters.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return DivisionMastersList;
	}
}
