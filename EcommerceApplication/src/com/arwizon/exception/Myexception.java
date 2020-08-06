package com.arwizon.exception;
public class Myexception extends Exception {
	
	String msg;
	public Myexception(String msg)
	{
		this.msg=msg;
	}
	
	public String getmessage()
	{
         return msg;		
	}

	
}
