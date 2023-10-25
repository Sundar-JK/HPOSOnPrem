package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.sectionss;

@RestController
public class SectionsController {

	@GetMapping("/sections")
	public static List<sectionss> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(sectionss.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<sectionss>sectionssList = session.createQuery("FROM sectionss", sectionss.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return sectionssList;
	}
}
