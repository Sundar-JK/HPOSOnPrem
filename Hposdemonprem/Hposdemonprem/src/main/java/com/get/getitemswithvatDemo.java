package com.get;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.transform.Transformers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.hibernate.Transaction;
import pojo.ItemDiscountss;
import pojo.ItemPrices;
import pojo.MenuItems;
import pojo.Menuhierarchiess;
import pojo.ProductHierarchyLinkss;
import pojo.Vatmasters;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class getitemswithvatDemo {

	public static void main(String[] args) {
		 Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        cfg.addAnnotatedClass(Menuhierarchiess.class);
	        cfg.addAnnotatedClass(ProductHierarchyLinkss.class);
	        cfg.addAnnotatedClass(MenuItems.class);
	        cfg.addAnnotatedClass(ItemPrices.class);
	        cfg.addAnnotatedClass(Vatmasters.class);
	        cfg.addAnnotatedClass(ItemDiscountss.class);
	        SessionFactory sessionFactory = cfg.buildSessionFactory();
	        Session session = sessionFactory.openSession();
	        Transaction transaction = session.beginTransaction();
	        try {
	          
	            String sqlQuery = "SELECT distinct mi.* " +
	                    "FROM product_hierarchy_links phl " +
	                    "LEFT JOIN menihierarchies mh ON mh.hierarchycode = phl.hierarchyid " +
	                    "LEFT JOIN menuitems mi ON mi.id = CAST(phl.productid AS INTEGER) " +
	                    "LEFT JOIN item_prices ip ON mi.id || '_' || mi.no = ip.itemno " +
	                    "LEFT JOIN item_discounts itd ON itd.item_no = ip.itemno " +
	                    "LEFT JOIN vat_masters vm ON vm.vatcode = ip.vatcode " +
	                    "WHERE mi.id = 55";
	            List<MenuItems> MenuItemstypes = session.createNativeQuery(sqlQuery)
	                    .addEntity(MenuItems.class)
	                    .list();           
	            if (!MenuItemstypes.isEmpty()) {
	                
	                for (MenuItems menuItem : MenuItemstypes) {
	                	 Gson gson = new GsonBuilder().setPrettyPrinting().create();
	                     String jsonResult = gson.toJson(menuItem);
	                     System.out.println(jsonResult);
	                }
	            } else {
	                System.out.println("No results found for the query.");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            transaction.commit();
	            session.close();
	            sessionFactory.close();
	        }
	    }
	}

