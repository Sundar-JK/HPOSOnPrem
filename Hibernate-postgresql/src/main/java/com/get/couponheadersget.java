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

import pojo.Couponheaders;

public class couponheadersget {

	public static void main(String[] args) {
	    String preurl = "http://d365hposvmv1.uaenorth.cloudapp.azure.com:4003/HPOSServerUAT/public/api/";        
        String fullUrl = preurl + API.coupon_headers ;
        String info = executeGet(fullUrl);
        System.out.println(info);
        
        Gson gson = new Gson();
        Couponheaders[] CouponheadersArray = gson.fromJson(info, Couponheaders[].class);
        System.out.println("done1");
        
    	Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Couponheaders.class);
		cfg.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
		System.out.println("done2");
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("done3");
		try {
			Transaction transaction=session.beginTransaction();
			System.out.println("done4");
			for (Couponheaders spojo :CouponheadersArray) {
	               
				Couponheaders entity = new Couponheaders();
                System.out.println("done5");
                entity.setId(spojo.getId());
                entity.setCreated_at(spojo.getCreated_at());
                entity.setUpdated_at(spojo.getUpdated_at());
                entity.setCode(spojo.getCode());
                entity.setCoupon_issuer(spojo.getCoupon_issuer());
                entity.setCoupon_reference_no(spojo.getCoupon_reference_no());
                entity.setDescription(spojo.getDescription());
                entity.setDescription_2(spojo.getDescription_2());
                entity.setPrice_group(spojo.getPrice_group());
                entity.setDiscount_type(spojo.getDiscount_type());
                entity.setValidation_period_id(spojo.getValidation_period_id());
                entity.setStatus(spojo.getStatus());
                entity.setType(spojo.getType());
                entity.setHandling(spojo.getHandling());
                entity.setNo_of_items_to_trigger(spojo.getNo_of_items_to_trigger());
                entity.setApply_to_no_of_items(spojo.getApply_to_no_of_items());
                entity.setAffects(spojo.getAffects());
                entity.setNo_series(spojo.getNo_series());
                entity.setMultiply_value(spojo.getMultiply_value());
                entity.setMultiply_value_period_id(spojo.getMultiply_value_period_id());
                entity.setIssue_at_pos(spojo.getIssue_at_pos());
                entity.setLoyalty_scheme(spojo.getLoyalty_scheme());
                entity.setDiscount__of_total(spojo.getDiscount__of_total());
                entity.setRounding_method(spojo.getRounding_method());
                entity.setExtra_print_setup(spojo.getExtra_print_setup());
                entity.setBarcode_mask(spojo.getBarcode_mask());
                entity.setMember_type(spojo.getMember_type());
                entity.setMember_value(spojo.getMember_value());
                entity.setFirst_valid_date_formula(spojo.getFirst_valid_date_formula());
                entity.setLast_valid_date_formula(spojo.getLast_valid_date_formula());
                entity.setBarcode_element_1(spojo.getBarcode_element_1());
                entity.setBarcode_element_2(spojo.getBarcode_element_2());
                entity.setBarcode_element_3(spojo.getBarcode_element_3());
                entity.setBarcode_element_4(spojo.getBarcode_element_4());
                entity.setBarcode_element_5(spojo.getBarcode_element_5());
                entity.setBarcode_element_6(spojo.getBarcode_element_6());
                entity.setBarcode_element_7(spojo.getBarcode_element_7());
                entity.setBarcode_element_8(spojo.getBarcode_element_8());
                entity.setCalculation_type(spojo.getCalculation_type());
                entity.setValue(spojo.getValue());
                entity.setEntry_validation(spojo.getEntry_validation());
                entity.setPosting_type(spojo.getPosting_type());
                entity.setPosting_account(spojo.getPosting_account());
                entity.setBuyer_id(spojo.getBuyer_id());
                entity.setBuyer_group_code(spojo.getBuyer_group_code());
                entity.setOffline_process(spojo.getOffline_process());
                entity.setCoupon_id_method(spojo.getCoupon_id_method());
                entity.setMax_per_member(spojo.getMax_per_member());
                entity.setMinimum_trans_amount(spojo.getMinimum_trans_amount());
                entity.setMaximum_trans_amount(spojo.getMaximum_trans_amount());
  
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
