package com.virtusa.vrps.service;

import com.virtusa.vrps.exception.PropagateException;
import com.virtusa.vrps.pojo.Experience;
import com.virtusa.vrps.pojo.Qualification;
import com.virtusa.vrps.pojo.Address;
import com.virtusa.vrps.pojo.JobSeeker;
import com.virtusa.vrps.pojo.Skill;

public interface IJobSeekerService
{
	public long saveOrUpdate(JobSeeker jobSeeker) throws PropagateException;
	public long saveOrUpdate(Address address);
	public long saveOrUpdate(Skill skill);
	public long saveOrUpdate(Qualification qualification);
	public long saveOrUpdate(Experience experience);
	//public void saveToSkill(Skill skill);

}