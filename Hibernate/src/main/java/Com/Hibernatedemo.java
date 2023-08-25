package Com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hibernatedemo {
public static void main(String[] args) {
	//first//
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Users.class);
	System.out.println("config loaded");
	
	
	//second//
	SessionFactory sessionFactory=cfg.buildSessionFactory();
	
	
	//last//
	Session session = sessionFactory.openSession();
	Transaction transaction=session.beginTransaction();
	
	
	//retrive full table data//
	List<Users> userList = session.createQuery("from Users", Users.class).getResultList();
	for (Users u : userList) {
	    System.out.println("ID: " + u.getId() + ", Name: " + u.getName() + ", email: " + u.getEmail()+" ,role :" +u.getRole()+" , shidt_id :" +u.getShift_id()+",branch_id :" +u.getBranch_id());
	
	     Users user = new Users();
	     user.setId(u.getId());
	     user.setName(u.getName());
	     user.setEmail(u.getEmail());
	     user.setRole(u.getRole());
	     user.setShift_id(u.getShift_id());
	     user.setBranch_id(u.getBranch_id());
	     session.save(user);

	}
	transaction.commit();
	session.close();
	
	// retrive single row//
	
//	Users u=session.get(Users.class,1);
//	System.out.println("ID:"+u.getId());
//	System.out.println("name : "+u.getName());
//	System.out.println("marks :"+ u.getMarks());
//	session.close();
	
	// insert data//
//	User u5 = new User (5,"mavish",88);
//	session.save(u5);
//	transaction.commit();
	
	System.out.println("session closed/saved ");
}
}
