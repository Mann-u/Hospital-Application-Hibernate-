package com.hospital.controller;

import com.hospital.dao.HospitalDao;
import com.hospital.dto.Hospital;

public class InsertHospital {
	
	public static void main(String[] args) {
		
		Hospital h = new Hospital();
		h.setName("Manipal Hospital");
		h.setPhone_no(9876543234l);
		h.setEmail_id("manipal@gmail.com");
		
		HospitalDao.saveHospital(h);
	}

}
