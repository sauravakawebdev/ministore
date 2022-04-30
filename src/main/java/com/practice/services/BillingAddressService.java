package com.practice.services;

import com.practice.entity.BillingAddress;

public interface BillingAddressService {
	public BillingAddress saveAll(BillingAddress billingAddress);
	public Iterable<BillingAddress> findAll();
	public long countOrder();
}
