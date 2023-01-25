package com.hospital.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hospital.dto.Encounter;

public class EncounterDao 
{
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("dbinfo");
	static EntityManager entityManager = factory.createEntityManager();
	static EntityTransaction transaction = entityManager.getTransaction();
	
	public void saveEncounter(Encounter encounter)
	{
		transaction.begin();
		entityManager.persist(encounter);
		transaction.commit();
		
	}
	
	

}
