package io.spring.part03.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import io.spring.part03.model.Product;

@Component
public class ProductDAOImpl implements ProductDAO {

	private List<Product> listOfProducts = new ArrayList<>();

	public ProductDAOImpl() {
		Product prod1 = new Product("P101", "Iphone X", 5600);
		prod1.setCategory("Mobile Phone");
		prod1.setDescription("The best iphone ever");
		prod1.setManufacturer("Apple");
		prod1.setCondition("In stock");
		prod1.setUnitsInStock(300);

		Product prod2 = new Product("P102", "Iphone 8 Plus", 4600);
		prod2.setCategory("Mobile Phone");
		prod2.setDescription("Not best iphone");
		prod2.setManufacturer("Apple");
		prod2.setCondition("In stock");
		prod2.setUnitsInStock(300);

		Product prod3 = new Product("P103", "Iphone 7", 3600);
		prod3.setCategory("Mobile Phone");
		prod3.setDescription("Old but good iphone");
		prod3.setManufacturer("Apple");
		prod3.setCondition("In stock");
		prod3.setUnitsInStock(100);

		Product prod4 = new Product("P105", "Note 8", 4900);
		prod4.setCategory("Mobile Phone");
		prod4.setDescription("The best samsung ever");
		prod4.setManufacturer("Samsung");
		prod4.setCondition("In stock");
		prod4.setUnitsInStock(400);

		Product prod5 = new Product("P106", "Galaxy S 9", 5200);
		prod5.setCategory("Mobile Phone");
		prod5.setDescription("The best samsung ever after note 8");
		prod5.setManufacturer("Samsung");
		prod5.setCondition("In stock");
		prod5.setUnitsInStock(200);

		Product prod6 = new Product("C101", "GT Titan Pro", 9900);
		prod6.setCategory("Laptop");
		prod6.setDescription("Feel the power");
		prod6.setManufacturer("MSI");
		prod6.setCondition("In stock");
		prod6.setUnitsInStock(100);

		Product prod7 = new Product("C102", "GE 72 7QF", 6900);
		prod7.setCategory("Laptop");
		prod7.setDescription("Feel the power");
		prod7.setManufacturer("MSI");
		prod7.setCondition("In stock");
		prod7.setUnitsInStock(100);

		Product prod8 = new Product("C103", "Legion Y720", 7900);
		prod8.setCategory("Laptop");
		prod8.setDescription("Feel the quality");
		prod8.setManufacturer("Lenovo");
		prod8.setCondition("In stock");
		prod8.setUnitsInStock(100);

		Product prod9 = new Product("C104", "Legion Y520", 5900);
		prod9.setCategory("Laptop");
		prod9.setDescription("Feel the quality");
		prod9.setManufacturer("Lenovo");
		prod9.setCondition("In stock");
		prod9.setUnitsInStock(100);

		Product prod10 = new Product("C105", "Inspiron 7577", 6900);
		prod10.setCategory("Laptop");
		prod10.setDescription("Good money good power");
		prod10.setManufacturer("Dell");
		prod10.setCondition("In stock");
		prod10.setUnitsInStock(300);

		listOfProducts.add(prod1);
		listOfProducts.add(prod2);
		listOfProducts.add(prod3);
		listOfProducts.add(prod4);
		listOfProducts.add(prod5);
		listOfProducts.add(prod6);
		listOfProducts.add(prod7);
		listOfProducts.add(prod8);
		listOfProducts.add(prod9);
		listOfProducts.add(prod10);
	}

	@Override
	public List<Product> getAllProducts() {
		return listOfProducts;
	}

	@Override
	public Product getByProductId(String productId) {
		return listOfProducts.stream().filter(p -> p.getProductId().equals(productId)).findAny().orElse(null);
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		return listOfProducts.stream().filter(p -> p.getCategory().equals(category)).collect(Collectors.toList());
	}
}
