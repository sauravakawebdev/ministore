package com.practice.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.Categories;
import com.practice.entity.Products;
import com.practice.repositry.ProductRepositry;
import com.practice.services.ProductService;


	@Service("productService")
	public class ProductServiceImpl implements ProductService {
		
		
		@Autowired
		private ProductRepositry productRepository;
		
		
		@Override
		public Iterable<Products> findAll() {
			// TODO Auto-generated method stub
			return productRepository.findAll();
		}


	@Override
	public Products saveAll(Products products) {
		// TODO Auto-generated method stub
		return productRepository.save(products);
	}


	@Override
	public Products getById(String prId) {
		// TODO Auto-generated method stub
		try {
			return productRepository.getById(Integer.parseInt(prId));
		}
		catch(Exception ex) {
			return null;
		}
		
	}


	@Override
	public void deleteById(Products products) {
		// TODO Auto-generated method stub
		try {
			productRepository.delete(products);
		}
		catch(Exception ex) {
			
		}
	}


	@Override
	public Products getByIdintProducts(int pId) {
		// TODO Auto-generated method stub
		try {
			return productRepository.getById(pId);
		}
		catch(Exception ex) {
			return null;
		}
	}


	@Override
	public long countProduct() {
		// TODO Auto-generated method stub
		return productRepository.count();
	}


//	@Override
//	public Products getProductByCategory(int category) {
//		// TODO Auto-generated method stub
//		return productRepository.getProductByCategoryId(category);
//	}


	
}
