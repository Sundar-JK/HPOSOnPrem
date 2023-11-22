package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.ProductGroupMasterss;



@RestController
public class ProductgroupMastersController {
	@GetMapping("/product_group_masters")
	public static List<ProductGroupMasterss> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(ProductGroupMasterss.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<ProductGroupMasterss>ProductGroupMasterssList = session.createQuery("FROM ProductGroupMasterss", ProductGroupMasterss.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return ProductGroupMasterssList;
	}
}
