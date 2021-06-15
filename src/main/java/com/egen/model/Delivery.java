package com.egen.model;

public class Delivery {
	
	private String deliveryId;
	private String deliveryMethod;
	private double deliveryCharge;
	public String getDeliveryId() {
		return deliveryId;
	}
	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}
	public String getDeliveryMethod() {
		return deliveryMethod;
	}
	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}
	public double getDeliveryCharge() {
		return deliveryCharge;
	}
	public void setDeliveryCharge(double deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}
	@Override
	public String toString() {
		return "Delivery [deliveryId=" + deliveryId + ", deliveryMethod=" + deliveryMethod + ", deliveryCharge="
				+ deliveryCharge + "]";
	}
	public Delivery(String deliveryId, String deliveryMethod, double deliveryCharge) {
		super();
		this.deliveryId = deliveryId;
		this.deliveryMethod = deliveryMethod;
		this.deliveryCharge = deliveryCharge;
	}
	public Delivery() {
		
	}
	
}
