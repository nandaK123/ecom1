package com.abc.ecom1.service;

import java.util.List;

import com.abc.ecom1.entity.Order;
import com.abc.ecom1.entity.Product;

public interface OrderService {

	public Order SaveOrder(Order order);

	public Order getOrderDetails(int orderId);

	Order SaveOrder1(Order order);

	Product getProductByName(String productName);

	List<Product> getProductsByCategory(String category);
	
	


}