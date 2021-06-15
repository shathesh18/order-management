package com.egen.model;

import java.util.Date;
import java.util.List;
import java.time.ZonedDateTime;

public class Order {
	private String orderId;
	private OrderStatus orderStatus;
	private String customerId;
	private List<Item> items;
	private double orderTotal;
	private List<Payment> payments;
	private Address shippingAddress;
	private ZonedDateTime createdDate;
	private ZonedDateTime modifiedDate;
	private Delivery delivery;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Delivery getDelivery() {
		return delivery;
	}

	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}

	public double getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getCreatedDate() {
		return createdDate.toString();
	}

	public ZonedDateTime getCreatedDateAsDate() {
		return createdDate;
	}
	public void setCreatedDate(ZonedDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedDate() {
		return modifiedDate.toString();
	}

	public void setModifiedDate(ZonedDateTime modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderStatus=" + orderStatus + ", customerId=" + customerId + ", items="
				+ items + ", orderTotal=" + orderTotal + ", payments=" + payments + ", shippingAddress="
				+ shippingAddress + ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate + ", delivery="
				+ delivery + "]";
	}

	public Order(String orderId, OrderStatus orderStatus, String customerId, List<Item> items, List<Payment> payments,
			Address shippingAddress, ZonedDateTime createdDate, ZonedDateTime modifiedDate, Delivery delivery) {
		super();
		this.orderId = orderId;
		this.orderStatus = orderStatus;
		this.customerId = customerId;
		this.items = items;
		this.payments = payments;
		this.shippingAddress = shippingAddress;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.delivery = delivery;
		this.orderTotal = this.delivery.getDeliveryCharge()
				+ this.items.stream().reduce(0.0, (sum, item) -> sum + item.getSubtotal(), Double::sum);
	}

	public Order() {

	}

}
