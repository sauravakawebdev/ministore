package com.practice.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.entity.Categories;

@Repository("categoriesRepositry")
public interface CategoriesRepositry extends JpaRepository <Categories, Integer> {

}
