package Com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hposonprem {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Users.class);
		System.out.println("configuration setup success");		
		SessionFactory sessionFactory=cfg.buildSessionFactory();		
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Users u1 = new Users (22,"dwtc002","dwtc002@apntbs.com","Cashier","11","13");
		session.save(u1);
		transaction.commit();
		
		System.out.println("saved ");
	}

}
