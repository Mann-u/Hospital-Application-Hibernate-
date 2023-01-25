package com.hospital.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hospital.dto.Hospital;

public class HospitalDao 
{
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("dbinfo");
	static EntityManager entityManager = factory.createEntityManager();
	static EntityTransaction transaction = entityManager.getTransaction();
	
	public static void saveHospital(Hospital hospital)
	{
		transaction.begin();
		entityManager.persist(hospital);
		transaction.commit();
		System.out.println("Hospital data inserted!!");
		
	}
	public static Hospital getHospitalById(int id)
	{
		return entityManager.find(Hospital.class, id);
	}

}
