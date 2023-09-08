package operations;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.google.gson.Gson;

import pojo.UserLogin;
import pojo.branch;
import pojo.couponentries;
import pojo.storeconfigurationss;
import pojo.users;

public class Hposfetch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(users.class);
        cfg.addAnnotatedClass(storeconfigurationss.class); // Add the entity class here

        System.out.println("Configuration Done");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();

        System.out.println("sessionFactory done");

        Transaction transaction = session.beginTransaction();

        try {
            System.out.println("Enter Username");
            String name = sc.next();

            String hqlQuery = "FROM users WHERE name = :userName";
            users user = (users) session.createQuery(hqlQuery)
                    .setParameter("userName", name)
                    .uniqueResult();

            if (user != null) {
                System.out.println("User found: " + user);

                String branchId = user.getBranch_id(); 
                
                String newTableQuery = "FROM storeconfigurationss WHERE id = :branchId";
                List<storeconfigurationss> resultList = session.createQuery(newTableQuery)
                        .setParameter("branchId", branchId)
                        .getResultList();
                
                List<branch> branchInfoList = new ArrayList();
                Gson gson = new Gson();
                

                for (storeconfigurationss data : resultList) {
                	branch branchInfo = new branch();
                	branchInfo.setId(data.getId());
                	branchInfo.setCreated_at(data.getCreated_at());
                	branchInfo.setUpdated_at(data.getUpdated_at());
                	branchInfo.setNo(data.getNo());
                	branchInfo.setName(data.getName());
                	branchInfo.setAddress(data.getAddress());
                	branchInfo.setAddress2(data.getAddress2());
                	branchInfo.setCity(data.getCity());
                	branchInfo.setPostcode(data.getPostcode());
                	branchInfo.setStoremanager_id(data.getStoremanager_id());
                	branchInfo.setStoremanager_name(data.getStoremanager_name());
                	branchInfo.setPhone_no(data.getPhone_no());
                	branchInfo.setCountry_code(data.getCountry_code());
                	branchInfo.setEmail(data.getEmail());
                	branchInfo.setCurrency_code(data.getCurrency_code());
                	branchInfo.setProfile_code(data.getProfile_code());
                	branchInfoList.add(branchInfo);
                	
//                    System.out.println("Data from storecongigTable: " + data);
//                    System.out.println("Data from branchTable: " + branchInfo);
                	
                	
                }
                
                String branchInfoListJson = gson.toJson(branchInfoList);
//                System.out.println(branchInfoListJson);
                
                UserLogin loginResponse = new UserLogin();
                loginResponse.setUser(user);
                loginResponse.setBranch(branchInfoList);
                
                System.out.println("Login Response: " +  new GsonBuilder().setPrettyPrinting().create().toJson(loginResponse));
            } else {
                System.out.println("User not found with the provided name.");
            }

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}


