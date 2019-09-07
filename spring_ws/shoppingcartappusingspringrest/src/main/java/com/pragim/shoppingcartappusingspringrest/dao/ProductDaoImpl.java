package com.pragim.shoppingcartappusingspringrest.dao;

import java.util.List;

import org.hibernate.Query;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pragim.shoppingcartappusingspringrest.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	private static final Logger logger = Logger.getLogger(ProductDaoImpl.class); 

	@Autowired
	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public List<Product> getProductList() {
		logger.debug("inside ProductDaoImpl->getProductList ");
		Session session = factory.openSession();
		Query query = session.createQuery("from Product p");
		return query.list();
	}

	@Override
	public String addProduct(Product product) {
		Session session = null;
		try {
			session = factory.openSession();
			session.save(product);
			session.beginTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return "product added successfully";
	}

	@Override
	public String deleteProduct(int pId) {
		
		Session session = null;
		try {
			session = factory.openSession();
			Transaction beginTransaction = session.beginTransaction();
			Query query = session.createQuery("delete from Product p where p.id=:productId").setParameter("productId", pId);
			query.executeUpdate();
			beginTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return "product deleted successfully";
	}

	@Override
	public String updateProduct(Product product) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
			session = factory.openSession();
			Transaction beginTransaction = session.beginTransaction();
			session.update(product);
			beginTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		return "product updated successfully";
	}
		
	

}
