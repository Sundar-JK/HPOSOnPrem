package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.settingss;
import pojo.userss;

@RestController
public class SeetingsController {
	@GetMapping("/settings")
	public static List<settingss> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(settingss.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<settingss>settingssList = session.createQuery("FROM settingss", settingss.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return settingssList;
	}
}
