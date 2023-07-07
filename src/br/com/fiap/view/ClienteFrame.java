package br.com.fiap.view;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.com.fiap.model.Cliente;
import br.com.fiap.util.CriptografiaUtils;

public class ClienteFrame extends JFrame {

    private JLabel labelNome, labelCPF, labelEmail, labelCEP, labelSenha, labelTelefone, labelDataNascimento;
    private JTextField textoNome, textoCPF, textoEmail, textoCEP, textoSenha, textoTelefone, textoDataNascimento;
    private JButton botaoSalvar, botaoLimpar;

    public ClienteFrame() {
        Container container = getContentPane();
        setLayout(null);

        labelNome = new JLabel("Nome");
        labelCPF = new JLabel("CPF");
        labelEmail = new JLabel("Email");
        labelCEP = new JLabel("CEP");
        labelSenha = new JLabel("Senha");
        labelTelefone = new JLabel("Telefone");
        labelDataNascimento = new JLabel("Data de Nascimento");

        labelNome.setBounds(10, 10, 100, 15);
        labelCPF.setBounds(10, 40, 100, 15);
        labelEmail.setBounds(10, 70, 100, 15);
        labelCEP.setBounds(10, 100, 100, 15);
        labelSenha.setBounds(10, 130, 100, 15);
        labelTelefone.setBounds(10, 160, 100, 15);
        labelDataNascimento.setBounds(10, 190, 150, 15);

        labelNome.setForeground(Color.BLACK);
        labelCPF.setForeground(Color.BLACK);
        labelEmail.setForeground(Color.BLACK);
        labelCEP.setForeground(Color.BLACK);
        labelSenha.setForeground(Color.BLACK);
        labelTelefone.setForeground(Color.BLACK);
        labelDataNascimento.setForeground(Color.BLACK);

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

        textoNome.setBounds(160, 10, 200, 20);
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
