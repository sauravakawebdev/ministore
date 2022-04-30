package com.practice.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.practice.entity.AdminUser;

@Repository
public interface AdminUserRepository extends JpaRepository<AdminUser, Integer> {
	
	@Query("select a from AdminUser a Where a.userName =:uName and a.pass =:upass")
	public AdminUser authenticateAdmin(@Param("uName") String userName, @Param("upass") String pass);

}
