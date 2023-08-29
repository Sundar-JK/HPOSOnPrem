package com.get;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.google.gson.Gson;

import pojo.customerss;

public class customer {

	public static void main(String[] args) {
	    String preurl = "http://d365hposvmv1.uaenorth.cloudapp.azure.com:4003/HPOSServerUAT/public/api/";        
        String fullUrl = preurl + API.customers ;
        String info = executeGet(fullUrl);
        System.out.println(info);
        
        Gson gson = new Gson();
        customerss[] customerssArray = gson.fromJson(info, customerss[].class);
        System.out.println("done1");
        
    	Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(customerss.class);
		cfg.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
		System.out.println("done2");
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("done3");
		try {
			Transaction transaction=session.beginTransaction();
			System.out.println("done4");
			for (customerss spojo :customerssArray) {
	               
				customerss entity = new customerss();
                System.out.println("done5");
                entity.setId(spojo.getId());
                entity.setCreated_at(spojo.getCreated_at());
                entity.setUpdated_at(spojo.getUpdated_at());
                entity.setCustomer_id(spojo.getCustomer_id());
                entity.setCompany_code(spojo.getCompany_code());
                entity.setNo(spojo.getNo());
                entity.setFirst_name(spojo.getFirst_name());
                entity.setLast_name(spojo.getLast_name());
                entity.setSalutation(spojo.getSalutation());
                entity.setNationality(spojo.getNationality());
                entity.setCountry_code(spojo.getCountry_code());
                entity.setCredit_customer(spojo.getCredit_customer());
                entity.setVat_registraion_no(spojo.getVat_registraion_no());
                entity.setMobile_no(spojo.getMobile_no());
                entity.setAlt_mobile_no(spojo.getAlt_mobile_no());
                entity.setEmail(spojo.getEmail());
                entity.setStatus(spojo.getStatus());
                entity.setCreated_by(spojo.getCreated_by());
                entity.setCreated_date(spojo.getCreated_date());
                entity.setUpdated_by(spojo.getUpdated_by());
                entity.setUpdated_date(spojo.getUpdated_date());
               
  
                // Save the entity to the database
                session.save(entity);
            }
			 transaction.commit();
	            System.out.println("Saved");
		}catch(Exception e){
			  e.printStackTrace();
		}finally {
			 session.close();
	            sessionFactory.close();
		}  
	}
	
	public static String executeGet(String targetURL) {
        HttpURLConnection connection = null;  

        try {
            // Create connection
            URL url = new URL(targetURL);	
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setRequestProperty("Authorization","2655|b9XXT5u06JOJuSSzvlDZ29VQNSIIxkvKDzGyBqRc");
            connection.setRequestProperty("Iadcasdoc", "12");
            connection.setRequestProperty("Oioizxeds", "18");            
            connection.setUseCaches(false);
            // Get Response
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            rd.close();
            
            
            return response.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
