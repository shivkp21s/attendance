package com.krranti.model;

import java.io.Serializable;
import java.sql.Date;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "trainee_tbl1")
public class Trainee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "tid")
	private Integer tid;

	@Column(name = "traineeName")
	private String traineeName;

	@Column(name = "traineeEmail")
	private String traineeEmail;

	@Column(name = "traineePhone")
	private String traineePhone;

	@Column(name = "doj")
	private Date doj;

	@Column(name = "dob")
	private Date dob;
	// private byte imag[];

//	@OneToMany(cascade = CascadeType.ALL, targetEntity = Trainee_Leave.class)
//	@JoinColumn(name = "tid", referencedColumnName = "tid")
//	List<Trainee_Leave> tLeaveList;

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public String getTraineeEmail() {
		return traineeEmail;
	}

	public void setTraineeEmail(String traineeEmail) {
		this.traineeEmail = traineeEmail;
	}

	public String getTraineePhone() {
		return traineePhone;
	}

	public void setTraineePhone(String traineePhone) {
		this.traineePhone = traineePhone;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

//	public List<Trainee_Leave> gettLeaveList() {
//		return tLeaveList;
//	}
//
//	public void settLeaveList(List<Trainee_Leave> tLeaveList) {
//		this.tLeaveList = tLeaveList;
//	}

}