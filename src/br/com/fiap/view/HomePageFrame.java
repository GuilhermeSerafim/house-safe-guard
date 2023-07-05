package br.com.fiap.view;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class HomePageFrame extends JFrame {

    private JButton botaoEntrar;
    private JButton botaoCadastrar;
    private JButton botaoCalcular;

    public HomePageFrame() {
        Container container = getContentPane();
        setLayout(null);
        container.setBackground(Color.LIGHT_GRAY);

        botaoEntrar = new JButton("Entrar");
        botaoCadastrar = new JButton("Cadastrar");
        botaoCalcular = new JButton("Cotação");

        botaoEntrar.setBounds(100, 50, 200, 30);
        botaoCadastrar.setBounds(100, 100, 200, 30);
        botaoCalcular.setBounds(100, 150, 200, 30);

        Color borderColor = new Color(0, 0, 255); // Cor azul
        Border border = BorderFactory.createLineBorder(borderColor);
        
        botaoEntrar.setBorder(border);
        botaoCadastrar.setBorder(border);
        botaoCalcular.setBorder(border);

        container.add(botaoEntrar);
        container.add(botaoCadastrar);
        container.add(botaoCalcular);

        setSize(400, 250);
        setVisible(true);
        setLocationRelativeTo(null);

        botaoEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entrar();
            }
        });

        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrar();
            }
        });

        botaoCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });
    }

    private void entrar() {
        JOptionPane.showMessageDialog(this, "Ação do botão 'Entrar' ainda não foi implementada.");
    }

    private void cadastrar() {
        ClienteFrame cliente = new ClienteFrame();
        cliente.setVisible(true);
    }

    private void calcular() {
        ContadorFrame contador;
        try {
            contador = new ContadorFrame();
            contador.setVisible(true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
