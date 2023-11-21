package com;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pojo.userss;




@RestController
public class UserController {
	
	@GetMapping("/use")
	public List<userss> getUser() {
	
	
	 	List<userss> userList = new ArrayList<>();
//         Add multiple users to the list
        userList.add(new userss(11, "KDSFOUR", "kds4@apntbs.com", null, null, null));
        userList.add(new userss(12, "KDSFIVE", "kds5@example.com", null, null, null));
        userList.add(new userss(2, "w2", "anilkumar.mukalla@apntbs.com", "Developer", null, null));

		
		return userList;
	}

	 
}
 