package com.shopping.main;
import com.arwizon.exception.Myexception;

public class Utilities {
	
	public static void check_productname(String Productname) throws Myexception
	{
	 String regx="[a-zA-Z]{3,8}";
     if(!Productname.matches(regx))
     {
        throw new Myexception("product name should be in alphabetes and between 3-8 charcter");
     
     }
     }
	
	public static boolean check_regx(String Dis_per)
	{
     while(true)
     {
     
     String regx="[1-9]{1,2}";
     if(Dis_per.matches(regx))
     {
        return true;
     
     }
     else
     {
    	 return false;
     }
     
     }
 
	}
}
