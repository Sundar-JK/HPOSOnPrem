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

import pojo.ErpItemMasterss;



public class ErpItemMasters {

	public static void main(String[] args)  {
	    String preurl = "http://d365hposvmv1.uaenorth.cloudapp.azure.com:4003/HPOSServerUAT/public/api/";        
        String fullUrl = preurl + API.erp_item_master ;
        String info = executeGet(fullUrl);
        System.out.println(info);
        
        Gson gson = new Gson();
        ErpItemMasterss[] erp_itemmasterArray = gson.fromJson(info, ErpItemMasterss[].class);
        System.out.println("done1");
        
    	Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(ErpItemMasterss.class);
		cfg.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
		System.out.println("done2");
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("done3");
		try {
			Transaction transaction=session.beginTransaction();
			System.out.println("done4");
			for (ErpItemMasterss spojo :erp_itemmasterArray) {
	               
				ErpItemMasterss entity = new ErpItemMasterss();
                System.out.println("done5");
                entity.setId(spojo.getId());
                entity.setCreated_at(spojo.getCreated_at());
                entity.setUpdated_at(spojo.getUpdated_at());
                entity.setArabic_description(spojo.getArabic_description());
                entity.setBrand_name(spojo.getBrand_name());
                entity.setBand_code(spojo.getBand_code());
                entity.setCategory_name(spojo.getCategory_name());
                entity.setCombo_menu(spojo.getCombo_menu());
                entity.setCompany_code(spojo.getCompany_code());
                entity.setCreation_date_time(spojo.getCreation_date_time());
                entity.setInvent_price(spojo.getInvent_price());
                entity.setInvent_unit(spojo.getInvent_unit());
                entity.setItem_code(spojo.getItem_code());
                entity.setItem_description(spojo.getItem_description());
                entity.setItem_group(spojo.getItem_group());
                entity.setItem_model_group(spojo.getItem_model_group());
                entity.setItem_name(spojo.getItem_name());
                entity.setModified_date_time(spojo.getModified_date_time());
                entity.setPurch_price(spojo.getPurch_price());
                entity.setPurch_unit(spojo.getPurch_unit());
                entity.setSales_price(spojo.getSales_price());
                entity.setSales_unit(spojo.getSales_unit());
                entity.setSction_name(spojo.getSction_name());
                entity.setSerch_name(spojo.getSerch_name());
                entity.setShelf_life(spojo.getShelf_life());
                entity.setVendor_no(spojo.getVendor_no());
                
                
                
  
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
