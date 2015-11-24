package com.virtusa.vrps.dao;

import com.virtusa.vrps.model.JobSeeker;

public interface IJobSeekerDao 
{
	public long saveOrUpdate(JobSeeker jobSeeker);
	//public void saveToAddress(Address address);
	public JobSeeker get(long jobSeekerId);
	//public void saveToSkill(Skill skill);

}