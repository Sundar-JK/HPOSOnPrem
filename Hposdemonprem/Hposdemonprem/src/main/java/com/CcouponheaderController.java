package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.Couponheaders;

@RestController
public class CcouponheaderController {


	@GetMapping("/Coupon_headers")
	public static List<Couponheaders> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Couponheaders.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<Couponheaders>CouponheadersList = session.createQuery("FROM Couponheaders", Couponheaders.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return CouponheadersList;
	}
}
