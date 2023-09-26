package operations;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query; // Import the correct Query class

import pojo.Couponheaders;
import pojo.TempTrnHeader;
import pojo.addonss;
import pojo.costingmethods;
import pojo.couponentries;
import pojo.customerss;
import pojo.discounttypess;
import pojo.divisionmasters;
import pojo.erp_itemmaster;
import pojo.getAllHospitalityTypess;
import pojo.guimenuses;
import pojo.item_modifierheader;
import pojo.itemledgerss;
import pojo.itemmodifier_detail;
import pojo.itempricess;
import pojo.kds_masters;
import pojo.kdsuser_links;
import pojo.menuhierarchiess;
import pojo.menuitems;
import pojo.numberseries;
import pojo.portioncosthierarchies;
import pojo.portionweights;
import pojo.product_groupmasters;
import pojo.product_hierarchylinks;
import pojo.reasonmasters;
import pojo.recipes;
import pojo.sectionss;
import pojo.settingss;
import pojo.shifts;
import pojo.storeconfigurationss;
import pojo.tableconfigurators;
import pojo.tableformlinks;
import pojo.tabless;
import pojo.temptrnorddet;
import pojo.temptrnordhdrss;
import pojo.tssc;
import pojo.unitofmeasures;
import pojo.users;
import pojo.usertablelinks;
import pojo.usertablestatusess;
import pojo.vatmasterss;

