package br.com.fiap.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Point;
import javax.swing.ImageIcon;

public class HomeFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeFrame window = new HomeFrame();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomeFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("House SG");
		frame.setUndecorated(true);
		frame.getContentPane().setFont(new Font("Segoe UI", Font.BOLD, 36));
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 336, 420);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(-92, 0, 513, 447);
		lblNewLabel_2.setIcon(new ImageIcon(HomeFrame.class.getResource("/resources/Logo Tree Dev (2).png")));
		panel.add(lblNewLabel_2);
		GradientButton button = new GradientButton("SIMULE E CONTRATE", new Color(0x23c5ae), new Color(0x19a38f), 45, 225, 5, 6);
		button.setText("ENTRAR");
		button.setBounds(395, 322, 119, 43);
		frame.getContentPane().add(button);
		button.addActionListener(new ActionListener() {
			//Ação do button
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "Você será redirecionado para a tela de CRUD");
			}
		});
		button.setFont(new Font("Segoe UI", Font.BOLD, 14));
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(23, 197, 174));
		
		textField = new JTextField();
		textField.setBounds(395, 181, 283, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(395, 216, 283, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("CPF");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel.setBounds(395, 156, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("SENHA");
		lblSenha.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblSenha.setBounds(395, 228, 46, 14);
		frame.getContentPane().add(lblSenha);
		
		JLabel lblNewLabel_1 = new JLabel("BEM-VINDO DE VOLTA");
		lblNewLabel_1.setForeground(new Color(20, 129, 99));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(420, 71, 230, 69);
		frame.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(395, 287, 283, 2);
		frame.getContentPane().add(separator_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(395, 253, 283, 36);
		frame.getContentPane().add(textField_1);
		
		GradientButton grdntbtnSair = new GradientButton("SIMULE E CONTRATE", new Color(35, 197, 174), new Color(25, 163, 143), 45, 225, 5, 6);
		grdntbtnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		grdntbtnSair.setText("SAIR");
		grdntbtnSair.setForeground(Color.WHITE);
		grdntbtnSair.setFont(new Font("Segoe UI", Font.BOLD, 14));
		grdntbtnSair.setBackground(new Color(23, 197, 174));
		grdntbtnSair.setBounds(560, 322, 119, 43);
		frame.getContentPane().add(grdntbtnSair);
		frame.setBounds(100, 100, 729, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
