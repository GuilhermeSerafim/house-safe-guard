package br.com.fiap.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.model.Cliente;

public class ClienteDAO {
    private Connection conexao;


				public ClienteDAO() throws SQLException {
					this.conexao = ConnectionFactory.conectar();
				}

				public void insert(Cliente cliente) {
					String sql = "insert into Cliente(cpf, nm_completo, email,cep,telefone,dt_nasc,dataCadastro, senha) values (?,?,?,?,?,?,?,?)";
					try {
						PreparedStatement stmt = conexao.prepareStatement(sql);
						stmt.setString(1, cliente.getCpf()); 
						stmt.setString(2, cliente.getNm_completo()); 
						stmt.setString(3, cliente.getEmail());
						stmt.setString(4, cliente.getCep());
						stmt.setString(5, cliente.getTelefone());
						stmt.setDate(6,cliente.getDataNascimento());
						stmt.setDate(7,cliente.getDataCadastro());
						stmt.setString(8, cliente.getSenha());

						stmt.execute(); 
						stmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}

				public List<Cliente> selectAll() {
					List<Cliente> clientes = new ArrayList<Cliente>();
					String sql = "select * from cliente order by nm_completo";
					try {
						PreparedStatement stmt = conexao.prepareStatement(sql);
						ResultSet rs = stmt.executeQuery();

						while (rs.next()) {
							Cliente cliente = new Cliente();
							cliente.setCpf(rs.getString("cpf"));
							cliente.setNm_completo(rs.getString("nm_completo"));
							cliente.setEmail(rs.getString("email"));
							cliente.setTelefone(rs.getString("telefone"));
							cliente.setCep(rs.getString("cep"));
							cliente.setSenha(rs.getString("senha"));
							cliente.setDataNascimento(rs.getDate("dt_nasc"));
							cliente.setDataCadastro(rs.getDate("dataCadastro"));

							clientes.add(cliente);
						}
						rs.close();
						stmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					return clientes;
				}

				public Cliente selectById(String cpf) {
					Cliente cliente = null;
					String sql = "select * from cliente where cpf=?";
					try {
						PreparedStatement stmt = conexao.prepareStatement(sql);
						stmt.setString(1, cpf);
						ResultSet rs = stmt.executeQuery();
						while (rs.next()) {
							cliente = new Cliente ();
							cliente.setCpf(rs.getString("cpf"));
							cliente.setNm_completo(rs.getString("nm_completo"));
							cliente.setEmail(rs.getString("email"));
							cliente.setTelefone(rs.getString("telefone"));
							cliente.setCep(rs.getString("cep"));
							cliente.setSenha(rs.getString("senha"));
							cliente.setDataCadastro(rs.getDate("dataCadastro"));
						}
						rs.close();
						stmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					return cliente;
				}

				public void delete(String cpf) {
					String sql = "delete from cliente where cpf=?";
					try {
						PreparedStatement stmt = conexao.prepareStatement(sql);
						stmt.setString(1, cpf);
						stmt.execute();
						stmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}

				public void update(Cliente cliente) {
					String sql = "update cliente set nm_completo = ?, email=? , telefone=?, cep=? , senha=? , dt_nasc=? where cpf=?";
					try {
						PreparedStatement stmt = conexao.prepareStatement(sql);
						stmt.setString(1, cliente.getNm_completo()); 
						stmt.setString(2, cliente.getCpf()); 
						stmt.setString(3, cliente.getEmail());
						stmt.setString(4, cliente.getCep());
						stmt.setString(5, cliente.getTelefone());
						stmt.setDate(6, cliente.getDataNascimento());
						stmt.setString(7, cliente.getSenha());

						stmt.execute();
						stmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}

				}
}