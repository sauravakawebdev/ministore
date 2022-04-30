package com.practice.services;

import com.practice.entity.ContactUs;

public interface ContactUsService {
	public ContactUs saveAll(ContactUs contactUs);
	public Iterable<ContactUs> findAll();
}
