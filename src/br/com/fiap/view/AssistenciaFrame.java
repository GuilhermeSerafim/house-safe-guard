package br.com.fiap.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class AssistenciaFrame {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AssistenciaFrame window = new AssistenciaFrame();
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
	 * @wbp.parser.entryPoint
	 */
	public AssistenciaFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(100, 100, 729, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon(AssistenciaFrame.class.getResource("/resources/hsg (2).png")));
		lblNewLabel_4_1.setBounds(0, 4, 64, 50);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("ESCOLHA A ASSISTÊNCIA IDEAL");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setForeground(new Color(20, 129, 99));
		lblNewLabel_1_1_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_1_2.setBounds(163, 15, 366, 32);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(AssistenciaFrame.class.getResource("/resources/previous (1).png")));
		lblNewLabel_2.setBounds(598, 0, 66, 60);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(AssistenciaFrame.class.getResource("/resources/close (1).png")));
		lblNewLabel_1.setBounds(674, 4, 55, 50);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Assistência 24hrs");
		lblNewLabel.setForeground(new Color(93, 198, 174));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 19));
		lblNewLabel.setBounds(57, 92, 152, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAssistnciaVip = new JLabel("Assistência Especial");
		lblAssistnciaVip.setHorizontalAlignment(SwingConstants.CENTER);
		lblAssistnciaVip.setForeground(new Color(93, 198, 174));
		lblAssistnciaVip.setFont(new Font("Segoe UI", Font.BOLD, 19));
		lblAssistnciaVip.setBounds(275, 77, 178, 32);
		frame.getContentPane().add(lblAssistnciaVip);
		
		JLabel lblAssistnciaEspecial = new JLabel("Assistência Vip");
		lblAssistnciaEspecial.setHorizontalAlignment(SwingConstants.CENTER);
		lblAssistnciaEspecial.setForeground(new Color(93, 198, 174));
		lblAssistnciaEspecial.setFont(new Font("Segoe UI", Font.BOLD, 19));
		lblAssistnciaEspecial.setBounds(529, 77, 141, 32);
		frame.getContentPane().add(lblAssistnciaEspecial);
		
		JLabel lblNewLabel_3_2 = new JLabel("Pacotes do assistência 24hrs +");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setForeground(Color.GRAY);
		lblNewLabel_3_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_3_2.setBounds(275, 108, 178, 14);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Pacotes do assistência 24hrs,");
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_1.setForeground(Color.GRAY);
		lblNewLabel_3_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_3_2_1.setBounds(519, 108, 152, 14);
		frame.getContentPane().add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("Assistência Especial +");
		lblNewLabel_3_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2_2.setForeground(Color.GRAY);
		lblNewLabel_3_2_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_3_2_2.setBounds(522, 120, 148, 14);
		frame.getContentPane().add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_3 = new JLabel("Chaveiro");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(57, 158, 152, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Encanador");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(57, 182, 152, 14);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("Eletricista");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_3_3.setBounds(57, 206, 152, 14);
		frame.getContentPane().add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Desintupidor");
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_3_4.setBounds(57, 231, 152, 14);
		frame.getContentPane().add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("Vidraceiro");
		lblNewLabel_3_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_5.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_3_5.setBounds(57, 256, 152, 14);
		frame.getContentPane().add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("Central de ajuda");
		lblNewLabel_3_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_6.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_3_6.setBounds(57, 281, 152, 14);
		frame.getContentPane().add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_7 = new JLabel("Linha Branca");
		lblNewLabel_3_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_7.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_3_7.setBounds(275, 158, 178, 14);
		frame.getContentPane().add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Linha Marrom");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_3_1_1.setBounds(275, 183, 178, 14);
		frame.getContentPane().add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Troca de Lâmpadas,");
		lblNewLabel_3_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_3_3_1.setBounds(275, 209, 178, 14);
		frame.getContentPane().add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("Caçamba");
		lblNewLabel_3_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_3_3_2.setBounds(519, 158, 151, 14);
		frame.getContentPane().add(lblNewLabel_3_3_2);
		
		JLabel lblNewLabel_3_4_2 = new JLabel("Instalação de Telas");
		lblNewLabel_3_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4_2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_3_4_2.setBounds(519, 261, 151, 14);
		frame.getContentPane().add(lblNewLabel_3_4_2);
		
		JLabel lblNewLabel_3_5_2 = new JLabel("Descarte Inteligente");
		lblNewLabel_3_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_5_2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_3_5_2.setBounds(519, 286, 151, 14);
		frame.getContentPane().add(lblNewLabel_3_5_2);
		
		GradientButton grdntbtnProsseguir_1_1 = new GradientButton("SIMULE E CONTRATE", new Color(35, 197, 174), new Color(25, 163, 143), 45, 225, 20, 20);
		grdntbtnProsseguir_1_1.setText("ESCOLHER");
		grdntbtnProsseguir_1_1.setForeground(Color.WHITE);
		grdntbtnProsseguir_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		grdntbtnProsseguir_1_1.setBackground(new Color(23, 197, 174));
		grdntbtnProsseguir_1_1.setBounds(57, 366, 145, 43);
		frame.getContentPane().add(grdntbtnProsseguir_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("R$6,00");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(new Color(20, 193, 168));
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_5.setBounds(57, 337, 145, 27);
		frame.getContentPane().add(lblNewLabel_5);
		
		GradientButton grdntbtnProsseguir_1_1_1 = new GradientButton("SIMULE E CONTRATE", new Color(35, 197, 174), new Color(25, 163, 143), 45, 225, 20, 20);
		grdntbtnProsseguir_1_1_1.setText("ESCOLHER");
		grdntbtnProsseguir_1_1_1.setForeground(Color.WHITE);
		grdntbtnProsseguir_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		grdntbtnProsseguir_1_1_1.setBackground(new Color(23, 197, 174));
		grdntbtnProsseguir_1_1_1.setBounds(300, 366, 145, 43);
		frame.getContentPane().add(grdntbtnProsseguir_1_1_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("R$15,00");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setForeground(new Color(20, 193, 168));
		lblNewLabel_5_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_5_1.setBounds(301, 337, 144, 27);
		frame.getContentPane().add(lblNewLabel_5_1);
		
		GradientButton grdntbtnProsseguir_1_1_2 = new GradientButton("SIMULE E CONTRATE", new Color(35, 197, 174), new Color(25, 163, 143), 45, 225, 20, 20);
		grdntbtnProsseguir_1_1_2.setText("ESCOLHER");
		grdntbtnProsseguir_1_1_2.setForeground(Color.WHITE);
		grdntbtnProsseguir_1_1_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		grdntbtnProsseguir_1_1_2.setBackground(new Color(23, 197, 174));
		grdntbtnProsseguir_1_1_2.setBounds(525, 366, 145, 43);
		frame.getContentPane().add(grdntbtnProsseguir_1_1_2);
		
		JLabel lblNewLabel_5_2 = new JLabel("R$24,00");
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2.setForeground(new Color(20, 193, 168));
		lblNewLabel_5_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_5_2.setBounds(529, 335, 135, 27);
		frame.getContentPane().add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_3_4_1_1 = new JLabel("Tomadas e");
		lblNewLabel_3_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_3_4_1_1.setBounds(275, 225, 178, 14);
		frame.getContentPane().add(lblNewLabel_3_4_1_1);
		
		JLabel lblNewLabel_3_4_1_1_1 = new JLabel("Interruptores");
		lblNewLabel_3_4_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_3_4_1_1_1.setBounds(275, 239, 178, 18);
		frame.getContentPane().add(lblNewLabel_3_4_1_1_1);
		
		JLabel lblNewLabel_3_3_1_1 = new JLabel("Instalação");
		lblNewLabel_3_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_3_3_1_1.setBounds(275, 267, 178, 14);
		frame.getContentPane().add(lblNewLabel_3_3_1_1);
		
		JLabel lblNewLabel_3_4_1_1_2 = new JLabel("do Visor Óptico");
		lblNewLabel_3_4_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4_1_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_3_4_1_1_2.setBounds(275, 281, 178, 14);
		frame.getContentPane().add(lblNewLabel_3_4_1_1_2);
		
		JLabel lblNewLabel_3_6_1_1 = new JLabel("Serviços gerais");
		lblNewLabel_3_6_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_6_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_3_6_1_1.setBounds(275, 300, 178, 27);
		frame.getContentPane().add(lblNewLabel_3_6_1_1);
		
		JLabel lblNewLabel_3_3_1_2 = new JLabel("Limpeza de");
		lblNewLabel_3_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_3_3_1_2.setBounds(519, 184, 151, 14);
		frame.getContentPane().add(lblNewLabel_3_3_1_2);
		
		JLabel lblNewLabel_3_4_1_1_3 = new JLabel("Ar Condicionado");
		lblNewLabel_3_4_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4_1_1_3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_3_4_1_1_3.setBounds(519, 198, 151, 14);
		frame.getContentPane().add(lblNewLabel_3_4_1_1_3);
		
		JLabel lblNewLabel_3_3_1_3 = new JLabel("Instalação de");
		lblNewLabel_3_3_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3_1_3.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_3_3_1_3.setBounds(519, 223, 151, 14);
		frame.getContentPane().add(lblNewLabel_3_3_1_3);
		
		JLabel lblNewLabel_3_4_1_1_4 = new JLabel("Suporte de TV");
		lblNewLabel_3_4_1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4_1_1_4.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_3_4_1_1_4.setBounds(519, 237, 151, 14);
		frame.getContentPane().add(lblNewLabel_3_4_1_1_4);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(AssistenciaFrame.class.getResource("/resources/Design sem nome (6) (1).png")));
		lblNewLabel_4.setBounds(655, 65, 55, 32);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(AssistenciaFrame.class.getResource("/resources/017-keychain.png")));
		lblNewLabel_6.setBounds(67, 158, 36, 32);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_6_2 = new JLabel("");
		lblNewLabel_6_6_2.setBounds(529, 158, 46, 14);
		frame.getContentPane().add(lblNewLabel_6_6_2);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setIcon(new ImageIcon(AssistenciaFrame.class.getResource("/resources/016-plumber.png")));
		lblNewLabel_6_1.setBounds(10, 157, 36, 32);
		frame.getContentPane().add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("");
		lblNewLabel_6_2.setIcon(new ImageIcon(AssistenciaFrame.class.getResource("/resources/010-electrician.png")));
		lblNewLabel_6_2.setBounds(10, 188, 36, 32);
		frame.getContentPane().add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("");
		lblNewLabel_6_3.setIcon(new ImageIcon(AssistenciaFrame.class.getResource("/resources/015-plunger.png")));
		lblNewLabel_6_3.setBounds(10, 231, 36, 32);
		frame.getContentPane().add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_6_4 = new JLabel("");
		lblNewLabel_6_4.setIcon(new ImageIcon(AssistenciaFrame.class.getResource("/resources/014-glazier.png")));
		lblNewLabel_6_4.setBounds(10, 266, 36, 32);
		frame.getContentPane().add(lblNewLabel_6_4);
		
		JLabel lblNewLabel_6_5 = new JLabel("");
		lblNewLabel_6_5.setIcon(new ImageIcon(AssistenciaFrame.class.getResource("/resources/013-customer-service.png")));
		lblNewLabel_6_5.setBounds(10, 309, 36, 32);
		frame.getContentPane().add(lblNewLabel_6_5);
		
		JLabel lblNewLabel_6_6 = new JLabel("");
		lblNewLabel_6_6.setIcon(new ImageIcon(AssistenciaFrame.class.getResource("/resources/012-mechanic.png")));
		lblNewLabel_6_6.setBounds(40, 115, 36, 32);
		frame.getContentPane().add(lblNewLabel_6_6);
		
		JLabel lblNewLabel_6_7 = new JLabel("");
		lblNewLabel_6_7.setIcon(new ImageIcon(AssistenciaFrame.class.getResource("/resources/011-construction.png")));
		lblNewLabel_6_7.setBounds(40, 157, 36, 32);
		frame.getContentPane().add(lblNewLabel_6_7);
		
		JLabel lblNewLabel_6_8 = new JLabel("");
		lblNewLabel_6_8.setIcon(new ImageIcon(AssistenciaFrame.class.getResource("/resources/001-light-bulb.png")));
		lblNewLabel_6_8.setBounds(40, 188, 36, 32);
		frame.getContentPane().add(lblNewLabel_6_8);
		
		JLabel lblNewLabel_6_9 = new JLabel("");
		lblNewLabel_6_9.setIcon(new ImageIcon(AssistenciaFrame.class.getResource("/resources/002-man.png")));
		lblNewLabel_6_9.setBounds(40, 234, 36, 32);
		frame.getContentPane().add(lblNewLabel_6_9);
		
		JLabel lblNewLabel_6_10 = new JLabel("");
		lblNewLabel_6_10.setIcon(new ImageIcon(AssistenciaFrame.class.getResource("/resources/003-carpenter.png")));
		lblNewLabel_6_10.setBounds(40, 266, 36, 32);
		frame.getContentPane().add(lblNewLabel_6_10);
		
		JLabel lblNewLabel_6_11 = new JLabel("");
		lblNewLabel_6_11.setIcon(new ImageIcon(AssistenciaFrame.class.getResource("/resources/005-caminhao-basculante.png")));
		lblNewLabel_6_11.setBounds(40, 312, 36, 32);
		frame.getContentPane().add(lblNewLabel_6_11);
		
		JLabel lblNewLabel_6_12 = new JLabel("");
		lblNewLabel_6_12.setIcon(new ImageIcon(AssistenciaFrame.class.getResource("/resources/009-service.png")));
		lblNewLabel_6_12.setBounds(86, 312, 36, 32);
		frame.getContentPane().add(lblNewLabel_6_12);
		
		JLabel lblNewLabel_6_13 = new JLabel("");
		lblNewLabel_6_13.setIcon(new ImageIcon(AssistenciaFrame.class.getResource("/resources/006-monitor.png")));
		lblNewLabel_6_13.setBounds(132, 312, 36, 32);
		frame.getContentPane().add(lblNewLabel_6_13);
		
		JLabel lblNewLabel_6_14 = new JLabel("");
		lblNewLabel_6_14.setIcon(new ImageIcon(AssistenciaFrame.class.getResource("/resources/007-computer-settings-interface-symbol-of-a-monitor-screen-with-gears.png")));
		lblNewLabel_6_14.setBounds(163, 312, 36, 32);
		frame.getContentPane().add(lblNewLabel_6_14);
		
		JLabel lblNewLabel_6_15 = new JLabel("");
		lblNewLabel_6_15.setIcon(new ImageIcon(AssistenciaFrame.class.getResource("/resources/008-discard.png")));
		lblNewLabel_6_15.setBounds(209, 312, 36, 32);
		frame.getContentPane().add(lblNewLabel_6_15);
	}
}
