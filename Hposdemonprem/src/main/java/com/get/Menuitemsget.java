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

import pojo.MenuItems;



public class Menuitemsget {

	public static void main(String[] args) {
		 String preurl = "http://d365hposvmv1.uaenorth.cloudapp.azure.com:4003/HPOSServerUAT/public/api/";        
	        String fullUrl = preurl + API.menuitems ;
	        String info = executeGet(fullUrl);
	        System.out.println(info);
	        
	        Gson gson = new Gson();
	        MenuItems[] menuitemsArray = gson.fromJson(info, MenuItems[].class);
	        System.out.println("done1");
	        
	    	Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(MenuItems.class);
			cfg.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
			System.out.println("done2");
			
			SessionFactory sessionFactory=cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("done3");
			try {
				Transaction transaction=session.beginTransaction();
				System.out.println("done4");
				for (MenuItems spojo :menuitemsArray) {
		               
					MenuItems entity = new MenuItems();
	                System.out.println("done5");
	                entity.setId(spojo.getId());
	                entity.setCreated_at(spojo.getCreated_at());
	                entity.setUpdated_at(spojo.getUpdated_at());
	                entity.setNo(spojo.getNo());
	                entity.setDescription(spojo.getDescription());
	                
	                entity.setArabic_description(spojo.getArabic_description());
	                entity.setAssembly_bom(spojo.getAssembly_bom());
	                entity.setBase_unit_of_measure(spojo.getBase_unit_of_measure());
	                entity.setUnit_price(spojo.getUnit_price());
	                entity.setCosting_method(spojo.getCosting_method());
	                entity.setUnit_cost(spojo.getUnit_cost());
	                entity.setVendor_no(spojo.getVendor_no());
	                entity.setVendor_item_no(spojo.getVendor_item_no());
	                entity.setLast_date_modified(spojo.getLast_date_modified());
	                entity.setInventory(spojo.getInventory());
	                entity.setNo_series(spojo.getNo_series());
	                entity.setSales_unit_of_measure(spojo.getSales_unit_of_measure());
	                entity.setPurch_unit_of_measure(spojo.getPurch_unit_of_measure());
	                entity.setItem_category_code(spojo.getItem_category_code());
	                entity.setProduct_group_code(spojo.getProduct_group_code());
	                entity.setBrand_code(spojo.getBrand_code());
	                entity.setDate_created(spojo.getDate_created());
	                entity.setCreated_by_user(spojo.getCreated_by_user());
	                entity.setDivision_code(spojo.getDivision_code());
	                entity.setBom_method(spojo.getBom_method());
	                entity.setRecipe_version_code(spojo.getRecipe_version_code());
	                entity.setRecipe_item_type(spojo.getRecipe_item_type());
	                entity.setWastage_(spojo.getWastage_());
	                entity.setIncluded_in_other_recipes(spojo.getIncluded_in_other_recipes());
	                entity.setPortion_weight(spojo.getPortion_weight());
	                entity.setPortion_cost(spojo.getPortion_cost());
	                entity.setExclude_from_menu_requisition(spojo.getExclude_from_menu_requisition());
	                entity.setRecipe_no_of_portions(spojo.getRecipe_no_of_portions());
	                entity.setMax_modifiers_no_price(spojo.getMax_modifiers_no_price());
	                entity.setMax_ingr_removed_no_price(spojo.getMax_ingr_removed_no_price());
	                entity.setMax_ingr_modifiers(spojo.getMax_ingr_modifiers());
	                entity.setProduction_time_min(spojo.getProduction_time_min());
	                entity.setDisplay_ingredients_in_monitor(spojo.getDisplay_ingredients_in_monitor());
	                entity.setDisplay_instruct_in_monitor(spojo.getDisplay_instruct_in_monitor());
	                entity.setRecipe_main_ingredient(spojo.getRecipe_main_ingredient());
	                entity.setRecipe_style(spojo.getRecipe_style());
	                entity.setRecipe_category(spojo.getRecipe_category());
	                entity.setAvailable_as_dish(spojo.getAvailable_as_dish());
	                entity.setUom_popup_on_pos(spojo.getUom_popup_on_pos());
	                entity.setUnit_price_including_vat(spojo.getUnit_price_including_vat());
	                entity.setWarranty_period(spojo.getWarranty_period());
	                entity.setHierarchy(spojo.getHierarchy());
	                entity.setVat_code(spojo.getVat_code());
	                entity.setUnit_price_amount(spojo.getUnit_price_amount());
	                entity.setUnit_price_without_tax(spojo.getUnit_price_without_tax());
	                entity.setGross_amount(spojo.getGross_amount());
	                entity.setDiscount_amount(spojo.getDiscount_amount());
	                entity.setNet_amount(spojo.getNet_amount());
	                entity.setAmount_without_tax(spojo.getAmount_without_tax());
	                entity.setTax_amount(spojo.getTax_amount());
	                entity.setPrice_includes_tax(spojo.isPrice_includes_tax());
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
