package com.pragim.shoppingcartappusingspringrest.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pragim.shoppingcartappusingspringrest.model.Product;
import com.pragim.shoppingcartappusingspringrest.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	private ProductService service;

	public void setService(ProductService service) {
		this.service = service;
	}

	@GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProductList() {

		return service.getProductList();
	}

	/*
	 * @PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	 * public String addProduct(@RequestBody Product product) {
	 * proList.add(product); return "product added successfully"; }
	 */

//	@DeleteMapping(value = "/delete/{id}")
//	public String deleteProduct(@PathVariable("id") String id) {
//
//		int pid = Integer.parseInt(id);
//
//		for (Product product : proList) {
//			if (product.getId() == pid)
//				proList.remove(product);
//		}
//		return "product deleted successfully";
//	}

//	@DeleteMapping(value = "/delete")
//	public String deleteProduct(@RequestParam("id") String id) {
//
//		int pid = Integer.parseInt(id);
//		Iterator<Product> iterator = proList.iterator();
//		while (iterator.hasNext()) {
//			Product product = iterator.next();
//			if (product.getId() == pid)
//				iterator.remove();
//		}
//		return "product deleted successfully";
//	}
//
//	@PutMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
//	public Map<String, String> updateProduct(@RequestBody Product product) {
//
//		for (Product product2 : proList) {
//			if (product2.getId() == product.getId()) {
//				product2.setPrice(product.getPrice());
//			}
//		}
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("message", "product updated successfully");
//		return map;
//	}

}
