package com.virtusa.vrps.model;



import java.util.Date;
import java.util.Set;

	import javax.persistence.Column;
	import javax.persistence.Entity;
import javax.persistence.FetchType;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Table
@Entity
public class JobSeeker
{

	
		private long jobSeekerId;
		
		private String firstName;
		private String lastName;
		private Date dateOfBirth;
		private String emailId;
		private long contactNumber;
		private double salary;
		public String userName;
		private String password;
		private String securityQuestion;
		private String securityQuestionAnswer;
	    private String imageFilePath;
	    private String resumeFilePath;
		
		private String bloodGroup;
		private Set<Address> addressSet;
		private Set<Skill> skill;
		private Set<Qualification>qualification;
		private Set<Experience>experience;
		
		@OneToMany(fetch=FetchType.EAGER)
		@JoinTable(name="vrps_jobseeker_experience")
		public Set<Experience> getExperience() {
			return experience;
		}
		public void setExperience(Set<Experience> experience) {
			this.experience = experience;
		}
		@OneToMany(fetch=FetchType.EAGER)
		@JoinTable(name="vrps_jobseeker_qualification")
		public Set<Qualification> getQualification() {
			return qualification;
		}
		public void setQualification(Set<Qualification> qualification) {
			this.qualification = qualification;
		}
		@OneToMany(fetch=FetchType.EAGER)
		@JoinTable(name="vrps_jobseeker_skill")
		public Set<Skill> getSkill() {
			return skill;
		}
		public void setSkill(Set<Skill> skill) {
			this.skill = skill;
		}
		@Id
		@GeneratedValue
		@Column(name="vrps_jobId")
		public long getjobSeekerId() {
			return jobSeekerId;
		}
		public void setjobSeekerId(long jobSeekerId) {
			this.jobSeekerId = jobSeekerId;
		}
		@Column(name="vrps_firstName")
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		@Column
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		@Column(name="vrps_dateOfbirth")
		public Date getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		@Column
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		@Column
		public long getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(long contactNumber) {
			this.contactNumber = contactNumber;
		}
		@Column
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		@Column
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		@Column
		
		public String getSecurityQuestion() {
			return securityQuestion;
		}
		public void setSecurityQuestion(String securityQuestion) {
			this.securityQuestion = securityQuestion;
		}
		
		@Column
		public String getSecurityQuestionAnswer() {
			return securityQuestionAnswer;
		}
		public void setSecurityQuestionAnswer(String securityQuestionAnswer) {
			this.securityQuestionAnswer = securityQuestionAnswer;
		}
		@Column
		public String getBloodGroup() {
			return bloodGroup;
		}
		public void setBloodGroup(String bloodGroup) {
			this.bloodGroup = bloodGroup;
		}
		@Column
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		@Column
		public String getImageFilePath() {
			return imageFilePath;
		}
		public void setImageFilePath(String imageFilePath) {
			this.imageFilePath = imageFilePath;
		}
		@Column
		
		public String getResumeFilePath() {
			return resumeFilePath;
		}
		public void setResumeFilePath(String resumeFilePath) {
			this.resumeFilePath = resumeFilePath;
		}
		
		@OneToMany(fetch=FetchType.EAGER)
		@JoinTable(name="vrps_jobseeker_address")
		public Set<Address> getAddressSet() {
			return addressSet;
		}
		public void setAddressSet(Set<Address> addressSet) {
			this.addressSet = addressSet;
		}
		
		/*@OneToMany
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		*/
		
		
		
		
		
	}


