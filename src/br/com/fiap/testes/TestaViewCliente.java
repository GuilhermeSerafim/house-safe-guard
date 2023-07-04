package br.com.fiap.testes;

import java.sql.SQLException;

import javax.swing.JFrame;

import br.com.fiap.view.ClienteFrame;
import br.com.fiap.view.ContadorFrame;

public class TestaViewCliente {

	public static void main(String[] args) {
		ClienteFrame frame = null;
		frame = new ClienteFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
