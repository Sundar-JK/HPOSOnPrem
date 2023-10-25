package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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



public class TempTrnDemo {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
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
	        	 String no=sc.next();
	        	 String hqlQuery = "FROM TempTrnHeaders where id = :HId";
	        	 List<TempTrnHeaders> HeaderResults = session.createQuery(hqlQuery)
		                    .setParameter("HId", no)
		                    .list();
	        	 transaction.commit();
	        	 System.err.println(HeaderResults);
	    		 
	    	     if(HeaderResults!=null) {
	    	    	 TempTrnHeaders tempHeadr = HeaderResults.get(0);
	    	    	 int H_id=tempHeadr.getId();
	    	    	 
	    	    	 String newQuery="FROM TempTrnOrdHeaders where transaction_no= :H_id";
	    	    	 List<TempTrnOrdHeaders> tempTrn =session.createQuery(newQuery)
			                    .setParameter("H_id", String.valueOf(H_id))
			                    .list();
	    	    	 List <OrderHeader> orderHdr = new ArrayList();
	    	    	 
	    	    	 
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
	    	    		    List<AddItems> addItemsList = new ArrayList<>();
	    	    		    OrdInfo.setAdditems(addItemsList);
	    	    		    
	    	    		    List<RemoveItems> removeItemsList= new ArrayList<>();
	    	    		    OrdInfo.setRemoveitems(removeItemsList);
	    	    		    
	    	    		    List<AddOns> AddOnsList= new ArrayList<>();
	    	    		    OrdInfo.setAddons(AddOnsList);
	    	    		    orderHdr.add(OrdInfo);
	                 }
	    	    	 Gson gson = new Gson();
	    	    	 String OrderInfojson = gson.toJson(orderHdr);
	    	    	 
	    	    	 System.out.println(OrderInfojson);
	    	    	 
	    	    
	    	     }
	    	     else {
	    	    	 System.out.println("no data");
	    	     }
	        }
	    	     finally {
	    	    	 session.close();
		    	     sessionFactory.close();
	    	     }
       
	}
}
