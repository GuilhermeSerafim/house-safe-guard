package br.com.fiap.testes;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.model.Contador;
import br.com.fiap.repository.ContadorDAO;



public class TesteContadorDAO {
	

		public static void main(String[] args) throws SQLException {

			ContadorDAO dao = new ContadorDAO();
			//Contador emerson = new Contador("Emerson", "casa",  100000.0);
			//Contador adriane = new Contador("Adriane", "apartamento", 200000.0);
			
			//dao.insert(emerson);
			//dao.insert(adriane);
			

			List<Contador> Contadores = dao.selectAll();
			for (Contador Contador : Contadores) {
				System.out.println(Contador.getId());
				System.out.println(Contador.getNome());
				System.out.println(Contador.getTpResidencia());
				System.out.println(Contador.getValor());
				System.out.println(Contador.getDataCadastro());
			}
		
			Contador Contador = dao.selectById(1);

				System.out.println(Contador.getId());
				System.out.println(Contador.getNome());
				System.out.println(Contador.getTpResidencia());
				System.out.println(Contador.getValor());
				System.out.println(Contador.getDataCadastro());
		}
	

}
