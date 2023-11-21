package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.TableSetups;



@RestController
public class TableSetupsController {

	@GetMapping("/tablesetups")
	public static List<TableSetups> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(TableSetups.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<TableSetups>TableSetupsList = session.createQuery("FROM TableSetups", TableSetups.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return TableSetupsList;
	}
}
