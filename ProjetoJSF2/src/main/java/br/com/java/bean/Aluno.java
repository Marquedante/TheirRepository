package br.com.java.bean;

public class Aluno { // classe Aluno.java

	private String nome;
	private String codigo;
	
	public Aluno(String nome, String codigo){//construtor cpm parametros
	   this.nome = nome;
	   this.codigo = codigo;
	}
	
	public Aluno(){//construtor sem parametros
	}

	public String getNome() { return nome; }

	public void setNome(String nome) { this.nome = nome; }
	
	public String getCodigo() { return codigo; }

	public void setCodigo(String codigo) { this.codigo = codigo; }
	
}
