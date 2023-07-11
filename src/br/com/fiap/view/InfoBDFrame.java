package br.com.fiap.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InfoBDFrame {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoBDFrame window = new InfoBDFrame();
					window.frame.setVisible(true);
					window.frame.requestFocusInWindow();
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
	public InfoBDFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
        frame.setUndecorated(true);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		GradientPanel panel = new GradientPanel(new Color(162, 212, 141), new Color(0, 160, 137));
		panel.setLayout(null);
		panel.setBounds(0, 35, 774, 130);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 11, 733, 182);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(InfoBDFrame.class.getResource("/resources/z.png")));
		
		GradientPanel panel_1 = new GradientPanel(new Color(162, 212, 141), new Color(0, 160, 137));
		panel_1.setLayout(null);
		panel_1.setBounds(0, 164, 730, 16);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Seus dados:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setForeground(new Color(20, 129, 99));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_1.setBounds(10, 184, 284, 43);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBounds(10, 247, 140, 24);
		frame.getContentPane().add(textField);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(20, 129, 99));
		separator.setBounds(10, 274, 140, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("CPF");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 234, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Nome completo");
		lblNewLabel_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(10, 295, 93, 15);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(10, 307, 140, 24);
		frame.getContentPane().add(textField_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(20, 129, 99));
		separator_1.setBounds(10, 334, 140, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Tipo da residência");
		lblNewLabel_2_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(10, 353, 106, 14);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBounds(10, 367, 140, 24);
		frame.getContentPane().add(textField_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(20, 129, 99));
		separator_2.setBounds(10, 394, 140, 2);
		frame.getContentPane().add(separator_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Valor do imóvel");
		lblNewLabel_2_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(200, 233, 106, 14);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBounds(201, 247, 140, 24);
		frame.getContentPane().add(textField_3);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(new Color(20, 129, 99));
		separator_3.setBounds(201, 274, 140, 2);
		frame.getContentPane().add(separator_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("CEP");
		lblNewLabel_2_4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_2_4.setBounds(200, 295, 46, 14);
		frame.getContentPane().add(lblNewLabel_2_4);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBorder(null);
		textField_4.setBounds(201, 307, 140, 24);
		frame.getContentPane().add(textField_4);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBackground(new Color(20, 129, 99));
		separator_4.setBounds(201, 334, 140, 2);
		frame.getContentPane().add(separator_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Número da residência");
		lblNewLabel_2_5.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblNewLabel_2_5.setBounds(200, 352, 131, 16);
		frame.getContentPane().add(lblNewLabel_2_5);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField_5.setColumns(10);
		textField_5.setBorder(null);
		textField_5.setBounds(201, 367, 140, 24);
		frame.getContentPane().add(textField_5);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBackground(new Color(20, 129, 99));
		separator_5.setBounds(201, 394, 140, 2);
		frame.getContentPane().add(separator_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField_6.setColumns(10);
		textField_6.setBorder(null);
		textField_6.setBounds(372, 247, 140, 24);
		frame.getContentPane().add(textField_6);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBackground(new Color(0X2847AD));
		separator_6.setBounds(372, 274, 140, 2);
		frame.getContentPane().add(separator_6);
		
		JLabel lblNewLabel_1_1 = new JLabel("Valor total");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(0X2847AD));
		lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(372, 224, 131, 27);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				HomeFrame home = new HomeFrame();
                home.frame.setVisible(true);
                frame.dispose();
                home.frame.setLocationRelativeTo(null);
			}
		});
		lblNewLabel_2_1_1.setIcon(new ImageIcon(InfoBDFrame.class.getResource("/resources/previous (1).png")));
		lblNewLabel_2_1_1.setBounds(601, -3, 64, 43);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_1_1_1.setIcon(new ImageIcon(InfoBDFrame.class.getResource("/resources/close (1).png")));
		lblNewLabel_1_1_1.setBounds(693, -10, 50, 57);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(InfoBDFrame.class.getResource("/resources/zz (1).png")));
		lblNewLabel_3.setBounds(526, 220, 204, 176);
		frame.getContentPane().add(lblNewLabel_3);
		
		GradientButton grdntbtnProsseguir = new GradientButton("SIMULE E CONTRATE", new Color(161, 210, 140), new Color(0, 160, 137), 45, 225, 5, 6);
		grdntbtnProsseguir.setText("ALTERAR");
		grdntbtnProsseguir.setForeground(Color.WHITE);
		grdntbtnProsseguir.setFont(new Font("Segoe UI", Font.BOLD, 14));
		grdntbtnProsseguir.setBackground(new Color(23, 197, 174));
		grdntbtnProsseguir.setBounds(390, 297, 109, 43);
		frame.getContentPane().add(grdntbtnProsseguir);
		
		GradientButton grdntbtnSalvar = new GradientButton("SIMULE E CONTRATE", new Color(161, 210, 140), new Color(0, 160, 137), 45, 225, 5, 6);
		grdntbtnSalvar.setText("EXCLUIR");
		grdntbtnSalvar.setForeground(Color.WHITE);
		grdntbtnSalvar.setFont(new Font("Segoe UI", Font.BOLD, 14));
		grdntbtnSalvar.setBackground(new Color(23, 197, 174));
		grdntbtnSalvar.setBounds(390, 353, 109, 43);
		frame.getContentPane().add(grdntbtnSalvar);
		frame.setBounds(100, 100, 730, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
