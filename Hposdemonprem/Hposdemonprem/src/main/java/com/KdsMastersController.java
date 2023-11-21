package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.KdsMasterss;



@RestController
public class KdsMastersController {

	@GetMapping("/kdsmasters")
	public static List<KdsMasterss> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(KdsMasterss.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<KdsMasterss>ItemPricesList = session.createQuery("FROM KdsMasterss", KdsMasterss.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return ItemPricesList;
	}
}
