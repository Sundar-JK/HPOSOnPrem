package operations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.usertablestatusess;

public class usertablestatusesfetch {

	public static void main(String[] args) {
		
		
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(usertablestatusess.class);
		System.out.println("configuration done");
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("Session factory done");
		Transaction transaction=session.beginTransaction();
		List<usertablestatusess> usertablestatus = session.createQuery("FROM usertablestatusess").list();


		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     for (usertablestatusess tablestatuses : usertablestatus) {
	         System.out.println(tablestatuses);
	     }
	}
	
}
