package io.spring.part02._02controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@RequestMapping("/{category}")
	public ModelAndView listProductByCategory(@PathVariable("category") String category) {
		ModelAndView mv = new ModelAndView("_02myproduct");
		mv.addObject("message", "listProductByCategory: " + category);
		return mv;
	}
	
	// product.detail?id=100
	@RequestMapping("/product.detail")
	public String productDetail(@RequestParam String productId, Model model) {
		model.addAttribute("message", "productId: " + productId);
		return "_02productDetail";
	}
	
	@RequestMapping("/product.moredetail/{matrixVariables}")
	public String moreDetailParameters(
			@MatrixVariable(pathVar="matrixVariables", name="color") List<String> colors,
			@MatrixVariable(pathVar="matrixVariables", name="lowPrice") String lowPrice,
			@MatrixVariable(pathVar="matrixVariables", name="highPrice") String highPrice, Model model) {
		model.addAttribute("message", "moreDetailParameters : " + lowPrice + " " + highPrice + " " + colors);
		return "_02extradetailedProduct";
	}
}
