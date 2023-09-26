package operations;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.getAllHospitalityTypess;

import pojo.storeconfigurationss;
import pojo.users;
public class getAllHospitalityTypesfetch {
	public static void main(String[] args) {
		
		
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(getAllHospitalityTypess.class);
		System.out.println("configuration done");		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("Session factory done");
		Transaction transaction=session.beginTransaction();
		List<getAllHospitalityTypess> hospitality = session.createQuery("FROM getAllHospitalityTypess").list();
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     for (getAllHospitalityTypess hospitalitytypes : hospitality) {
	         System.out.println(hospitalitytypes);
	     }
	}
}
