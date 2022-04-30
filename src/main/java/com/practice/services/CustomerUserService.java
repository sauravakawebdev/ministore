package com.practice.services;

import com.practice.entity.CustomerUser;

public interface CustomerUserService {

	public Iterable<CustomerUser> findAll();
	public CustomerUser saveAll(CustomerUser customerUser);
	public CustomerUser authenticaCustomerUser(String userName,String pass);
	public long countCustomer();
}
