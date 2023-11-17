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

import pojo.tablesetupstatusess;



public class TableSetupStatusesget {

	public static void main(String[] args) {
		 String preurl = "http://d365hposvmv1.uaenorth.cloudapp.azure.com:4003/HPOSServerUAT/public/api/";        
	        String fullUrl = preurl + API.tssc ;
	        String info = executeGet(fullUrl);
	        System.out.println(info);
	        
	        Gson gson = new Gson();
	        tablesetupstatusess[] tsscArray = gson.fromJson(info, tablesetupstatusess[].class);
	        System.out.println("done1");
	        
	    	Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(tablesetupstatusess.class);
			cfg.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
			System.out.println("done2");
			
			SessionFactory sessionFactory=cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("done3");
			try {
				Transaction transaction=session.beginTransaction();
				System.out.println("done4");
				for (tablesetupstatusess spojo :tsscArray) {
		               
					tablesetupstatusess entity = new tablesetupstatusess();
	                System.out.println("done5");
	                entity.setId(spojo.getId());
	                entity.setCreated_at(spojo.getCreated_at());
	                entity.setUpdated_at(spojo.getUpdated_at());
	                entity.setStatus(spojo.getStatus());
	                entity.setNotes(spojo.getNotes());
	                entity.setStatus_icon(spojo.getStatus_icon());
	                entity.setTransaction_ref_id(spojo.getTransaction_ref_id());
	                entity.setUser_id(spojo.getUser_id());
	                entity.setPrevious_status(spojo.getPrevious_status());
	                entity.setGuest_count(spojo.getGuest_count());
	  
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
