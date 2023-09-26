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

import pojo.tableconfigurators;

public class tableconfiguratorsget {

	public void fetchtableconfigurator() {
	    String preurl = "http://d365hposvmv1.uaenorth.cloudapp.azure.com:4003/HPOSServerUAT/public/api/";        
        String fullUrl = preurl + API.table_configurators ;
        String info = executeGet(fullUrl);
        System.out.println(info);
        
        Gson gson = new Gson();
        tableconfigurators[] tableconfiguratorsArray = gson.fromJson(info, tableconfigurators[].class);
        System.out.println("done1");
        
    	Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(tableconfigurators.class);
		cfg.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
		System.out.println("done2");
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("done3");
		try {
			Transaction transaction=session.beginTransaction();
			System.out.println("done4");
			for (tableconfigurators spojo :tableconfiguratorsArray) {
	               
				tableconfigurators entity = new tableconfigurators();
                System.out.println("done5");
                entity.setId(spojo.getId());
                entity.setCreated_at(spojo.getCreated_at());
                entity.setUpdated_at(spojo.getUpdated_at());
                entity.setEnabled(spojo.getEnabled());
                entity.setField_no(spojo.getField_no());
                entity.setField_name(spojo.getField_name());
                entity.setCaption(spojo.getCaption());
                entity.setData_type(spojo.getData_type());
                entity.setLength(spojo.getLength());
                entity.setDescription(spojo.getDescription());
                entity.setField_class(spojo.getField_class());
                entity.setOption_string(spojo.getOption_string());
                entity.setForm_id(spojo.getForm_id());
                entity.setPage_id(spojo.getPage_id());
                entity.setStore_id(spojo.getStore_id());
                entity.setUser_id(spojo.getUser_id());
                entity.setUi_columns(spojo.getUi_columns());
                entity.setPriority(spojo.getPriority());
                entity.setGroup_id(spojo.getGroup_id());
                entity.setGroup_label(spojo.getGroup_label());
                entity.setMandatory(spojo.getMandatory());
                entity.setOption_type(spojo.getOption_type());
                entity.setOption_url(spojo.getOption_url());
                entity.setOption_key(spojo.getOption_key());
                entity.setOption_label(spojo.getOption_label());
                entity.setForm_enabled(spojo.getForm_enabled());
                
                
                
                
                entity.setStore_id(spojo.getStore_id());
                
  
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
