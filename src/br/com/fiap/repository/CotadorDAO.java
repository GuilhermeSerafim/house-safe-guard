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

			public void insert(Cotador contador ) {
				String sql = "insert into cotador(cpf,nome,tp_residencial,valor,dataCadastro) values (?,?,?,?,?)";
				try {
					PreparedStatement stmt = conexao.prepareStatement(sql);
					stmt.setString(1, contador.getCpf()); 
					stmt.setString(2, contador.getNome()); 
					stmt.setString(3, contador.getTpResidencia());
					stmt.setDouble(4, contador.getValor());
					stmt.setDate(5, contador.getDataCadastro());
					stmt.execute(); 
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			public List<Cotador> selectAll() {
				List<Cotador> contadores = new ArrayList<Cotador>();
				String sql = "select * from cotador order by nome";
				try {
					PreparedStatement stmt = conexao.prepareStatement(sql);
					ResultSet rs = stmt.executeQuery();

					while (rs.next()) {
						Cotador contador = new Cotador();
						contador.setCpf(rs.getString("cpf"));
						contador.setNome(rs.getString("nome"));
						contador.setTpResidencia(rs.getString("tp_residencial"));
						contador.setValor(rs.getDouble("valor"));
						contador.setDataCadastro(rs.getDate("dataCadastro"));

						contadores.add(contador);
					}
					rs.close();
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return contadores;
			}

			public Cotador selectByCpf(String cpf) {
				Cotador contador = null;
				String sql = "select * from cotador where cpf=?";
				try {
					PreparedStatement stmt = conexao.prepareStatement(sql);
					stmt.setString(1, cpf);
					ResultSet rs = stmt.executeQuery();
					while (rs.next()) {
						contador = new Cotador();
						contador.setCpf(rs.getString("cpf"));
						contador.setNome(rs.getString("nome"));
						contador.setTpResidencia(rs.getString("tp_residencial"));
						contador.setValor(rs.getDouble("valor"));
						contador.setDataCadastro(rs.getDate("dataCadastro"));
					}
					rs.close();
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return contador;
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

			public void update(Cotador contador) {
				String sql = "update cotador set nome=? , tp_residencial =? , valor=? where cpf=?";
				try {
					PreparedStatement stmt = conexao.prepareStatement(sql);
					stmt.setString(1, contador.getNome());
					stmt.setString(2, contador.getTpResidencia());
				    stmt.setDouble(3, contador.getValor());
					stmt.setString(4, contador.getCpf());

					stmt.execute();
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}

		

		

	}


