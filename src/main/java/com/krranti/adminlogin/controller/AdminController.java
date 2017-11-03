package com.krranti.adminlogin.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.krranti.adminlogin.model.Admin;
import com.krranti.adminlogin.service.AdminServices;



@Controller
public class AdminController {

	@Autowired
	@Qualifier("adminSer")
	AdminServices adminSer;

// Post api method calling	
	
	@RequestMapping(value = "/Admin/", method = RequestMethod.POST)
	public @ResponseBody Admin addAdmin(@RequestBody Admin admin){
		Admin adm=adminSer.addAdmin(admin);
		//System.out.println(Controller.class + trainee.getTraineeName());
		return adm;
	}

// Get api method calling 
	
	 
	 @RequestMapping(value = "/adminlist/", method = RequestMethod.GET)
		public @ResponseBody
		List<Admin> getAdmin() {

			List<Admin> adminList = null;
			try {
				adminList = adminSer.getAllAdmin();
				

			} catch (Exception e) {
				e.printStackTrace();
			}

			return adminList;
		}
	
}
