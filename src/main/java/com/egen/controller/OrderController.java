package com.egen.controller;

import com.egen.model.Order;
import com.egen.repo.OrderRepositoryMock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;

@RestController
public class OrderController {
    /**
     * implement the following endpoints
     */
	@Autowired
	OrderRepositoryMock orderRepositoryMock;
    
	@GetMapping("/order")
    public ResponseEntity<List<Order>> getAllOrders(){
        return ResponseEntity.ok(this.orderRepositoryMock.getOrders());
    }

    @GetMapping("/order/{orderId}")
    public ResponseEntity<Order> getOrderById(@PathVariable(name="orderId") String id){
        return ResponseEntity.ok(this.orderRepositoryMock.getOrderById(id));
    }

    @GetMapping(value = "/order", 
    		  params = { "startTime", "endTime" })
    public ResponseEntity<List<Order>> getAllOrdersWithInInterval(@RequestParam("startTime") String startTime,@RequestParam("endTime") String endTime){
        //TODO
        return ResponseEntity.ok(this.orderRepositoryMock.getAllOrdersWithInInterval(startTime, endTime));
    }
//    
//    @GetMapping(value = "/order", 
//  		  params = { "startTime", "endTime" })
//    public ResponseEntity<List<Order>> getAllOrdersWithInInterval(@RequestParam("startTime") ZonedDateTime startTime, ZonedDateTime endTime){
//    	//TODO
//    	return null;
//    }

    @GetMapping(value = "/order", 
  		  params = {"zip"})
    public ResponseEntity<List<Order>> top10OrdersWithHighestDollarAmountInZip(@RequestParam("zip") String zip){
        //TODO
        return ResponseEntity.ok(this.orderRepositoryMock.getOrders());
    }

    public ResponseEntity<Order> placeOrder(Order order){
        return null;
    }

    public ResponseEntity<Order> cancelOrder(Order order){
        return null;
    }

    public ResponseEntity<Order> updateOrder(Order order){
        return null;
    }
}
