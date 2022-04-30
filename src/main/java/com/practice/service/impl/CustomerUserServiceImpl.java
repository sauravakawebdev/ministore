package com.practice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.CustomerUser;
import com.practice.repositry.CustomerUserRepository;
import com.practice.services.CustomerUserService;

@Service("customerUserService")
public class CustomerUserServiceImpl implements CustomerUserService {
	
	@Autowired
	private CustomerUserRepository customerUserRepository;

	@Override
	public Iterable<CustomerUser> findAll() {
		// TODO Auto-generated method stub
		return customerUserRepository.findAll();
	}

	@Override
	public CustomerUser saveAll(CustomerUser customerUser) {
		// TODO Auto-generated method stub
		return customerUserRepository.save(customerUser);
	}

	@Override
	public CustomerUser authenticaCustomerUser(String userName, String pass) {
		// TODO Auto-generated method stub
		return customerUserRepository.authenticateCustomer(userName, pass);
	}

	@Override
	public long countCustomer() {
		// TODO Auto-generated method stub
		return customerUserRepository.count();
	}

}
