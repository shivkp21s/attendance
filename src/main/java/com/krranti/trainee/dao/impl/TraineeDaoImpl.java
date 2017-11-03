package com.krranti.trainee.dao.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.krranti.model.Trainee;
import com.krranti.model.TraineeReport;
import com.krranti.model.Trainee_Leave;
import com.krranti.trainee.dao.TraineeDao;
import com.krranti.utils.KrantiUtil;

@Service("traineeDao")
public class TraineeDaoImpl extends KrantiUtil implements TraineeDao{

	SessionFactory sessionFactory;
	Session session = null;
	Transaction tx = null;
    
	
	
	public Trainee addTrainee(Trainee trainee) {
		
		Integer id=(Integer)getSession().save(trainee);
		trainee.setTid(id);
		return trainee;
	}

	
public Trainee_Leave addTraineeLeave(Trainee_Leave traineeleave) {
		
		Integer id=(Integer)getSession().save(traineeleave);
		traineeleave.setLid(id);
		return traineeleave;
	}

	

public TraineeReport addReport(TraineeReport traineereport) {
	
	Integer id=(Integer)getSession().save(traineereport);
	traineereport.setRid(id);
	return traineereport;
}


	@SuppressWarnings("unchecked")
	@Override
	public List<Trainee> getAllTrainee(){
//		session = sessionFactory.openSession();
//		tx = session.beginTransaction();
	List<Trainee> traineeList = getSession().createCriteria(Trainee.class).list();   
		//tx.commit();  
		//session.close();
		return traineeList;
																																																																																																																												
	}


	@SuppressWarnings("unchecked")
	public List<Trainee_Leave> getAllTraineeOnCurrentDateLeave(String cdate) {
		
		Query query=getSession().createQuery("from Trainee_Leave where currentdate=?");
		query.setParameter(1, cdate);
		List<Trainee_Leave> list=query.list();
		return list;
	}
}
