package com.capgemini.product.service;

import java.util.List;

import com.capgemini.product.entity.Product;
import com.capgemini.product.exception.ProductNotFoundException;

public interface ProductService {

	public Product addProduct(Product product);

	public Product updateProduct(Product product);

	public Product findProductById(int productId) throws ProductNotFoundException;

	public void deleteProduct(Product product);
	
	public List<Product> findByProductName(String productName) throws ProductNotFoundException;
	
	public List<Product> findByProductCategory(String productCategory) throws ProductNotFoundException;
	
	public List<Product> findByProductByRange(String productCategory, double min, double max) throws ProductNotFoundException;

}


