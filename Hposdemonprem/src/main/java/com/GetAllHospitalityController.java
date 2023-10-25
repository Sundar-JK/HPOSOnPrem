//package com;
//
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import pojo.GetAllHospitalityTypess;
//
//
//

package com;

import java.util.List;

import javax.websocket.server.PathParam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pojo.GetAllHospitalityTypess;

@RestController
public class GetAllHospitalityController {

	@RequestMapping(path = "/getAllHospitalityTypes/{storecode}", method = RequestMethod.GET)
	public List<GetAllHospitalityTypess> getUser(@PathVariable String storecode) {
		System.out.println(storecode);
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(GetAllHospitalityTypess.class);
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

       
        String hql = "FROM GetAllHospitalityTypess WHERE store_code = :storecode";
        List<GetAllHospitalityTypess> GetAllHospitalityTypessList = session.createQuery(hql, GetAllHospitalityTypess.class)
                .setParameter("storecode", storecode)
                .list();

        transaction.commit();
        session.close();
        sessionFactory.close();
        return GetAllHospitalityTypessList;
    }
	
	@GetMapping("/getAllHospitalityTypes")
	public static List<GetAllHospitalityTypess> getUser() {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(GetAllHospitalityTypess.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		List<GetAllHospitalityTypess>GetAllHospitalityTypessList = session.createQuery("FROM GetAllHospitalityTypess", GetAllHospitalityTypess.class).list();
		
		transaction.commit();
		 session.close();
	     sessionFactory.close();
	     return GetAllHospitalityTypessList;
	}
}


