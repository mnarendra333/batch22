package com.pragim.shoppingcartappusingspringrest.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pragim.shoppingcartappusingspringrest.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public List<Product> getProductList() {
		// TODO Auto-generated method stub
		Session session = factory.openSession();
		Query query = session.createQuery("from Product p");
		return query.list();
	}

}
