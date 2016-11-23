package com.sm.services;

import java.util.List;

import com.sm.domain.Product;

/**
 * Created by prash on 11/22/2016.
 */
public interface ProductService {
	
	public List<Product> productList();
	
	public Product getProductById(Integer id);
}
