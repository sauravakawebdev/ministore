package com.practice.repositry;

import org.hibernate.sql.results.graph.instantiation.internal.ArgumentDomainResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.practice.entity.Categories;
import com.practice.entity.Products;

@Repository("productRepository")
public interface ProductRepositry extends JpaRepository <Products, Integer> {
	
	//@Query("select p from Products p Where p.categories=:cat")
	//public Products getProductByCategory(@Param("cat") Categories category);
	
//	@Query("select p from Products p Where p.categories_categoryid=:cat")
//	public Products getProductByCategoryId(@Param("cat") int category);
//	
//	@Query("select * from products where categories_categoryid=1")
//	public Products getProductByCategoryId1();
}