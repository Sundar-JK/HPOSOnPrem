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

import pojo.itemmodifier_detail;

public class itemmodifierdetails {

	
	public static void main(String[] args) {
	    String preurl = "http://d365hposvmv1.uaenorth.cloudapp.azure.com:4003/HPOSServerUAT/public/api/";        
        String fullUrl = preurl + API.item_modifier_detail ;
        String info = executeGet(fullUrl);
        System.out.println(info);
        
        Gson gson = new Gson();
        itemmodifier_detail[] itemmodifier_detailArray = gson.fromJson(info, itemmodifier_detail[].class);
        System.out.println("done1");
        
    	Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(itemmodifier_detail.class);
		cfg.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
		System.out.println("done2");
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("done3");
		try {
			Transaction transaction=session.beginTransaction();
			System.out.println("done4");
			for (itemmodifier_detail spojo :itemmodifier_detailArray) {
	               
				itemmodifier_detail entity = new itemmodifier_detail();
                System.out.println("done5");
                entity.setId(spojo.getId());
                entity.setCreated_at(spojo.getCreated_at());
                entity.setUpdated_at(spojo.getUpdated_at());
                entity.setCode(spojo.getCode());
                entity.setSub_code(spojo.getSub_code());
                entity.setItem_no(spojo.getItem_no());
                entity.setDescription(spojo.getDescription());
                entity.setDescription_2(spojo.getDescription_2());
                entity.setQty_per_uom(spojo.getQty_per_uom());
                entity.setMax_selection(spojo.getMax_selection());
                entity.setMin_selection(spojo.getMin_selection());
                entity.setPrice_type(spojo.getPrice_type());
                entity.setPrice_handling(spojo.getPrice_handling());
                entity.setUsage_category(spojo.getUsage_category());
                entity.setUom(spojo.getUom());
                entity.setPriority(spojo.getPriority());
              
  
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
