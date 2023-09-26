package operations;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.google.gson.Gson;

import pojo.getAllHospitalityTypess;
import pojo.tabless;
import pojo.users;

public class Tablesfetch {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
	        Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        cfg.addAnnotatedClass(getAllHospitalityTypess.class);
	        cfg.addAnnotatedClass(tabless.class);
	        System.out.println("Configuration Done");
	        SessionFactory sessionFactory = cfg.buildSessionFactory();
	        Session session = sessionFactory.openSession();
	        System.out.println("sessionFactory done");
	        Transaction transaction = session.beginTransaction();
	        try {
	            System.out.println("Enter Storecode");
	            String no=sc.next();
	            String hqlQuery1 = "FROM getAllHospitalityTypess WHERE store_code = :storeCode AND is_active = :isActive";
	            List<getAllHospitalityTypess> activeHospitalityTypes = session.createQuery(hqlQuery1, getAllHospitalityTypess.class)
	                    .setParameter("storeCode", no)
	                    .setParameter("isActive", "1")
	                    .list();

	       if(activeHospitalityTypes!=null) {
	    	   String subquery = "SELECT CAST(id AS string) FROM getAllHospitalityTypess WHERE store_code = :storeCode";
	    	   String hqlQuery2 = "FROM tabless WHERE hospitality_type IN (" + subquery + ")";
	    	   List<tabless> tablesWithHospitalityTypes = session.createQuery(hqlQuery2, tabless.class)
	    	           .setParameter("storeCode", no)
	    	           .list();
	    	   Gson gson = new Gson();
	    	   String jsonResult = gson.toJson(tablesWithHospitalityTypes);

	    	   System.out.println(jsonResult);
	    	
	       }else {
	    	   System.out.println("no data found");
	       }

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            transaction.commit();
	            session.close();
	            sessionFactory.close();
	        }
	
	}
}
