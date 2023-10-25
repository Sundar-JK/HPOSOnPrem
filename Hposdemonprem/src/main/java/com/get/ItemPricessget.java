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

import pojo.ItemPrices;



public class ItemPricessget {

	public static void main(String[] args) {
		
		 String preurl = "http://d365hposvmv1.uaenorth.cloudapp.azure.com:4003/HPOSServerUAT/public/api/";        
	        String fullUrl = preurl + API.item_prices ;
	        String info = executeGet(fullUrl);
	        System.out.println(info);
	        
	        Gson gson = new Gson();
	        ItemPrices[] itempricessArray = gson.fromJson(info, ItemPrices[].class);
	        System.out.println("done1");
	        
	    	Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(ItemPrices.class);
			cfg.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
			System.out.println("done2");
			
			SessionFactory sessionFactory=cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("done3");
			try {
				Transaction transaction=session.beginTransaction();
				System.out.println("done4");
				for (ItemPrices spojo :itempricessArray) {
		               
					ItemPrices entity = new ItemPrices();
	                System.out.println("done5");
	                entity.setId(spojo.getId());
	                entity.setCreated_at(spojo.getCreated_at());
	                entity.setUpdated_at(spojo.getUpdated_at());
	                entity.setItem_no(spojo.getItem_no());
	                entity.setStore_code(spojo.getStore_code());
	                entity.setUnit_price(spojo.getUnit_price());
	                entity.setUnit_price_incl_vat(spojo.getUnit_price_incl_vat());
	                entity.setStart_date(spojo.getStart_date());
	                entity.setEnd_date(spojo.getEnd_date());
	                entity.setUom(spojo.getUom());
	                entity.setVat_code(spojo.getVat_code());
	                entity.setLocation_code(spojo.getLocation_code());
	                entity.setVariant_code(spojo.getVariant_code());
	                entity.setCurrency_code(spojo.getCurrency_code());
	                entity.setStart_time(spojo.getStart_time());
	                entity.setEnd_time(spojo.getEnd_time());
	                entity.setItem_price(spojo.getItem_price());
	  
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
