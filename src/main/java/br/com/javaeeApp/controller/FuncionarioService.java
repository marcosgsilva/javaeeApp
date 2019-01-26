package br.com.javaeeApp.controller;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import br.com.javaeeApp.entidade.Funcionario;

@Model
public class FuncionarioService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void salvar(Funcionario funcionario) {
		entityManager.persist(funcionario);		
	}
	
	public List<Funcionario> buscarTodos(){
		String query="SELECT f FROM Funcionario f";
		return entityManager.createQuery(query).getResultList();
		
	}
	

}
