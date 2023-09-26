package operations;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.google.gson.Gson;

import pojo.getAllHospitalityTypess;
import pojo.itemdiscounts;
import pojo.itempricess;
import pojo.menuitems;
import pojo.tabless;
import pojo.vatmasterss;

public class getitemsvat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(menuitems.class);
		cfg.addAnnotatedClass(itempricess.class);
		cfg.addAnnotatedClass(vatmasterss.class);
		cfg.addAnnotatedClass(itemdiscounts.class);
		System.out.println("Configuration Done");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("sessionFactory done");
		Transaction transaction = session.beginTransaction();
		try {
			System.out.println("Enter ID");
			String no = sc.next();
			String hqlQuery1 = "FROM menuitems WHERE id = :Id";
			List<menuitems> menuitemsTypes = session.createQuery(hqlQuery1, menuitems.class).setParameter("Id", no)
					.list();

			if (menuitemsTypes != null) {
				System.out.println(menuitemsTypes.get(0).isPrice_includes_tax());
				int m_id = menuitemsTypes.get(0).getId();
				String m_no = menuitemsTypes.get(0).getNo();
				String Item_No = m_id + "_" + m_no;
				System.out.println(menuitemsTypes);

				String newQuerry = "FROM itempricess WHERE item_no = :Ino ";
				List<itempricess> itempricessTypes = session.createQuery(newQuerry, itempricess.class)
						.setParameter("Ino", Item_No).list();
				Gson gson = new Gson();
				String jsonResult = gson.toJson(itempricessTypes);
				System.out.println("itemprice" + jsonResult);

				if (itempricessTypes != null) {

					String v_code = itempricessTypes.get(0).getVat_code();
					String vQuery = "FROM vatmasterss WHERE vat_code=:vatcode";
					List<vatmasterss> vatmasterssTypes = session.createQuery(vQuery, vatmasterss.class)
							.setParameter("vatcode", v_code).list();
					Gson gson1 = new Gson();
					String jsonResult1 = gson1.toJson(vatmasterssTypes);
					System.out.println("vatmasters" + jsonResult1);

					String Str_code = itempricessTypes.get(0).getStore_code();
					String ItmdscQuery = "FROM itemdiscounts WHERE store_code=:Strcode";
					List<itemdiscounts> itemdiscountsTypes = session.createQuery(ItmdscQuery, itemdiscounts.class)
							.setParameter("Strcode", Str_code).list();
					Gson gson2 = new Gson();
					String jsonResult2 = gson2.toJson(itemdiscountsTypes);
					System.out.println("itemDisc" + jsonResult2);

					String U_Prc = itempricessTypes.get(0).getUnit_price();
					double unitPrice = Double.parseDouble(U_Prc);
					String vatPercentStr = vatmasterssTypes.get(0).getVat_percent();
					double vatPercent = Double.parseDouble(vatPercentStr);
					double cal_vat = (unitPrice * 1.0 / 100 * vatPercent);
					System.out.println("Calculated_vat: " + cal_vat);

					double Price_incl_Tx = unitPrice + cal_vat;
					System.out.println("PriceInclTx: " + Price_incl_Tx);

					String discount_percentagestr = itemdiscountsTypes.get(0).getDiscount_percentage();
					double discountper = Double.parseDouble(discount_percentagestr);

					if (menuitemsTypes.get(0).isPrice_includes_tax()) {

						double calc_desc = 0.00;
						double discValue = unitPrice * (discountper / 100);
						calc_desc = unitPrice - discValue;

						System.out.println("Calculated_discount :=" + calc_desc);
					} else {

						double calc_desc = 0.00;
						double discValue = unitPrice * (discountper / 100);
						calc_desc = unitPrice + discValue;
						System.out.println("Calculated_discount :=" + calc_desc);
					}
				}

			} else {
				System.out.println("no data found");
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
