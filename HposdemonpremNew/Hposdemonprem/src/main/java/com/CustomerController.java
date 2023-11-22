package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.Customerss;

@RestController
public class CustomerController {

	@GetMapping("/customers")
	public static List<Customerss> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Customerss.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<Customerss>CustomerssList = session.createQuery("FROM Customerss", Customerss.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return CustomerssList;
	}
}
