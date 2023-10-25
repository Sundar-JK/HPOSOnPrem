package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.KdsUserLinkss;



@RestController
public class KdsUserlinksController {

	@GetMapping("/kdsuserlinks")
	public static List<KdsUserLinkss> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(KdsUserLinkss.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<KdsUserLinkss>ItemPricesList = session.createQuery("FROM KdsUserLinkss", KdsUserLinkss.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return ItemPricesList;
	}
}
