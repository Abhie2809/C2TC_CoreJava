package tnsif.c2tc.m07.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Configuration {
	static EntityManager entityManager;
	static EntityManagerFactory entityManagerFactory;
	
	static {
		entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
		entityManager=entityManagerFactory.createEntityManager();
	}

	public static EntityManager createEntityManager() {
		entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
	}
	

}
