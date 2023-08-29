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

import pojo.couponentries;

public class couponentriesget {

	public static void main(String[] args) {
	    String preurl = "http://d365hposvmv1.uaenorth.cloudapp.azure.com:4003/HPOSServerUAT/public/api/";        
        String fullUrl = preurl + API.coupon_entries ;
        String info = executeGet(fullUrl);
        System.out.println(info);
        
        Gson gson = new Gson();
        couponentries[] couponentriesArray = gson.fromJson(info, couponentries[].class);
        System.out.println("done1");
        
    	Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(couponentries.class);
		cfg.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
		System.out.println("done2");
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("done3");
		try {
			Transaction transaction=session.beginTransaction();
			System.out.println("done4");
			for (couponentries spojo :couponentriesArray) {
	               
				couponentries entity = new couponentries();
                System.out.println("done5");
                entity.setId(spojo.getId());
                entity.setCreated_at(spojo.getCreated_at());
                entity.setUpdated_at(spojo.getUpdated_at());
                entity.setStore_no(spojo.getStore_no());
                entity.setPos_terminal_no(spojo.getPos_terminal_no());
                entity.setTransaction_no(spojo.getTransaction_no());
                entity.setCoupon_code(spojo.getCoupon_code());
                entity.setLine_no(spojo.getLine_no());
                entity.setCoupon_reference_no(spojo.getCoupon_reference_no());
                entity.setCoupon_no(spojo.getCoupon_no());
                entity.setBarcode(spojo.getBarcode());
                entity.setIssued_by_store(spojo.getIssued_by_store());
                entity.setIssued_by_pos_terminal(spojo.getIssued_by_pos_terminal());
                entity.setIssue_date(spojo.getIssue_date());
                entity.setIssued_by_user(spojo.getIssued_by_user());
                entity.setReserved_by_pos_terminal_no(spojo.getReserved_by_pos_terminal_no());
                entity.setDate_reserved_on_pos(spojo.getDate_reserved_on_pos());
                entity.setFirst_valid_date(spojo.getFirst_valid_date());
                entity.setLast_valid_date(spojo.getLast_valid_date());
                entity.setStatus(spojo.getStatus());
                entity.setSequence_no(spojo.getSequence_no());
                entity.setClosed_by_store(spojo.getClosed_by_store());
                entity.setClosed_by_terminal(spojo.getClosed_by_terminal());
                entity.setClosed_date(spojo.getClosed_date());
                entity.setClosed_by_user(spojo.getClosed_by_user());
                entity.setClosed_by_entry_no(spojo.getClosed_by_entry_no());
                entity.setDiscount_type(spojo.getDiscount_type());
                entity.setValue(spojo.getValue());
                entity.setValue_type(spojo.getValue_type());
                entity.setG_l_status(spojo.getG_l_status());
                entity.setG_l_amount(spojo.getG_l_amount());
                entity.setCoupon_function(spojo.getCoupon_function());
                entity.setFbp_ledger_entry_no(spojo.getFbp_ledger_entry_no());
                entity.setMember_account_no(spojo.getMember_account_no());
  
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
