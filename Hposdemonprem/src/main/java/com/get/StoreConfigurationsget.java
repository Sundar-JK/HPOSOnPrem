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

import pojo.StoreConfigurationss;



public class StoreConfigurationsget {

	public static void main(String[] args) {
		
		  String preurl = "http://d365hposvmv1.uaenorth.cloudapp.azure.com:4003/HPOSServerUAT/public/api/";        
	        String fullUrl = preurl + API.Storeconfig ;
	        String info = executeGet(fullUrl);
//	        System.out.println(info);
	        
	        Gson gson = new Gson();
	        StoreConfigurationss[] storeconfigurationssArray = gson.fromJson(info, StoreConfigurationss[].class);
	        System.out.println("done1");
	        
	    	Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(StoreConfigurationss.class);
			cfg.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
			System.out.println("done2");

			SessionFactory sessionFactory=cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("done3");
			try {
				Transaction transaction=session.beginTransaction();
				System.out.println("done4");
				for (StoreConfigurationss spojo :storeconfigurationssArray) {
		               
					StoreConfigurationss entity = new StoreConfigurationss();
	                System.out.println("done5");
	                entity.setId(spojo.getId());
	                entity.setCreated_at(spojo.getCreated_at());
	                entity.setUpdated_at(spojo.getUpdated_at());
	                entity.setNo(spojo.getNo());
	                entity.setName(spojo.getName());
	                entity.setAddress(spojo.getAddress());
	                entity.setAddress2(spojo.getAddress2());
	                entity.setCity(spojo.getCity());
	                entity.setPostcode(spojo.getPostcode());
	                entity.setStoremanager_id(spojo.getStoremanager_id());
	                entity.setStoremanager_name(spojo.getStoremanager_name());
	                entity.setPhone_no(spojo.getPhone_no());
	                entity.setCountry_code(spojo.getCountry_code());
	                entity.setEmail(spojo.getEmail());
	                entity.setCurrency_code(spojo.getCurrency_code());
	                entity.setProfile_code(spojo.getProfile_code());
	  
	                // Save the entity to the database
	                session.saveOrUpdate(entity);;
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
