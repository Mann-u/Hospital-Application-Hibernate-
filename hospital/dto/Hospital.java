package com.hospital.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "hospital_name")
	private String name;
	@Column(unique = true)
	private long phone_no;
	@Column(unique = true, nullable = false)
	private String email_id;
	
	@OneToMany(mappedBy = "hospital")
	private List<Branch> branchs;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public List<Branch> getBranchs() {
		return branchs;
	}

	public void setBranchs(List<Branch> branchs) {
		this.branchs = branchs;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", name=" + name + ", phone_no=" + phone_no + ", email_id=" + email_id
				+ ", branchs=" + branchs + "]";
	}
	
	
	
	

}
