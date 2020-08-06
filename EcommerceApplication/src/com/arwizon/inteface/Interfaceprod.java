package com.arwizon.inteface;
import com.arwizon.shopping.Info.ProductInfo;

import java.util.*;

import com.arwizon.customer.Customer;

public interface Interfaceprod {
	
	public ProductInfo Addproduct(String Productname,int no_of_units,String Description,String Mfg_Name,double price,String Dis_per );
	public Customer Purchase_Product(String product_purchase,int qty);
	public Set<ProductInfo>search_product(String Name,Set<ProductInfo> prodList);
	public Set<ProductInfo>DeleteProduct(int Id,Set<ProductInfo> prodList);
	public Set<ProductInfo> update(int price1,int PId,Set<ProductInfo> prodList);
}
