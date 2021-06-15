package com.egen.repo;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.egen.model.*;
@Repository
public class OrderRepositoryMock {
	private List<Order> orders;

	public OrderRepositoryMock() {
		this.orders = new ArrayList<>();
		List<Item> items = new ArrayList<Item>();
		items.add(new Item(UUID.randomUUID().toString(), "board", 1, 12, 89));
		items.add(new Item(UUID.randomUUID().toString(), "caravan", 1, 10.5, 189));
		List<Payment> payments = new ArrayList<Payment>();
		Address shippingAddress = new Address(UUID.randomUUID().toString(), "123 Striker Ave", "Ragnarok st", "Asgard", "Greek Temple State", 13667);
		Address billingAddress = new Address(UUID.randomUUID().toString(), "153 Defender Ave", "Anfield st", "Liverpool", "Merseyside", 13267);
		
		payments.add(new Payment(UUID.randomUUID().toString(), "paypal",  ZonedDateTime.now(), UUID.randomUUID().toString(), billingAddress));
		payments.add(new Payment(UUID.randomUUID().toString(), "paypal", ZonedDateTime.now(), UUID.randomUUID().toString(), shippingAddress));
		Delivery delivery = new Delivery(UUID.randomUUID().toString(), "In store", 0);
		Order order = new Order(UUID.randomUUID().toString(), OrderStatus.INPROGRESS, UUID.randomUUID().toString(),items,
				payments, shippingAddress, ZonedDateTime.now(), ZonedDateTime.now(), delivery);
		
		this.orders.add(order);
		
		items = new ArrayList<Item>();
		items.add(new Item(UUID.randomUUID().toString(), "hot wheels", 8, 9, 39));
		payments = new ArrayList<Payment>();
		shippingAddress = new Address(UUID.randomUUID().toString(), "67 Tampa Ave", "Televe st", "Gaivo", "Estadio State", 65332);
		
		payments.add(new Payment(UUID.randomUUID().toString(), "credit card", ZonedDateTime.now(), UUID.randomUUID().toString(), shippingAddress));
		delivery = new Delivery(UUID.randomUUID().toString(), "home delivery", 5.8);
		order = new Order(UUID.randomUUID().toString(), OrderStatus.INPROGRESS, UUID.randomUUID().toString(),items,
				payments, shippingAddress, ZonedDateTime.now(), ZonedDateTime.now(), delivery);
		
		this.orders.add(order);
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Order getOrderById(String id) {
		for (Order order:orders) {
			if (order.getOrderId().equals(id)) return order;
		}
		return null;
	}
	
	public List<Order> getAllOrdersWithInInterval(String startTimeString, String endTimeString){
		ZonedDateTime startTime = ZonedDateTime.parse(startTimeString+"-04:00[America/New_York]");
		ZonedDateTime endTime = ZonedDateTime.parse(endTimeString+"-04:00[America/New_York]");
		
		return this.orders.stream()
				.filter(order-> order.getCreatedDateAsDate().hashCode()>=startTime.hashCode() && order.getCreatedDateAsDate().hashCode()<endTime.hashCode())
				.collect(Collectors.toList());
	}	
	
	
	
	
}
