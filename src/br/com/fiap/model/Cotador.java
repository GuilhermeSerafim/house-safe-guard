package br.com.fiap.model;

import java.sql.Date;

public class Cotador {

	private String nome, cpf, tpResidencia;
	private Double valor;
	private Date dataCadastro;
	
	public Cotador(){
		
	}
	
	// Construtor
	public Cotador(String cpf, String nome, String tpResidencia, Double valor) {
		this.cpf = cpf;
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

	

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	
}
