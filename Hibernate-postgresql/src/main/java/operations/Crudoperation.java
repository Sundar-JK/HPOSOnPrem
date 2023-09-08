package operations;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.kds_masters;
import pojo.storeconfigurationss;
import pojo.users;

public class Crudoperation {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(storeconfigurationss.class);
	
	System.out.println("Configuration Done");
	
	
	SessionFactory sessionFactory=cfg.buildSessionFactory();
	Session session=sessionFactory.openSession();
//	session.saveOrUpdate(k1);
	System.out.println("sessionFactory done");
	
	Transaction transaction=session.beginTransaction();
	 System.out.println("Enter Username");
	 String no = sc.next();
	  String hqlQuery = "FROM storeconfigurationss WHERE no = :no";
	  storeconfigurationss storeconfigurations = (storeconfigurationss) session.createQuery(hqlQuery)
              .setParameter("no", no)
              .uniqueResult();
	  System.out.println(storeconfigurations);
	  
//	users user=session.get(users.class, 18);
//	System.out.println(user);

//	kds_masters kdsmasters=session.get(kds_masters.class, 10);
//	System.out.println(kdsmasters);
	
//	List<kds_masters> kdsmasters=session.createQuery("FROM kds_masters").list();
//	for(kds_masters kdsmasterss : kdsmasters) {
//		System.out.println(kdsmasterss);
//	}
}
}
