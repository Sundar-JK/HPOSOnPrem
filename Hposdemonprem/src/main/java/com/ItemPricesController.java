package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.ItemPrices;


@RestController
public class ItemPricesController {

	@GetMapping("/itemPrices")
	public static List<ItemPrices> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(ItemPrices.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<ItemPrices>ItemPricesList = session.createQuery("FROM ItemPrices", ItemPrices.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return ItemPricesList;
	}
}
