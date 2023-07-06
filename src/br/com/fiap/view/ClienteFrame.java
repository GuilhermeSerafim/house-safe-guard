package br.com.fiap.view;

import java.awt.Color;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

import br.com.fiap.model.Cliente;
import br.com.fiap.util.CriptografiaUtils;

public class ClienteFrame extends JFrame {
	 JFrame frame = new JFrame("Exemplo de Fundo de Cor");

    private JLabel labelNome, labelCPF, labelEmail, labelCEP, labelSenha, labelTelefone, labelDataNascimento;
    private JTextField textoNome, textoCPF, textoEmail, textoCEP, textoSenha, textoTelefone, textoDataNascimento;
    private JButton botaoSalvar, botaoLimpar;

    public ClienteFrame() {
        Container container = getContentPane();
        getContentPane().setLayout(null);
        
        
       
        
  
        labelNome = new JLabel("Nome");
        labelNome.setForeground(new Color(153, 255, 153));
        labelNome.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
        labelCPF = new JLabel("CPF");
        labelCPF.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
        labelEmail = new JLabel("Email");
        labelEmail.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
        labelCEP = new JLabel("CEP");
        labelCEP.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
        labelSenha = new JLabel("Senha");
        labelSenha.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
        labelTelefone = new JLabel("Telefone");
        labelTelefone.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));
        labelDataNascimento = new JLabel("Data de Nascimento");
        labelDataNascimento.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 13));

        labelNome.setBounds(10, 0, 140, 40);
        labelCPF.setBounds(10, 42, 66, 15);
        labelEmail.setBounds(10, 68, 100, 27);
        labelCEP.setBounds(10, 94, 93, 27);
        labelSenha.setBounds(10, 132, 100, 15);
        labelTelefone.setBounds(10, 166, 100, 15);
        labelDataNascimento.setBounds(14, 192, 150, 15);
        
  
        container.setBackground(new Color(20, 129, 99));
       
       JPanel painel = new JPanel ();
       painel.setBackground(new Color (255,255,255));
       painel.setLayout(new GridBagLayout());
       container.add(painel);
        labelCPF.setForeground(new Color(153, 255, 153));
        labelEmail.setForeground(new Color(153, 255, 153));
        labelCEP.setForeground(new Color(153, 255, 153));
        labelSenha.setForeground(new Color(153, 255, 153));
        labelTelefone.setForeground(new Color(153, 255, 153));
        labelDataNascimento.setForeground(new Color(153, 255, 153));

        container.add(labelNome);
        container.add(labelCPF);
        container.add(labelEmail);
        container.add(labelCEP);
        container.add(labelSenha);
        container.add(labelTelefone);
        container.add(labelDataNascimento);

        textoNome = new JTextField();
        textoCPF = new JTextField();
        textoEmail = new JTextField();
        textoCEP = new JTextField();
        textoSenha = new JTextField();
        textoTelefone = new JTextField();
        textoDataNascimento = new JTextField();

        textoNome.setBounds(160, 12, 200, 20);
        textoCPF.setBounds(160, 40, 200, 20);
        textoEmail.setBounds(160, 70, 200, 20);
        textoCEP.setBounds(160, 100, 200, 20);
        textoSenha.setBounds(160, 130, 200, 20);
        textoTelefone.setBounds(160, 160, 200, 20);
        textoDataNascimento.setBounds(160, 190, 200, 20);

        container.add(textoNome);
        container.add(textoCPF);
        container.add(textoEmail);
        container.add(textoCEP);
        container.add(textoSenha);
        container.add(textoTelefone);
        container.add(textoDataNascimento);

        botaoSalvar = new JButton("Salvar");
        botaoLimpar = new JButton("Limpar");

        botaoSalvar.setBounds(160, 220, 80, 20);
        botaoLimpar.setBounds(260, 220, 80, 20);

        container.add(botaoSalvar);
        container.add(botaoLimpar);
        
        JLabel lblNewLabel = new JLabel("Nome");
        lblNewLabel.setIcon(new ImageIcon(ClienteFrame.class.getResource("/br/com/fiap/view/fundo2.jpg")));
        lblNewLabel.setBounds(-195, 0, 603, 629);
        getContentPane().add(lblNewLabel);

        setSize(400, 300);
        setVisible(true);
        setLocationRelativeTo(null);

        botaoSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarCliente();
            }
        });

        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparCampos();
            }
        });
    }

    private void salvarCliente() {
        String nome = textoNome.getText();
        String cpf = textoCPF.getText();
        String email = textoEmail.getText();
        String cep = textoCEP.getText();
        String senha = textoSenha.getText();
        String telefone = textoTelefone.getText();
        String dataNascimentoStr = textoDataNascimento.getText();

        if (nome.isEmpty() || cpf.isEmpty() || email.isEmpty() || cep.isEmpty() || senha.isEmpty()
                || telefone.isEmpty() || dataNascimentoStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
            return;
        }

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date dataNascimento = dateFormat.parse(dataNascimentoStr);

            Cliente cliente = new Cliente();
            // Realizar o salvamento do cliente no banco de dados ou outra operação desejada

            JOptionPane.showMessageDialog(this, "Cliente salvo com sucesso!");
            limparCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro ao salvar o cliente.");
        }
    }

    private void limparCampos() {
        textoNome.setText("");
        textoCPF.setText("");
        textoEmail.setText("");
        textoCEP.setText("");
        textoSenha.setText("");
        textoTelefone.setText("");
        textoDataNascimento.setText("");
    }
}
