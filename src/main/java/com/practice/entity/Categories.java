package com.practice.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categories {
	@OneToMany(mappedBy="categories",cascade = CascadeType.ALL)
	private List<Products> product ;	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "categoryid")	
	private int categoryId;
	@Column(name="type")
	private String type;
	
		
	public List<Products> getProduct() {
		return product;
	}
	public void setProduct(List<Products> product) {
		this.product = product;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Categories [product=" + product + ", categoryId=" + categoryId + ", type=" + type + "]";
	}
	

	
	
		
	

	
	
}
