package br.com.fiap.model;

import java.sql.Date;

public class Cotador {

	private String nome, cpf, tpResidencia,cep,numResidencia;
	private Double valor;
	
	public Cotador(){
		
	}
	
	// Construtor
	public Cotador(String cpf, String nome, String tpResidencia, Double valor, String cep, String numResidencia) {
		this.cpf = cpf;
		this.nome = nome;
		this.tpResidencia = tpResidencia;
		this.valor = valor;
		this.cep = cep;
		this.numResidencia = numResidencia;
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


	public String getCep() {
		return cep;
	}

	

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNumResidencia() {
		return numResidencia;
	}

	public void setNumResidencia(String numResidencia) {
		this.numResidencia = numResidencia;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "Cotador [nome=" + nome + ", cpf=" + cpf + ", tpResidencia=" + tpResidencia + ", cep=" + cep
				+ ", numResidencia=" + numResidencia + ", valor=" + valor + "]";
	}
}
