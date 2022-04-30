package com.practice.services;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.practice.entity.AdminUser;
import com.practice.repositry.AdminUserRepository;

public interface AdminService {
	
	public AdminUser authenticateAdminUser(String userName,String pass);
}
