package com.practice.services;
import com.practice.entity.Categories;
import com.practice.entity.Products;

public interface ProductService {

	public Iterable<Products> findAll();
	public Products saveAll(Products products);
	public  Products getById(String prId);
	public Products getByIdintProducts(int pId);
	public void deleteById(Products products);
	public long countProduct();
	//public Products getProductByCategory(int category);

	
}
