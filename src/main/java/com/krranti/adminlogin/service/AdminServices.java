package com.krranti.adminlogin.service;

import java.util.List;

import com.krranti.adminlogin.model.Admin;

public interface AdminServices {

	public Admin addAdmin(Admin admin);
	public List<Admin> getAllAdmin();
}
