package br.com.fiap.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CadastroFrame {

    JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;

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

    public CadastroFrame() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setUndecorated(true);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setBackground(Color.WHITE);
        frame.setBounds(100, 100, 730, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setIcon(new ImageIcon(CadastroFrame.class.getResource("/resources/Black Coconut Tree Logo.png")));
        lblNewLabel_2.setBounds(-99, -8, 398, 447);
        frame.getContentPane().add(lblNewLabel_2);

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
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setForeground(new Color(20, 129, 99));
        lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 25));
        lblNewLabel_1.setBounds(378, 41, 297, 57);
        frame.getContentPane().add(lblNewLabel_1);

        textField = new JTextField();
        textField.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        textField.setForeground(Color.GRAY);
        textField.setText("Email");
        textField.setColumns(10);
        textField.setBounds(430, 109, 200, 25);
        frame.getContentPane().add(textField);

        textField_1 = new JTextField();
        textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        textField_1.setForeground(Color.GRAY);
        textField_1.setText("Nome");
        textField_1.setColumns(10);
        textField_1.setBounds(431, 140, 200, 25);
        frame.getContentPane().add(textField_1);

        GradientButton button = new GradientButton("SIMULE E CONTRATE", new Color(35, 197, 174), new Color(25, 163, 143), 45, 225, 5, 20);
        button.setText("CADASTRAR");
        button.setForeground(Color.WHITE);
        button.setFont(new Font("Segoe UI", Font.BOLD, 14));
        button.setBackground(new Color(23, 197, 174));
        button.setBounds(430, 318, 200, 43);
        frame.getContentPane().add(button);

        JLabel lblNewLabel_1_1_1 = new JLabel("");
        lblNewLabel_1_1_1.setBounds(664, 0, 50, 57);
        frame.getContentPane().add(lblNewLabel_1_1_1);

        JLabel lblNewLabel_2_1_1 = new JLabel("");
        lblNewLabel_2_1_1.setBounds(570, 0, 91, 43);
        frame.getContentPane().add(lblNewLabel_2_1_1);
        
        textField_2 = new JTextField();
        textField_2.setText("Nome");
        textField_2.setForeground(Color.GRAY);
        textField_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        textField_2.setColumns(10);
        textField_2.setBounds(430, 171, 200, 25);
        frame.getContentPane().add(textField_2);
        
        textField_3 = new JTextField();
        textField_3.setText("Nome");
        textField_3.setForeground(Color.GRAY);
        textField_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        textField_3.setColumns(10);
        textField_3.setBounds(430, 202, 200, 25);
        frame.getContentPane().add(textField_3);
        
        textField_4 = new JTextField();
        textField_4.setText("Nome");
        textField_4.setForeground(Color.GRAY);
        textField_4.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        textField_4.setColumns(10);
        textField_4.setBounds(430, 264, 200, 25);
        frame.getContentPane().add(textField_4);
        
        textField_5 = new JTextField();
        textField_5.setText("Nome");
        textField_5.setForeground(Color.GRAY);
        textField_5.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        textField_5.setColumns(10);
        textField_5.setBounds(430, 233, 200, 25);
        frame.getContentPane().add(textField_5);

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
                if (textField_1.getText().equals("Nome")) {
                    textField_1.setText("");
                    textField_1.setForeground(Color.BLACK);
                }
            }

            @Override //2
            public void focusLost(FocusEvent e) {
                if (textField_1.getText().isEmpty()) {
                    textField_1.setText("Nome");
                    textField_1.setForeground(Color.GRAY);
                }
            }
        });
    }
}
