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

import pojo.itemledgerss;

public class itemledgersget {

	public void fetchitemledgers() {
	    String preurl = "http://d365hposvmv1.uaenorth.cloudapp.azure.com:4003/HPOSServerUAT/public/api/";        
        String fullUrl = preurl + API.item_ledgers ;
        String info = executeGet(fullUrl);
        System.out.println(info);
        
        Gson gson = new Gson();
        itemledgerss[] itemledgerssArray = gson.fromJson(info, itemledgerss[].class);
        System.out.println("done1");
        
    	Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(itemledgerss.class);
		cfg.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
		System.out.println("done2");
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("done3");
		try {
			Transaction transaction=session.beginTransaction();
			System.out.println("done4");
			for (itemledgerss spojo :itemledgerssArray) {
	               
				itemledgerss entity = new itemledgerss();
                System.out.println("done5");
                entity.setId(spojo.getId());
                entity.setCreated_at(spojo.getCreated_at());
                entity.setUpdated_at(spojo.getUpdated_at());
                entity.setEntry_no(spojo.getEntry_no());
                entity.setItem_no(spojo.getItem_no());
                entity.setPosting_date(spojo.getPosting_date());
                entity.setEntry_type(spojo.getEntry_type());
                entity.setSource_no(spojo.getSource_no());
                entity.setDocument_no(spojo.getDocument_no());
                entity.setDescription(spojo.getDescription());
                entity.setLocation_code(spojo.getLocation_code());
                entity.setQuantity(spojo.getQuantity());
                entity.setRemaining_quantity(spojo.getRemaining_quantity());
                entity.setInvoiced_quantity(spojo.getInvoiced_quantity());
                entity.setApplies_to_entry(spojo.getApplies_to_entry());
                entity.setOpen(spojo.getOpen());
                entity.setGlobal_dimension_1_code(spojo.getGlobal_dimension_1_code());
                entity.setGlobal_dimension_2_code(spojo.getGlobal_dimension_2_code());
                entity.setPositive(spojo.getPositive());
                entity.setSource_type(spojo.getSource_type());
                entity.setDrop_shipment(spojo.getDrop_shipment());
                entity.setTransaction_type(spojo.getTransaction_type());
                entity.setTransport_method(spojo.getTransport_method());
                entity.setCountry_region_code(spojo.getCountry_region_code());
                entity.setEntry_exit_point(spojo.getEntry_exit_point());
                entity.setDocument_date(spojo.getDocument_date());
                entity.setExternal_document_no(spojo.getExternal_document_no());
                entity.setArea(spojo.getArea());
                entity.setTransaction_specification(spojo.getTransaction_specification());
                entity.setNo_series(spojo.getNo_series());
                entity.setReserved_quantity(spojo.getReserved_quantity());
                entity.setDocument_type(spojo.getDocument_type());
                entity.setDocument_line_no(spojo.getDocument_line_no());
                entity.setJob_no(spojo.getJob_no());
                entity.setJob_task_no(spojo.getJob_task_no());
                entity.setJob_purchase(spojo.getJob_purchase());
                entity.setProd_order_no(spojo.getProd_order_no());
                entity.setVariant_code(spojo.getVariant_code());
                entity.setQty_per_unit_of_measure(spojo.getQty_per_unit_of_measure());
                entity.setUnit_of_measure_code(spojo.getUnit_of_measure_code());
                entity.setDerived_from_blanket_order(spojo.getDerived_from_blanket_order());
                entity.setCross_reference_no(spojo.getCross_reference_no());
                entity.setOriginally_ordered_no(spojo.getOriginally_ordered_no());
                entity.setOriginally_ordered_var_code(spojo.getOriginally_ordered_var_code());
                entity.setOut_of_stock_substitution(spojo.getOut_of_stock_substitution());
                entity.setItem_category_code(spojo.getItem_category_code());
                entity.setNonstock(spojo.getNonstock());
                entity.setPurchasing_code(spojo.getPurchasing_code());
                entity.setProduct_group_code(spojo.getProduct_group_code());
                entity.setTransfer_order_no(spojo.getTransfer_order_no());
                entity.setCompletely_invoiced(spojo.getCompletely_invoiced());
                entity.setLast_invoice_date(spojo.getLast_invoice_date());
                entity.setApplied_entry_to_adjust(spojo.getApplied_entry_to_adjust());
                entity.setCost_amount_expected(spojo.getCost_amount_expected());
                entity.setCost_amount_actual(spojo.getCost_amount_actual());
                entity.setCost_amount_non_invtbl(spojo.getCost_amount_non_invtbl());
                entity.setCost_amount_expected_acy(spojo.getCost_amount_expected_acy());
                entity.setCost_amount_actual_acy(spojo.getCost_amount_actual_acy());
                entity.setCost_amount_non_invtbl_acy(spojo.getCost_amount_non_invtbl_acy());
                entity.setPurchase_amount_expected(spojo.getPurchase_amount_expected());
                entity.setPurchase_amount_actual(spojo.getPurchase_amount_actual());
                entity.setSales_amount_expected(spojo.getSales_amount_expected());
                entity.setSales_amount_actual(spojo.getSales_amount_actual());
                entity.setCorrection(spojo.getCorrection());
                entity.setShipped_qty_not_returned(spojo.getShipped_qty_not_returned());
                entity.setProd_order_line_no(spojo.getProd_order_line_no());
                entity.setProd_order_comp_line_no(spojo.getProd_order_comp_line_no());
                entity.setService_order_no(spojo.getService_order_no());
                entity.setSerial_no(spojo.getSerial_no());
                entity.setLot_no(spojo.getLot_no());
                entity.setWarranty_date(spojo.getWarranty_date());
                entity.setExpiration_date(spojo.getExpiration_date());
                entity.setItem_tracking(spojo.getItem_tracking());
                entity.setReturn_reason_code(spojo.getReturn_reason_code());
                entity.setOffer_no(spojo.getOffer_no());
                entity.setBatch_no(spojo.getBatch_no());
                entity.setUnit_retail_value(spojo.getUnit_retail_value());
                entity.setTransfer_type(spojo.getTransfer_type());
                entity.setStatement_no(spojo.getStatement_no());
                
                
                
                
  
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
