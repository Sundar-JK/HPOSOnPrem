package operations;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.TempTrnHeader;
import pojo.storeconfigurationss;
import pojo.temptrnordhdrss;

public class Hposfetchorders {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
		    cfg.addAnnotatedClass(TempTrnHeader.class);
		    cfg.addAnnotatedClass(temptrnordhdrss.class);
		    System.out.println("congiguration done");
		
			SessionFactory sessionFactory=cfg.buildSessionFactory();
			Session session=sessionFactory.openSession();
			System.out.println("sessionFactory done");
			
			Transaction transaction = session.beginTransaction();
			List<temptrnordhdrss> tempHeaders = session.createQuery("FROM temptrnordhdrss").list();
			 session.close();
		     sessionFactory.close();
		     for (temptrnordhdrss temptrn : tempHeaders) {
		         System.out.println(temptrn);
		     }
			
	}
}
