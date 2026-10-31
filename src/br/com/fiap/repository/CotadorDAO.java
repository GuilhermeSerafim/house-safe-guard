package br.com.fiap.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.model.Cotador;

public class CotadorDAO {
	

	      private Connection conexao;

			public CotadorDAO() throws SQLException {
				this.conexao = ConnectionFactory.conectar();
			}

			public void insert(Cotador cotador ) {
				String sql = "insert into cotador(cpf,nm_completo,tp_residencial,valor_imovel, cep, num_residencia) values (?,?,?,?,?,?)";
				try {
					PreparedStatement stmt = conexao.prepareStatement(sql);
					stmt.setString(1, cotador.getCpf()); 
					stmt.setString(2, cotador.getNome()); 
					stmt.setString(3, cotador.getTpResidencia());
					stmt.setDouble(4, cotador.getValor());
					stmt.setString(5,cotador.getCep());
					stmt.setString(6, cotador.getNumResidencia());
					stmt.execute(); 
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			public List<Cotador> selectAll() {
				List<Cotador> cotadores = new ArrayList<Cotador>();
				String sql = "select * from cotador order by nm_completo";
				try {
					PreparedStatement stmt = conexao.prepareStatement(sql);
					ResultSet rs = stmt.executeQuery();

					while (rs.next()) {
						Cotador cotador = new Cotador();
						cotador.setCpf(rs.getString("cpf"));
						cotador.setNome(rs.getString("nm_completo"));
						cotador.setTpResidencia(rs.getString("tp_residencial"));
						cotador.setValor(rs.getDouble("valor_imovel"));
						cotador.setCep(rs.getString("cep"));
						cotador.setNumResidencia(rs.getString("num_residencia"));


						cotadores.add(cotador);
					}
					rs.close();
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return cotadores;
			}

			public Cotador selectByCpf(String cpf) {
				Cotador cotador = null;
				String sql = "select * from cotador where cpf=?";
				try {
					PreparedStatement stmt = conexao.prepareStatement(sql);
					stmt.setString(1, cpf);
					ResultSet rs = stmt.executeQuery();
					while (rs.next()) {
						cotador = new Cotador();
						cotador.setCpf(rs.getString("cpf"));
						cotador.setNome(rs.getString("nome"));
						cotador.setTpResidencia(rs.getString("tp_residencial"));
						cotador.setValor(rs.getDouble("valor_imovel"));
						cotador.setCep(rs.getString("cep"));
						cotador.setNumResidencia(rs.getString("num_residencia"));

					}
					rs.close();
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return cotador;
			}

			public void delete(String cpf) {
				String sql = "delete from cotador where cpf=?";
				try {
					PreparedStatement stmt = conexao.prepareStatement(sql);
					stmt.setString(1, cpf);
					stmt.execute();
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			public void update(Cotador cotador) {
				String sql = "update cotador set nome=? , tp_residencial =? , valor_imovel=?, num_residencia where cpf=?";
				try {
					PreparedStatement stmt = conexao.prepareStatement(sql);
					stmt.setString(1, cotador.getNome());
					stmt.setString(2, cotador.getTpResidencia());
				    stmt.setDouble(3, cotador.getValor());
					stmt.setString(4, cotador.getCpf());
					stmt.setString(5, cotador.getNumResidencia());

					stmt.execute();
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}

		

		

	}


