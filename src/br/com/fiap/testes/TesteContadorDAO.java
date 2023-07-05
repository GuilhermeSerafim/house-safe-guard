package br.com.fiap.testes;

import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

import br.com.fiap.model.Cliente;
import br.com.fiap.model.Cotador;
import br.com.fiap.repository.ClienteDAO;
import br.com.fiap.repository.ContadorDAO;



public class TesteContadorDAO {
	

		public static void main(String[] args) throws SQLException{

			ContadorDAO dao = new ContadorDAO();
			//Contador emerson = new Contador("Emerson", "casa",  100000.0);
			//Contador adriane = new Contador("Adriane", "apartamento", 200000.0);
			
			//dao.insert(emerson);
			//dao.insert(adriane);
			
			ClienteDAO da = new ClienteDAO();
			Cliente isa = new Cliente("Isabella Sousa", "54191563858", "isabellasousa619gmail.com", "04243150", "isalinda", "11954712587", Date.valueOf("2005-04-05"));
			
			da.insert(isa);
			

			List<Cotador> Contadores = dao.selectAll();
			for (Cotador Contador : Contadores) {
				System.out.println(Contador.getId());
				System.out.println(Contador.getNome());
				System.out.println(Contador.getTpResidencia());
				System.out.println(Contador.getValor());
				System.out.println(Contador.getDataCadastro());
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

			

