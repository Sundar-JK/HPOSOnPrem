package com.get;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.Menuhierarchiess;



@RestController
public class MenuhierarchiesControllerr {

	@GetMapping("/menuhierarchiess")
	public static List<Menuhierarchiess> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Menuhierarchiess.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<Menuhierarchiess>userList = session.createQuery("FROM Menuhierarchiess", Menuhierarchiess.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return userList;
	}
}
