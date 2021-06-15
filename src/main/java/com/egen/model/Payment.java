package com.egen.model;

import java.time.ZonedDateTime;
import java.util.Date;

public class Payment {

	private String paymentId;
	private String paymentMethod;
	private ZonedDateTime payment_date;
	private String confirmation_number;
	private Address billingAddress;
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getPayment_date() {
		return payment_date.toString();
	}
	public void setPayment_date(ZonedDateTime payment_date) {
		this.payment_date = payment_date;
	}
	public String getConfirmation_number() {
		return confirmation_number;
	}
	public void setConfirmation_number(String confirmation_number) {
		this.confirmation_number = confirmation_number;
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentMethod=" + paymentMethod + ", payment_date=" + payment_date
				+ ", confirmation_number=" + confirmation_number + ", billingAddress=" + billingAddress + "]";
	}
	public Payment(String paymentId, String paymentMethod, ZonedDateTime payment_date, String confirmation_number,
			Address billingAddress) {
		super();
		this.paymentId = paymentId;
		this.paymentMethod = paymentMethod;
		this.payment_date = payment_date;
		this.confirmation_number = confirmation_number;
		this.billingAddress = billingAddress;
	}
	
	public Payment() {
		
	}
	
	

}
