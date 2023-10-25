package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.Usertablestatusess;


@RestController
public class UsertableStatusController {

	@GetMapping("/usertablestatuses")
	public static List<Usertablestatusess> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Usertablestatusess.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<Usertablestatusess>UsertablestatusessList = session.createQuery("FROM Usertablestatusess", Usertablestatusess.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return UsertablestatusessList;
	}
}
