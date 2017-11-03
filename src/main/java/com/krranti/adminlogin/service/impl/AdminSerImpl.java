package com.krranti.adminlogin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.krranti.adminlogin.dao.AdminDao;
import com.krranti.adminlogin.model.Admin;
import com.krranti.adminlogin.service.AdminServices;





@Service("adminSer")
@Transactional
public class AdminSerImpl implements AdminServices {

	@Autowired
	@Qualifier("adminDao")
	AdminDao adminDao;
	
	public Admin addAdmin(Admin admin) {
		
		Admin ad=adminDao.addAdmin(admin);
		return ad;
	}
	
	public List<Admin> getAllAdmin() {
		return adminDao.getAllAdmin();
	}
}
