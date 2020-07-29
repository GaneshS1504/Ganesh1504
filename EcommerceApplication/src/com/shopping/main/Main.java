package com.shopping.main;

import com.arwizon.shopping.Info.ProductInfo;
import com.arwizon.inteface.Implementsprod;
import com.arwizon.inteface.interfaceprod;
import com.arwizon.customer.*;
import java.util.Scanner;



public class Main {
    
	static int ch;
	public static void main(String[] Args)
	{
		System.out.println("press 1 to add product");
		System.out.println("press 2 to display product");
		System.out.println("press 3 to search product");
		System.out.println("press 4 to purchase product");//for customer use
		System.out.println("press 5 to exit application");
		
		Scanner data=new Scanner(System.in);
	    System.out.println("enter how many Products data you want to enter");
        int n=data.nextInt();
        ProductInfo[] arr=new ProductInfo[n];
        
        while(true)
		{
			
			Scanner read=new Scanner(System.in);
			System.out.println("enter your choice");
			ch=read.nextInt();
			switch(ch)
			{
			      
			case 1:
				 
				        System.out.println("enter productname");
				        String Productname=read.next();
				        System.out.println("enter no_of_units");
				        int no_of_units=read.nextInt();
				        System.out.println("enter description");
				        String description=read.next();
				        System.out.println("enter manufacturer");
				        String Mfg_Name=read.next();
				        System.out.println("enter price of product");
				        double price=read.nextDouble();
				        System.out.println("enter discount percentage");
				        int Dis_per=read.nextInt();
				        
				        
				       interfaceprod p=new Implementsprod();
				       ProductInfo p1=p.Addproduct(Productname,no_of_units,description,Mfg_Name,price,Dis_per);
				        for(int i=0;i<arr.length;i++)
				        {
				        	if(arr[i]==null)
				        	{
				        		arr[i]=p1;
				        		break;
				        	}
				        }
			  break;
			case 2:
				
				for(ProductInfo i:arr)
				{
			         System.out.println(i);
				}
			  break;
			  
			case 3:
				System.out.println("enter product name to search");
				String Name=read.next();
				interfaceprod prod=new Implementsprod();
			    ProductInfo[] product=prod.search_product(Name,arr);
			    if(product[0]==null)
				{
					System.out.println("product not found");
				}
			    else
			    {
				for(ProductInfo t:product)
				{
					if(t==null)
						break;
					else
					System.out.println(t);
					
				}
			    }
				
				break;
			case 4:
			{
				
				System.out.println("enter Product name to purchase");
				String Prod_Name=read.next();
				for(int i=0;i<arr.length;i++)
				{
				if(Prod_Name.equals(arr[i].getProductname()))
				{
					System.out.println("product exist");
					System.out.println("enter Product qty to purchase");
					int qty=read.nextInt();
					interfaceprod c=new Implementsprod();
					Customer c1=c.Purchase_Product(Prod_Name, qty);
					System.out.println("you are purchasing:"+c1);
				}
				else
				{
					System.out.println("product not found");
				}
				
				}
				
			}
			break;
		
			case 6:
	           System.exit(1);
	           
			
			}
			
		}
		
	}

	}



