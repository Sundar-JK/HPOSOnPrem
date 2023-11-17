package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pojo.GetAllHospitalityTypess;
import pojo.ReasonMasterss;
import pojo.userss;

@RestController
public class ReasonMastersController {

	@GetMapping("/reason_masters")
	public static List<ReasonMasterss> getUser1() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(ReasonMasterss.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<ReasonMasterss>ReasonMasterssList = session.createQuery("FROM ReasonMasterss", ReasonMasterss.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return ReasonMasterssList;
	}
	
	@RequestMapping(path = "/reason_masters/{reasontype}", method = RequestMethod.GET)
	public static List<ReasonMasterss> getUser(@PathVariable String reasontype) {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(ReasonMasterss.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		String hql = "FROM ReasonMasterss WHERE reason_type = :reasontype";
		 List<ReasonMasterss> ReasonMasterssList = session.createQuery(hql, ReasonMasterss.class)
	                .setParameter("reasontype", reasontype)
	                .list();
				
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return ReasonMasterssList;
	}
	
	
}
