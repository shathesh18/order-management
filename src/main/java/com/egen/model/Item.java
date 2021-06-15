package com.egen.model;

public class Item {

	private String itemId;
	private String itemName;
	private int quantity;
	private double tax;
	private double price;
	private double subtotal;
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		this.subtotal = this.price*this.quantity;
		this.subtotal = this.subtotal + this.tax/100*this.subtotal;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
		this.subtotal = this.price*this.quantity;
		this.subtotal = this.subtotal + this.tax/100*this.subtotal;
	}
	public double getSubtotal() {
		return subtotal;
	}
	

	public static double sum(Item a, Item b) {
		return a.getSubtotal()+b.getSubtotal();
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", quantity=" + quantity + ", price=" + price
				+ ", subtotal=" + subtotal + "]";
	}
	public Item(String itemId, String itemName, int quantity, double tax, double price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
		this.tax = tax;
		this.subtotal = this.price*this.quantity;
		this.subtotal = this.subtotal + this.tax/100*this.subtotal; 
	}
	public Item() {
		
	}
	
	
	
}
