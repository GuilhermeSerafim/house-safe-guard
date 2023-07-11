package br.com.fiap.testes;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.model.Cliente;
import br.com.fiap.model.Cotador;
import br.com.fiap.repository.ClienteDAO;
import br.com.fiap.repository.CotadorDAO;



public class TesteCotadorDAO {
	

		public static void main(String[] args) throws SQLException{

			CotadorDAO dao = new CotadorDAO();
	//	Cotador gi = new Cotador("47130757876","Gisele Pontes Coutinho","apartamento", 200000.0, "04342150", "177");
			//Contador adriane = new Contador("Adriane", "apartamento", 200000.0);
			
//dao.insert(gi);
			//dao.insert(adriane);
				ClienteDAO da = new ClienteDAO();
	Cliente gii = new Cliente("47130757876", "gigi@gmail.com", "11954715689", "04342150", "hello", 15);
		da.insert(gii);
			

			List<Cotador> Cotadores = dao.selectAll();
			for (Cotador Cotador : Cotadores) {
				System.out.println(Cotador.getCpf());
				System.out.println(Cotador.getNome());
				System.out.println(Cotador.getTpResidencia());
				System.out.println(Cotador.getValor());
				System.out.println(Cotador.getCep());
				System.out.println(Cotador.getNumResidencia());
				System.out.println("  ");
			}
			
			List<Cliente> Clientes = da.selectAll();
			for (Cliente Cliente : Clientes) {
				System.out.println(Cliente.getCpf());
				System.out.println(Cliente.getEmail());
				System.out.println(Cliente.getTelefone());
				System.out.println(Cliente.getCep());
				System.out.println(Cliente.getSenha());
				System.out.println(Cliente.getIdade());
				System.out.println("  ");
			}
			
			List<Cliente> Client = da.join("47130757876");
		System.out.println("Os dados do cliente" + Client);
				
		
		
			}
			}