package com.krranti.trainee.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.krranti.model.Trainee;
import com.krranti.model.TraineeReport;
import com.krranti.model.Trainee_Leave;
import com.krranti.trainee.service.TraineeServices;

@Controller
public class TraineeController {

	@Autowired
	@Qualifier("traineeSer")
	TraineeServices traineeSer;
	
	 @RequestMapping(value = "/Trainee/", method = RequestMethod.POST)
	public @ResponseBody Trainee addTrainee(@RequestBody Trainee trainee){
		Trainee tra=traineeSer.addTrainee(trainee);
		//System.out.println(Controller.class + trainee.getTraineeName());
		return tra;
	}
	 
	//@RequestMapping(value = "/Trainee/", method = RequestMethod.GET)
	 
	 @RequestMapping(value = "/list/", method = RequestMethod.GET)
		public @ResponseBody
		List<Trainee> getTrainee() {

			List<Trainee> traineeList = null;
			try {
				traineeList = traineeSer.getAllTrainee();           

			} catch (Exception e) {
				e.printStackTrace();
			}

			return traineeList;
		}
	 
	 // insert for leave
	 @RequestMapping(value = "/Trainee_leave/", method = RequestMethod.POST)
		public @ResponseBody Trainee_Leave addTraineeLeave(@RequestBody Trainee_Leave traineeleave){
			Trainee_Leave tra=traineeSer.addTraineeLeave(traineeleave);
			//System.out.println(Controller.class + trainee.getTraineeName());
			return tra;
		}
	 
	 @RequestMapping(value = "/getTrainee_leave/", method = RequestMethod.GET)
		public @ResponseBody List<Trainee_Leave> getTraineeLeave(){
			
		 Timestamp t=new Timestamp(System.currentTimeMillis());
		 String s=t.toString();
		 List<Trainee_Leave> tLeaveList=traineeSer.getAllTraineeOnCurrentDateLeave(s.split(" ")[0]);
		 return tLeaveList;
		}
	 
	 //trainee report
		@RequestMapping(value = "/TraineeReport/", method = RequestMethod.POST)
		public @ResponseBody TraineeReport addReport(@RequestBody TraineeReport traineereport){
			TraineeReport trp=traineeSer.addReport(traineereport);
			//System.out.println(Controller.class + trainee.getTraineeName());
			return trp;
		}
		
}
