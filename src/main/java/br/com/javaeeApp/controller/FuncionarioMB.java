package br.com.javaeeApp.controller;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.com.javaeeApp.entidade.Funcionario;

@Named
@RequestScoped
public class FuncionarioMB {
	
	@Inject
	private FuncionarioService funcionarioService;
	
	private Funcionario funcionario = new Funcionario();
	
	private List<Funcionario> funcionarios;
	
	@Transactional
	public String Salvar() {
		funcionarioService.salvar(funcionario);
		
		funcionario = new Funcionario();
		funcionarios = null;		
		return null;
	}
	
	public List<Funcionario> getFuncionarios(){
		if(funcionarios==null) 
			funcionarios = funcionarioService.buscarTodos();
		return funcionarios;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	
	
	
	
	

}
