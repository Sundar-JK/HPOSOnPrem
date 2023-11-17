package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.UserTableLink;

@RestController
public class UserTableLinkController {

	@GetMapping("/UTL")
	public static List<UserTableLink> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(UserTableLink.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<UserTableLink>UserTableLinkList = session.createQuery("FROM UserTableLink", UserTableLink.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return UserTableLinkList;
	}
}
