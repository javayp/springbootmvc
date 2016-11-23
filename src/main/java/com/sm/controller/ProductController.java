package com.sm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sm.services.ProductService;

@Controller
public class ProductController {
	
	private ProductService productService;
	
	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping("/products")
	public String productList(Model model){
		model.addAttribute("products", productService.productList());
		return "productList";
	}
	
	@RequestMapping("/viewproduct/{id}")
	public String productList(@PathVariable("id") Integer id,Model model){
		System.out.println("Id is------------"+id);
		model.addAttribute("product", productService.getProductById(id));
		return "product";
	}
}
