package com.arwizon.inteface;
import com.arwizon.shopping.Info.ProductInfo;
import com.arwizon.customer.Customer;
//
public interface interfaceprod {
	
	public ProductInfo Addproduct(String Productname,int no_of_units,String Description,String Mfg_Name,double price,String Dis_per );
	public Customer Purchase_Product(String product_purchase,int qty);
	public ProductInfo[] search_product(String Name,ProductInfo[] arr);

}
