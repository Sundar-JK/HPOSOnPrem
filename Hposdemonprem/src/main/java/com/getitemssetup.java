package com;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.MenuItems;
import pojo.TempTrnHeaders;


public class getitemssetup {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    Configuration cfg = new Configuration();
    cfg.configure("hibernate.cfg.xml");
    cfg.addAnnotatedClass(MenuItems.class);
    SessionFactory sessionFactory = cfg.buildSessionFactory();
    Session session = sessionFactory.openSession();
    System.out.println("sessionFactory done");
    Transaction transaction = session.beginTransaction();
    try {
    	System.out.println("Enter Id");
    	String no = sc.next();
    	
    	String hql="FROM MenuItems where id = :Mid";
    	List<MenuItems> menuResults = session.createQuery(hql)
                .setParameter("Mid", no)
                .list();
    	System.out.println(menuResults);
    	if(menuResults!=null) {
    		
    	}
    	
    }catch(Exception e) {
    	
    }
}
}
