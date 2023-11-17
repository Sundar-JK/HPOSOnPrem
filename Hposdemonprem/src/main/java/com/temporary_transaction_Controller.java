package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import pojo.AddItems;
import pojo.AddOns;
import pojo.OrderHeader;
import pojo.RemoveItems;
import pojo.TempTrnHeaders;
import pojo.TempTrnOrdDetails;
import pojo.TempTrnOrdHeaders;
import pojo.TmpTrn;
import pojo.users;
import pojo.usertablestatusess;


@RestController
public class temporary_transaction_Controller {
	
	 @RequestMapping(path = "/temptrnordhdr/tableOrdHdr/{id}", method = RequestMethod.GET)
	   public List<OrderHeader> getTempTrn(@PathVariable String id) {
		 Scanner sc = new Scanner(System.in);
		 List <OrderHeader> orderHdr = new ArrayList();
	        Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        cfg.addAnnotatedClass(TempTrnHeaders.class);
	        cfg.addAnnotatedClass(TempTrnOrdHeaders.class);
	        cfg.addAnnotatedClass(TempTrnOrdDetails.class);
	        System.out.println("Configuration Done");

	        SessionFactory sessionFactory = cfg.buildSessionFactory();
	        Session session = sessionFactory.openSession();

	        System.out.println("sessionFactory done");

	        Transaction transaction = session.beginTransaction();
	        try {
	        	 System.out.println("Enter Id");
	        	
	        	 String no=id;
	        	 String hqlQuery = "FROM TempTrnHeaders where id = :HId";
	        	 List<TempTrnHeaders> HeaderResults = session.createQuery(hqlQuery)
		                    .setParameter("HId", no)
		                    .list();
	        	 System.out.println("hello output of temptrnheader");
	        	 System.out.println(HeaderResults);
	        	 transaction.commit();

	    		 
	    	     if(HeaderResults!=null) {
	    	    	 
	    	    	 TempTrnHeaders tempHeadr = HeaderResults.get(0);
	    	    	 
	    	    	 int H_id=tempHeadr.getId();
	    	    	 

	    	    	 String newQuery="FROM TempTrnOrdHeaders  WHERE transaction_no = :H_id";
	    	    	 
	    	    	 List<TempTrnOrdHeaders> tempTrn =session.createQuery(newQuery)
			                    .setParameter("H_id", String.valueOf(H_id))
			                    .list();

	    	  		 List<AddItems> addItemsList1 = new ArrayList<>();
	    	  		List<RemoveItems> RemoveItemsList1 = new ArrayList<>();
	    	  	  List<AddOns> AddOnsList1= new ArrayList<>();

	    	  	

	    	  	for (TempTrnOrdHeaders ordHeader : tempTrn) {
	    	  		OrderHeader OrdInfo = new OrderHeader(); 
 	    		
	    		 
	    		 OrdInfo.setId(ordHeader.getId());
	    		 OrdInfo.setCreated_at(ordHeader.getCreated_at());
	    		 OrdInfo.setUpdated_at(ordHeader.getUpdated_at());
	    		 OrdInfo.setTransaction_no(ordHeader.getTransaction_no());
	    		 OrdInfo.setReceipt_no(ordHeader.getReceipt_no());
	    		 OrdInfo.setLine_no(ordHeader.getLine_no());
	    		 OrdInfo.setProduct_code(ordHeader.getProduct_code());
	    		 OrdInfo.setEntry_status(ordHeader.getEntry_status());
	    		 OrdInfo.setDescription(ordHeader.getDescription());
	    		 OrdInfo.setUom(ordHeader.getUom());
	    		 OrdInfo.setStore_no(ordHeader.getStore_no());
	    		 OrdInfo.setPos_terminal_no(ordHeader.getPos_terminal_no());
	    		 OrdInfo.setQuantity(ordHeader.getQuantity());
	    		 OrdInfo.setVat_percent(ordHeader.getVat_percent());
	    		 OrdInfo.setDiscount_percent(ordHeader.getDiscount_percent());
	    		 OrdInfo.setDiscount_amount(ordHeader.getDiscount_amount());
	    		 OrdInfo.setNet_amount(ordHeader.getNet_amount());
	    		 OrdInfo.setVat_amount(ordHeader.getVat_amount());
	    		 OrdInfo.setAmount(ordHeader.getAmount());
	    		 OrdInfo.setAdditional_info_exist(ordHeader.getAdditional_info_exist());
	    		 OrdInfo.setSales_type(ordHeader.getSales_type());
	    		 OrdInfo.setLine_current_status(ordHeader.getLine_current_status());
	    		 OrdInfo.setSales_staff(ordHeader.getSales_staff());
	    		 OrdInfo.setCoverid(ordHeader.getCoverid());
	    		 OrdInfo.setParent_item_no(ordHeader.getParent_item_no());
	    		 OrdInfo.setHierarchy(ordHeader.getHierarchy());
	    		 OrdInfo.setParent_order_ref_no(ordHeader.getParent_order_ref_no());
	    		 OrdInfo.setVat_code(ordHeader.getVat_code());
	    		 OrdInfo.setVat_percentage(ordHeader.getVat_percentage());
	    		 OrdInfo.setUnit_price_amount(ordHeader.getUnit_price_amount());
	    		 OrdInfo.setUnit_price_without_tax(ordHeader.getUnit_price_without_tax());
	    		 OrdInfo.setGross_amount(ordHeader.getGross_amount());
	    		 OrdInfo.setAmount_without_tax(ordHeader.getAmount_without_tax());
	    		 OrdInfo.setTax_amount(ordHeader.getTax_amount());
	    		 OrdInfo.setPrice_includes_tax(ordHeader.getPrice_includes_tax());
	    		 OrdInfo.setKot_ref_id(ordHeader.getKot_ref_id());
	    		 OrdInfo.setDeal_name(ordHeader.getDeal_name());
	    		 OrdInfo.setDeal_trn_link(ordHeader.getDeal_trn_link());
	    		 OrdInfo.setVariant_code(ordHeader.getVariant_code());
//	    		 OrdInfo.setAdditems(addItemsList1);
//	    		 OrdInfo.setRemoveitems(RemoveItemsList1);
//	    		 OrdInfo.setAddons(AddOnsList1);
	  
//	    		 orderHdr.add(OrdInfo);
//	    		 Gson gson = new Gson();
//
//	    		 String OrderInfojson = gson.toJson(OrdInfo);
//	    		 System.out.println( new GsonBuilder().setPrettyPrinting().create().toJson(OrdInfo));

	    		 if(OrdInfo !=null) {
	    	    		String TransactionNo = OrdInfo.getTransaction_no();
	    	    			    		
	    	    		String hqlquerry1= "FROM TempTrnOrdDetails ttrd " +
	    		                 "LEFT JOIN TempTrnOrdHeaders trdh ON CAST(trdh.id AS string) = ttrd.parent_order_ref_no " +
	    		                 "WHERE trdh.transaction_no = :TransactionNo AND ttrd.entry_status = '1'"; 
	    	    		
	    	    		List<TempTrnOrdDetails> Detailresult= session.createQuery(hqlquerry1)
	    	    				.setParameter("TransactionNo", TransactionNo)
			                    .list();
	    	    		
	    	    		
	    	    		List<AddItems> addItemsList = new ArrayList<>();
	    	    		
	    	    		  for (TempTrnOrdDetails tempTrnOrdDetail : Detailresult) {
	    		    if(String.valueOf(ordHeader.getId()).equals(tempTrnOrdDetail.getParent_order_ref_no())) {

	    		              AddItems addItems = new AddItems();
	    		              addItems.setId(tempTrnOrdDetail.getId());
	    		              addItems.setCreated_at(tempTrnOrdDetail.getCreated_at());
	    		              addItems.setUpdated_at(tempTrnOrdDetail.getUpdated_at());
	    		              addItems.setTransaction_no(tempTrnOrdDetail.getTransaction_no());
	    		              addItems.setReceipt_no(tempTrnOrdDetail.getReceipt_no());
	    		              addItems.setLine_no(tempTrnOrdDetail.getLine_no());
	    		              addItems.setProduct_code(tempTrnOrdDetail.getProduct_code());
	    		              addItems.setEntry_status(tempTrnOrdDetail.getEntry_status());
	    		              addItems.setDescription(tempTrnOrdDetail.getDescription());
	    		              addItems.setUom(tempTrnOrdDetail.getUom());
	    		              addItems.setPos_terminal_no(tempTrnOrdDetail.getPos_terminal_no());
	    		              addItems.setQuantity(tempTrnOrdDetail.getQuantity());
	    		              addItems.setVat_percent(tempTrnOrdDetail.getVat_percent());
	    		              addItems.setDiscount_percent(tempTrnOrdDetail.getDiscount_percent());
	    		              addItems.setDiscount_amount(tempTrnOrdDetail.getDiscount_amount());
	    		              addItems.setNet_amount(tempTrnOrdDetail.getNet_amount());
	    		              addItems.setVat_amount(tempTrnOrdDetail.getVat_amount());
	    		              addItems.setAmount(tempTrnOrdDetail.getAmount());
	    		              addItems.setAdditional_info_exist(tempTrnOrdDetail.getAdditional_info_exist());
	    		              addItems.setSales_type(tempTrnOrdDetail.getSales_type());
	    		              addItems.setLine_is_excluded(tempTrnOrdDetail.getLine_is_excluded());
	    		              addItems.setAdditional_charge_lines_exist(tempTrnOrdDetail.getAdditional_charge_lines_exist());
	    		              addItems.setSales_staff(tempTrnOrdDetail.getSales_staff());
	    		              addItems.setCoverid(tempTrnOrdDetail.getCoverid());
	    		              addItems.setParent_item_no(tempTrnOrdDetail.getParent_item_no());
	    		              addItems.setParent_order_ref_no(tempTrnOrdDetail.getParent_order_ref_no());
	    		             
	    		              addItemsList1.add(addItems);
	    		    }
	    		    	
	    	    	}
	    	    		  OrdInfo.setAdditems(addItemsList1);
	    	    		  addItemsList1 = new ArrayList<>();
	    		    	  
	    		    	  String hqlquerry2= "FROM TempTrnOrdDetails ttrd " +
		    		                 "LEFT JOIN TempTrnOrdHeaders trdh ON CAST(trdh.id AS string) = ttrd.parent_order_ref_no " +
		    		                 "WHERE trdh.transaction_no = :TransactionNo AND ttrd.entry_status = '0'"; 
		    	    		
		    	    		List<TempTrnOrdDetails> Detailresult1= session.createQuery(hqlquerry2)
		    	    				.setParameter("TransactionNo", TransactionNo)
				                    .list();
		    	    		
		    	    		List<RemoveItems> RemoveItemsList = new ArrayList<>();
		    	    		 for (TempTrnOrdDetails removeDetail : Detailresult1) {
		    	    			 if(String.valueOf(ordHeader.getId()).equals(removeDetail.getParent_order_ref_no())) {
		    	    			 RemoveItems removeItems = new RemoveItems();
		    	    		
		    	    			 removeItems.setId(removeDetail.getId());
 	    		    		 removeItems.setCreated_at(removeDetail.getCreated_at());
 	    		    		 removeItems.setUpdated_at(removeDetail.getUpdated_at());
 	    		    		 removeItems.setTransaction_no(removeDetail.getTransaction_no());
 	    		    		 removeItems.setReceipt_no(removeDetail.getReceipt_no());
 	    		    		 removeItems.setLine_no(removeDetail.getLine_no());
 	    		    		 removeItems.setProduct_code(removeDetail.getProduct_code());
 	    		    		 removeItems.setEntry_status(removeDetail.getEntry_status());
 	    		    		 removeItems.setDescription(removeDetail.getDescription());
 	    		    		 removeItems.setUom(removeDetail.getUom());
 	    		    		 removeItems.setPos_terminal_no(removeDetail.getPos_terminal_no());
 	    		    		 removeItems.setQuantity(removeDetail.getQuantity());
 	    		    		 removeItems.setVat_percent(removeDetail.getVat_percent());
 	    		    		 removeItems.setDiscount_percent(removeDetail.getDiscount_percent());
 	    		    		 removeItems.setDiscount_amount(removeDetail.getDiscount_amount());
 	    		    		 removeItems.setNet_amount(removeDetail.getNet_amount());
 	    		    		 removeItems.setVat_amount(removeDetail.getVat_amount());
 	    		    		 removeItems.setAmount(removeDetail.getAmount());
 	    		    		 removeItems.setAdditional_info_exist(removeDetail.getAdditional_info_exist());
 	    		    		 removeItems.setSales_type(removeDetail.getSales_type());
 	    		    		 removeItems.setLine_is_excluded(removeDetail.getLine_is_excluded());
 	    		    		 removeItems.setAdditional_charge_lines_exist(removeDetail.getAdditional_charge_lines_exist());
 	    		    		 removeItems.setSales_staff(removeDetail.getSales_staff());
 	    		    		 removeItems.setCoverid(removeDetail.getCoverid());
 	    		    		 removeItems.setParent_item_no(removeDetail.getParent_item_no());
 	    		    		 removeItems.setParent_order_ref_no(removeDetail.getParent_order_ref_no());
		    	    			 
 	    		    		 RemoveItemsList1.add(removeItems);
		    	    		 }
		    	    		 }
		    	    		  OrdInfo.setRemoveitems(RemoveItemsList1);
		    	    		  RemoveItemsList1 = new ArrayList<>();
		    	    		  
		    	    		  String hqlquerry3= "FROM TempTrnOrdDetails ttrd " +
			    		                 "LEFT JOIN TempTrnOrdHeaders trdh ON CAST(trdh.id AS string) = ttrd.parent_order_ref_no " +
			    		                 "WHERE trdh.transaction_no = :TransactionNo AND ttrd.entry_status = '2'"; 
			    	    		
			    	    		List<TempTrnOrdDetails> Detailresult2= session.createQuery(hqlquerry3)
			    	    				.setParameter("TransactionNo", TransactionNo)
					                    .list();
			    	    		
			    	    		 List<AddOns> AddOnsList= new ArrayList<>();
			    	    		 
			    	    		 for (TempTrnOrdDetails AddonDetail : Detailresult2) {
			    	    			 if(String.valueOf(ordHeader.getId()).equals(AddonDetail.getParent_order_ref_no())) {
			    	    			 
			    	    			 AddOns addOnitems = new AddOns();
			    	    			 
			    	    			 addOnitems.setId(AddonDetail.getId());
			    	    			 addOnitems.setCreated_at(AddonDetail.getCreated_at());
			    	    			 addOnitems.setUpdated_at(AddonDetail.getUpdated_at());
			    	    			 addOnitems.setTransaction_no(AddonDetail.getTransaction_no());
			    	    			 addOnitems.setReceipt_no(AddonDetail.getReceipt_no());
			    	    			 addOnitems.setLine_no(AddonDetail.getLine_no());
			    	    			 addOnitems.setProduct_code(AddonDetail.getProduct_code());
			    	    			 addOnitems.setEntry_status(AddonDetail.getEntry_status());
			    	    			 addOnitems.setDescription(AddonDetail.getDescription());
			    	    			 addOnitems.setUom(AddonDetail.getUom());
			    	    			 addOnitems.setPos_terminal_no(AddonDetail.getPos_terminal_no());
			    	    			 addOnitems.setQuantity(AddonDetail.getQuantity());
			    	    			 addOnitems.setVat_percent(AddonDetail.getVat_percent());
			    	    			 addOnitems.setDiscount_percent(AddonDetail.getDiscount_percent());
			    	    			 addOnitems.setDiscount_amount(AddonDetail.getDiscount_amount());
			    	    			 addOnitems.setNet_amount(AddonDetail.getNet_amount());
			    	    			 addOnitems.setVat_amount(AddonDetail.getVat_amount());
			    	    			 addOnitems.setAmount(AddonDetail.getAmount());
			    	    			 addOnitems.setAdditional_info_exist(AddonDetail.getAdditional_info_exist());
			    	    			 addOnitems.setSales_type(AddonDetail.getSales_type());
			    	    			 addOnitems.setLine_is_excluded(AddonDetail.getLine_is_excluded());
			    	    			 addOnitems.setAdditional_charge_lines_exist(AddonDetail.getAdditional_charge_lines_exist());
			    	    			 addOnitems.setSales_staff(AddonDetail.getSales_staff());
			    	    			 addOnitems.setCoverid(AddonDetail.getCoverid());
			    	    			 addOnitems.setParent_item_no(AddonDetail.getParent_item_no());
			    	    			 addOnitems.setParent_order_ref_no(AddonDetail.getParent_order_ref_no());
			    	    			 
			    	    			 AddOnsList1.add(addOnitems);
			    	    			
			    	    		 }
			    	    			 
			    	    		 }
			    	    		 OrdInfo.setAddons(AddOnsList1);
			    	    		 AddOnsList1= new ArrayList<>();
			    	    		 orderHdr.add(OrdInfo);
			    	    		 
	    	    	 }
	    		 
	    	 }
	    	    	for (OrderHeader ordInfo : orderHdr) {
	    	    	    Gson gson = new Gson();
	    	    	    String OrderInfojson = gson.toJson(ordInfo);
	    	    	    System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(ordInfo));
	    	    	   
	    	    	}
	    	    	
	        }
	    	     
	    	     }
	        
	    	     finally {
	    	    	 session.close();
		    	     sessionFactory.close();		    	     
	    	     }
			return orderHdr;   
	 }	
	       
}

