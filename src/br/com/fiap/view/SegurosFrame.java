package br.com.fiap.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SegurosFrame {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SegurosFrame window = new SegurosFrame();
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
	public SegurosFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 729, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon(SegurosFrame.class.getResource("/resources/hsg (2).png")));
		lblNewLabel_4_1.setBounds(0, 0, 64, 50);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CotadorFrame cotador = new CotadorFrame();
		        cotador.frame.setVisible(true); 
		        frame.dispose();
		        cotador.frame.setLocationRelativeTo(null);
			}
		});
		lblNewLabel_2.setIcon(new ImageIcon(SegurosFrame.class.getResource("/resources/previous (1).png")));
		lblNewLabel_2.setBounds(598, -4, 66, 60);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon(SegurosFrame.class.getResource("/resources/close (1).png")));
		lblNewLabel_1.setBounds(674, 0, 55, 50);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("ESCOLHA A COBERTURA IDEAL");
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setForeground(new Color(20, 129, 99));
		lblNewLabel_1_1_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_1_2.setBounds(195, 11, 316, 32);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		GradientButton grdntbtnProsseguir = new GradientButton("SIMULE E CONTRATE", new Color(171, 184, 195), new Color(134, 165, 191), 45, 225, 20, 20);
		grdntbtnProsseguir.setText("BÁSICO");
		grdntbtnProsseguir.setForeground(Color.WHITE);
		grdntbtnProsseguir.setFont(new Font("Segoe UI", Font.BOLD, 14));
		grdntbtnProsseguir.setBackground(new Color(23, 197, 174));
		grdntbtnProsseguir.setBounds(10, 65, 192, 43);
		frame.getContentPane().add(grdntbtnProsseguir);
		
		GradientButton grdntbtnProsseguir_1 = new GradientButton("SIMULE E CONTRATE", new Color(0x391ce2), new Color(0x8556f8), 45, 225, 20, 20);
		grdntbtnProsseguir_1.setText("INTERMEDIÁRIO");
		grdntbtnProsseguir_1.setForeground(Color.WHITE);
		grdntbtnProsseguir_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		grdntbtnProsseguir_1.setBackground(new Color(23, 197, 174));
		grdntbtnProsseguir_1.setBounds(527, 65, 192, 43);
		frame.getContentPane().add(grdntbtnProsseguir_1);
		
		GradientButton grdntbtnProsseguir_2 = new GradientButton("SIMULE E CONTRATE", new Color(250, 210, 74), new Color(160, 112, 0), 45, 225, 20, 20);
		grdntbtnProsseguir_2.setText("PREMIUM");
		grdntbtnProsseguir_2.setForeground(Color.WHITE);
		grdntbtnProsseguir_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		grdntbtnProsseguir_2.setBackground(new Color(23, 197, 174));
		grdntbtnProsseguir_2.setBounds(245, 65, 239, 43);
		frame.getContentPane().add(grdntbtnProsseguir_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(SegurosFrame.class.getResource("/resources/Design sem nome (4) (1).png")));
		lblNewLabel.setBounds(473, 41, 55, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Incêndio");
		lblNewLabel_3.setForeground(new Color(0, 160, 137));
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_3.setBounds(21, 116, 72, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("R$100.000,00");
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_4.setForeground(new Color(0x005145));
		lblNewLabel_4.setBounds(21, 135, 102, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_2 = new JLabel("R$5.000,00");
		lblNewLabel_4_2.setForeground(new Color(0, 81, 69));
		lblNewLabel_4_2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_4_2.setBounds(21, 179, 102, 14);
		frame.getContentPane().add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("Roubo");
		lblNewLabel_3_1.setForeground(new Color(0, 160, 137));
		lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_3_1.setBounds(21, 160, 72, 14);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Danos eletrícos");
		lblNewLabel_3_1_1.setForeground(new Color(0, 160, 137));
		lblNewLabel_3_1_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_3_1_1.setBounds(20, 204, 102, 14);
		frame.getContentPane().add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("R$5.000,00");
		lblNewLabel_4_2_1.setForeground(new Color(0, 81, 69));
		lblNewLabel_4_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_4_2_1.setBounds(21, 223, 102, 14);
		frame.getContentPane().add(lblNewLabel_4_2_1);
		
		JLabel lblNewLabel_4_2_1_1 = new JLabel("R$10.000,00");
		lblNewLabel_4_2_1_1.setForeground(new Color(0, 81, 69));
		lblNewLabel_4_2_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_4_2_1_1.setBounds(21, 263, 102, 14);
		frame.getContentPane().add(lblNewLabel_4_2_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Desp. Aluguel");
		lblNewLabel_3_1_1_1.setForeground(new Color(0, 160, 137));
		lblNewLabel_3_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_3_1_1_1.setBounds(21, 244, 101, 14);
		frame.getContentPane().add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_4_2_1_2 = new JLabel("R$20.000,00");
		lblNewLabel_4_2_1_2.setForeground(new Color(0, 81, 69));
		lblNewLabel_4_2_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_4_2_1_2.setBounds(21, 307, 102, 14);
		frame.getContentPane().add(lblNewLabel_4_2_1_2);
		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("RC Familiar");
		lblNewLabel_3_1_1_2.setForeground(new Color(0, 160, 137));
		lblNewLabel_3_1_1_2.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_3_1_1_2.setBounds(21, 288, 72, 14);
		frame.getContentPane().add(lblNewLabel_3_1_1_2);
		
		JLabel lblNewLabel_4_2_1_2_1 = new JLabel("R$20.000,00");
		lblNewLabel_4_2_1_2_1.setForeground(new Color(0, 81, 69));
		lblNewLabel_4_2_1_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_4_2_1_2_1.setBounds(255, 307, 102, 14);
		frame.getContentPane().add(lblNewLabel_4_2_1_2_1);
		
		JLabel lblNewLabel_3_1_1_2_1 = new JLabel("RC Familiar");
		lblNewLabel_3_1_1_2_1.setForeground(new Color(0, 160, 137));
		lblNewLabel_3_1_1_2_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_3_1_1_2_1.setBounds(255, 288, 72, 14);
		frame.getContentPane().add(lblNewLabel_3_1_1_2_1);
		
		JLabel lblNewLabel_4_2_1_1_1 = new JLabel("R$10.000,00");
		lblNewLabel_4_2_1_1_1.setForeground(new Color(0, 81, 69));
		lblNewLabel_4_2_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_4_2_1_1_1.setBounds(255, 263, 102, 14);
		frame.getContentPane().add(lblNewLabel_4_2_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Desp. Aluguel");
		lblNewLabel_3_1_1_1_1.setForeground(new Color(0, 160, 137));
		lblNewLabel_3_1_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_3_1_1_1_1.setBounds(255, 244, 87, 14);
		frame.getContentPane().add(lblNewLabel_3_1_1_1_1);
		
		JLabel lblNewLabel_4_2_1_3 = new JLabel("R$5.000,00");
		lblNewLabel_4_2_1_3.setForeground(new Color(0, 81, 69));
		lblNewLabel_4_2_1_3.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_4_2_1_3.setBounds(255, 223, 102, 14);
		frame.getContentPane().add(lblNewLabel_4_2_1_3);
		
		JLabel lblNewLabel_3_1_1_3 = new JLabel("Danos elétricos");
		lblNewLabel_3_1_1_3.setForeground(new Color(0, 160, 137));
		lblNewLabel_3_1_1_3.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_3_1_1_3.setBounds(255, 204, 102, 14);
		frame.getContentPane().add(lblNewLabel_3_1_1_3);
		
		JLabel lblNewLabel_4_2_2 = new JLabel("R$5.000,00");
		lblNewLabel_4_2_2.setForeground(new Color(0, 81, 69));
		lblNewLabel_4_2_2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_4_2_2.setBounds(255, 179, 102, 14);
		frame.getContentPane().add(lblNewLabel_4_2_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Roubo");
		lblNewLabel_3_1_2.setForeground(new Color(0, 160, 137));
		lblNewLabel_3_1_2.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_3_1_2.setBounds(255, 160, 72, 14);
		frame.getContentPane().add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("R$100.000,00");
		lblNewLabel_4_3.setForeground(new Color(0, 81, 69));
		lblNewLabel_4_3.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_4_3.setBounds(255, 135, 102, 14);
		frame.getContentPane().add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_3_2 = new JLabel("Incêndio");
		lblNewLabel_3_2.setForeground(new Color(0, 160, 137));
		lblNewLabel_3_2.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_3_2.setBounds(255, 116, 72, 14);
		frame.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_2_1_2_2 = new JLabel("R$20.000,00");
		lblNewLabel_4_2_1_2_2.setForeground(new Color(0, 81, 69));
		lblNewLabel_4_2_1_2_2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_4_2_1_2_2.setBounds(537, 310, 102, 14);
		frame.getContentPane().add(lblNewLabel_4_2_1_2_2);
		
		JLabel lblNewLabel_3_1_1_2_2 = new JLabel("RC Familiar");
		lblNewLabel_3_1_1_2_2.setForeground(new Color(0, 160, 137));
		lblNewLabel_3_1_1_2_2.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_3_1_1_2_2.setBounds(537, 291, 72, 14);
		frame.getContentPane().add(lblNewLabel_3_1_1_2_2);
		
		JLabel lblNewLabel_4_2_1_1_2 = new JLabel("R$10.000,00");
		lblNewLabel_4_2_1_1_2.setForeground(new Color(0, 81, 69));
		lblNewLabel_4_2_1_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_4_2_1_1_2.setBounds(537, 266, 102, 14);
		frame.getContentPane().add(lblNewLabel_4_2_1_1_2);
		
		JLabel lblNewLabel_3_1_1_1_2 = new JLabel("Desp. Aluguel");
		lblNewLabel_3_1_1_1_2.setForeground(new Color(0, 160, 137));
		lblNewLabel_3_1_1_1_2.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_3_1_1_1_2.setBounds(537, 247, 102, 16);
		frame.getContentPane().add(lblNewLabel_3_1_1_1_2);
		
		JLabel lblNewLabel_4_2_1_4 = new JLabel("R$5.000,00");
		lblNewLabel_4_2_1_4.setForeground(new Color(0, 81, 69));
		lblNewLabel_4_2_1_4.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_4_2_1_4.setBounds(537, 226, 102, 14);
		frame.getContentPane().add(lblNewLabel_4_2_1_4);
		
		JLabel lblNewLabel_3_1_1_4 = new JLabel("Danos elétricos");
		lblNewLabel_3_1_1_4.setForeground(new Color(0, 160, 137));
		lblNewLabel_3_1_1_4.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_3_1_1_4.setBounds(537, 207, 102, 14);
		frame.getContentPane().add(lblNewLabel_3_1_1_4);
		
		JLabel lblNewLabel_4_2_3 = new JLabel("R$5.000,00");
		lblNewLabel_4_2_3.setForeground(new Color(0, 81, 69));
		lblNewLabel_4_2_3.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_4_2_3.setBounds(537, 182, 102, 14);
		frame.getContentPane().add(lblNewLabel_4_2_3);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("Roubo");
		lblNewLabel_3_1_3.setForeground(new Color(0, 160, 137));
		lblNewLabel_3_1_3.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_3_1_3.setBounds(537, 163, 72, 14);
		frame.getContentPane().add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("R$100.000,00");
		lblNewLabel_4_4.setForeground(new Color(0, 81, 69));
		lblNewLabel_4_4.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_4_4.setBounds(537, 138, 102, 14);
		frame.getContentPane().add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_3_3 = new JLabel("Incêndio");
		lblNewLabel_3_3.setForeground(new Color(0, 160, 137));
		lblNewLabel_3_3.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_3_3.setBounds(537, 119, 72, 14);
		frame.getContentPane().add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Vendaval");
		lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_2_1.setForeground(new Color(0, 160, 137));
		lblNewLabel_3_2_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_3_2_1.setBounds(382, 119, 102, 14);
		frame.getContentPane().add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_4_3_1 = new JLabel("R$10.000,00");
		lblNewLabel_4_3_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4_3_1.setForeground(new Color(0, 81, 69));
		lblNewLabel_4_3_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_4_3_1.setBounds(382, 138, 102, 14);
		frame.getContentPane().add(lblNewLabel_4_3_1);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("Vidros");
		lblNewLabel_3_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_2_2.setForeground(new Color(0, 160, 137));
		lblNewLabel_3_2_2.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_3_2_2.setBounds(382, 163, 102, 14);
		frame.getContentPane().add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_4_3_2 = new JLabel("R$2.500,00");
		lblNewLabel_4_3_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4_3_2.setForeground(new Color(0, 81, 69));
		lblNewLabel_4_3_2.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_4_3_2.setBounds(382, 182, 102, 14);
		frame.getContentPane().add(lblNewLabel_4_3_2);
		
		JLabel lblNewLabel_4_3_2_1 = new JLabel("R$10.000,00");
		lblNewLabel_4_3_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4_3_2_1.setForeground(new Color(0, 81, 69));
		lblNewLabel_4_3_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_4_3_2_1.setBounds(382, 244, 102, 14);
		frame.getContentPane().add(lblNewLabel_4_3_2_1);
		
		JLabel lblNewLabel_3_2_2_1 = new JLabel("Vazamento de");
		lblNewLabel_3_2_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_2_2_1.setForeground(new Color(0, 160, 137));
		lblNewLabel_3_2_2_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_3_2_2_1.setBounds(382, 207, 102, 14);
		frame.getContentPane().add(lblNewLabel_3_2_2_1);
		
		JLabel lblNewLabel_3_2_2_1_1 = new JLabel("Turbulações");
		lblNewLabel_3_2_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_2_2_1_1.setForeground(new Color(0, 160, 137));
		lblNewLabel_3_2_2_1_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_3_2_2_1_1.setBounds(382, 223, 102, 14);
		frame.getContentPane().add(lblNewLabel_3_2_2_1_1);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("Vendaval");
		lblNewLabel_3_2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_2_1_1.setForeground(new Color(0, 160, 137));
		lblNewLabel_3_2_1_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		lblNewLabel_3_2_1_1.setBounds(617, 119, 102, 14);
		frame.getContentPane().add(lblNewLabel_3_2_1_1);
		
		JLabel lblNewLabel_4_3_1_1 = new JLabel("R$10.000,00");
		lblNewLabel_4_3_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4_3_1_1.setForeground(new Color(0, 81, 69));
		lblNewLabel_4_3_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_4_3_1_1.setBounds(617, 138, 102, 14);
		frame.getContentPane().add(lblNewLabel_4_3_1_1);
		
		GradientButton grdntbtnProsseguir_1_1 = new GradientButton("SIMULE E CONTRATE", new Color(0xa1d28c), new Color(0x00a089), 45, 225, 20, 20);
		grdntbtnProsseguir_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		grdntbtnProsseguir_1_1.setText("ESCOLHER");
		grdntbtnProsseguir_1_1.setForeground(Color.WHITE);
		grdntbtnProsseguir_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		grdntbtnProsseguir_1_1.setBackground(new Color(23, 197, 174));
		grdntbtnProsseguir_1_1.setBounds(21, 366, 181, 43);
		frame.getContentPane().add(grdntbtnProsseguir_1_1);
		
		GradientButton grdntbtnProsseguir_1_1_1 = new GradientButton("SIMULE E CONTRATE", new Color(0xa1d28c), new Color(0x00a089), 45, 225, 20, 20);
		grdntbtnProsseguir_1_1_1.setText("ESCOLHER");
		grdntbtnProsseguir_1_1_1.setForeground(Color.WHITE);
		grdntbtnProsseguir_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		grdntbtnProsseguir_1_1_1.setBackground(new Color(23, 197, 174));
		grdntbtnProsseguir_1_1_1.setBounds(255, 366, 229, 43);
		frame.getContentPane().add(grdntbtnProsseguir_1_1_1);
		
		GradientButton grdntbtnProsseguir_1_1_2 = new GradientButton("SIMULE E CONTRATE", new Color(0xa1d28c), new Color(0x00a089), 45, 225, 20, 20);
		grdntbtnProsseguir_1_1_2.setText("ESCOLHER");
		grdntbtnProsseguir_1_1_2.setForeground(Color.WHITE);
		grdntbtnProsseguir_1_1_2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		grdntbtnProsseguir_1_1_2.setBackground(new Color(23, 197, 174));
		grdntbtnProsseguir_1_1_2.setBounds(537, 366, 182, 43);
		frame.getContentPane().add(grdntbtnProsseguir_1_1_2);
		
		JLabel lblNewLabel_5 = new JLabel("R$12,00");
		lblNewLabel_5.setForeground(new Color(0x14c1a8));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_5.setBounds(44, 337, 131, 27);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("R$20,00");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setForeground(new Color(20, 193, 168));
		lblNewLabel_5_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_5_1.setBounds(305, 337, 131, 27);
		frame.getContentPane().add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("R$14,00");
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2.setForeground(new Color(20, 193, 168));
		lblNewLabel_5_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_5_2.setBounds(560, 335, 131, 27);
		frame.getContentPane().add(lblNewLabel_5_2);
	}
}
