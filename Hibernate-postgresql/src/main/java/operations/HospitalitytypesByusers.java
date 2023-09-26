package operations;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.getAllHospitalityTypess;
import pojo.sectionss;
import pojo.users;

public class HospitalitytypesByusers {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        cfg.addAnnotatedClass(getAllHospitalityTypess.class);
	        cfg.addAnnotatedClass(users.class);
	        System.out.println("Configuration Done");

	        SessionFactory sessionFactory = cfg.buildSessionFactory();
	        Session session = sessionFactory.openSession();

	        System.out.println("sessionFactory done");

	        Transaction transaction = session.beginTransaction();
	        try {
	            System.out.println("Enter BranchId");
	            String no=sc.next();
//	            int Id =Integer.parseInt(no);

	            String hqlQuery = "FROM users where branch_id = :bId";
	            List<users> userResults = session.createQuery(hqlQuery)
	                    .setParameter("bId", no)
	                    .list();
	            if (userResults!=null) {
	            	users user = userResults.get(0);
	               String S_Hsptype=user.getBranch_id();
	                
	               String newQuery="FROM getAllHospitalityTypess where store_code= :S_Hsptype";
	              List<getAllHospitalityTypess> hsptytyp= (List<getAllHospitalityTypess>) session.createQuery(newQuery)
	            		   .setParameter("S_Hsptype", String.valueOf(S_Hsptype))
	            		   .list();
	               if(hsptytyp!=null) {
	            	   
	               }
	            		   
	            } else {
	              
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
