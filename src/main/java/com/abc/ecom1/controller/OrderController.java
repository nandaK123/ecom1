package com.abc.ecom1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.ecom1.entity.Order;
import com.abc.ecom1.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/create")
	public ResponseEntity<Order> placeOrder(@RequestBody Order order) {

		Order newOrder = orderService.SaveOrder(order);

		return new ResponseEntity<>(newOrder,HttpStatus.CREATED);

	}
}