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

//import pojo.TempTableHeader;
import pojo.TempTrnHeader;

public class temptrnget {

	
	public void fetchtemptrn() {
	    String preurl = "http://d365hposvmv1.uaenorth.cloudapp.azure.com:4003/HPOSServerUAT/public/api/";        
        String fullUrl = preurl + API.temptableheader ;
        String info = executeGet(fullUrl);
        System.out.println(info);
        
        Gson gson = new Gson();
        TempTrnHeader[] TempTableHeaderArray = gson.fromJson(info, TempTrnHeader[].class);
        System.out.println("done1");
        
    	Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(TempTrnHeader.class);
		cfg.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
		System.out.println("done2");
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("done3");
		try {
			Transaction transaction=session.beginTransaction();
			System.out.println("done4");
			for (TempTrnHeader spojo :TempTableHeaderArray) {
	               
				TempTrnHeader entity = new TempTrnHeader();
                System.out.println("done5");
                entity.setId(spojo.getId());
                entity.setCreated_at(spojo.getCreated_at());
                entity.setUpdated_at(spojo.getUpdated_at());
                entity.setTransaction_no(spojo.getTransaction_no());
                entity.setStore_no(spojo.getStore_no());
                entity.setPos_terminal_no(spojo.getPos_terminal_no());
                entity.setStaff_id(spojo.getStaff_id());
                entity.setTransaction_date(spojo.getTransaction_date());
                entity.setOriginal_date(spojo.getOriginal_date());
                entity.setTransaction_time(spojo.getTransaction_time());
                entity.setCustomer_no(spojo.getCustomer_no());
                entity.setNet_amount(spojo.getNet_amount());
                entity.setGross_amount(spojo.getGross_amount());
                entity.setPayment(spojo.getPayment());
                entity.setDiscounts(spojo.getDiscounts());
                entity.setTotal_quantity(spojo.getTotal_quantity());
                entity.setEntry_status(spojo.getEntry_status());
                entity.setNo_of_item_lines(spojo.getNo_of_item_lines());
                entity.setNo_of_payment_lines(spojo.getNo_of_payment_lines());
                entity.setTable_no(spojo.getTable_no());
                entity.setTable_capacity(spojo.getTable_capacity());
                entity.setNo_of_covers(spojo.getNo_of_covers());
                entity.setActive_table_no(spojo.getActive_table_no());
                entity.setTable_group(spojo.getTable_group());
                entity.setKitchen_status(spojo.getKitchen_status());
                entity.setOrder_no(spojo.getOrder_no());
                entity.setOrder_current_status(spojo.getOrder_current_status());
                entity.setOrder_delivery_id(spojo.getOrder_delivery_id());
                entity.setVat_amount(spojo.getVat_amount());
                entity.setZreport_id(spojo.getZreport_id());
                entity.setVariant_code(spojo.getVariant_code());
  
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
