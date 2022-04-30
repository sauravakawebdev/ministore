package com.practice.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.practice.entity.AdminUser;
import com.practice.repositry.AdminUserRepository;
import com.practice.services.AdminService;
import com.practice.services.CustomerUserService;

@Service("adminUserService")
public class AdminUserServiceImpl implements AdminService {
	
	@Autowired
	AdminUserRepository adminUserRepository;

	@Override
	public AdminUser authenticateAdminUser(String userName, String pass) {
		// TODO Auto-generated method stub
		return adminUserRepository.authenticateAdmin(userName, pass);
	}

	
	
}
