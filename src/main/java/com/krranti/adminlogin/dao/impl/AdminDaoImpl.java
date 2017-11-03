package com.krranti.adminlogin.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import com.krranti.adminlogin.dao.AdminDao;
import com.krranti.adminlogin.model.Admin;

import com.krranti.utils.KrantiUtil;

@Service("adminDao")
public class AdminDaoImpl extends KrantiUtil implements AdminDao{

	SessionFactory sessionFactory;
	Session session = null;
	Transaction tx = null;
    
	public Admin addAdmin(Admin admin) {
		
		Integer id=(Integer)getSession().save(admin);
		admin.setAid(id);
		return admin;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Admin> getAllAdmin(){
		//session = sessionFactory.openSession();
		//tx = session.beginTransaction();
	List<Admin> adminList = getSession().createCriteria(Admin.class).list();   
		
		//session.close();
		return adminList;
		
	}
	

}
