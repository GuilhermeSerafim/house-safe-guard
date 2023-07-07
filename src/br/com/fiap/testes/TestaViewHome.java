package br.com.fiap.testes;


import java.sql.SQLException;
import javax.swing.JFrame;
import br.com.fiap.view.ClienteFrame;
import br.com.fiap.view.CotadorFrame;
import br.com.fiap.view.HomePageFrame;

public class TestaViewHome {

	public static void main(String[] args) {
		HomePageFrame frame = null;
		frame = new HomePageFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
