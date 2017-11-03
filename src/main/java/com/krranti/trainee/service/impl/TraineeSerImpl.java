package com.krranti.trainee.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.krranti.model.Trainee;
import com.krranti.model.TraineeReport;
import com.krranti.model.Trainee_Leave;
import com.krranti.trainee.dao.TraineeDao;
import com.krranti.trainee.service.TraineeServices;

@Service("traineeSer")
@Transactional
public class TraineeSerImpl implements TraineeServices {

	@Autowired
	@Qualifier("traineeDao")
	TraineeDao traineeDao;
	
	public Trainee addTrainee(Trainee trainee) {
		
		Trainee tr=traineeDao.addTrainee(trainee);
		return tr;
	}
	
public Trainee_Leave addTraineeLeave(Trainee_Leave traineeleave) {
		
		Trainee_Leave tra=traineeDao.addTraineeLeave(traineeleave);
		return tra;
	}

	public TraineeReport addReport(TraineeReport traineereport) {
		
		TraineeReport trp=traineeDao.addReport(traineereport);
		return trp;
	}

	public List<Trainee> getAllTrainee() {
		return traineeDao.getAllTrainee();
	}

	public List<Trainee_Leave> getAllTraineeOnCurrentDateLeave(String cdate) {
		
		
		
		
		return traineeDao.getAllTraineeOnCurrentDateLeave(cdate);
	}
}
