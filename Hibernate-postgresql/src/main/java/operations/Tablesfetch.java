package operations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.tabless;

public class Tablesfetch {

	public static void main(String[] args) {
		
		
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(tabless.class);
		System.out.println("configuration done");
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("Session factory done");
		Transaction transaction=session.beginTransaction();
		List<tabless> tabbledata = session.createQuery("FROM tabless").list();


		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     for (tabless tabledata : tabbledata) {
	         System.out.println(tabledata);
	     }
	}
}
