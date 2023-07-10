package br.com.fiap.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class HomeFrame {

	JFrame frame;

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

	public HomeFrame() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 729, 420);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);

		GradientButton btnEntrar = new GradientButton("ENTRAR", new Color(0x23c5ae), new Color(0x19a38f), 45, 225, 5, 6);
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EntrarFrame entrar = new EntrarFrame();
		        entrar.frame.setVisible(true);
		        frame.dispose(); 
		        entrar.frame.setLocationRelativeTo(null);
			}
		});
		btnEntrar.setText("LOGIN");
		btnEntrar.setForeground(Color.WHITE);
		btnEntrar.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnEntrar.setBackground(new Color(23, 197, 174));
		btnEntrar.setBounds(541, 11, 128, 40);
		frame.getContentPane().add(btnEntrar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel.setIcon(new ImageIcon(HomeFrame.class.getResource("/resources/close (1).png")));
		lblNewLabel.setBounds(679, 0, 50, 57);
		frame.getContentPane().add(lblNewLabel);
		
		GradientPanel panel_1 = new GradientPanel(new Color(0xFFFFFF), new Color(0xFFFFFF));
		frame.getContentPane().add(panel_1);
		panel_1.setBounds(0, 0, 729, 420);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("com os nossos seguros residenciais.");
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(22, 222, 350, 35);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_2 = new JLabel("A House tem a solução financeira ideal para você!");
		lblNewLabel_2_2.setBounds(22, 260, 443, 29);
		panel_1.add(lblNewLabel_2_2);
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		
		JLabel lblNewLabel_2 = new JLabel("Proteja o seu lar e a sua família");
		lblNewLabel_2.setBounds(19, 190, 414, 29);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		
				GradientButton btnQueroFazer = new GradientButton("SIMULE E CONTRATE!", new Color(0x23c5ae), new Color(0x19a38f), 45, 225, 5, 6);
				btnQueroFazer.setBounds(21, 337, 265, 45);
				panel_1.add(btnQueroFazer);
				btnQueroFazer.addActionListener(new ActionListener() {
					// Ação para entrar na tela de cotação
					public void actionPerformed(ActionEvent e) {
						CotadorFrame cotador = new CotadorFrame(); // Crie uma instância da classe EntrarFrame
				        cotador.frame.setVisible(true); // Defina a visibilidade da janela EntrarFrame como true
				        frame.dispose();
				        cotador.frame.setLocationRelativeTo(null);
					}
				});
				btnQueroFazer.setForeground(Color.WHITE);
				btnQueroFazer.setFont(new Font("Segoe UI", Font.BOLD, 14));
				btnQueroFazer.setBackground(new Color(23, 197, 174));
				
				JLabel lblNewLabel_5 = new JLabel("");
				lblNewLabel_5.setIcon(new ImageIcon(HomeFrame.class.getResource("/resources/imgHome2_resized_resized.png")));
				lblNewLabel_5.setBounds(323, 106, 679, 303);
				panel_1.add(lblNewLabel_5);
				
				JLabel lblNewLabel_1 = new JLabel("CONHEÇA A HOUSE SG");
				lblNewLabel_1.setBounds(21, 100, 407, 84);
				panel_1.add(lblNewLabel_1);
				lblNewLabel_1.setForeground(new Color(20, 129, 99));
				lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 35));
				
				JLabel lblNewLabel_3 = new JLabel("");
				lblNewLabel_3.setBounds(0, 0, 82, 73);
				panel_1.add(lblNewLabel_3);
				lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_3.setIcon(new ImageIcon(HomeFrame.class.getResource("/resources/logohsg.png")));
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
