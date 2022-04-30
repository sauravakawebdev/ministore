package com.practice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ContactUs 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Contact_id")
	private int Contact_id;
	@Column(name="first_name")
	private String first_name;
	@Column(name="last_name")
	private String last_name;
	@Column(name="contactNumber")
	private int contactno;
	@Column(name="issue")
	private String issue;
	
	public ContactUs() {
		
		
	}
	public ContactUs(int contact_id, String first_name, String last_name, int contactno, String issue) {
		
		Contact_id = contact_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.contactno = contactno;
		this.issue = issue;
	}
	public int getContact_id() {
		return Contact_id;
	}
	public void setContact_id(int contact_id) {
		Contact_id = contact_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getContactno() {
		return contactno;
	}
	public void setContactno(int contactno) {
		this.contactno = contactno;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	@Override
	public String toString() {
		return "ContactUs [Contact_id=" + Contact_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", contactno=" + contactno + ", issue=" + issue + "]";
	}
	
	
}
