package Com;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Com.shift;
import com.google.gson.Gson;
public class gethttp {
	  public static void main(String[] args) {
	        String preurl = "http://d365hposvmv1.uaenorth.cloudapp.azure.com:4003/HPOSServerUAT/public/api/";        
	        String fullUrl = preurl + API.shift ;
	        String info = executeGet(fullUrl);
	        System.out.println(info);
	        Gson gson = new Gson();
	        shift[] shiftArray = gson.fromJson(info, shift[].class);
	        System.out.println("done1");
	        
	    	Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(shift.class);
			System.out.println("done2");
			SessionFactory sessionFactory=cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println("done3");
			try {
				Transaction transaction=session.beginTransaction();
				System.out.println("done4");
				for (shift spojo : shiftArray) {
		               
	                shift entity = new shift();
	                System.out.println("done5");
	                entity.setId(spojo.getId());
	                entity.setCreated_at(spojo.getCreated_at());
	                
	                System.out.println();
	                entity.setUpdated_at(spojo.getUpdated_at());
	                entity.setShift_id(spojo.getShift_id());
	                entity.setLable_id(spojo.getLabel_id());

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
	     		
//	        for (shift spojo : shiftArray) {
//	            System.out.println("ID: " + spojo.getId());
//	            System.out.println("created "+ spojo.getCreated_at());
//	            System.out.println("updatedat"+ spojo.getUpdated_at());
//	            System.out.println("shift_id"+spojo.getShift_id());
//	            System.out.println("lable id"+spojo.getLable_id());
//	        }
	       
//	        System.out.println(info);
	        
	        
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

