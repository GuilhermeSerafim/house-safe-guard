package br.com.fiap.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import br.com.fiap.model.Cotador;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import br.com.fiap.view.CotadorFrame;

public class HomePageFrame extends JFrame {

	public HomePageFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Exemplo de JFrame");
		setSize(1200, 700);
		setLocationRelativeTo(null);

		Container container = getContentPane();
		container.setBackground(new Color(20, 129, 99));

		JPanel painel = new JPanel();
		painel.setBackground(new Color(171, 184, 195));
		painel.setLayout(new GridBagLayout());
		container.add(painel);

		JLabel labelBemVindo = new JLabel("Bem-vindo");
		labelBemVindo.setFont(new Font("Arial", Font.BOLD, 24));
		labelBemVindo.setForeground(Color.WHITE);

		JButton botaoEntrar = new JButton("Entrar");
		botaoEntrar.setPreferredSize(new Dimension(200, 30));
		botaoEntrar.setBackground(new Color(113, 206, 126));
		botaoEntrar.setForeground(Color.WHITE);
		botaoEntrar.setFont(new Font("Arial", Font.BOLD, 14));

		JButton botaoCotacao = new JButton("Cotação");
		botaoCotacao.setPreferredSize(new Dimension(200, 30));
		botaoCotacao.setBackground(new Color(113, 206, 126));
		botaoCotacao.setForeground(Color.WHITE);
		botaoCotacao.setFont(new Font("Arial", Font.BOLD, 14));

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.insets = new Insets(10, 0, 10, 0);
		painel.add(labelBemVindo, gbc);

		gbc.gridy = 1;
		painel.add(botaoEntrar, gbc);

		gbc.gridy = 2;
		painel.add(botaoCotacao, gbc);

		setVisible(true);

		botaoEntrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				entrar();
			}
		});

		botaoCotacao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cotacao();
			}
		});
	}

	private void entrar() {
		EntrarFrame entrar = new EntrarFrame();
		entrar.setVisible(true);
	}

	private void cotacao() {
		CotadorFrame contador;
		try {
			contador = new CotadorFrame();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
