package com.arwizon.customer;

public class Customer {
	
	private String product_purchase;
	private int qty;

	public String getProduct_purchase() {
		return product_purchase;
	}

	public void setProduct_purchase(String product_purchase) {
		this.product_purchase = product_purchase;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String toString()
	{
		return "product name:"+":"+this.product_purchase+" "+"qty:"+this.qty;
		
	}

}
