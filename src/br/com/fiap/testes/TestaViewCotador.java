package br.com.fiap.testes;

import java.sql.SQLException;
import javax.swing.JFrame;
import br.com.fiap.view.CotadorFrame;

public class TestaViewCotador {

	public static void main(String[] args) {
		CotadorFrame frame = null;
		try {
			frame = new CotadorFrame();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
