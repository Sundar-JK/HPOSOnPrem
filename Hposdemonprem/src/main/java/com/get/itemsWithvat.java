package com.get;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.ItemDiscountss;
import pojo.ItemPrices;
import pojo.MenuItems;
import pojo.Menuhierarchiess;
import pojo.ProductHierarchyLinkss;
import pojo.Vatmasters;
import pojo.itemsWithVat;





public class itemsWithvat {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     Configuration cfg = new Configuration();
     cfg.configure("hibernate.cfg.xml");
     cfg.addAnnotatedClass(Vatmasters.class);
     cfg.addAnnotatedClass(ItemDiscountss.class);
     cfg.addAnnotatedClass(ItemPrices.class);
     cfg.addAnnotatedClass(MenuItems.class);
     cfg.addAnnotatedClass(ProductHierarchyLinkss.class);
     cfg.addAnnotatedClass(Menuhierarchiess.class);
     System.out.println("Configuration Done");

     SessionFactory sessionFactory = cfg.buildSessionFactory();
     Session session = sessionFactory.openSession();

     System.out.println("sessionFactory done");

     Transaction transaction = session.beginTransaction();
     try {
    	 
         System.out.println("Enter Id");
         String no = sc.next();


         // Query 1: Joining Menuhierarchiess, ProductHierarchyLinkss, and MenuItems
         String query1 = "FROM Menuhierarchiess mh " +
        	        "LEFT JOIN ProductHierarchyLinkss phl ON mh.hierarchyCode = phl.hierarchyId " +
        	        "LEFT JOIN MenuItems mi ON mi.id = CAST(phl.productId AS string) AND mi.id = :MId";

        	List<Object[]> result1 = session.createQuery(query1)
        	        .setParameter("MId", Long.parseLong(no))
        	        .list();

        	for (Object[] item : result1) {
        	    Menuhierarchiess mh = (Menuhierarchiess) item[0];
        	    ProductHierarchyLinkss phl = (ProductHierarchyLinkss) item[1];
        	    MenuItems mi = (MenuItems) item[2];
        	    // Process entities as needed
        	    System.out.println(mh);
        	    System.out.println(phl);
        	    System.out.println(mi);
        	}

//    	 System.out.println("Enter Id");
//    	 String no=sc.next();
//    	 String hqlquery =
//    			    "FROM Menuhierarchiess mh " +
//    			    "LEFT JOIN ProductHierarchyLinkss phl ON mh.hierarchyCode = phl.hierarchyId " +
//    			    "LEFT JOIN MenuItems mi ON mi.id = CAST(phl.productId AS string) " +
//    			    "LEFT JOIN ItemPrices ip ON mi.id + '_' + mi.no = ip.itemNo " +
//    			    "LEFT JOIN ItemDiscountss itd ON itd.itemNo = ip.itemNo " +
//    			    "LEFT JOIN Vatmasters vm ON vm.vatCode = ip.vatCode " +
//    			    "WHERE phl.productId = mi.id and mi.id = :MId";
//
//         List<itemsWithVat> result = session.createQuery(hqlquery, itemsWithVat.class)
//                 .setParameter("MId", Long.parseLong(no))
//                 .list();
//
//         for (MenuItems item : result) {
//             System.out.println(item); 
//         }
//     try {
//    	 System.out.println("Enter Id");
//    	 String no=sc.next();
//    	 String hqlquerry="FROM MenuItems where id = :MId";
//    	 List<MenuItems> menuitemsResults = session.createQuery(hqlquerry)
//                 .setParameter("MId", no)
//                 .list();
//    	 System.out.println(menuitemsResults);
//    	 if(menuitemsResults!=null) {
//    		 MenuItems mnuitms = menuitemsResults.get(0);
//    		int P_Id=mnuitms.getId();
//    		
//    		String hqlQuerry1="FROM ProductHierarchyLinkss where product_id = :P_Id";
//    		List<ProductHierarchyLinkss> producthierarchylinksResults = session.createQuery(hqlQuerry1)
//                    .setParameter("P_Id",String.valueOf(P_Id))
//                    .list();
//    		System.out.println("result of productlinks");
//    		System.out.println(producthierarchylinksResults);
//    	 }
     }catch(Exception e) {
    	 System.out.println(e);
     }
}
}
