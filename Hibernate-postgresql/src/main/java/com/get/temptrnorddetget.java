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

import pojo.temptrnorddet;

public class temptrnorddetget {

	public static void main(String[] args) {
	    String preurl = "http://d365hposvmv1.uaenorth.cloudapp.azure.com:4003/HPOSServerUAT/public/api/";        
        String fullUrl = preurl + API.temptrnorddet ;
        String info = executeGet(fullUrl);
        System.out.println(info);
        
        Gson gson = new Gson();
        temptrnorddet[] temptrnorddetArray = gson.fromJson(info, temptrnorddet[].class);
        System.out.println("done1");
        
    	Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(temptrnorddet.class);
		cfg.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
		System.out.println("done2");
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("done3");
		try {
			Transaction transaction=session.beginTransaction();
			System.out.println("done4");
			for (temptrnorddet spojo :temptrnorddetArray) {
	               
				temptrnorddet entity = new temptrnorddet();
                System.out.println("done5");
                entity.setId(spojo.getId());
                entity.setCreated_at(spojo.getCreated_at());
                entity.setUpdated_at(spojo.getUpdated_at());
                entity.setTransaction_no(spojo.getTransaction_no());
                entity.setReceipt_no(spojo.getReceipt_no());
                entity.setLine_no(spojo.getLine_no());
                entity.setProduct_code(spojo.getProduct_code());
                entity.setEntry_status(spojo.getEntry_status());
                entity.setDescription(spojo.getDescription());
                entity.setUom(spojo.getUom());
                entity.setStore_no(spojo.getStore_no());
                entity.setPos_terminal_no(spojo.getPos_terminal_no());
                
                entity.setQuantity(spojo.getQuantity());
                entity.setVat_percent(spojo.getVat_percent());
                entity.setDiscount_percent(spojo.getDiscount_percent());
                entity.setDiscount_amount(spojo.getDiscount_amount());
                entity.setNet_amount(spojo.getNet_amount());
                entity.setVat_amount(spojo.getVat_amount());
                entity.setAmount(spojo.getAmount());
                entity.setAdditional_info_exist(spojo.getAdditional_info_exist());
                entity.setSales_type(spojo.getSales_type());
                entity.setLine_is_excluded(spojo.getLine_is_excluded());
                entity.setAdditional_charge_lines_exist(spojo.getAdditional_charge_lines_exist());
                entity.setSales_staff(spojo.getSales_staff());
                entity.setCoverid(spojo.getCoverid());
                entity.setParent_item_no(spojo.getParent_item_no());
                entity.setParent_order_ref_no(spojo.getParent_order_ref_no());
             
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
