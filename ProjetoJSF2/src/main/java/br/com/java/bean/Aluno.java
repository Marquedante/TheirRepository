package br.com.java.bean;

public class Aluno { // classe Aluno.java

	private String nome;
	
	public Aluno(String nome){//construtor com parametros 
		
	   this.nome = nome;
	   
	}
	
	public Aluno(){//construtor sem parametros
		
	}

	public String getNome() { return nome; }

	public void setNome(String nome) { this.nome = nome; }
	
}
