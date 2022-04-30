package com.practice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.BillingAddress;
import com.practice.repositry.BillingAddressRepositry;
import com.practice.services.BillingAddressService;

@Service
public class BillingAddressServiceImpl implements BillingAddressService {

	@Autowired
	private BillingAddressRepositry billingAddressRepositry;
	
	@Override
	public BillingAddress saveAll(BillingAddress billingAddress) {
		// TODO Auto-generated method stub
		return billingAddressRepositry.save(billingAddress);
	}

	@Override
	public Iterable<BillingAddress> findAll() {
		// TODO Auto-generated method stub
		return billingAddressRepositry.findAll();
	}

	@Override
	public long countOrder() {
		// TODO Auto-generated method stub
		return billingAddressRepositry.count();
	}
	
}
