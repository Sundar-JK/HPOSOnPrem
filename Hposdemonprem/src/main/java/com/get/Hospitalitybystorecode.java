package com.get;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.GetAllHospitalityTypess;
import pojo.getAllHospitalityTypess;

public class Hospitalitybystorecode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        cfg.addAnnotatedClass(GetAllHospitalityTypess.class);
	        SessionFactory sessionFactory = cfg.buildSessionFactory();
	        Session session = sessionFactory.openSession();
	        Transaction transaction = session.beginTransaction();
	        System.out.println("Enter Storecode");
	   	    String storecode = sc.next();
	   	 String hql = "FROM GetAllHospitalityTypess WHERE store_code = :storecode";
	   	List<GetAllHospitalityTypess> hospitalityTypes = session.createQuery(hql)
	   	        .setParameter("storecode", storecode)
	   	        .list();

	   	for (GetAllHospitalityTypess Hosptyp : hospitalityTypes) {
	   	    System.out.println(Hosptyp);
	   	}
	 
	}
}
