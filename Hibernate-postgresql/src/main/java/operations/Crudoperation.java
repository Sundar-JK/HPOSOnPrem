package operations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.kds_masters;

public class Crudoperation {
public static void main(String[] args) {
	
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(kds_masters.class);
	
	System.out.println("Configuration Done");
	
	SessionFactory sessionFactory=cfg.buildSessionFactory();
	Session session=sessionFactory.openSession();
	System.out.println("sessionFactory done");
	
	Transaction transaction=session.beginTransaction();
	
//	kds_masters kdsmasters=session.get(kds_masters.class, 10);
//	System.out.println(kdsmasters);
	
	List<kds_masters> kdsmasters=session.createQuery("FROM kds_masters").list();
	for(kds_masters kdsmasterss : kdsmasters) {
		System.out.println(kdsmasterss);
	}
}
}
