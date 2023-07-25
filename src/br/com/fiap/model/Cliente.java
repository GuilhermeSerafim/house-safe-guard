package br.com.fiap.model;

import java.sql.Date;

import br.com.fiap.util.CriptografiaUtils;

public class Cliente {
		
			//Declarando variaveis;
			String cpf, email,cep,senha,telefone;
			String idade;
			Date dataCadastro;
			Double valor_seguro;
			private Cotador cotador;
	
			public Cliente () {
				
			}
			//criação do primeiro método construtor
			public Cliente( String cpf, String email, String cep, String senha,
					String telefone, String idade) {
				this.cpf = cpf;
				this.email = email;
				this.cep = cep;
				setSenha(senha);
				this.telefone = telefone;
				this.idade= idade;
				this.dataCadastro = new Date (System.currentTimeMillis());
				
				//Criação dos moetodos get e set
			}
			
			

	
			public Cotador getCotador() {
				return cotador;
			}
			public Double getValor_seguro() {
				return valor_seguro;
			}
			public void setValor_seguro(Double valor_seguro) {
				this.valor_seguro = valor_seguro;
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
				try {
					this.senha = CriptografiaUtils.criptografar(senha);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			public String getTelefone() {
				return telefone;
			}

			public void setTelefone(String telefone) {
				this.telefone = telefone;
			}

			public String getIdade() {
				return idade;
			}

			public void setIdade(String idade) {
				this.idade = idade;
			}

			public Date getDataCadastro() {
				return dataCadastro;
			}

			public void setDataCadastro(Date dataCadastro) {
				this.dataCadastro = dataCadastro;
			}
			public void setCotador(Cotador cotador) {
				this.cotador = cotador;
				// TODO Auto-generated method stub
				
			}
			@Override
			public String toString() {
				return "Cliente [cpf=" + cpf + ", email=" + email + ", cep=" + cep
						+ ", senha=" + senha + ", telefone=" + telefone + ", idade=" + idade
						+ ", dataCadastro=" + dataCadastro + ", valor_seguro=" + valor_seguro + "]";
			}
			
			


			} 
			
			


	



