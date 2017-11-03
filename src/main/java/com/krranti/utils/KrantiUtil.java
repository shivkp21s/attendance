package com.krranti.utils;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.krranti.adminlogin.model.Admin;
import com.krranti.model.Trainee;

public class KrantiUtil {

	@Autowired
    private SessionFactory sessionFactory;
 
    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

	/*public List<Trainee> getAllTrainee() {
		// TODO Auto-generated method stub
		return null;
	}*/

	public List<Trainee> getAllTrainee() {
		// TODO Auto-generated method stub
		System.out.println("hello util");
		return getAllTrainee();
	}

	public List<Admin> getAllAdmin() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
