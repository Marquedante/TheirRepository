package br.com.java.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="clienteBean")// Este eh um bean do jsf
@RequestScoped
public class ClienteBean {
	
	private String nome;
	
	private Integer idade;

	public ClienteBean() { 
		System.out.println(">>> >>> >>> ClienteBean()");
	}
	
	@PostConstruct
	public void init() { 
	   System.out.println(">>> >>> >>> init()"); 
	}

	public String getNome() { 
		return nome; 
	}

	public void setNome(String nome) { 
		this.nome = nome; 
	}

	public Integer getIdade() { 
	  return idade; 
   	}

	public void setIdade(Integer idade) { 
		this.idade = idade; 
	}
	
}
