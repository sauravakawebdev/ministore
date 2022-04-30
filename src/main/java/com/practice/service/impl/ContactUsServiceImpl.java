package com.practice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.ContactUs;
import com.practice.repositry.ContactUsRepository;
import com.practice.services.ContactUsService;

@Service
public class ContactUsServiceImpl implements ContactUsService {
	
	@Autowired
	ContactUsRepository contactUsRepository;
	
	@Override
	public ContactUs saveAll(ContactUs contactUs) {
		// TODO Auto-generated method stub
		return contactUsRepository.save(contactUs);
	}

	@Override
	public Iterable<ContactUs> findAll() {
		// TODO Auto-generated method stub
		return contactUsRepository.findAll();
	}
	
}
