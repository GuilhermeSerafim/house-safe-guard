package br.com.fiap.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.com.fiap.model.Cliente;
import br.com.fiap.repository.ClienteDAO;

public class EntrarFrame {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntrarFrame window = new EntrarFrame();
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
	public EntrarFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Entrar");
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
		
		//imagem dev tree
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
			}
		});
		lblNewLabel_2.setBounds(-92, 0, 418, 447);
		lblNewLabel_2.setIcon(new ImageIcon(EntrarFrame.class.getResource("/resources/Black Coconut Tree Logo.png")));
		panel.add(lblNewLabel_2);
		
		GradientButton button = new GradientButton("SIMULE E CONTRATE", new Color(0xa1d28c), new Color(0x00a089), 45, 225, 5, 20);
		button.setText("ENTRAR");
		button.setBounds(395, 318, 283, 43);
		frame.getContentPane().add(button);
		button.addActionListener(new ActionListener() {
			//Ação do button
			public void actionPerformed(ActionEvent e) {
				button.addActionListener(new ActionListener() {
				    public void actionPerformed(ActionEvent e) {
				    	String cpfDigitado = textField.getText();

				            InfoBDFrame info = null;
				            try {
				                info = new InfoBDFrame(cpfDigitado); // Passa o cpfDigitado como parâmetro
				            } catch (SQLException e1) {
				                e1.printStackTrace();
				            }

						try {
							info = new InfoBDFrame();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
				    	info.frame.setVisible(true); // Defina a visibilidade da janela EntrarFrame como true
				        frame.dispose();
				        info.frame.setLocationRelativeTo(null);

				        // Verifica se o CPF digitado não está vazio
				        if (!cpfDigitado.isEmpty()) {
				            ClienteDAO clienteDAO = null;
							try {
								clienteDAO = new ClienteDAO();
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
				            Cliente cliente = clienteDAO.selectById(cpfDigitado);

				            // Verifica se o cliente foi encontrado no banco de dados
				            if (cliente != null) {
				                // Verifica se o CPF digitado corresponde ao CPF do cliente
				                if (cliente.getCpf().equals(cpfDigitado)) {
				                    // Redireciona para a próxima tela ou execute as ações necessárias para um login bem-sucedido
				                    // ...
				                    JOptionPane.showMessageDialog(frame, "Login bem-sucedido! Você será redirecionado para a próxima tela.");
				                } else {
				                    JOptionPane.showMessageDialog(frame, "CPF ou senha incorretos. Tente novamente.");
				                }
				            } else {
				                JOptionPane.showMessageDialog(frame, "CPF ou senha incorretos. Tente novamente.");
				            }
				        } else {
				            JOptionPane.showMessageDialog(frame, "Por favor, digite o CPF.");
				        }
				    }
				});

			}
		});
		button.setFont(new Font("Segoe UI", Font.BOLD, 14));
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(23, 197, 174));
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField.setBounds(395, 181, 283, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(20, 129, 99));
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
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(384, 76, 297, 69);
		frame.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(20, 129, 99));
		separator_1.setBounds(395, 287, 283, 2);
		frame.getContentPane().add(separator_1);
		
		textField_1 = new JTextField();
		textField_1.setBorder(null);
		textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(395, 253, 283, 36);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				HomeFrame home = new HomeFrame(); // Crie uma instância da classe EntrarFrame
				home.frame.setVisible(true); // Defina a visibilidade da janela EntrarFrame como true
		        frame.dispose();
		        home.frame.setLocationRelativeTo(null);
			}
		});
		lblNewLabel_2_1.setBounds(585, 0, 91, 43);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon(EntrarFrame.class.getResource("/resources/previous (1).png")));
		lblNewLabel_2_2.setBounds(606, 11, 50, 32);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_1_1.setIcon(new ImageIcon(EntrarFrame.class.getResource("/resources/close (1).png")));
		lblNewLabel_1_1.setBounds(679, 0, 50, 57);
		frame.getContentPane().add(lblNewLabel_1_1);
		frame.setBounds(100, 100, 729, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
