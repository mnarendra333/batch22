package com.pragim.shoppingcartappusingspringrest.service;

import java.util.List;

import com.pragim.shoppingcartappusingspringrest.model.Product;

public interface ProductService {
	
	public List<Product> getProductList();

	public String addProduct(Product product);

	public String deleteProduct(String id);

	public String updateProduct(Product product);

}
