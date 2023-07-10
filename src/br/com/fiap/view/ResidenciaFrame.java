package br.com.fiap.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ResidenciaFrame {

    JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ResidenciaFrame window = new ResidenciaFrame();
                    window.frame.setVisible(true);
                    window.frame.setLocationRelativeTo(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ResidenciaFrame() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setUndecorated(true);
        frame.setBounds(100, 100, 730, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setIcon(new ImageIcon(ResidenciaFrame.class.getResource("/resources/icon-home-button.png")));
        lblNewLabel_3.setBounds(81, 241, 40, 51);
        frame.getContentPane().add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon(ResidenciaFrame.class.getResource("/resources/icon-appartment.png")));
        lblNewLabel_4.setBounds(202, 241, 40, 51);
        frame.getContentPane().add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("");
        lblNewLabel_5.setIcon(new ImageIcon(ResidenciaFrame.class.getResource("/resources/icon-cond.png")));
        lblNewLabel_5.setBounds(322, 241, 57, 51);
        frame.getContentPane().add(lblNewLabel_5);

        JRadioButton rdbtnCondominio = new JRadioButton("Condomínio");
        rdbtnCondominio.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        rdbtnCondominio.setBounds(288, 302, 107, 23);
        frame.getContentPane().add(rdbtnCondominio);

        JRadioButton rdbtnApartamento = new JRadioButton("Apartamento");
        rdbtnApartamento.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        rdbtnApartamento.setBounds(164, 302, 107, 23);
        frame.getContentPane().add(rdbtnApartamento);

        JRadioButton rdbtnCasa = new JRadioButton("Casa");
        rdbtnCasa.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        rdbtnCasa.setBounds(74, 302, 57, 23);
        frame.getContentPane().add(rdbtnCasa);

        // Agrupando os botões de rádio
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rdbtnCasa);
        buttonGroup.add(rdbtnApartamento);
        buttonGroup.add(rdbtnCondominio);

        // Ação do botão "Casa"
        rdbtnCasa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Opção selecionada: Casa");
            }
        });

        // Ação do botão "Apartamento"
        rdbtnApartamento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Opção selecionada: Apartamento");
            }
        });

        // Ação do botão "Condomínio"
        rdbtnCondominio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Opção selecionada: Condomínio");
            }
        });

        JLabel lblNewLabel_1_1_2 = new JLabel("QUAL O TIPO DE IMÓVEL?");
        lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1_1_2.setForeground(new Color(20, 129, 99));
        lblNewLabel_1_1_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblNewLabel_1_1_2.setBounds(64, 202, 316, 32);
        frame.getContentPane().add(lblNewLabel_1_1_2);

        GradientPanel panel = new GradientPanel(new Color(162, 212, 141), new Color(0, 160, 137));
        panel.setLayout(null);
        panel.setBounds(0, 43, 778, 136);
        frame.getContentPane().add(panel);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(0, 11, 733, 117);
        panel.add(lblNewLabel);
        lblNewLabel.setIcon(new ImageIcon(ResidenciaFrame.class.getResource("/resources/1.png")));

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		System.exit(0);
        	}
        });
        lblNewLabel_1.setIcon(new ImageIcon(ResidenciaFrame.class.getResource("/resources/close (1).png")));
        lblNewLabel_1.setBounds(680, 0, 50, 50);
        frame.getContentPane().add(lblNewLabel_1);

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
        lblNewLabel_2.setIcon(new ImageIcon(ResidenciaFrame.class.getResource("/resources/previous (1).png")));
        lblNewLabel_2.setBounds(615, 10, 55, 32);
        frame.getContentPane().add(lblNewLabel_2);
        
        JLabel lblNewLabel_4_1 = new JLabel("");
        lblNewLabel_4_1.setIcon(new ImageIcon(ResidenciaFrame.class.getResource("/resources/hsg (2).png")));
        lblNewLabel_4_1.setBounds(0, 0, 64, 50);
        frame.getContentPane().add(lblNewLabel_4_1);
        
        JLabel lblNewLabel_6 = new JLabel("");
        lblNewLabel_6.setIcon(new ImageIcon(ResidenciaFrame.class.getResource("/resources/imagem_2023-07-10_022512723.png")));
        lblNewLabel_6.setBounds(418, 202, 258, 218);
        frame.getContentPane().add(lblNewLabel_6);
        
        GradientButton grdntbtnProsseguir = new GradientButton("SIMULE E CONTRATE", new Color(35, 197, 174), new Color(25, 163, 143), 45, 225, 5, 6);
        grdntbtnProsseguir.setText("PROSSEGUIR");
        grdntbtnProsseguir.setForeground(Color.WHITE);
        grdntbtnProsseguir.setFont(new Font("Segoe UI", Font.BOLD, 14));
        grdntbtnProsseguir.setBackground(new Color(23, 197, 174));
        grdntbtnProsseguir.setBounds(125, 343, 192, 43);
        frame.getContentPane().add(grdntbtnProsseguir);
    }
}
