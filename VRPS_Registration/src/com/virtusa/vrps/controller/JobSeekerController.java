package com.virtusa.vrps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.vrps.exception.PropagateException;
import com.virtusa.vrps.pojo.Address;
import com.virtusa.vrps.pojo.Experience;
import com.virtusa.vrps.pojo.JobSeeker;
import com.virtusa.vrps.pojo.Qualification;
import com.virtusa.vrps.pojo.Skill;
import com.virtusa.vrps.service.IJobSeekerService;


@Controller
public class JobSeekerController {
   
    @Autowired
    IJobSeekerService iJobSeekerService;
   
    @RequestMapping(value="/jobSeekerRegistration")
    public ModelAndView displayJobSeekerRegistrationForm()
    {
        return new ModelAndView("jobSeekerForm","jobSeeker",new JobSeeker());
    }

   
           
        @RequestMapping(value="/addJobSeeker",method=RequestMethod.POST)
        public ModelAndView addJobSeeker(@ModelAttribute("jobSeeker") JobSeeker jobSeeker,BindingResult result)
        {


            try
            {
                Address address=new Address();


                address.setJobSeekerId(iJobSeekerService.saveOrUpdate(jobSeeker));
                return new ModelAndView("address","address",address);

            }
            catch (PropagateException e)
            {

                System.out.println(e);
                return null;
            }

        }
       
 @RequestMapping(value="/addToAddressDatabase")
 public ModelAndView addAddress(@ModelAttribute("address") Address address,BindingResult result)
 {

    /*    Address newAddress= new Address();                   
        newAddress.setJobSeekerId(iJobSeekerService.saveOrUpdate(address));   
        return new  ModelAndView("skill","skill",newAddress);*/
     Skill skill=new Skill();
     skill.setJobSeekerId(iJobSeekerService.saveOrUpdate(address));
     return new ModelAndView("skill","skill",skill);
 }
       
 @RequestMapping(value="/addToSkillDatabase")
 public ModelAndView addSkill(@ModelAttribute("skill") Skill skill,BindingResult result)
 {

  /*      Skill newSkill=new Skill();               
        newSkill.setJobSeekerId(iJobSeekerService.saveOrUpdate(skill));   
        return new  ModelAndView("skill","skill",newSkill);
 */
	 
	 Qualification qualification=new Qualification();
	 qualification.setJobSeekerId(iJobSeekerService.saveOrUpdate(skill));
	 return new  ModelAndView("qualification","qualification",qualification);
	 
 }   
 
 
 @RequestMapping(value="/addToQualificationDatabase")
 public ModelAndView addQualification(@ModelAttribute("qualification") Qualification qualification,BindingResult result)
 {

    /*    Address newAddress= new Address();                   
        newAddress.setJobSeekerId(iJobSeekerService.saveOrUpdate(address));   
        return new  ModelAndView("skill","skill",newAddress);*/
     Experience experience=new Experience();
     experience.setJobSeekerId(iJobSeekerService.saveOrUpdate(qualification));
     return new ModelAndView("experience","experience",experience);
 }
 
 @RequestMapping(value="/addToExperienceDatabase")
public  ModelAndView addExperience(@ModelAttribute("experience") Experience experience,BindingResult result) 
 {  
	 Experience newExperience=new Experience();
	 newExperience.setJobSeekerId(iJobSeekerService.saveOrUpdate(experience));
	return new ModelAndView("success");
	 
 }
 
 
 
}