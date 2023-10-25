
package com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import pojo.Branch;
import pojo.StoreConfigurationss;
import pojo.UsersLogin;
import pojo.userss;

@RestController
public class LoginController {
    
    @RequestMapping(path = "/login/{userName}", method = RequestMethod.GET)
    public UsersLogin getUser(@PathVariable String userName) {
        System.out.println(userName);
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(userss.class);
        cfg.addAnnotatedClass(StoreConfigurationss.class);
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        String hqlQuery = "FROM userss WHERE name = :userName";
        
        userss user = (userss) session.createQuery(hqlQuery)
                .setParameter("userName", userName)
                .uniqueResult();
        UsersLogin loginResponse = new UsersLogin(); 
      

        if (user != null) {
            System.out.println("User found: " + user);
            String branchId = user.getBranch_id();
            
            String newTableQuery = "FROM StoreConfigurationss WHERE id = :branchId";
            List<StoreConfigurationss> resultList = session.createQuery(newTableQuery)
                    .setParameter("branchId", branchId)
                    .getResultList();
            
            List<Branch> branchInfoList = new ArrayList<Branch>(); // Specify the generic type

            for (StoreConfigurationss data : resultList) {
                Branch branchInfo = new Branch();
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
            }
           
            loginResponse.setUsers(user);
            loginResponse.setBranch(branchInfoList);

            System.out.println("Login Response: " + new GsonBuilder().setPrettyPrinting().create().toJson(loginResponse));
        } else {
            System.out.println("User not found with the provided name.");
        }

        transaction.commit();
        session.close();
        sessionFactory.close();
        return loginResponse;
    }
}
