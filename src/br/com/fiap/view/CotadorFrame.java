
package br.com.fiap.view;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import br.com.fiap.model.Apartamento;
import br.com.fiap.model.Casa;
import br.com.fiap.model.Condominio;
import br.com.fiap.model.Cotador;
import br.com.fiap.repository.CotadorDAO;

	public class CotadorFrame extends JFrame {
	    private static final long serialVersionUID = 1L;
	    private JLabel labelNome, labelTpResidencia, labelValor;
	    private JTextField textoNome, textoTpResidencia, textoValor;
	    private JButton botaoSalvar, botaoEditar, botaoLimpar, botarApagar, botaoSair, botaoCalcular;
	    private JTable tabela;
	    private DefaultTableModel modelo;
	    private CotadorDAO dao = new CotadorDAO();
	    private Condominio cond = new Condominio();
	    private Casa casa = new Casa();
	    private Apartamento apto = new Apartamento();

		private double valorCotacao1;
		private double valorCotacao2;
		private double valorCotacao3;
		private Cotador cotador;
		
		public CotadorFrame() throws SQLException {
	        Container container = getContentPane();
	        setLayout(null);

	        labelNome = new JLabel("Nome");
	        labelTpResidencia = new JLabel("Tipo Residencia");
	        labelValor = new JLabel("Valor");
	        
	        labelNome.setBounds(10, 10, 240, 15);
	        labelTpResidencia.setBounds(10, 50, 240, 15);
	        labelValor.setBounds(10, 100, 240, 15);
	        
	        labelNome.setForeground(Color.BLACK);
	        labelTpResidencia.setForeground(Color.BLACK);
	        labelValor.setForeground(Color.BLACK);
	        
	        container.add(labelNome);
	        container.add(labelTpResidencia);
	        container.add(labelValor);
	        
	        textoNome = new JTextField();
	        textoTpResidencia = new JTextField();
	        textoValor = new JTextField();
	        
	        textoNome.setBounds(10, 25, 265, 20);
	        textoTpResidencia.setBounds(10, 70, 265, 20);
	        textoValor.setBounds(10, 120, 265, 20);
	        
	        container.add(textoNome);
	        container.add(textoTpResidencia);
	        container.add(textoValor);
	        
	        botaoSalvar = new JButton("Salvar");
	        botaoLimpar = new JButton("Limpar");
	        botaoCalcular = new JButton("Calcular");
	        
	        botaoSalvar.setBounds(10, 150, 80, 20);
	        botaoLimpar.setBounds(100, 150, 80, 20);
	        botaoCalcular.setBounds(190, 150, 100, 20);
	        
	        container.add(botaoSalvar);
	        container.add(botaoLimpar);
	        container.add(botaoCalcular);
	        
	        tabela = new JTable();
	        modelo = (DefaultTableModel) tabela.getModel();
	        modelo.addColumn("Id do Usuario");
	        modelo.addColumn("Nome do Usuario");
	        modelo.addColumn("TpResidencia");
	        modelo.addColumn("Valor");
	        preencherTabela();
	        tabela.setBounds(10, 185, 760, 300);
	        container.add(tabela);
	        
	        botarApagar = new JButton("Excluir");
	        botaoEditar = new JButton("Alterar");
	        botaoSair = new JButton("Sair");
	        
	        botarApagar.setBounds(10, 500, 80, 20);
	        botaoEditar.setBounds(100, 500, 80, 20);
	        botaoSair.setBounds(700, 500, 80, 20);
	        
	        container.add(botaoSair);
	        container.add(botarApagar);
	        container.add(botaoEditar);
	        setSize(800, 600);
	        setVisible(true);
	        setLocationRelativeTo(null);
	        botaoSalvar.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                salvar();
	                limparTabela();
	                preencherTabela();
	            }
	        });
	        botaoLimpar.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                limpar();
	            }
	        });
	        botarApagar.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                deletar();
	                limparTabela();
	                preencherTabela();
	            }
	        });
	        botaoEditar.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                alterar();
	                limparTabela();
	                preencherTabela();
	            }
	        });
	        botaoCalcular.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	cotador = new Cotador();
	            	ArrayList <Double> resultado = CotCalcular(Double.parseDouble(textoValor.getText()));
	              System.out.println(resultado);
	            }
	        });
	        
	        botaoSair.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                System.exit(ABORT);
	            }
	        });
	    }
	    private void limparTabela() {
	        modelo.getDataVector().clear();
	    }
	    private void alterar() {
	        Object objetoDaLinha = modelo.getValueAt(tabela.getSelectedRow(), tabela.getSelectedColumn());
	        if (objetoDaLinha instanceof Integer) {
	            Integer id = (Integer) objetoDaLinha;
	            String nome = (String) modelo.getValueAt(tabela.getSelectedRow(), 1);
	            String tpResidencia = (String) modelo.getValueAt(tabela.getSelectedRow(), 2);
	            Double valor = (double) modelo.getValueAt(tabela.getSelectedRow(), 3);
	            Cotador cont = new Cotador(nome, tpResidencia, valor);
	            cont.setId(id);
	            this.dao.update(cont);
	            JOptionPane.showMessageDialog(this, "Item alterado com sucesso!");
	        } else {
	            JOptionPane.showMessageDialog(this, "Por favor, selecionar o ID");
	        }
	    }
	    private void deletar() {
	        Object objetoDaLinha = modelo.getValueAt(tabela.getSelectedRow(), tabela.getSelectedColumn());
	        if (objetoDaLinha instanceof Integer) {
	            Integer id = (Integer) objetoDaLinha;
	            this.dao.delete(id);
	            modelo.removeRow(tabela.getSelectedRow());
	            JOptionPane.showMessageDialog(this, "Item excluído com sucesso!");
	        } else {
	            JOptionPane.showMessageDialog(this, "Por favor, selecionar o ID");
	        }
	    }
	    
	    private void preencherTabela() {
	        List<Cotador> cotadores = dao.selectAll();
	        try {
	            for (Cotador cotador : cotadores) {
	            	modelo.addRow(new Object[] { cotador.getId(), cotador.getNome(), cotador.getTpResidencia(), cotador.getValor()});
	            }
	        } catch (Exception e) {
	            throw e;
	        }
	    }
	    private void salvar() {
	        if (!textoNome.getText().equals("") && !textoTpResidencia.getText().equals("")
	                && !textoValor.getText().equals("")) {
	            Cotador contador = new Cotador(textoNome.getText(), textoTpResidencia.getText(),
	                    Double.parseDouble(textoValor.getText()));
	            this.dao.insert(contador);
	            JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
	            this.limpar();
	        } else {
	            JOptionPane.showMessageDialog(this, "Nome e Descrição devem ser informados.");
	        }
	    }
	    private void limpar() {
	        this.textoNome.setText("");
	        this.textoTpResidencia.setText("");
	        this.textoValor.setText("");
	    }
	    
	   	public ArrayList <Double> CotCalcular(double valor) {
	     
	       ArrayList <Double> cot = new ArrayList <Double>();
	       if (textoTpResidencia.getText().equalsIgnoreCase("Casa")) {

				System.out.println("Seguro Básico: "+ "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\n");
			this.valorCotacao1 = casa.SeguroBasico(valor);
	System.out.println(valorCotacao1);
			
			System.out.println("Seguro Intermediário: " + "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\nVendaval" + "\n");
			this.valorCotacao2 = casa.SeguroIntermediario(valor);
			System.out.println(valorCotacao2);
			
			System.out.println("Seguro Avançado: " + "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\nVendaval" + "\nVidros" + "\nVazamento de Tubulacoes" + "\n");
			this.valorCotacao3 = casa.SeguroCompleto(valor);
			System.out.println(valorCotacao3);
			
			cot.add (valorCotacao1);
			cot.add (valorCotacao2);
			cot.add (valorCotacao2);
			
			return cot;
			
	       } else if (textoTpResidencia.getText().equalsIgnoreCase("Apartamento")) {
	   		System.out.println("Seguro Básico: "+ "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\n");
	   		this.valorCotacao1 = apto.SeguroBasico(valor);
	   		System.out.println(valorCotacao1);
	   		
	   		System.out.println("Seguro Intermediário: " + "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\nVendaval" + "\n");
			this.valorCotacao2 = apto.SeguroBasico(valor);
			System.out.println(valorCotacao2);
			
			System.out.println("Seguro Avançado: " + "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\nVendaval" + "\nVidros" + "\nVazamento de Tubulacoes" + "\n");
			this.valorCotacao3 = apto.SeguroBasico(valor);
			System.out.println(valorCotacao3);
			
			return cot;

	       } else if (textoTpResidencia.getText().equalsIgnoreCase("Casa Condominio")) {
	   		System.out.println("Seguro Básico: "+ "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\n");
	   		this.valorCotacao1 = cond.SeguroBasico(valor);
	   		System.out.println(valor);
	   		
	   		System.out.println("Seguro Intermediário: " + "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\nVendaval" + "\n");
	   		this.valorCotacao2 = cond.SeguroIntermediario(valor);
	   		System.out.println(valor);
	   		
	   		System.out.println("Seguro Avançado: " + "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\nVendaval" + "\nVidros" + "\nVazamento de Tubulacoes" + "\n");
	   		this.valorCotacao3 = cond.SeguroCompleto(valor);
	   		System.out.println(valor);
	   		return cot ;
	   }
	   return cot;
	   	
	   		
	   }
	       	
	          
	       
	   }
	   
 
        
        
  
        
        
        