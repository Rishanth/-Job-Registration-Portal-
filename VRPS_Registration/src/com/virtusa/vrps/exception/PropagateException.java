package com.virtusa.vrps.exception;

public class PropagateException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 String message;
	public PropagateException(String message)
	{
		this.message=message;
		
	}
	
	public String toString()
	{
		return message;
	}

}