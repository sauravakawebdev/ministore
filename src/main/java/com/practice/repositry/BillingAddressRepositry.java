package com.practice.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.entity.BillingAddress;

@Repository
public interface BillingAddressRepositry extends JpaRepository<BillingAddress, Integer> {

}
