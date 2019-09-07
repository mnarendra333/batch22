package com.pragim.shoppingcartappusingspringrest.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pragim.shoppingcartappusingspringrest.dao.ProductDao;
import com.pragim.shoppingcartappusingspringrest.model.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao dao;

	public void setDao(ProductDao dao) {
		this.dao = dao;
	}


	@Override
	public List<Product> getProductList() {
		return dao.getProductList();
	}


	@Override
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.addProduct(product);
	}


	@Override
	public String deleteProduct(String id) {
		// TODO Auto-generated method stub
		int pId = Integer.parseInt(id);
		return dao.deleteProduct(pId);
	}


	@Override
	public String updateProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.updateProduct(product);
	}

}
