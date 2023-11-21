package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.ItemModifiersHeaders;


@RestController
public class ItemModifierHeadersController {

	@GetMapping("/item_modifier_header")
	public static List<ItemModifiersHeaders> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(ItemModifiersHeaders.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<ItemModifiersHeaders>ItemModifiersHeadersList = session.createQuery("FROM ItemModifiersHeaders", ItemModifiersHeaders.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return ItemModifiersHeadersList;
	}
}
