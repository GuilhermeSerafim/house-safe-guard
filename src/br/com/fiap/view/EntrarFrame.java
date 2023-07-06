package br.com.fiap.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EntrarFrame extends JFrame {

    public EntrarFrame() {
        setTitle("Entrar");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel labelCpf = new JLabel("CPF:");
        JTextField inputCpf = new JTextField();
        
        JLabel labelSenha = new JLabel("Senha:");
        JTextField inputSenha = new JTextField();
        
        JButton botaoConfirmar = new JButton("Confirmar");

        setLayout(null);
        
        labelCpf.setBounds(50, 30, 80, 20);
        inputCpf.setBounds(130, 30, 120, 20);
        
        labelSenha.setBounds(50, 70, 80, 20);
        inputSenha.setBounds(130, 70, 120, 20);
        
        botaoConfirmar.setBounds(100, 120, 100, 30);

        add(labelCpf);
        add(inputCpf);
        add(labelSenha);
        add(inputSenha);
        add(botaoConfirmar);

        setVisible(true);
    }

    public static void main(String[] args) {
        new EntrarFrame();
    }
}
