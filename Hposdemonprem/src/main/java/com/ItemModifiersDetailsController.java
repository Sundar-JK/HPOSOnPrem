package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.ItemModifiersDetailss;



@RestController
public class ItemModifiersDetailsController {
	@GetMapping("/item_modifier_detail")
	public static List<ItemModifiersDetailss> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(ItemModifiersDetailss.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<ItemModifiersDetailss>ItemModifiersDetailssList = session.createQuery("FROM ItemModifiersDetailss", ItemModifiersDetailss.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return ItemModifiersDetailssList;
	}

}