public class Crudop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Table");
		System.out.println("sections");
		System.out.println("AllHospitalityTypes");
		System.out.println("addons");
		System.out.println("costingmethods");
		System.out.println("CouponEntries");
		System.out.println("couponHeader");
		System.out.println("customers");
		System.out.println("discounttypes");
		System.out.println("divisionmastersget");
		System.out.println("ErpMasters");
		System.out.println("Users");
		System.out.println("GuiMenus");
		System.out.println("Itemledgers");
		System.out.println("ItemModifierDetail");
		System.out.println("ItemModifierHeaders");
		System.out.println("ItemPrices");
		System.out.println("KdsMasters");
		System.out.println("KdsUsers");
		System.out.println("menuHierarchies");
		System.out.println("MenuItems");
		System.out.println("NumberSeries");
		System.out.println("PortionCostHierarchies");
		System.out.println("PortionWeights");
		System.out.println("ProductGroupMasters");
		System.out.println("producthierarchielinks");
		System.out.println("ReasonsMasters");
		System.out.println("Recipies");
		System.out.println("Sections");
		System.out.println("Settings");
		System.out.println("Shifts");
		System.out.println("StoreConfigurations");
		System.out.println("TableConfiguration");
		System.out.println("TableFormLinks");
		System.out.println("TempTrnHeader");
		System.out.println("TempTrnOrdDetails");
		System.out.println("TempTrnordhdrss");
		System.out.println("Tssc");
		System.out.println("UnitOfMeasure");
		System.out.println("UsertableLinks");
		System.out.println("UserTableStatuses");
		System.out.println("VatMasters");
		
		
		
		
		System.out.println("-----------------------");
		System.out.println("enter Tablename from above list");

		String tablename = sc.next();
		switch (tablename) {
		case "table": {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			System.out.println("enter Annotatedclasss");
			cfg.addAnnotatedClass(tabless.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<tabless> tabbledata = session.createQuery("FROM tabless").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (tabless tabledata : tabbledata) {
				System.out.println(tabledata);
			}
			break;
		}
		case "sections": {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(sectionss.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<sectionss> sections = session.createQuery("FROM sectionss").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (sectionss sectionsdata : sections) {
				System.out.println(sectionsdata);
			}
			break;
		}
		case "AllHospitalityTypes": {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(getAllHospitalityTypess.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<getAllHospitalityTypess> hospitality = session.createQuery("FROM getAllHospitalityTypess").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (getAllHospitalityTypess hospitalitytypes : hospitality) {
				System.out.println(hospitalitytypes);
			}
			break;
		}
		case "addons": {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(addonss.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<addonss> adonstyp = session.createQuery("FROM addonss").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (addonss adons : adonstyp) {
				System.out.println(adons);
			}
			break;
		}

		case "costingmethods": {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(costingmethods.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<costingmethods> costingtyp = session.createQuery("FROM costingmethods").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (costingmethods costs : costingtyp) {
				System.out.println(costs);
			}
			break;
		}
		case "CouponEntries": {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(couponentries.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<couponentries> cupnctytyp = session.createQuery("FROM couponentries").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (couponentries cupnctr : cupnctytyp) {
				System.out.println(cupnctr);
			}
			break;
		}
		case "couponHeader": {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Couponheaders.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<Couponheaders> cupnctytyp = session.createQuery("FROM Couponheaders").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (Couponheaders cupnhdr : cupnctytyp) {
				System.out.println(cupnhdr);
			}
			break;
		}
		case "customers": {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(customerss.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<customerss> cstmr = session.createQuery("FROM customerss").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (customerss cstmrrs : cstmr) {
				System.out.println(cstmrrs);
			}
			break;
		}
		case "discounttypes": {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(discounttypess.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<discounttypess> dcntyps = session.createQuery("FROM discounttypess").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (discounttypess dscntyp : dcntyps) {
				System.out.println(dscntyp);
			}
			break;
		}

		case "divisionmastersget": {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(divisionmasters.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<divisionmasters> dvsnmstr = session.createQuery("FROM divisionmasters").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (divisionmasters dvsnm : dvsnmstr) {
				System.out.println(dvsnm);
			}
			break;
		}

		case "ErpMasters": {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(erp_itemmaster.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<erp_itemmaster> erpmstr = session.createQuery("FROM erp_itemmaster").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (erp_itemmaster erpm : erpmstr) {
				System.out.println(erpm);
			}
			break;
		}

		case "Users": {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(users.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<users> userslist = session.createQuery("FROM users").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (users usr : userslist) {
				System.out.println(usr);
			}
			break;
		}
		
		case "GuiMenus" :{
			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(guimenuses.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<guimenuses> guimnu = session.createQuery("FROM guimenuses").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (guimenuses gui : guimnu) {
				System.out.println(gui);
			}
			break;
		}
		
		case "Itemledgers" :{
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(itemledgerss.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<itemledgerss> itmldgr = session.createQuery("FROM itemledgerss").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (itemledgerss itmldr : itmldgr) {
				System.out.println(itmldr);
			}
			break;
			
		}
		
		case "ItemModifierDetail" :{
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(itemmodifier_detail.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<itemmodifier_detail> itmdtls = session.createQuery("FROM itemmodifier_detail").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (itemmodifier_detail itmmoddtls : itmdtls) {
				System.out.println(itmmoddtls);
			}
			break;
		}
		
		case "ItemModifierHeaders" : {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(item_modifierheader.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<item_modifierheader> itmdthdr = session.createQuery("FROM item_modifierheader").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (item_modifierheader itmmodhdr : itmdthdr) {
				System.out.println(itmmodhdr);
			}
			break;
			
		}
		
		case "ItemPrices" :{
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(itempricess.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<itempricess> itmprice = session.createQuery("FROM itempricess").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (itempricess itmprc : itmprice) {
				System.out.println(itmprc);
			}
			break;
		}
		
		case "KdsMasters": {
			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(kds_masters.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<kds_masters> kdsmaster = session.createQuery("FROM kds_masters").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (kds_masters itmprc : kdsmaster) {
				System.out.println(itmprc);
			}
			break;
		}
		
		case "KdsUsers":{
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(kdsuser_links.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<kdsuser_links> kdsusr = session.createQuery("FROM kdsuser_links").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (kdsuser_links kdsu : kdsusr) {
				System.out.println(kdsu);
			}
			break;
		}
		
		case "menuHierarchies" :{
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(menuhierarchiess.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<menuhierarchiess> menuhie = session.createQuery("FROM menuhierarchiess").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (menuhierarchiess menuh : menuhie) {
				System.out.println(menuh);
			}
			break;
		}
		
		case "MenuItems" :{
			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(menuitems.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<menuitems> menuitem = session.createQuery("FROM menuitems").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (menuitems menuitm : menuitem) {
				System.out.println(menuitm);
			}
			break;
		}
		
		case "NumberSeries" : {
			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(numberseries.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<numberseries> numser = session.createQuery("FROM numberseries").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (numberseries numseries : numser) {
				System.out.println(numseries);
			}
			break;
		}
		
		case "PortionCostHierarchies":{
			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(portioncosthierarchies.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<portioncosthierarchies> portincost = session.createQuery("FROM portioncosthierarchies").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (portioncosthierarchies prtncost : portincost) {
				System.out.println(prtncost);
			}
			break;
		}
		
		case "PortionWeights" :{
			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(portionweights.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<portionweights> portinweights = session.createQuery("FROM portionweights").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (portionweights prtnwgt : portinweights) {
				System.out.println(prtnwgt);
			}
			break;
		}
		
		case "ProductGroupMasters":{
			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(product_groupmasters.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<product_groupmasters> prdctgrpmstr = session.createQuery("FROM product_groupmasters").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (product_groupmasters prdtmst : prdctgrpmstr) {
				System.out.println(prdtmst);
			}
			break;
		}
		
		case "producthierarchielinks":{
			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(product_hierarchylinks.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<product_hierarchylinks> prdcthirarclinks = session.createQuery("FROM product_hierarchylinks").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (product_hierarchylinks prdthirlnks : prdcthirarclinks) {
				System.out.println(prdthirlnks);
			}
			break;
		}
		
		case "ReasonsMasters" :{
			

			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(reasonmasters.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<reasonmasters> rsnmstr = session.createQuery("FROM reasonmasters").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (reasonmasters rsnmstrs : rsnmstr) {
				System.out.println(rsnmstrs);
			}
			break;
		}
		
		
		case "Recipies" : {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(recipes.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<recipes> rcips = session.createQuery("FROM recipes").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (recipes recpies : rcips) {
				System.out.println(recpies);
			}
			break;
		}
		
		case "Sections":{
			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(sectionss.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<sectionss> sctns = session.createQuery("FROM sectionss").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (sectionss sctins : sctns) {
				System.out.println(sctins);
			}
			break;
		}
		
		case "Settings" : {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(settingss.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<settingss> stngss = session.createQuery("FROM settingss").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (settingss setngs : stngss) {
				System.out.println(setngs);
			}
			break;
		}
		
		case "Shifts" :{
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(shifts.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<shifts> shfts = session.createQuery("FROM shifts").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (shifts sfts : shfts) {
				System.out.println(sfts);
			}
			break;
		}
		
		case "StoreConfigurations":{
			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(storeconfigurationss.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<storeconfigurationss> strcnfg = session.createQuery("FROM storeconfigurationss").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (storeconfigurationss strecnfg : strcnfg) {
				System.out.println(strecnfg);
			}
			break;
		}
		
		case "TableConfiguration" :{
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(tableconfigurators.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<tableconfigurators> tblecnf = session.createQuery("FROM tableconfigurators").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (tableconfigurators tblecnfg : tblecnf) {
				System.out.println(tblecnfg);
			}
			break;
		}
		
		case "TableFormLinks" : {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(tableformlinks.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<tableformlinks> tblefrmlnks = session.createQuery("FROM tableformlinks").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (tableformlinks tblefrml : tblefrmlnks) {
				System.out.println(tblefrml);
			}
			break;
		}
		
		
		case "TempTrnHeader" : {
			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(TempTrnHeader.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<TempTrnHeader> temptrn = session.createQuery("FROM TempTrnHeader").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (TempTrnHeader temptrnhdr : temptrn) {
				System.out.println(temptrnhdr);
			}
			break;
		}
		
		
		case "TempTrnOrdDetails" : {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(temptrnorddet.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<temptrnorddet> temptrnorddet = session.createQuery("FROM temptrnorddet").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (temptrnorddet temptrnorddt : temptrnorddet) {
				System.out.println(temptrnorddt);
			}
			break;
		}
		
		case "TempTrnordhdrss" : {
			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(temptrnordhdrss.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<temptrnordhdrss> temptrnordhdrss = session.createQuery("FROM temptrnordhdrss").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (temptrnordhdrss temptrnordhdrs : temptrnordhdrss) {
				System.out.println(temptrnordhdrs);
			}
			break;
		}
		
		case "Tssc" : {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(tssc.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<tssc> tsscget = session.createQuery("FROM tssc").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (tssc tsscg : tsscget) {
				System.out.println(tsscg);
			}
			break;
		}
		
		case "UnitOfMeasure" : {
			
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(unitofmeasures.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<unitofmeasures> Untodmsr = session.createQuery("FROM unitofmeasures").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (unitofmeasures uom : Untodmsr) {
				System.out.println(uom);
			}
			break;
		}
		
		case "UsertableLinks":{
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(usertablelinks.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<usertablelinks> Usrtbllnks = session.createQuery("FROM usertablelinks").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (usertablelinks usrtblnk : Usrtbllnks) {
				System.out.println(usrtblnk);
			}
			break;
		}
		
		case "UserTableStatuses":{
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(usertablestatusess.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<usertablestatusess> Usrtblsts = session.createQuery("FROM usertablestatusess").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (usertablestatusess usrtblstus : Usrtblsts) {
				System.out.println(usrtblstus);
			}
			break;
		}
		
		case "VatMasters" :{
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(vatmasterss.class);
			System.out.println("configuration done");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("Session factory done");
			Transaction transaction = session.beginTransaction();
			List<vatmasterss> vatmstr = session.createQuery("FROM vatmasterss").list();
			transaction.commit();
			session.close();
			sessionFactory.close();
			for (vatmasterss vatmsters : vatmstr) {
				System.out.println(vatmsters);
			}
			break;
		}
		
		
		}
	}

}
