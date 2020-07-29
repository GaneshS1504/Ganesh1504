package com.arwizon.inteface;
//import com.shopping.main.Main;

import com.arwizon.customer.Customer;
import com.arwizon.shopping.Info.ProductInfo;

public class Implementsprod implements interfaceprod{

	@Override
	public ProductInfo Addproduct(String Productname, int no_of_units, String description, String Mfg_Name,double price,int Dis_per) {
		ProductInfo p=new ProductInfo();
		p.setProductname(Productname);
		p.setNo_of_units(no_of_units);
		p.setDescription(description);
		p.setMfg_Name(Mfg_Name);
		p.setProduct_ID(ProductInfo.getCount());
		p.setPrice(price);
		p.setDis_per(Dis_per);
		
		
		return p;
	}

	@Override
	public  Customer Purchase_Product(String product_purchase,int qty) {
		
		Customer c=new Customer();
		c.setProduct_purchase(product_purchase);
		c.setQty(qty);
		return c;
		
		
	}

	@Override
	public ProductInfo[] search_product(String Name,ProductInfo[] arr) {
		ProductInfo [] arr1=new ProductInfo[arr.length];
		int j=0;
		
		for (int i=0;i<arr.length;i++)
		{
			if(Name.equals(arr[i].getProductname()))
					{
				         arr1[j]=arr[i];
				         j++;
					}
		}
		return arr1;
		
	}

	
	}


