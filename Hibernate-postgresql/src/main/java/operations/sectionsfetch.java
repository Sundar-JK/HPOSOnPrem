package operations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.sectionss;

public class sectionsfetch {

public static void main(String[] args) {
		
		
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(sectionss.class);
		System.out.println("configuration done");
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("Session factory done");
		Transaction transaction=session.beginTransaction();
		List<sectionss> sections = session.createQuery("FROM sectionss").list();


		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     for (sectionss sectionsdata : sections) {
	         System.out.println(sectionsdata);
	     }
	}
}
