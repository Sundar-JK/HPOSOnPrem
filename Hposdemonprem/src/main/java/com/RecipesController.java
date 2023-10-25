package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.Recipes;



@RestController
public class RecipesController {

	@GetMapping("/recipes")
	public static List<Recipes> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Recipes.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<Recipes>userList = session.createQuery("FROM Recipes", Recipes.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return userList;
	}
}
