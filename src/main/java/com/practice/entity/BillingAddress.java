package com.practice.entity;

import java.security.KeyStore.PrivateKeyEntry;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "billing_address")
public class BillingAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bId;
	
	private String fullName;
	
	private String email;
	
	private String address;
	
	private String city;
	
	private String state;
	
	private int pincode;
	
	@ManyToOne
	private CustomerUser customerUser;
	
	public CustomerUser getCustomerUser() {
		return customerUser;
	}

	public void setCustomerUser(CustomerUser customerUser) {
		this.customerUser = customerUser;
	}

	public BillingAddress() {
		
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	
	 
	 

	@Override
	public String toString() {
		return "BillingAddress [bId=" + bId + ", fullName=" + fullName + ", email=" + email + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", pincode=" + pincode +  "]";
	}
	
	
}
