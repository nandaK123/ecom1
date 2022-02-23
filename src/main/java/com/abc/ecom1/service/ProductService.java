package com.abc.ecom1.service;
import java.util.List;

import com.abc.ecom1.entity.Product;

public interface ProductService {

	public Product  saveProduct(Product product);
	
	public List<Product> getAllProducts() ;

	public Product getProductById(int productId);

	public Product getProductByName(String productName);

	public List<Product> getProductsByCategory(String category);

	public Product updateProduct(Product product);

	public void deleteProduct(int productId);

	Product saveProduct1(Product product);

	List<Product> getAllProduct();

	List<Product> getAllProduct1();
}
	

