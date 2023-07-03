package br.com.fiap.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.connection.ConnectionFactory;
import br.com.fiap.model.Contador;

public class ContadorDAO {
	

	      private Connection conexao;

			public ContadorDAO() throws SQLException {
				this.conexao = ConnectionFactory.conectar();
			}

			public void insert(Contador contador ) {
				String sql = "insert into contador(nome,tp_residencia,valor,data) values (?,?,?,?)";
				try {
					PreparedStatement stmt = conexao.prepareStatement(sql);
					stmt.setString(1, contador.getNome()); 
					stmt.setString(2, contador.getTpResidencia());
					stmt.setDouble(3, contador.getValor());
					stmt.setDate(4, contador.getDataCadastro());
					stmt.execute(); 
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			public List<Contador> selectAll() {
				List<Contador> contadores = new ArrayList<Contador>();
				String sql = "select * from contador order by nome";
				try {
					PreparedStatement stmt = conexao.prepareStatement(sql);
					ResultSet rs = stmt.executeQuery();

					while (rs.next()) {
						Contador contador = new Contador();
						contador.setId(rs.getInt("id"));
						contador.setNome(rs.getString("nome"));
						contador.setTpResidencia(rs.getString("tp_residencia"));
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

			public Contador selectById(int id) {
				Contador contador = null;
				String sql = "select * from contador where id=?";
				try {
					PreparedStatement stmt = conexao.prepareStatement(sql);
					stmt.setInt(1, id);
					ResultSet rs = stmt.executeQuery();
					while (rs.next()) {
						contador = new Contador();
						contador.setId(rs.getInt("id"));
						contador.setNome(rs.getString("nome"));
						contador.setTpResidencia(rs.getString("tp_residencia"));
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

			public void delete(int id) {
				String sql = "delete from contador where id=?";
				try {
					PreparedStatement stmt = conexao.prepareStatement(sql);
					stmt.setLong(1, id);
					stmt.execute();
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			public void update(Contador contador) {
				String sql = "update contador set nome=? , tp_residencia =? , valor=? where id=?";
				try {
					PreparedStatement stmt = conexao.prepareStatement(sql);
					stmt.setString(1, contador.getNome());
					stmt.setString(2, contador.getTpResidencia());
				    stmt.setDouble(3, contador.getValor());
					stmt.setLong(4, contador.getId());

					stmt.execute();
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}

		

		

	}


