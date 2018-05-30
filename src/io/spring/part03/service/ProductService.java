package io.spring.part03.service;

import java.util.List;

import io.spring.part03.model.Product;

public interface ProductService {
	List<Product> getAllProduct();
	Product getByProductId(String productId);
	List<Product> getProductsByCategory(String category);
	List<Product> getProductsByBrands(List<String> brands);
}
