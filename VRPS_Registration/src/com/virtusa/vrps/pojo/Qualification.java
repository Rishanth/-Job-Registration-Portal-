package com.virtusa.vrps.pojo;

import java.util.Date;



public class Qualification {
	
	private long qualificationId;
	private String degreeName;
	private String university;
	private String collegeName;
	private Date fromDate;
	private Date toDate;
	private double aggregate;
	private long jobSeekerId;
	public long getQualificationId() {
		return qualificationId;
	}
	public void setQualificationId(long qualificationId) {
		this.qualificationId = qualificationId;
	}
	public String getDegreeName() {
		return degreeName;
	}
	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public double getAggregate() {
		return aggregate;
	}
	public void setAggregate(double aggregate) {
		this.aggregate = aggregate;
	}
	public long getJobSeekerId() {
		return jobSeekerId;
	}
	public void setJobSeekerId(long jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}
	
	
	
}