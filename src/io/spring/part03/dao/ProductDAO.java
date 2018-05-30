package io.spring.part03.dao;

import java.util.List;

import io.spring.part03.model.Product;

public interface ProductDAO {
	List<Product> getAllProducts();

	Product getByProductId(String productId);
	List<Product> getProductsByCategory(String category);
	List<Product> getProductsByBrands(List<String> brands);
	void addProduct(Product product);
}
