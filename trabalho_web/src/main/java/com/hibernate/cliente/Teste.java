package com.hibernate.cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hibernate.cliente.model.Cliente;

public class Teste {
	
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("BancoPU");
	
	private static EntityManager entityManager = entityManagerFactory.createEntityManager();

	public static void main(String[] args) {
	
		// FIND
		//Cliente cliente = entityManager.find(Cliente.class, 4);
		//System.out.println("Nome do cliente:" + cliente.getNome());
		
		// INSERT
		Cliente cliente = new Cliente();
		cliente.setNome("TESTE");
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();
		
		// DELETE
		//Cliente cliente = entityManager.find(Cliente.class, 5);
		//entityManager.getTransaction().begin();
		//entityManager.remove(cliente);
		//entityManager.getTransaction().commit();
		
		// MODIFY
		//Cliente cliente = new Cliente();
		//cliente.setId(5);
		//cliente.setNome("FACEBOOK INC.");		
		//entityManager.getTransaction().begin();
		//entityManager.merge(cliente);
		//entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
		
	}
	
}
