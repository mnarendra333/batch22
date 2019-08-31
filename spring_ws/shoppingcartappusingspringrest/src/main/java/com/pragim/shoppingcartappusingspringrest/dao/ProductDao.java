package com.pragim.shoppingcartappusingspringrest.dao;

import java.util.List;

import com.pragim.shoppingcartappusingspringrest.model.Product;

public interface ProductDao {
	public List<Product> getProductList();
}
