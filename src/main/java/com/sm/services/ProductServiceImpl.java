package com.sm.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sm.domain.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	private Map<Integer,Product> products;
	
	 public ProductServiceImpl() {
		lodaProducts();
	}
	
	@Override
	public List<Product> productList() {
		
		return new ArrayList<>(products.values());
	}
	
	public void lodaProducts(){
		
		products=new HashMap<>();
		
		Product produt1=new Product(1,"product 1",new BigDecimal("1100"),"http://www.exmp1.com/p1");
		Product produt2=new Product(2,"product 2",new BigDecimal("1200"),"http://www.exmp1.com/p2");
		Product produt3=new Product(3,"product 3",new BigDecimal("1300"),"http://www.exmp1.com/p3");
		Product produt4=new Product(4,"product 4",new BigDecimal("1400"),"http://www.exmp1.com/p4");
		
		products.put(1, produt1);
		products.put(2, produt2);
		products.put(3, produt3);
		products.put(4, produt4);

	}

	@Override
	public Product getProductById(Integer id) {
		return products.get(id);
	}
	
	

}