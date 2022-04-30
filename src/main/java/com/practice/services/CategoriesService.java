package com.practice.services;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;

import com.practice.entity.Categories;

public interface CategoriesService {

	public Iterable<Categories> findAll();
	
	public Categories saveAll(Categories categories);
	
	public Categories getById(int id);

	
}
