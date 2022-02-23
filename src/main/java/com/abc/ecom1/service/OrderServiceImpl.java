package com.abc.ecom1.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.ecom1.entity.Order;
import com.abc.ecom1.entity.Product;
import com.abc.ecom1.exception.ProductNotFoundException;
import com.abc.ecom1.exception.ResourceNotFoundException;
import com.abc.ecom1.repository.OrderRepository;
import com.abc.ecom1.repository.ProductRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Order SaveOrder1(Order order) {

		order.setOrderDate(LocalDate.now());

		// calcualte Order amount

		int productId = order.getProductId();

		Optional<Product> optionalProduct = productRepository.findById(productId);

		if(optionalProduct.isEmpty()) {
			throw new ProductNotFoundException("Product not exising with id: "+productId);
		}
		else {
			Product product = optionalProduct.get();
			double unitPrice = product.getProductprice();
			double orderAmount = order.getQuantity() * unitPrice;

			order.setOrderAmount(orderAmount);
		}		

		Order newOrder = orderRepository.save(order);
		return newOrder;
	}

	@Override
	public Order getOrderDetails(int orderId) {

		Optional<Order> optionalOrder = orderRepository.findById(orderId);
		if(optionalOrder.isEmpty()) {
			throw new ResourceNotFoundException("Order not found with Order Id: "+orderId);
		}

		return optionalOrder.get();
	}

	@Override
	public Product getProductByName(String productName) {

		Product product = productRepository.findByProductName(productName);

		return product;
	}

	@Override
	public List<Product> getProductsByCategory(String category) {

		return productRepository.findProductByCategory(category);
	}

	@Override
	public Order SaveOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

}