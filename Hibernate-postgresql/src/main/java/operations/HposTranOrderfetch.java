
package operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.Details;
import pojo.Headers;
import pojo.TempTrnHeader;
import pojo.orders;
import pojo.temptrnorddet;
import pojo.temptrnordhdrss;
import org.hibernate.type.StandardBasicTypes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class HposTranOrderfetch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(TempTrnHeader.class);
        cfg.addAnnotatedClass(temptrnordhdrss.class);
        cfg.addAnnotatedClass(temptrnorddet.class);
        System.out.println("Configuration done");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();

        System.out.println("SessionFactory done");

        Transaction transaction = session.beginTransaction();
        System.out.println("Enter Id");
        String no = sc.next();
        int id = Integer.parseInt(no);

        TempTrnHeader TempTabletrn = session.get(TempTrnHeader.class, id);

        if (TempTabletrn != null) {
            System.out.println("TransactionResponse: " + formatTransactionResponse(TempTabletrn, session));
        }
    }

    private static String formatTransactionResponse(TempTrnHeader TempTabletrn, Session session) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        int Id = TempTabletrn.getId();
        System.out.println(Id);

        String newTableQuery = "FROM temptrnordhdrss WHERE transaction_no = :Id";

        List<temptrnordhdrss> temptrnordhdrList = session.createQuery(newTableQuery)
                .setParameter("Id", String.valueOf(Id), StandardBasicTypes.STRING)
                .list();
        System.out.println("hello");

        List<Headers> HeadersInfoList = new ArrayList<Headers>();

        for (temptrnordhdrss data : temptrnordhdrList) {
            Headers headerinfo = new Headers();
            headerinfo.setId(data.getId());
            headerinfo.setCreated_at(data.getCreated_at());
            headerinfo.setUpdated_at(data.getUpdated_at());
            headerinfo.setTransaction_no(data.getTransaction_no());
            headerinfo.setReceipt_no(data.getReceipt_no());
            headerinfo.setLine_no(data.getLine_no());
            headerinfo.setProduct_code(data.getProduct_code());
            headerinfo.setEntry_status(data.getEntry_status());
            headerinfo.setDescription(data.getDescription());
            headerinfo.setUom(data.getUom());
            headerinfo.setStore_no(data.getStore_no());
            headerinfo.setPos_terminal_no(data.getPos_terminal_no());
            headerinfo.setQuantity(data.getQuantity());
            headerinfo.setVat_percent(data.getVat_percent());
            headerinfo.setDiscount_percent(data.getDiscount_percent());
            headerinfo.setDiscount_amount(data.getDiscount_amount());
            headerinfo.setAmount(data.getAmount());
            headerinfo.setHierarchy(data.getHierarchy());
            headerinfo.setVat_code(data.getVat_code());
            headerinfo.setVat_percentage(data.getVat_percentage());
            headerinfo.setUnit_price_amount(data.getUnit_price_amount());
            headerinfo.setUnit_price_without_tax(data.getUnit_price_without_tax());
            HeadersInfoList.add(headerinfo);
        }

        List<Details> DetailsInfoList = new ArrayList();

        for (temptrnordhdrss data : temptrnordhdrList) {
            int transactionno = data.getId();
            System.out.println("hellommm");
//            System.out.println(transactionno);
            String ordretailQuery = "FROM temptrnorddet WHERE transaction_no = :transactionno";

            List<temptrnorddet> Tempdetail = session.createQuery(ordretailQuery)
                    .setParameter("transactionno", String.valueOf(transactionno), StandardBasicTypes.STRING)
                    .list();

            for (temptrnorddet detaildata : Tempdetail) {
                Details ddata = new Details();
                ddata.setId(detaildata.getId());
                ddata.setCreated_at(detaildata.getCreated_at());
                ddata.setUpdated_at(detaildata.getUpdated_at());
                ddata.setTransaction_no(detaildata.getTransaction_no());
                ddata.setReceipt_no(detaildata.getReceipt_no());
                ddata.setLine_no(detaildata.getLine_no());
                ddata.setProduct_code(detaildata.getProduct_code());
                ddata.setEntry_status(detaildata.getEntry_status());
                ddata.setDescription(detaildata.getDescription());
                ddata.setUom(detaildata.getUom());
                ddata.setStore_no(detaildata.getStore_no());
                ddata.setPos_terminal_no(detaildata.getPos_terminal_no());
                ddata.setQuantity(detaildata.getQuantity());
                ddata.setVat_percent(detaildata.getVat_percent());
                ddata.setDiscount_percent(detaildata.getDiscount_percent());
                ddata.setDiscount_amount(detaildata.getDiscount_amount());
                ddata.setNet_amount(detaildata.getNet_amount());
                ddata.setVat_amount(detaildata.getVat_amount());
                ddata.setAmount(detaildata.getAmount());
                ddata.setAdditional_info_exist(detaildata.getAdditional_info_exist());
                ddata.setSales_type(detaildata.getSales_type());
                ddata.setLine_is_excluded(detaildata.getLine_is_excluded());
                ddata.setAdditional_charge_lines_exist(detaildata.getAdditional_charge_lines_exist());
                ddata.setSales_staff(detaildata.getSales_staff());
                ddata.setCoverid(detaildata.getCoverid());
                ddata.setParent_item_no(detaildata.getParent_item_no());
                ddata.setParent_order_ref_no(detaildata.getParent_order_ref_no());
                DetailsInfoList.add(ddata);
            }
        }

        orders orderResponse = new orders();
        orderResponse.setTempTrnHeader(TempTabletrn);
        orderResponse.setHeaders(HeadersInfoList);
        orderResponse.setDetails(DetailsInfoList);

        return gson.toJson(orderResponse);
    }
}




