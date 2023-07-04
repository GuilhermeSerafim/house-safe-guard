package br.com.fiap.model;

import java.sql.Date;

public class Contador {

	private int id;
	private String nome;
	private String tpResidencia;
	private Double valor;
	private Date dataCadastro;
	
	public Contador(){
		
	}
	
	// Construtor
	public Contador(String nome, String tpResidencia, Double valor) {
		this.nome = nome;
		this.tpResidencia = tpResidencia;
		this.valor = valor;
		this.dataCadastro = new Date(System.currentTimeMillis());
	}
	
	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTpResidencia() {
		return tpResidencia;
	}

	public void setTpResidencia(String tpResidencia) {
		this.tpResidencia = tpResidencia;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	
}
