package com.krranti.trainee.service;

import java.util.List;

import com.krranti.model.Trainee;
import com.krranti.model.TraineeReport;
import com.krranti.model.Trainee_Leave;

public interface TraineeServices {

	public Trainee addTrainee(Trainee trainee);
	public Trainee_Leave addTraineeLeave(Trainee_Leave traineeleave);
	public TraineeReport addReport(TraineeReport traineereport);
	public List<Trainee> getAllTrainee();
	public List<Trainee_Leave> getAllTraineeOnCurrentDateLeave(String cdate);
}
