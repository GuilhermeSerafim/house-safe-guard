package br.com.fiap.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.com.fiap.model.Cliente;
import br.com.fiap.repository.ClienteDAO;

public class CadastroFrame {

    JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private ClienteDAO dao;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CadastroFrame window = new CadastroFrame();
                    window.frame.setVisible(true);
                    window.frame.requestFocusInWindow();
                    window.frame.setLocationRelativeTo(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public CadastroFrame() throws SQLException {
        initialize();
        dao = new ClienteDAO();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setUndecorated(true);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setBackground(Color.WHITE);
        frame.setBounds(100, 100, 730, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel_1_1 = new JLabel("");
        lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        	System.exit(0);
        	}
        });
        lblNewLabel_1_1.setIcon(new ImageIcon(CadastroFrame.class.getResource("/resources/close (1).png")));
        lblNewLabel_1_1.setBounds(664, 0, 50, 57);
        frame.getContentPane().add(lblNewLabel_1_1);

        JLabel lblNewLabel_2_1 = new JLabel("");
        lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		AssistenciaFrame assistencia = new AssistenciaFrame();
                assistencia.frame.setVisible(true);
                frame.dispose();
                assistencia.frame.setLocationRelativeTo(null);
        	}
        });
        lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1.setIcon(new ImageIcon(CadastroFrame.class.getResource("/resources/previous (1).png")));
        lblNewLabel_2_1.setBounds(570, 8, 91, 43);
        frame.getContentPane().add(lblNewLabel_2_1);

        JLabel lblNewLabel_1 = new JLabel("Faça seu cadastro");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1.setForeground(new Color(20, 129, 99));
        lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        lblNewLabel_1.setBounds(29, 190, 297, 57);
        frame.getContentPane().add(lblNewLabel_1);

        textField = new JTextField();
        textField.setBorder(null);
        textField.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        textField.setForeground(Color.GRAY);
        textField.setText("Email");
        textField.setColumns(10);
        textField.setBounds(29, 246, 200, 25);
        frame.getContentPane().add(textField);

        textField_1 = new JTextField();
        textField_1.setBorder(null);
        textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        textField_1.setForeground(Color.GRAY);
        textField_1.setText("CPF");
        textField_1.setColumns(10);
        textField_1.setBounds(29, 282, 200, 25);
        frame.getContentPane().add(textField_1);

        GradientButton button = new GradientButton("SIMULE E CONTRATE", new Color(0xa1d28c), new Color(0x00a089), 45, 225, 5, 20);
        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		salvar();
        		EntrarFrame entrar = new EntrarFrame();
                entrar.frame.setVisible(true);
                frame.dispose();
                entrar.frame.setLocationRelativeTo(null);
        	}
        });
        button.setText("CADASTRAR");
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Segoe UI", Font.BOLD, 14));
        button.setBackground(new Color(23, 197, 174));
        button.setBounds(29, 366, 200, 43);
        frame.getContentPane().add(button);

        JLabel lblNewLabel_1_1_1 = new JLabel("");
        lblNewLabel_1_1_1.setBounds(664, 0, 50, 57);
        frame.getContentPane().add(lblNewLabel_1_1_1);

        JLabel lblNewLabel_2_1_1 = new JLabel("");
        lblNewLabel_2_1_1.setBounds(570, 0, 91, 43);
        frame.getContentPane().add(lblNewLabel_2_1_1);
        
        textField_2 = new JTextField();
        textField_2.setBorder(null);
        textField_2.setText("Telefone");
        textField_2.setForeground(Color.GRAY);
        textField_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        textField_2.setColumns(10);
        textField_2.setBounds(282, 282, 200, 25);
        frame.getContentPane().add(textField_2);
        
        textField_3 = new JTextField();
        textField_3.setBorder(null);
        textField_3.setText("CEP");
        textField_3.setForeground(Color.GRAY);
        textField_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        textField_3.setColumns(10);
        textField_3.setBounds(282, 246, 200, 25);
        frame.getContentPane().add(textField_3);
        
        textField_4 = new JTextField();
        textField_4.setBorder(null);
        textField_4.setText("Idade");
        textField_4.setForeground(Color.GRAY);
        textField_4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        textField_4.setColumns(10);
        textField_4.setBounds(282, 318, 200, 25);
        frame.getContentPane().add(textField_4);
        
        textField_5 = new JTextField();
        textField_5.setBorder(null);
        textField_5.setText("Senha");
        textField_5.setForeground(Color.GRAY);
        textField_5.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        textField_5.setColumns(10);
        textField_5.setBounds(29, 318, 200, 25);
        frame.getContentPane().add(textField_5);
        
        GradientPanel panel = new GradientPanel(new Color(162, 212, 141), new Color(0, 160, 137));
        panel.setLayout(null);
        panel.setBounds(0, 49, 778, 136);
        frame.getContentPane().add(panel);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(CadastroFrame.class.getResource("/resources/1.png")));
        lblNewLabel.setBounds(0, 11, 733, 117);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_4_1 = new JLabel("");
        lblNewLabel_4_1.setIcon(new ImageIcon(CadastroFrame.class.getResource("/resources/hsg (2).png")));
        lblNewLabel_4_1.setBounds(0, 0, 64, 50);
        frame.getContentPane().add(lblNewLabel_4_1);
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon(CadastroFrame.class.getResource("/resources/cadastrar (1).png")));
        lblNewLabel_2.setBounds(445, 212, 322, 219);
        frame.getContentPane().add(lblNewLabel_2);
        
        JSeparator separator = new JSeparator();
        separator.setBackground(new Color(20, 129, 99));
        separator.setBounds(29, 270, 200, 25);
        frame.getContentPane().add(separator);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setBackground(new Color(20, 129, 99));
        separator_1.setBounds(29, 306, 200, 25);
        frame.getContentPane().add(separator_1);
        
        JSeparator separator_2 = new JSeparator();
        separator_2.setBackground(new Color(20, 129, 99));
        separator_2.setBounds(29, 345, 200, 25);
        frame.getContentPane().add(separator_2);
        
        JSeparator separator_3 = new JSeparator();
        separator_3.setBackground(new Color(20, 129, 99));
        separator_3.setBounds(282, 270, 200, 25);
        frame.getContentPane().add(separator_3);
        
        JSeparator separator_4 = new JSeparator();
        separator_4.setBackground(new Color(20, 129, 99));
        separator_4.setBounds(282, 306, 200, 25);
        frame.getContentPane().add(separator_4);
        
        JSeparator separator_5 = new JSeparator();
        separator_5.setBackground(new Color(20, 129, 99));
        separator_5.setBounds(282, 345, 200, 25);
        frame.getContentPane().add(separator_5);

        textField.addFocusListener(new FocusAdapter() {
            @Override //1
            public void focusGained(FocusEvent e) {
            	if (textField.getText().equals("Email")) {
            		textField.setText("");
                    textField.setForeground(Color.BLACK);
            	}
            }

            @Override //2
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
                    textField.setText("Email");
                    textField.setForeground(Color.GRAY);
                }
            }
        });

        textField_1.addFocusListener(new FocusAdapter() {
            @Override //1
            public void focusGained(FocusEvent e) {
                if (textField_1.getText().equals("CPF")) {
                    textField_1.setText("");
                    textField_1.setForeground(Color.BLACK);
                }
            }

            @Override //2
            public void focusLost(FocusEvent e) {
                if (textField_1.getText().isEmpty()) {
                    textField_1.setText("CPF");
                    textField_1.setForeground(Color.GRAY);
                }
            }
        });
        
        textField_2.addFocusListener(new FocusAdapter() {
            @Override //1
            public void focusGained(FocusEvent e) {
            	if (textField_2.getText().equals("Telefone")) {
            		textField_2.setText("");
                    textField_2.setForeground(Color.BLACK);
            	}
            }

            @Override //2
            public void focusLost(FocusEvent e) {
                if (textField_2.getText().isEmpty()) {
                    textField_2.setText("Telefone");
                    textField_2.setForeground(Color.GRAY);
                }
            }
        });
        
        textField_3.addFocusListener(new FocusAdapter() {
            @Override //1
            public void focusGained(FocusEvent e) {
            	if (textField_3.getText().equals("CEP")) {
            		textField_3.setText("");
                    textField_3.setForeground(Color.BLACK);
            	}
            }

            @Override //2
            public void focusLost(FocusEvent e) {
                if (textField_3.getText().isEmpty()) {
                    textField_3.setText("CEP");
                    textField_3.setForeground(Color.GRAY);
                }
            }
        });

        textField_4.addFocusListener(new FocusAdapter() {
            @Override //1
            public void focusGained(FocusEvent e) {
            	if (textField_4.getText().equals("Idade")) {
            		textField_4.setText("");
                    textField_4.setForeground(Color.BLACK);
            	}
            }

            @Override //2
            public void focusLost(FocusEvent e) {
                if (textField_4.getText().isEmpty()) {
                    textField_4.setText("Idade");
                    textField_4.setForeground(Color.GRAY);
                }
            }
        });
        
        textField_5.addFocusListener(new FocusAdapter() {
            @Override //1
            public void focusGained(FocusEvent e) {
            	if (textField_5.getText().equals("Senha")) {
            		textField_5.setText("");
                    textField_5.setForeground(Color.BLACK);
            	}
            }

            @Override //2
            public void focusLost(FocusEvent e) {
                if (textField_5.getText().isEmpty()) {
                    textField_5.setText("Senha");
                    textField_5.setForeground(Color.GRAY);
                }
            }
        });
    }
    
    private void salvar() {
        if (!textField.getText().equals("") && !textField_1.getText().equals("") && !textField_2.getText().equals("")
                && !textField_3.getText().equals("") && !textField_4.getText().equals("")
                && !textField_5.getText().equals("")) {
        
                 Cliente cliente = new Cliente(textField_1.getText(), textField.getText(), textField_3.getText(),
                         textField_5.getText(), textField_2.getText(),(textField_4.getText()));
                 dao.insert(cliente); // Chamada ao método insert() do CotadorDAO
                 JOptionPane.showMessageDialog(frame, "Salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                 limpar();
                             
         } else {
             JOptionPane.showMessageDialog(frame, "Nome e Descrição devem ser informados.", "Erro", JOptionPane.ERROR_MESSAGE);
         }
     }
     

    
    
    

    
    private void limpar() {
    	textField.setText("");
    	textField_1.setText("");
    	textField_2.setText("");
    	textField_3.setText("");
    	textField_4.setText("");
    	textField_5.setText("");
    }
}
