package br.com.fiap.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import br.com.fiap.view.GradientPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CotadorFrame {

    JFrame frame;
    private JTextField txtNome;
    private JTextField txtCpf;
    private JTextField txtCep;
    private JTextField txtNumeroResidencia;
    private JTextField txtR;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CotadorFrame window = new CotadorFrame();
                    window.frame.setVisible(true);
                    window.frame.setLocationRelativeTo(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public CotadorFrame() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setUndecorated(true);
        frame.setBounds(100, 100, 719, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        GradientPanel panel = new GradientPanel(new Color(0xa2d48d), new Color(0xa00a089));
        panel.setBounds(0, 41, 728, 103);
        frame.getContentPane().add(panel);
        panel.setLayout(null);


        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(0, 11, 749, 86);
        panel.add(lblNewLabel);
        lblNewLabel.setIcon(new ImageIcon(CotadorFrame.class.getResource("/resources/background-cotador_resized (1).png")));

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
        lblNewLabel_1.setIcon(new ImageIcon(CotadorFrame.class.getResource("/resources/close (1).png")));
        lblNewLabel_1.setBounds(666, 0, 50, 50);
        frame.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                HomeFrame home = new HomeFrame();
                home.frame.setVisible(true);
                frame.dispose();
                home.frame.setLocationRelativeTo(null);
            }
        });
        lblNewLabel_2.setIcon(new ImageIcon(CotadorFrame.class.getResource("/resources/previous (1).png")));
        lblNewLabel_2.setBounds(601, 8, 55, 32);
        frame.getContentPane().add(lblNewLabel_2);

        txtNome = new JTextField();
        txtNome.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        txtNome.setBounds(51, 220, 109, 20);
        frame.getContentPane().add(txtNome);
        txtNome.setColumns(10);
        txtNome.setText("Nome completo");
        txtNome.setForeground(Color.GRAY);
        txtNome.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtNome.getText().equals("Nome completo")) {
                    txtNome.setText("");
                    txtNome.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtNome.getText().isEmpty()) {
                    txtNome.setText("Nome completo");
                    txtNome.setForeground(Color.GRAY);
                }
            }
        });

        txtCpf = new JTextField();
        txtCpf.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        txtCpf.setBounds(51, 250, 109, 20);
        frame.getContentPane().add(txtCpf);
        txtCpf.setColumns(10);
        txtCpf.setText("Seu CPF");
        txtCpf.setForeground(Color.GRAY);
        txtCpf.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtCpf.getText().equals("CPF")) {
                    txtCpf.setText("");
                    txtCpf.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtCpf.getText().isEmpty()) {
                    txtCpf.setText("CPF");
                    txtCpf.setForeground(Color.GRAY);
                }
            }
        });

        txtCep = new JTextField();
        txtCep.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        txtCep.setBounds(51, 280, 283, 20);
        frame.getContentPane().add(txtCep);
        txtCep.setColumns(10);
        txtCep.setText("CEP do imóvel");
        txtCep.setForeground(Color.GRAY);
        txtCep.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtCep.getText().equals("Preencha o CEP")) {
                    txtCep.setText("");
                    txtCep.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtCep.getText().isEmpty()) {
                    txtCep.setText("Preencha o CEP");
                    txtCep.setForeground(Color.GRAY);
                }
            }
        });

        txtNumeroResidencia = new JTextField();
        txtNumeroResidencia.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        txtNumeroResidencia.setBounds(51, 310, 283, 20);
        frame.getContentPane().add(txtNumeroResidencia);
        txtNumeroResidencia.setColumns(10);
        txtNumeroResidencia.setText("Número da residência");
        txtNumeroResidencia.setForeground(Color.GRAY);
        txtNumeroResidencia.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtNumeroResidencia.getText().equals("Preencha o número da residência")) {
                    txtNumeroResidencia.setText("");
                    txtNumeroResidencia.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtNumeroResidencia.getText().isEmpty()) {
                    txtNumeroResidencia.setText("Preencha o número da residência");
                    txtNumeroResidencia.setForeground(Color.GRAY);
                }
            }
        });

        // Removendo as bordas esquerda, direita e superior dos campos de texto
        Border emptyBorder = BorderFactory.createEmptyBorder(0, 5, 0, 5);
        txtNome.setBorder(emptyBorder);
        txtCpf.setBorder(emptyBorder);
        txtCep.setBorder(emptyBorder);
        txtNumeroResidencia.setBorder(emptyBorder);

        JLabel lblNewLabel_1_1 = new JLabel("Importância Segurada");
        lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1_1.setForeground(new Color(20, 129, 99));
        lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblNewLabel_1_1.setBounds(400, 160, 316, 32);
        frame.getContentPane().add(lblNewLabel_1_1);

        JLabel lblNewLabel_1_1_1 = new JLabel("Preencha os campos");
        lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1_1.setForeground(Color.DARK_GRAY);
        lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblNewLabel_1_1_1.setBounds(51, 160, 192, 32);
        frame.getContentPane().add(lblNewLabel_1_1_1);

        JLabel lblNewLabel_3 = new JLabel("Levando em conta o valor do imóvel");
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3.setForeground(Color.GRAY);
        lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lblNewLabel_3.setBounds(343, 203, 213, 14);
        frame.getContentPane().add(lblNewLabel_3);

        JLabel lblNewLabel_3_1 = new JLabel("e de tudo o que há nele");
        lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_1.setForeground(Color.GRAY);
        lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lblNewLabel_3_1.setBounds(454, 203, 316, 14);
        frame.getContentPane().add(lblNewLabel_3_1);

        JLabel lblNewLabel_3_1_1 = new JLabel("(móveis, eletrodomésticos, eletroeletrônicos e seus bens).");
        lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_1_1.setForeground(Color.GRAY);
        lblNewLabel_3_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lblNewLabel_3_1_1.setBounds(358, 222, 316, 14);
        frame.getContentPane().add(lblNewLabel_3_1_1);

        JLabel lblNewLabel_3_1_1_1 = new JLabel("Qual é o valor que você deseja contratar como cobertura?");
        lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_1_1_1.setForeground(Color.DARK_GRAY);
        lblNewLabel_3_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lblNewLabel_3_1_1_1.setBounds(362, 242, 316, 14);
        frame.getContentPane().add(lblNewLabel_3_1_1_1);

        txtR = new JTextField();
        txtR.setHorizontalAlignment(SwingConstants.CENTER);
        txtR.setText("R$100.000,00");
        txtR.setForeground(Color.GRAY);
        txtR.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        txtR.setColumns(10);
        txtR.setBounds(358, 274, 316, 51);
        frame.getContentPane().add(txtR);
        
        JLabel lblNewLabel_3_2 = new JLabel("Valores entre R$ 100.000,00 e 1.000.000,00 são permitidos.");
        lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_2.setForeground(Color.GRAY);
        lblNewLabel_3_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lblNewLabel_3_2.setBounds(358, 336, 316, 14);
        frame.getContentPane().add(lblNewLabel_3_2);
        
        JLabel lblNewLabel_3_2_1 = new JLabel("Para outros valores, favor entrar em contato ");
        lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_2_1.setForeground(Color.GRAY);
        lblNewLabel_3_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lblNewLabel_3_2_1.setBounds(358, 355, 316, 14);
        frame.getContentPane().add(lblNewLabel_3_2_1);
        
        JLabel lblNewLabel_3_2_2 = new JLabel("conosco por esse email: housesg@gmail.com.");
        lblNewLabel_3_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_3_2_2.setForeground(Color.GRAY);
        lblNewLabel_3_2_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        lblNewLabel_3_2_2.setBounds(358, 373, 316, 20);
        frame.getContentPane().add(lblNewLabel_3_2_2);
        
        GradientButton grdntbtnProsseguir = new GradientButton("SIMULE E CONTRATE", new Color(35, 197, 174), new Color(25, 163, 143), 45, 225, 5, 6);
        grdntbtnProsseguir.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ResidenciaFrame residencia = new ResidenciaFrame();
		        residencia.frame.setVisible(true); 
		        frame.dispose();
		        residencia.frame.setLocationRelativeTo(null);
        	}
        });
        grdntbtnProsseguir.setText("PROSSEGUIR");
        grdntbtnProsseguir.setForeground(Color.WHITE);
        grdntbtnProsseguir.setFont(new Font("Segoe UI", Font.BOLD, 14));
        grdntbtnProsseguir.setBackground(new Color(23, 197, 174));
        grdntbtnProsseguir.setBounds(51, 358, 192, 43);
        frame.getContentPane().add(grdntbtnProsseguir);
        
        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon(CotadorFrame.class.getResource("/resources/hsg (2).png")));
        lblNewLabel_4.setBounds(0, 0, 64, 50);
        frame.getContentPane().add(lblNewLabel_4);
        
        // Ocultar o texto inicial ao começar a digitar
        txtR.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                txtR.setText("");
            }
        });
    }
}