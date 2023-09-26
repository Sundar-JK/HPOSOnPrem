package operations;

	import java.util.List;
	import java.util.Scanner;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;
	import org.hibernate.query.Query;

	import pojo.*; 

	public class opp {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("tabless");
	        System.out.println("sections");
	        System.out.println("AllHospitalityTypes");
	        System.out.println("addons");
	        System.out.println("costingmethods");
	        System.out.println("CouponEntries");
	        System.out.println("couponHeader");
	        System.out.println("customers");
	        System.out.println("discounttypes");
	        System.out.println("divisionmasters");
	        System.out.println("erp_itemmaster");
	        System.out.println("users");
	        System.out.println("guimenuses");
	        System.out.println("itemledgerss");
	        System.out.println("itemmodifier_detail");
	        System.out.println("item_modifierheader");
	        System.out.println("itempricess");
	        System.out.println("kds_masters");
	        System.out.println("kdsuser_links");
	        System.out.println("menuhierarchiess");
	        System.out.println("menuitems");
	        System.out.println("numberseries");
	        System.out.println("portioncosthierarchies");
	        System.out.println("portionweights");
	        System.out.println("product_hierarchylinks");
	        System.out.println("reasonmasters");
	        System.out.println("recipes");
	        System.out.println("sectionss");
	        System.out.println("settingss");
	        System.out.println("shifts");
	        System.out.println("storeconfigurationss");
	        System.out.println("tableconfigurators");
	        System.out.println("tableformlinks");
	        System.out.println("TempTrnHeader");
	        System.out.println("temptrnorddet");
	        System.out.println("temptrnordhdrss");
	        System.out.println("tssc");
	        System.out.println("unitofmeasures");
	        System.out.println("usertablelinks");
	        System.out.println("usertablestatusess");
	        System.out.println("vatmasterss");
	        System.out.println("-----------------------");
	        System.out.println("Enter tablename from the above list");

	        String tablename = sc.next();

	        switch (tablename) {
	            case "tabless":
	                performCRUDOperation(tabless.class);
	                break;
	            case "sections":
	                performCRUDOperation(sectionss.class);
	                break;
	            case "AllHospitalityTypes":
	                performCRUDOperation(getAllHospitalityTypess.class);
	                break;
	            case "addons":
	                performCRUDOperation(addonss.class);
	                break;
	            case "costingmethods":
	                performCRUDOperation(costingmethods.class);
	                break;
	            case "CouponEntries":
	                performCRUDOperation(couponentries.class);
	                break;
	            case "couponHeader":
	                performCRUDOperation(Couponheaders.class);
	                break;
	            case "customers":
	                performCRUDOperation(customerss.class);
	                break;
	            case "discounttypes":
	                performCRUDOperation(discounttypess.class);
	                break;
	            case "divisionmasters":
	            	performCRUDOperation(divisionmasters.class);
	            	break;
	            case "erp_itemmaster":
	            	performCRUDOperation(erp_itemmaster.class);
	            	break;
	            case "users":
	            	performCRUDOperation(users.class);
	            	break;
	            case "guimenuses":
	            	performCRUDOperation(guimenuses.class);
	            	break;
	            case "itemledgerss": 
	            	performCRUDOperation(itemledgerss.class);
	            	break;
	            case "itemmodifier_detail":
	            	performCRUDOperation(itemmodifier_detail.class);
	            	break;
	            case "item_modifierheader":
	            	performCRUDOperation(item_modifierheader.class);
	            	break;
	            case "itempricess":
	            	performCRUDOperation(itempricess.class);
	            	break;
	            case "kds_masters":
	            	performCRUDOperation(kds_masters.class);
	            	break;
	            case "kdsuser_links":
	            	performCRUDOperation(kdsuser_links.class);
	            	break;
	            case "menuhierarchiess":
	            	performCRUDOperation(menuhierarchiess.class);
	            	break;
	            case "menuitems":
	            	performCRUDOperation(menuitems.class);
	            	break;
	            case "numberseries":
	            	performCRUDOperation(numberseries.class);
	            	break;
	            case "portioncosthierarchies":
	            	performCRUDOperation(portioncosthierarchies.class);
	            	break;
	            case "portionweights":
	            	performCRUDOperation(portionweights.class);
	            	break;
	            case "product_hierarchylinks":
	            	performCRUDOperation(product_hierarchylinks.class);
	            	break;
	            case "reasonmasters":
	            	performCRUDOperation(reasonmasters.class);
	            	break;
	            case "recipes":
	            	performCRUDOperation(recipes.class);
	            	break;
	            case "sectionss":
	            	performCRUDOperation(sectionss.class);
	            	break;
	            case "settingss":
	            	performCRUDOperation(settingss.class);
	            	break;
	            case "shifts":
	            	performCRUDOperation(shifts.class);
	            	break;
	            case "storeconfigurationss":
	            	performCRUDOperation(storeconfigurationss.class);
	            	break;
	            case "tableconfigurators":
	            	performCRUDOperation(tableconfigurators.class);
	            	break;
	            case "tableformlinks":
	            	performCRUDOperation(tableformlinks.class);
	            	break;
	            case "TempTrnHeader":
	            	performCRUDOperation(TempTrnHeader.class);
	            	break;
	            case "temptrnorddet":
	            	performCRUDOperation(temptrnorddet.class);
	            	break;
	            case "temptrnordhdrss":
	            	performCRUDOperation(temptrnordhdrss.class);
	            	break;
	            case "tssc":
	            	performCRUDOperation(tssc.class);
	            	break;
	            case "unitofmeasures":
	            	performCRUDOperation(unitofmeasures.class);
	            	break;
	            case "usertablelinks":
	            	performCRUDOperation(usertablelinks.class);
	            	break;
	            case "usertablestatusess":
	            	performCRUDOperation(usertablestatusess.class);
	            	break;
	            case "vatmasterss":
	            	performCRUDOperation(vatmasterss.class);
	            	break;
	            default:
	                System.out.println("Invalid table name");
	        }
	    }

	    private static <T> void performCRUDOperation(Class<T> entityClass) {
	        Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        cfg.addAnnotatedClass(entityClass);
	        System.out.println("Configuration done");
	        SessionFactory sessionFactory = cfg.buildSessionFactory();
	        Session session = sessionFactory.openSession();
	        System.out.println("Session factory done");
	        Transaction transaction = session.beginTransaction();
	        List<T> data = session.createQuery("FROM " + entityClass.getSimpleName()).list();
	        transaction.commit();
	        session.close();
	        sessionFactory.close();
	        for (T entity : data) {
	            System.out.println(entity);
	        }
	    }
	}

	
	
	
	

