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
					String sql = "insert into cliente(nm_completo,cpf,email,cep,telefone,dt_nasc,senha) values (?,?,?,?,?,?,?)";
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

				public List<Cliente> selectAll() {
					List<Cliente> clientes = new ArrayList<Cliente>();
					String sql = "select * from cliente order by nome";
					try {
						PreparedStatement stmt = conexao.prepareStatement(sql);
						ResultSet rs = stmt.executeQuery();

						while (rs.next()) {
							Cliente cliente = new Cliente();
							cliente.setNm_completo(rs.getString("nm_completo"));
							cliente.setCpf(rs.getString("cpf"));
							cliente.setEmail(rs.getString("email"));
							cliente.setTelefone(rs.getString("telefone"));
							cliente.setCep(rs.getString("cep"));
							cliente.setSenha(rs.getString("senha"));
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

				public Cliente selectById(int id) {
					Cliente cliente = null;
					String sql = "select * from cliente where id=?";
					try {
						PreparedStatement stmt = conexao.prepareStatement(sql);
						stmt.setInt(1, id);
						ResultSet rs = stmt.executeQuery();
						while (rs.next()) {
							cliente = new Cliente ();
							cliente.setNm_completo(rs.getString("nm_completo"));
							cliente.setCpf(rs.getString("cpf"));
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

				public void delete(int id) {
					String sql = "delete from cliente where id=?";
					try {
						PreparedStatement stmt = conexao.prepareStatement(sql);
						stmt.setLong(1, id);
						stmt.execute();
						stmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}

				public void update(Cliente cliente) {
					String sql = "update cliente set nm_completo = ?, cpf=? , email=? , telefone=?, cep=? , senha=? , dt_nasc=? where id=?";
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