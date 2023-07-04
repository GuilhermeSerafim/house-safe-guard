package br.com.fiap.testes;

import java.sql.SQLException;

import javax.swing.JFrame;

import br.com.fiap.view.ClienteFrame;

public class TestaViewCliente {
	


		public static void main(String[] args) {
			ClienteFrame frame = null;
			try {
				frame = new ClienteFrame();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}


