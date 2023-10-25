package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.Vatmasters;
import pojo.userss;

@RestController
public class VatmastersController {

	@GetMapping("/vatmasters")
	public static List<Vatmasters> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Vatmasters.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<Vatmasters>VatmastersList = session.createQuery("FROM Vatmasters", Vatmasters.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return VatmastersList;
	}
}
