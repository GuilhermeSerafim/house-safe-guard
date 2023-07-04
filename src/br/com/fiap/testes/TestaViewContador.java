package br.com.fiap.testes;

import java.sql.SQLException;

import javax.swing.JFrame;

import br.com.fiap.view.ContadorFrame;

public class TestaViewContador {

	public static void main(String[] args) {
		ContadorFrame frame = null;
		try {
			frame = new ContadorFrame();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
