package com.virtusa.vrps.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.virtusa.vrps.exception.PropagateException;

public class Utility 
{
	public static Date StringToDate(String dateOfBirth) throws PropagateException
	{
		Date date=null;
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
		
		try 
		{
			date=simpleDateFormat.parse(dateOfBirth);
		}
		catch (ParseException e) 
		{
			throw new PropagateException(e.toString());
		}
		return date;
		
	}
	
	public static String saveImage(CommonsMultipartFile imageContent,String userName) throws PropagateException
	{
		FileOutputStream fileOutputStream=null;
		String filePath="/home/test/VRPS_Registration/VRPS_Registration/WebContent/WEB-INF/cv/" +userName+".png";
		if(!imageContent.getOriginalFilename().equals(""))
		{
		try 
		{
			fileOutputStream=new FileOutputStream(new File(filePath));
			fileOutputStream.write(imageContent.getFileItem().get());
			
		} 
		catch (FileNotFoundException e) 
		{
			throw new PropagateException(e.toString());
		} 
		catch (IOException e) 
		{
			throw new PropagateException(e.toString());
		}
		return filePath;
	}
		return null;
	}
	
	public static String saveResume(CommonsMultipartFile resumeContent,String userName) throws PropagateException
	{
		FileOutputStream fileOutputStream=null;
		String filePath="/home/test/VRPS_Registration/VRPS_Registration/WebContent/WEB-INF/cv/" +"/"+userName+".docx";
		if(!resumeContent.getOriginalFilename().equals(""))
		{
		try 
		{
			fileOutputStream=new FileOutputStream(new File(filePath));
			fileOutputStream.write(resumeContent.getFileItem().get());
			
		} 
		catch (FileNotFoundException e) 
		{
			throw new PropagateException(e.toString());
		} 
		catch (IOException e) 
		{
			throw new PropagateException(e.toString());
		}
		return filePath;
	}
		return null;
	}
}