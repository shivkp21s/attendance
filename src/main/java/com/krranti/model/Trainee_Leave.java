package com.krranti.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainee_leave_tbl")
public class Trainee_Leave implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	
	@Column(name = "lid")
	private Integer lid;
	
	@Column(name = "tid")
	private Integer tid;
	
	@Column(name = "traineeName")
	private String traineeName;
	
	@Column(name="leaveReson")
	private String reson;
	
	@Column(name = "leaveFrom")
	private Date leaveFrom;
	
	@Column(name = "leaveTo")
	private Date leaveTo;

	
	@Column(name = "currentdate")
	private Date currentdate;
	
	public Integer getLid() {
		return lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
	}

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

	public Date getLeaveFrom() {
		return leaveFrom;
	}

	public void setLeaveFrom(Date leaveFrom) {
		this.leaveFrom = leaveFrom;
	}

	public Date getLeaveTo() {
		return leaveTo;
	}

	public void setLeaveTo(Date leaveTo) {
		this.leaveTo = leaveTo;
	}
	
	public String getReson() {
		return reson;
	}
	
	public void setReson(String reson) {
		this.reson = reson;
	}

	public Date getCurrentdate() {
		return currentdate;
	}

	public void setCurrentdate(Date currentdate) {
		this.currentdate = currentdate;
	}
	
	
}
