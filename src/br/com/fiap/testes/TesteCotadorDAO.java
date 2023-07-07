package br.com.fiap.testes;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import br.com.fiap.model.Cliente;
import br.com.fiap.model.Cotador;
import br.com.fiap.repository.ClienteDAO;
import br.com.fiap.repository.CotadorDAO;



public class TesteCotadorDAO {
	

		public static void main(String[] args) throws SQLException{

			CotadorDAO dao = new CotadorDAO();
		//	Cotador isa = new Cotador("54191563880","Emerson", "casa",  100000.0);
			//Contador adriane = new Contador("Adriane", "apartamento", 200000.0);
			
		//	dao.insert(isa);
			//dao.insert(adriane);
			
			ClienteDAO da = new ClienteDAO();
	Cliente p = new Cliente("12345678925", "isabella", "isabella@gmail.com", "04243155", "hello", "11954712588", Date.valueOf("2005-04-05"));
			
		da.insert(p);
			

			List<Cotador> Contadores = dao.selectAll();
			for (Cotador Contador : Contadores) {
				System.out.println(Contador.getNome());
				System.out.println(Contador.getTpResidencia());
				System.out.println(Contador.getValor());
				System.out.println(Contador.getDataCadastro());
				System.out.println("  ");
			}
			
			
				
			List<Cliente> Clientes = da.selectAll();
			for (Cliente Cliente : Clientes) {
				System.out.println(Cliente.getNm_completo());
				System.out.println(Cliente.getEmail());
				System.out.println(Cliente.getCpf());
				System.out.println(Cliente.getCep());
				System.out.println(Cliente.getSenha());
				System.out.println(Cliente.getDataNascimento());
			}
			}
		}

			

