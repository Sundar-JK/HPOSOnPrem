package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.Tabless;

@RestController
public class TablessController {

	@GetMapping("/tabless")
	public static List<Tabless> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Tabless.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<Tabless>TablessList = session.createQuery("FROM Tabless", Tabless.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return TablessList;
	}
}
