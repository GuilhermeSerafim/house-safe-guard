package br.com.fiap.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.model.Cliente;
import br.com.fiap.model.Cotador;

public class ClienteDAO {
    private Connection conexao;


				public ClienteDAO() throws SQLException {
					this.conexao = ConnectionFactory.conectar();
				}

				public void insert(Cliente cliente) {
					String sql = "insert into Cliente(cpf,email,telefone,cep,senha,idade,dataCadastro) values (?,?,?,?,?,?,?)";
					try {
						PreparedStatement stmt = conexao.prepareStatement(sql);
						stmt.setString(1, cliente.getCpf()); 
						stmt.setString(2, cliente.getEmail());
						stmt.setString(3, cliente.getTelefone());
						stmt.setString(4, cliente.getCep());
						stmt.setString(5, cliente.getSenha());
						stmt.setInt(6,cliente.getIdade());
						stmt.setDate(7,cliente.getDataCadastro());

						stmt.execute(); 
						stmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}

				public List<Cliente> selectAll() {
					List<Cliente> clientes = new ArrayList<Cliente>();
					String sql = "select * from cliente order by cpf";
					try {
						PreparedStatement stmt = conexao.prepareStatement(sql);
						ResultSet rs = stmt.executeQuery();

						while (rs.next()) {
							Cliente cliente = new Cliente();
							cliente.setCpf(rs.getString("cpf"));
							cliente.setEmail(rs.getString("email"));
							cliente.setTelefone(rs.getString("telefone"));
							cliente.setCep(rs.getString("cep"));
							cliente.setSenha(rs.getString("senha"));
							cliente.setIdade(rs.getInt("idade"));
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
					String sql = "update cliente set email=? , telefone=?, cep=? , senha=? , idade=? where cpf=?";
					try {
						PreparedStatement stmt = conexao.prepareStatement(sql);
						stmt.setString(1, cliente.getCpf()); 
						stmt.setString(2, cliente.getEmail());
						stmt.setString(3, cliente.getCep());
						stmt.setString(4, cliente.getTelefone());
						stmt.setInt(5, cliente.getIdade());
						stmt.setString(6, cliente.getSenha());

						stmt.execute();
						stmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					
					
					
				}
				
				
				public List<Cliente> join(String cpf) {
				    List<Cliente> clientes = new ArrayList<>();
				    String sql = "SELECT Cotador.nm_completo,Cotador.cpf, Cotador.tp_residencial, Cotador.valor_imovel, Cotador.cep, Cotador.num_residencia , Cliente.email, Cliente.telefone, Cliente.idade , Cliente.senha, Cliente.dataCadastro, Cotador.valor_total FROM Cliente Full Outer JOIN Cotador ON Cliente.cpf = Cotador.cpf WHERE Cliente.cpf = ?";
				    try {
				        PreparedStatement stmt = conexao.prepareStatement(sql);
				        stmt.setString(1, cpf);
				        ResultSet rs = stmt.executeQuery();
				        while (rs.next()) {
				        	
				        	
				        	
				        	
				        	Cliente cliente = new Cliente ();


				        	cliente.setEmail(rs.getString("email"));
				        	cliente.setTelefone(rs.getString("telefone"));
				        	cliente.setSenha(rs.getString("senha"));
				        	cliente.setDataCadastro(rs.getDate("dataCadastro"));
				        	cliente.setIdade(rs.getInt("idade"));

				        	Cotador cotador = new Cotador ();
				        	cotador.setCpf(rs.getString("cpf"));
				        	cotador.setTpResidencia(rs.getString("tp_residencial"));
				        	cotador.setCep(rs.getString("cep"));
				        	cotador.setNumResidencia(rs.getString("num_residencia"));


				            cliente.setCotador(cotador);
				   
				            clientes.add(cliente);
				        }
				        rs.close();
				        stmt.close();
				    } catch (SQLException e) {
				        e.printStackTrace();
				    }
				    return clientes;
				}
				
				
				

				}
