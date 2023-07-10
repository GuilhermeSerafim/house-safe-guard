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

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;


public class CotadorFrame {

    JFrame frame;
    private JTextField txtNome;
    private JTextField txtCpf;
    private JTextField txtCep;
    private JTextField txtNumeroResidencia;
    private JTextField txtR;
    private JTextField txtTpResidencia;

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
        frame.getContentPane().setBackground(Color.WHITE);
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
        txtNome.setBounds(51, 203, 109, 20);
        frame.getContentPane().add(txtNome);
        txtNome.setColumns(10);
        txtNome.setText("Nome");
        txtNome.setForeground(Color.GRAY);
        txtNome.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                txtNome.setText("");
                txtNome.setForeground(Color.BLACK);
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtNome.getText().isEmpty()) {
                    txtNome.setText("Digite seu nome");
                    txtNome.setForeground(Color.GRAY);
                }
            }
        });

        txtCpf = new JTextField();
        txtCpf.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        txtCpf.setBounds(51, 233, 109, 20);
        frame.getContentPane().add(txtCpf);
        txtCpf.setColumns(10);
        txtCpf.setText("CPF");
        txtCpf.setForeground(Color.GRAY);
        txtCpf.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                txtCpf.setText("");
                txtCpf.setForeground(Color.BLACK);
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtCpf.getText().isEmpty()) {
                    txtCpf.setText("Digite seu CPF");
                    txtCpf.setForeground(Color.GRAY);
                }
            }
        });

        txtCep = new JTextField();
        txtCep.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        txtCep.setBounds(51, 263, 283, 20);
        frame.getContentPane().add(txtCep);
        txtCep.setColumns(10);
        txtCep.setText("CEP");
        txtCep.setForeground(Color.GRAY);
        txtCep.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                txtCep.setText("");
                txtCep.setForeground(Color.BLACK);
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtCep.getText().isEmpty()) {
                    txtCep.setText("Digite seu CEP");
                    txtCep.setForeground(Color.GRAY);
                }
            }
        });

        txtNumeroResidencia = new JTextField();
        txtNumeroResidencia.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        txtNumeroResidencia.setBounds(50, 293, 283, 20);
        frame.getContentPane().add(txtNumeroResidencia);
        txtNumeroResidencia.setColumns(10);
        txtNumeroResidencia.setText("Número da residência");
        txtNumeroResidencia.setForeground(Color.GRAY);
        txtNumeroResidencia.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                txtNumeroResidencia.setText("");
                txtNumeroResidencia.setForeground(Color.BLACK);
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtNumeroResidencia.getText().isEmpty()) {
                    txtNumeroResidencia.setText("Digite o número da residência");
                    txtNumeroResidencia.setForeground(Color.GRAY);
                }
            }
        });

        // Removendo as bordas esquertas, direitas e superiores dos campos de texto
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

    JLabel lblNewLabel_3_1_1_1 = new JLabel("Qual é o valor que você deseja contratar como cobertura?");
    lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_3_1_1_1.setForeground(Color.DARK_GRAY);
    lblNewLabel_3_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
    lblNewLabel_3_1_1_1.setBounds(360, 203, 316, 14);
    frame.getContentPane().add(lblNewLabel_3_1_1_1);

    txtR = new JTextField();
    txtR.setHorizontalAlignment(SwingConstants.CENTER);
    txtR.setText("R$100.000,00");
    txtR.setForeground(Color.GRAY);
    txtR.setFont(new Font("Segoe UI", Font.PLAIN, 20));
    txtR.setColumns(10);
    txtR.setBounds(360, 220, 316, 51);
    frame.getContentPane().add(txtR);

    JLabel lblNewLabel_3_2 = new JLabel("Valores entre R$ 100.000,00 e 1.000.000,00 são permitidos.");
    lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_3_2.setForeground(Color.GRAY);
    lblNewLabel_3_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
    lblNewLabel_3_2.setBounds(360, 280, 316, 14);
    frame.getContentPane().add(lblNewLabel_3_2);

    JLabel lblNewLabel_3_2_1 = new JLabel("Para outros valores, favor entrar em contato ");
    lblNewLabel_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_3_2_1.setForeground(Color.GRAY);
    lblNewLabel_3_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
    lblNewLabel_3_2_1.setBounds(360, 299, 316, 14);
    frame.getContentPane().add(lblNewLabel_3_2_1);

    JLabel lblNewLabel_3_2_2 = new JLabel("conosco por esse email: housesg@gmail.com.");
    lblNewLabel_3_2_2.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel_3_2_2.setForeground(Color.GRAY);
    lblNewLabel_3_2_2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
    lblNewLabel_3_2_2.setBounds(360, 317, 316, 20);
    frame.getContentPane().add(lblNewLabel_3_2_2);

    GradientButton grdntbtnProsseguir = new GradientButton("SIMULE E CONTRATE", new Color(35, 197, 174), new Color(25, 163, 143), 45, 225, 5, 6);
    grdntbtnProsseguir.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            SegurosFrame seguros = new SegurosFrame();
            seguros.frame.setVisible(true);
            frame.dispose();
            seguros.frame.setLocationRelativeTo(null);
        }
    });
    grdntbtnProsseguir.setText("PROSSEGUIR");
    grdntbtnProsseguir.setForeground(Color.WHITE);
    grdntbtnProsseguir.setFont(new Font("Segoe UI", Font.BOLD, 14));
    grdntbtnProsseguir.setBackground(new Color(23, 197, 174));
    grdntbtnProsseguir.setBounds(247, 366, 211, 43);
    frame.getContentPane().add(grdntbtnProsseguir);

    JLabel lblNewLabel_4 = new JLabel("");
    lblNewLabel_4.setIcon(new ImageIcon(CotadorFrame.class.getResource("/resources/hsg (2).png")));
    lblNewLabel_4.setBounds(0, 0, 64, 50);
    frame.getContentPane().add(lblNewLabel_4);
    
    txtTpResidencia = new JTextField();
    txtTpResidencia.setBorder(null);
    txtTpResidencia.setText("Tipo da residência");
    txtTpResidencia.setForeground(Color.GRAY);
    txtTpResidencia.setFont(new Font("Segoe UI", Font.PLAIN, 12));
    txtTpResidencia.setColumns(10);
    txtTpResidencia.setBounds(53, 324, 192, 20);
    frame.getContentPane().add(txtTpResidencia);

    // Ocultar o texto inicial ao começar a digitar
    txtR.addFocusListener(new FocusAdapter() {
        @Override
        public void focusGained(FocusEvent e) {
            txtR.setText("");
            txtR.setForeground(Color.BLACK);
        }

        @Override
        public void focusLost(FocusEvent e) {
            if (txtR.getText().isEmpty()) {
                txtR.setText("R$100.000,00");
                txtR.setForeground(Color.GRAY);
            }
        }
    });
    
    	txtTpResidencia.addFocusListener(new FocusAdapter() {
        @Override
        public void focusGained(FocusEvent e) {
            txtTpResidencia.setText("");
            txtTpResidencia.setForeground(Color.BLACK);
        }

        @Override
        public void focusLost(FocusEvent e) {
            if (txtTpResidencia.getText().isEmpty()) {
            	txtTpResidencia.setText("Insira o tipo da sua residencia");
            	txtTpResidencia.setForeground(Color.GRAY);
            }
        }
    });
}
}
