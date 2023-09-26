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


public class SectionsByHospitality {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(getAllHospitalityTypess.class);
        cfg.addAnnotatedClass(sectionss.class);
        System.out.println("Configuration Done");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();

        System.out.println("sessionFactory done");

        Transaction transaction = session.beginTransaction();
        try {
            System.out.println("Enter Id");
            String no=sc.next();
            int Id =Integer.parseInt(no);

            String hqlQuery = "FROM getAllHospitalityTypess where id = :bId";
            getAllHospitalityTypess Hosptyp = (getAllHospitalityTypess) session.createQuery(hqlQuery)
                    .setParameter("bId", Id)
                    .uniqueResult();

            if (Hosptyp!=null) {
               int S_Hsptype=Hosptyp.getId();
             
               String newQuery="FROM sectionss where hospitality_type= :S_Hsptype";
              List<sectionss> sectn= (List<sectionss>) session.createQuery(newQuery)
            		   .setParameter("S_Hsptype", String.valueOf(S_Hsptype))
            		   .list();
               if(sectn!=null) {
            	   System.out.println(sectn);
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
