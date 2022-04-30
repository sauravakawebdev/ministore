package com.practice.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer_user")
public class CustomerUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "user_name", unique = true)
	private String userName;
	
	private String fullName;
	
	private String mobile;

	private String pass;
	
	
	  @OneToMany(mappedBy="customerUser",cascade = CascadeType.ALL) 
	  private List<BillingAddress> billingAddresses;
	 
	public CustomerUser() {
		
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getFullName() {
		return fullName;
	}
	
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	
	  public List<BillingAddress> getBillingAddresses() { return billingAddresses;
	  }
	  
	  public void setBillingAddresses(List<BillingAddress> billingAddresses) {
	  this.billingAddresses = billingAddresses; }

	@Override
	public String toString() {
		return "CustomerUser [userId=" + userId + ", userName=" + userName + ", fullName=" + fullName + ", mobile="
				+ mobile + ", pass=" + pass + ", billingAddresses=" + billingAddresses + "]";
	}
	 

	

	
		
}
