package com.shopping.main;
import com.arwizon.shopping.Info.ProductInfo;
import com.arwizon.inteface.Implementsprod;
import com.arwizon.inteface.Interfaceprod;
//import com.arwizon.customer.*;
import com.arwizon.exception.Myexception;

import java.util.*;

public class Main {

	static int ch;

	public static void main(String[] Args) {
		System.out.println("press 1 to add product");
		System.out.println("press 2 to display product");
		System.out.println("press 3 to search product");
		System.out.println("press 4 to purchase product");// for customer use
		System.out.println("press 5 to exit application");

		Scanner data = new Scanner(System.in);
		System.out.println("enter how many Products data you want to enter");
		//int n = data.nextInt();
		//ProductInfo[] arr = new ProductInfo[n];
		//List<ProductInfo>prodList=new LinkedList<ProductInfo>();
		Set<ProductInfo>prodList=new HashSet<ProductInfo>();

		while (true) {

			Scanner read = new Scanner(System.in);
			System.out.println("enter your choice");
			ch = read.nextInt();
			switch (ch) {

			case 1:
				String Productname;
				while (true) {
					System.out.println("enter productname");
					Productname = read.next();
					try {
						Utilities.check_productname(Productname);
						break;
					} catch (Myexception e) {
						
							System.out.println(e.getmessage());
						

					}
				
				}

				System.out.println("enter no_of_units");
				int no_of_units = read.nextInt();
				System.out.println("enter description");
				String description = read.next();
				System.out.println("enter manufacturer");
				String Mfg_Name = read.next();
				System.out.println("enter price of product");
				double price = read.nextDouble();

				String Dis_per;
				while (true) {
					System.out.println("enter discount percentage");
					Dis_per = read.next();
					
					boolean res = Utilities.check_regx(Dis_per);

					if (res == true) {
						break;
					}
				}

				Interfaceprod p = new Implementsprod();
				ProductInfo p1 = p.Addproduct(Productname, no_of_units, description, Mfg_Name, price, Dis_per);
				//for (int i = 0; i < arr.length; i++) {
					//if (arr[i] == null) {
						//arr[i] = p1;
						//break;
					//}
				prodList.add(p1);
			
				break;
			
				case 2:

				for (ProductInfo i : prodList) {
					System.out.println(i);
				}
				break;
			
			case 3:
				System.out.println("enter product name to search");
				String Name = read.next();
				Interfaceprod prod = new Implementsprod();
				Set<ProductInfo> product = prod.search_product(Name, prodList);
				if (product.size() == 0) {
					System.out.println("product not found");
				} else {
					
					System.out.println(product);
					

 					}
		         break;
			case 4:
				System.out.println("enter the Id to be deleted");
				int Id=read.nextInt();
				Interfaceprod del = new Implementsprod();
				prodList=del.DeleteProduct(Id,prodList);
				for(ProductInfo j:prodList)
				{
					System.out.println(j);
				}
				break;
				  
			case 5:
				System.out.println("enter the ProductId to be updated");
				int PId=read.nextInt();
				System.out.println("enter the what you want to update");
				int price1=read.nextInt();
				Interfaceprod up = new Implementsprod();
				prodList=up.update(price1,PId,prodList);
				for(ProductInfo l:prodList)
				{
				System.out.println(l);
				}
			}
		
	}
		}
}

				


				

			



