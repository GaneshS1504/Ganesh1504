package com.arwizon.inteface;

import java.util.*;

import com.arwizon.customer.Customer;
import com.arwizon.shopping.Info.ProductInfo;

public class Implementsprod implements Interfaceprod{

	@Override
	public ProductInfo Addproduct(String Productname, int no_of_units, String description, String Mfg_Name,double price,String Dis_per) {
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

	
	public  Customer Purchase_Product(String product_purchase,int qty) {
		
		Customer c=new Customer();
		c.setProduct_purchase(product_purchase);
		c.setQty(qty);
		return c;
		
		
	}

	@Override
	public Set<ProductInfo> search_product(String Name,Set<ProductInfo> prodList) {
		//ProductInfo [] arr1=new ProductInfo[prodList.size()];
		Set<ProductInfo> l=new HashSet<ProductInfo>();
		
		for (ProductInfo t :prodList)
		{
			if(t.getProductname().equals(Name))
			{
				l.add(t);
			}
				
		}
		return l;
		
	}


	@Override
	public Set<ProductInfo> DeleteProduct(int Id, Set<ProductInfo> prodList) {
		//Set<ProductInfo> s=new HashSet<ProductInfo>(prodList.size());
		for(ProductInfo i:prodList)
		{
			if(i.getProduct_ID()==Id)
			{
				prodList.remove(i);
				break;	
			}
			System.out.println();
		}
		
		return prodList;
	}


	@Override
	public Set<ProductInfo> update(int price1, int PId,Set<ProductInfo> prodList) {
		//ProductInfo update=new ProductInfo();
		for(ProductInfo k:prodList)
		{
			if(k.getProduct_ID()==PId)
				k.setNewprice(price1);
			  
			break;
		}
	
		
		return prodList;
	}
	
	

	
	}


