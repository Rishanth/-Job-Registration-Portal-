
	
	package com.virtusa.vrps.model;


	import java.util.Date;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;

	@Entity
	@Table
	public class Experience 
	{
		private long experienceId;
		private String companyName;
		private String roleDesignation;
		private String lastReportingManger;
		private long lastReportingManagernumber;
		
		@Column
		public long getLastReportingManagernumber() {
			return lastReportingManagernumber;
		}
		public void setLastReportingManagernumber(long lastReportingManagernumber) {
			this.lastReportingManagernumber = lastReportingManagernumber;
		}
		private Date startDate;
		private Date endDate;
		private JobSeeker jobSeeker;
		
		@Id
		@GeneratedValue
		public long getExperienceId() {
			return experienceId;
		}
		public void setExperienceId(long experienceId) {
			this.experienceId = experienceId;
		}
		@Column
		public String getCompanyName()
		{
			return companyName;
		}
		public void setCompanyName(String companyName) 
		{
			this.companyName = companyName;
		}
		@Column
		public String getRoleDesignation() {
			return roleDesignation;
		}
		public void setRoleDesignation(String roleDesignation) {
			this.roleDesignation = roleDesignation;
		}
		@Column
		public String getLastReportingManger()
		{
			return lastReportingManger;
		}
		public void setLastReportingManger(String lastReportingManger) 
		{
			this.lastReportingManger = lastReportingManger;
		}
		
		@Column
		public Date getStartDate()
		{
			return startDate;
		}
		public void setStartDate(Date startDate) 
		
		{
			this.startDate = startDate;
		}
		@Column
		public Date getEndDate() 
		{
			return endDate;
		}
		public void setEndDate(Date endDate) 
		{
			this.endDate = endDate;
		}
		
		@ManyToOne
		public JobSeeker getJobSeeker() {
			return jobSeeker;
		}
		public void setJobSeeker(JobSeeker jobSeeker) {
			this.jobSeeker = jobSeeker;
		}
		
		

	}



