
	
	
package com.virtusa.vrps.pojo;

import java.util.Date;


	
	public class Experience 
	{
		private long experienceId;
		private String companyName;
		private String roleDesignation;
		private String lastReportingManger;
		private long lastReportingManagernumber;
		private Date startDate;
		private Date endDate;
		
	    public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}
		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}
		private long jobSeekerId;
		
		
		public long getExperienceId() {
			return experienceId;
		}
		public void setExperienceId(long experienceId) {
			this.experienceId = experienceId;
		}
		
		public String getCompanyName()
		{
			return companyName;
		}
		public void setCompanyName(String companyName) 
		{
			this.companyName = companyName;
		}
		
		public String getRoleDesignation() {
			return roleDesignation;
		}
		public void setRoleDesignation(String roleDesignation) {
			this.roleDesignation = roleDesignation;
		}
		
		public String getLastReportingManger()
		{
			return lastReportingManger;
		}
		public void setLastReportingManger(String lastReportingManger) 
		{
			this.lastReportingManger = lastReportingManger;
		}
		
	public long getLastReportingManagernumber() {
			return lastReportingManagernumber;
		}
		public void setLastReportingManagernumber(long lastReportingManagernumber) {
			this.lastReportingManagernumber = lastReportingManagernumber;
		}
		public Date getStartDate() {
			return startDate;
		}
		public Date getEndDate() {
			return endDate;
		}
		public long getJobSeekerId() {
			return jobSeekerId;
		}
		public void setJobSeekerId(long jobSeekerId) {
			this.jobSeekerId = jobSeekerId;
		}
		
		
		

	}



