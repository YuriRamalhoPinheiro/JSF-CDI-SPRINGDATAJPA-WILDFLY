package br.com.yuriramalhopinheiro;

import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//@Dependent
public class CdiConfig {
/*
	@PersistenceContext(name = "jsf-cdi-spring-data")
	EntityManager entityManager;

	//@RequestScoped TODO Incluir o Request no lugar do Singleton
	@Singleton 
	@Produces
	public EntityManager createEntityManager() {
		return entityManager;
	}
*/	
}
