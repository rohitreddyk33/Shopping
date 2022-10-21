package com.example.shopping.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.shopping.entity.Product;
import com.example.shopping.repository.ProductRepository;
@Service
public class ProductService {
	 private ProductRepository productRepository;

	    public ProductService(ProductRepository productRepository) {
	        this.productRepository = productRepository;
	    }

	    public List<Product> getAllProducts() {
	    	
	    	
//	    	for(int i=0;i<l.size();i++)
//	    	{
//	    		System.out.print(l.get());
//	    	}
	        return this.productRepository.findAll();
	    }
}
