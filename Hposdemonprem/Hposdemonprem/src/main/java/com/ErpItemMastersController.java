package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.ErpItemMasterss;


@RestController
public class ErpItemMastersController {

	@GetMapping("/erp_item_master")
	public static List<ErpItemMasterss> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(ErpItemMasterss.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<ErpItemMasterss>ErpItemMasterssList = session.createQuery("FROM ErpItemMasterss", ErpItemMasterss.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return ErpItemMasterssList;
	}
}
