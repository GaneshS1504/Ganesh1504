package com.arwizon.shopping.Info;
public class ProductInfo {
	static int  count=100;
	private String Productname;
	private int no_of_units;
	private int Product_ID;
	private String Description;
	private String Mfg_Name;
	private double price;
	private String Dis_per;
	
	
	public ProductInfo()
	{
		count++;
	}
	
	public static int getCount()
	{
		return count;
	}
	
	public String getProductname() {
		return Productname;
	}

	public void setProductname(String productname) {
		this.Productname = productname;
	}

	public int getNo_of_units() {
		return no_of_units;
	}

	public void setNo_of_units(int no_of_units) {
		this.no_of_units = no_of_units;
	}

	public int getProduct_ID() {
		return Product_ID;
	}

	public void setProduct_ID(int product_ID) {
		this.Product_ID = product_ID;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getMfg_Name() {
		return Mfg_Name;
	}

	public void setMfg_Name(String mfg_Name) {
		Mfg_Name = mfg_Name;
	}
	
	
	public String toString()
	{
		return "product name"+":"+this.Productname+" "+"no of units:"+this.no_of_units+" "+"manufacturer:"+this.Mfg_Name+" "+"Description:"+this.Description+" "+"productId:"+this.Product_ID+" "+"price:"+this.price+" "+"discount rate:"+this.Dis_per;
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDis_per() {
		return Dis_per;
	}

	public void setDis_per(String dis_per) {
		this.Dis_per = dis_per;
	}
	
	public void setNewprice(int price1)
	{
		this.price=price1;
	}
	
	//public int compareTo(ProductInfo p)
	//{
		//System.out.println(p);
		//{
			//if(this.getProductname().compareTo(p.getProductname())>0)
				//return 1;
			//else if(this.getProductname().compareTo(p.getProductname())<0)
				//return -1;
			//else
				//return 0;
				
	//}

}

