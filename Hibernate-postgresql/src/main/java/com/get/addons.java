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

import pojo.addonss;

public class addons {

	public  void fetchaddons() {
	    String preurl = "http://d365hposvmv1.uaenorth.cloudapp.azure.com:4003/HPOSServerUAT/public/api/";        
        String fullUrl = preurl + API.addons ;
        String info = executeGet(fullUrl);
        System.out.println(info);
        
        Gson gson = new Gson();
        addonss[] addonssArray = gson.fromJson(info, addonss[].class);
        System.out.println("done1");
        
    	Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(addonss.class);
		cfg.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
		System.out.println("done2");
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("done3");
		try {
			Transaction transaction=session.beginTransaction();
			System.out.println("done4");
			for (addonss spojo :addonssArray) {
	               
				addonss entity = new addonss();
                System.out.println("done5");
                entity.setId(spojo.getId());
                entity.setCreated_at(spojo.getCreated_at());
                entity.setUpdated_at(spojo.getUpdated_at());
                entity.setParent_item_no(spojo.getParent_item_no());
                entity.setLine_no(spojo.getLine_no());
                entity.setType(spojo.getType());
                entity.setNo(spojo.getNo());
                entity.setAssembly_bom(spojo.getAssembly_bom());
                entity.setDescription(spojo.getDescription());
                entity.setunit_of_measure_code(spojo.getunit_of_measure_code());
                entity.setquantity_per(spojo.getquantity_per());
                entity.setbom_description(spojo.getbom_description());
                entity.setResource_usage_type(spojo.getResource_usage_type());
                entity.setBom_recipe_version_code(spojo.getBom_recipe_version_code());
                entity.setBom_component_type(spojo.getBom_component_type());
                entity.setBom_recipe_version_code(spojo.getBom_recipe_version_code());
                entity.setWastage_(spojo.getWastage_());
                entity.setGross_weight(spojo.getGross_weight());
                entity.setNet_weight(spojo.getNet_weight());
                entity.setCost(spojo.getCost());
                entity.setExclude_from_menu_requisition(spojo.getExclude_from_menu_requisition());
                entity.setExcluded_from_portion_weight(spojo.getExcluded_from_portion_weight());
                entity.setUnaff_by_multipl_factor(spojo.getUnaff_by_multipl_factor());
                entity.setItem_no(spojo.getItem_no());
                entity.setQty_per_recipe_noof_portions(spojo.getQty_per_recipe_noof_portions());
                entity.setExclusion(spojo.getExclusion());
                entity.setPrice_on_exclusion(spojo.getPrice_on_exclusion());
                entity.setCategory(spojo.getCategory());
              
  
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