//package operations;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//import pojo.Details;
//import pojo.Headers;
////import pojo.TempTableHeader;
//import pojo.TempTrnHeader;
//import pojo.UserLogin;
//import pojo.branch;
//import pojo.orders;
//import pojo.storeconfigurationss;
//import pojo.temptrnorddet;
//import pojo.temptrnordhdrss;
//
//import org.hibernate.type.StandardBasicTypes;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//
//public class HposTranOrderfetch {
//
//	public static void main(String[] args) {
//		    Scanner sc = new Scanner(System.in);
//		    Configuration cfg = new Configuration();
//	        cfg.configure("hibernate.cfg.xml");
//	        cfg.addAnnotatedClass(TempTrnHeader.class);
//	        cfg.addAnnotatedClass(temptrnordhdrss.class);
//	        cfg.addAnnotatedClass(temptrnorddet.class);
//	        System.out.println("congiguration done");
//	        
//	        SessionFactory sessionFactory = cfg.buildSessionFactory();
//	        Session session = sessionFactory.openSession();
//	        
//	        System.out.println("sessionFactory done");
//
//	        Transaction transaction = session.beginTransaction();
//	        System.out.println("Enter Id");
//	   	    String no = sc.next();
//	   	    int id = Integer.parseInt(no);
//	   	    
//	   	    String hqlQuery = "FROM TempTrnHeader WHERE Id = :id";
//	   	  
//	   	    TempTrnHeader TempTabletrn = (TempTrnHeader) session.createQuery(hqlQuery)
//	             .setParameter("id", id) 
//	             .uniqueResult();
//
//	   	   System.out.println(TempTabletrn);
//	   	  
//	   	  if(TempTabletrn!=null) {
//	   		  
//	   		  int Id=TempTabletrn.getId();
//	   		  
//	   		  System.out.println(Id);
//	   		  
//	   		  String newTableQuery = "FROM temptrnordhdrss WHERE transaction_no = :Id";
//	   		  
//	   		  List<temptrnordhdrss> temptrnordhdrList = session.createQuery(newTableQuery)
//	   			    .setParameter("Id", String.valueOf(Id), StandardBasicTypes.STRING) 
//	   			    .list();
//	   		  System.out.println("hello");
//	   		  
//	   		
//	   		List<Headers> HeadersInfoList = new ArrayList();
//	   		Gson gson = new Gson();
//	   		
//	   		for(temptrnordhdrss data:temptrnordhdrList) {
//	   			Headers headerinfo=new Headers();
//	   			headerinfo.setId(data.getId());
//	   			headerinfo.setCreated_at(data.getCreated_at());
//	   			headerinfo.setUpdated_at(data.getUpdated_at());
//	   			headerinfo.setTransaction_no(data.getTransaction_no());
//	   			headerinfo.setReceipt_no(data.getReceipt_no());
//	   			headerinfo.setLine_no(data.getLine_no());
//	   			headerinfo.setProduct_code(data.getProduct_code());
//	   			headerinfo.setEntry_status(data.getEntry_status());
//	   			headerinfo.setDescription(data.getDescription());
//	   			headerinfo.setUom(data.getUom());
//	   			headerinfo.setStore_no(data.getStore_no());
//	   			headerinfo.setPos_terminal_no(data.getPos_terminal_no());
//	   			headerinfo.setQuantity(data.getQuantity());
//	   			headerinfo.setVat_percent(data.getVat_percent());
//	   			headerinfo.setDiscount_percent(data.getDiscount_percent());
//	   			headerinfo.setDiscount_amount(data.getDiscount_amount());
//	   			headerinfo.setAmount(data.getAmount());
//	   			headerinfo.setHierarchy(data.getHierarchy());
//	   			headerinfo.setVat_code(data.getVat_code());
//	   			headerinfo.setVat_percentage(data.getVat_percentage());
//	   			headerinfo.setUnit_price_amount(data.getUnit_price_amount());
//	   			headerinfo.setUnit_price_without_tax(data.getUnit_price_without_tax());
//	   			HeadersInfoList.add(headerinfo);
//	   		 List<Details> DetailsInfoList = new ArrayList<Details>(); 
//	   			if(temptrnordhdrList!=null) {
//	   				int transactionno=data.getId();
//	   				System.out.println("hellommm");
//	   				System.out.println(transactionno);
//	   				String ordretailQuery = "FROM temptrnorddet WHERE transaction_no = :transactionno";
//	   				
//
//                    List<temptrnorddet> Tempdetail = session.createQuery(ordretailQuery)
//                            .setParameter("transactionno",  String.valueOf(transactionno), StandardBasicTypes.STRING)
//                            .list();
//
//                   
//                    
//                    for(temptrnorddet detaildata:Tempdetail) {
//                    	Details ddata=new Details();
//                    	ddata.setId(detaildata.getId());
//                    	ddata.setCreated_at(detaildata.getCreated_at());
//                    	ddata.setUpdated_at(detaildata.getUpdated_at());
//                    	ddata.setTransaction_no(detaildata.getTransaction_no());
//                    	ddata.setReceipt_no(detaildata.getReceipt_no());
//                    	ddata.setLine_no(detaildata.getLine_no());
//                    	ddata.setProduct_code(detaildata.getProduct_code());
//                    	ddata.setEntry_status(detaildata.getEntry_status());
//                    	ddata.setDescription(detaildata.getDescription());
//                    	ddata.setUom(detaildata.getUom());
//                    	ddata.setStore_no(detaildata.getStore_no());
//                    	ddata.setPos_terminal_no(detaildata.getPos_terminal_no());
//                    	ddata.setQuantity(detaildata.getQuantity());
//                    	ddata.setVat_percent(detaildata.getVat_percent());
//                    	ddata.setDiscount_percent(detaildata.getDiscount_percent());
//                    	ddata.setDiscount_amount(detaildata.getDiscount_amount());
//                    	ddata.setNet_amount(detaildata.getNet_amount());
//                    	ddata.setVat_amount(detaildata.getVat_amount());
//                    	ddata.setAmount(detaildata.getAmount());
//                    	ddata.setAdditional_info_exist(detaildata.getAdditional_info_exist());
//                    	ddata.setSales_type(detaildata.getSales_type());
//                    	ddata.setLine_is_excluded(detaildata.getLine_is_excluded());
//                    	ddata.setAdditional_charge_lines_exist(detaildata.getAdditional_charge_lines_exist());
//                    	ddata.setSales_staff(detaildata.getSales_staff());
//                    	ddata.setCoverid(detaildata.getCoverid());
//                    	ddata.setParent_item_no(detaildata.getParent_item_no());
//                    	ddata.setParent_order_ref_no(detaildata.getParent_order_ref_no());
//                    	DetailsInfoList.add(ddata);
//                    }
//                    
//	   		}
//	   	
//	   	
//	   		   	String headerInfoListJson = gson.toJson(HeadersInfoList);
//	   		   	String detailInfoListJson = gson.toJson(DetailsInfoList);
//	   		   	
//	   		   	orders orderResponse = new orders();
//	   		   	orderResponse.setTempTrnHeader(TempTabletrn);
//	   		   	orderResponse.setHeaders(HeadersInfoList);
//	   		   	orderResponse.setDetails(DetailsInfoList);
//	   		   	
//	   		   	System.out.println("TransactionResponse: " +  new GsonBuilder().setPrettyPrinting().create().
//	   		   			toJson(orderResponse));
//	   	
//	   		
//	   	  }
//	        		
//	}
//	   	  
//}
//}