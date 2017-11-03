package com.krranti.adminlogin.dao;



import java.util.List;

import com.krranti.adminlogin.model.Admin;



public interface AdminDao {

	public Admin addAdmin(Admin admin);
	public List<Admin> getAllAdmin();
}
