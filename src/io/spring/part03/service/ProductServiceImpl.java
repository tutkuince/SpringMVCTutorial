package io.spring.part03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.spring.part03.dao.ProductDAO;
import io.spring.part03.model.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDAO productDAO;
	
	@Override
	public List<Product> getAllProduct() {
		return productDAO.getAllProducts();
	}

	@Override
	public Product getByProductId(String productId) {
		return productDAO.getByProductId(productId);
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		return productDAO.getProductsByCategory(category);
	}
}
