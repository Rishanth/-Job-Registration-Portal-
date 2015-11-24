package com.virtusa.vrps.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.virtusa.vrps.model.Address;
import com.virtusa.vrps.model.JobSeeker;
import com.virtusa.vrps.model.Qualification;
import com.virtusa.vrps.model.Skill;
import com.virtusa.vrps.model.Experience;

@Component
public class JobSeekerDao implements IJobSeekerDao
{
	@Autowired
	HibernateTemplate hibernateTemplate;

	public long saveOrUpdate(JobSeeker jobSeeker) 
	{
		if(null!=jobSeeker.getAddressSet() && !jobSeeker.getAddressSet().isEmpty())
		{
			for(Address address:jobSeeker.getAddressSet())
			{
				hibernateTemplate.saveOrUpdate(address);
			}
		}

if(null!=jobSeeker.getSkill() && !jobSeeker.getSkill().isEmpty())
	{
		for(Skill skill:jobSeeker.getSkill())
		{
			hibernateTemplate.saveOrUpdate(skill);
		}
	}
if(null!=jobSeeker.getQualification() && !jobSeeker.getQualification().isEmpty())
{
	for(Qualification qualification:jobSeeker.getQualification())
	{
		hibernateTemplate.saveOrUpdate(qualification);
	}
}

if(null!=jobSeeker.getExperience() && !jobSeeker.getExperience().isEmpty())
{
	for(Experience experience:jobSeeker.getExperience())
	{
		hibernateTemplate.saveOrUpdate(experience);
	}
}

	hibernateTemplate.saveOrUpdate(jobSeeker);

	return jobSeeker.getjobSeekerId();
	
}
	
	
	
	public JobSeeker get(long jobSeekerId) 
{
	return hibernateTemplate.get(JobSeeker.class,jobSeekerId);
		 
	}
	
	

/*	public void saveToSkill(Skill skill)
	{
		hibernateTemplate.saveOrUpdate(skill);
	}
	
*/
}