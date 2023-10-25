package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.Addonss;
import pojo.userss;

@RestController
public class AddonController {

	@GetMapping("/addons")
	public static List<Addonss> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Addonss.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<Addonss>AddonssList = session.createQuery("FROM Addonss", Addonss.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return AddonssList;
	
}
}