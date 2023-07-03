package br.com.fiap.model;

import java.sql.Date;

public class Cliente {
		
			//Declarando variaveis;
			String nm_completo,cpf, email,cep,senha,telefone;
			Date dataNascimento,dataCadastro;
	
			public Cliente () {
				
			}
			//criação do primeiro método construtor
			public Cliente(String nm_completo, String cpf, String email, String cep, String senha,
					String telefone, Date dataNascimento, Date dataCadastro) {
				this.nm_completo = nm_completo;
				this.cpf = cpf;
				this.email = email;
				this.cep = cep;
				this.senha = senha;
				this.telefone = telefone;
				this.dataNascimento = dataNascimento;
				this.dataCadastro = dataCadastro;
				
				//Criação dos moetodos get e set
			}
			
			

			public String getNm_completo() {
				return nm_completo;
			}
			public void setNm_completo(String nm_completo) {
				this.nm_completo = nm_completo;
			}
			public String getCpf() {
				return cpf;
			}

			public void setCpf(String cpf) {
				this.cpf = cpf;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getCep() {
				return cep;
			}

			public void setCep(String cep) {
				this.cep = cep;
			}

			public String getSenha() {
				return senha;
			}

			public void setSenha(String senha) {
				this.senha = senha;
			}

			public String getTelefone() {
				return telefone;
			}

			public void setTelefone(String telefone) {
				this.telefone = telefone;
			}

			public Date getDataNascimento() {
				return dataNascimento;
			}

			public void setDataNascimento(Date dataNascimento) {
				this.dataNascimento = dataNascimento;
			}

			public Date getDataCadastro() {
				return dataCadastro;
			}

			public void setDataCadastro(Date dataCadastro) {
				this.dataCadastro = dataCadastro;
			} 
			
			


	}



