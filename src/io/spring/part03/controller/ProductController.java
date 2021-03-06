package io.spring.part03.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.spring.part03.model.Product;
import io.spring.part03.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/productList")
	public String defaultPage(Model model) {
		List<Product> products = productService.getAllProduct();
		model.addAttribute("products", products);
		return "_03productList";
	}

	@RequestMapping("/productDetail")
	public String getProductById(@RequestParam(name = "id") String productId, Model model) {
		Product product = productService.getByProductId(productId);
		model.addAttribute("product", product);
		return "_03productDetails";
	}

	@RequestMapping("/category/{categoryId}")
	public String getProductsByCategory(@PathVariable("categoryId") String category, Model model) {
		List<Product> products = productService.getProductsByCategory(category);
		model.addAttribute("products", products);
		return "_03productList";
	}

	@RequestMapping("/brand/{brands}")
	public String getProductsByBrands(@MatrixVariable(pathVar = "brands") List<String> brands, Model model) {
		model.addAttribute("products", productService.getProductsByBrands(brands));
		return "_03productList";
	}

	@RequestMapping(value = "/add", method= RequestMethod.GET)
	public String getNewProductForm(@ModelAttribute("newProduct") Product product) {
		return "_03addproduct";
	}
	
	@RequestMapping(value = "/add", method= RequestMethod.POST)
	public String addProduct(@ModelAttribute("newProduct") Product product) {
		productService.addProduct(product);
		return "redirect:/products/productList";
	}
}
