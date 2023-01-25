package com.hospital.controller;

import com.hospital.dao.BranchDao;
import com.hospital.dto.Address;
import com.hospital.dto.Branch;

public class InsertBranch {
	
	
	public static void main(String[] args) {
		Address a = new Address();
		a.setLocation("Banaswadi");
		
		Branch b = new Branch();
		b.setName("Manipal Banaswadi");
		b.setEmail_id("manipalban@gmail.com");
		b.setAddress(a);
		
		BranchDao.saveBranch(1, b);
	}

}
