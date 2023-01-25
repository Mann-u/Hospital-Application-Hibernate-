package com.hospital.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hospital.dto.Patients;

public class PatientsDao
{
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("mannu");
	static EntityManager entityManager = factory.createEntityManager();
	static EntityTransaction transaction = entityManager.getTransaction();
	
	public void savePatients(Patients patients)
	{
		transaction.begin();
		entityManager.persist(patients);
		transaction.commit();
		System.out.println("Person information inserted");
	}
	
	public Patients getPersonById(int id)
	{
		return entityManager.find(Patients.class, id);
	}

}
