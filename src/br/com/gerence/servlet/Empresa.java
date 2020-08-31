package br.com.gerence.servlet;

import java.util.Date;

public class Empresa {
	
	private Integer id;
	private String nome;
	private Date data = new Date();
	
	//data ja inicializado pq Date sem paramentro de construtor faz com a data atual
	// ou seja, nossos testes mocados nao precisam ter uma data setada ja que automaticamente
    // pegara a data atual
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
}
