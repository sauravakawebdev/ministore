package com.practice.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.practice.entity.CustomerUser;

@Repository("customerRepository")
public interface CustomerUserRepository extends JpaRepository<CustomerUser, Integer> {
	
	@Query("select c from CustomerUser c Where c.userName =:uName and c.pass =:uPass")
	public CustomerUser authenticateCustomer(@Param("uName") String userName, @Param("uPass") String pass);

}
