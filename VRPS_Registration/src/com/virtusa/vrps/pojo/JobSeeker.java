package com.virtusa.vrps.pojo;



import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class JobSeeker 
{
	private long jobSeekerId;
	
		private String firstName,lastName,emailId,userName,password,securityQuestion,securityQuestionAnswer,bloodGroup;
	
	
	private String dateOfBirth;
	
	private long contactNumber;
	
	private double salary;
	
	private CommonsMultipartFile imageContent;
	private CommonsMultipartFile resumeContent;
	
	private String imageFilePath;
	private String resumeFilePath;
	
	
	public long getjobSeekerId() {
		return jobSeekerId;
	}
	public void setjobSeekerId(long jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getSecurityQuestion() 
	{
		return securityQuestion;
	}
	public void setSecurityQuestion(String securityQuestion) 
	{
		this.securityQuestion = securityQuestion;
	}
	
	public String getSecurityQuestionAnswer() 
	{
		return securityQuestionAnswer;
	}
	public void setSecurityQuestionAnswer(String securityQuestionAnswer) 
	{
		this.securityQuestionAnswer = securityQuestionAnswer;
	}
	
	public String getBloodGroup() 
	{
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) 
	{
		this.bloodGroup = bloodGroup;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public CommonsMultipartFile getImageContent() {
		return imageContent;
	}
	public void setImageContent(CommonsMultipartFile imageContent) {
		this.imageContent = imageContent;
	}
	public CommonsMultipartFile getResumeContent() {
		return resumeContent;
	}
	public void setResumeContent(CommonsMultipartFile resumeContent) {
		this.resumeContent = resumeContent;
	}
	public String getImageFilePath() {
		return imageFilePath;
	}
	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}
	public String getResumeFilePath() {
		return resumeFilePath;
	}
	public void setResumeFilePath(String resumeFilePath) {
		this.resumeFilePath = resumeFilePath;
	}
	

}