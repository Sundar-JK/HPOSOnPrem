package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(path = "/sections/{storecode}", method = RequestMethod.GET)
	public  List<sectionss> getUser(@PathVariable String storecode) {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(sectionss.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		String hql = "FROM sectionss WHERE store_code = :storecode";
        List<sectionss> sectionssList = session.createQuery(hql, sectionss.class)
                .setParameter("storecode", storecode)
                .list();
	
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return sectionssList;
	}
	
}
