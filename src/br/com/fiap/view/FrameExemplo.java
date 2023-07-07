package br.com.fiap.view;

	
	import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

	public class FrameExemplo extends JFrame {
	    
	    public FrameExemplo() {
	        super("Opções de Imóveis");
	        
	        // Configurando o layout do frame
	        setLayout(new FlowLayout());
	        
	        // Configurando a cor de fundo do frame
	        getContentPane().setBackground(new Color(180, 240, 180));
	        
	        // Criando os botões
	        JButton btnCasa = new JButton("Casa");
	        JButton btnCondominio = new JButton("Condomínio");
	        JButton btnApartamento = new JButton("Apartamento");
	        
	        // Configurando a aparência dos botões
	        int borderRadius = 10; // Raio do arredondamento dos botões
	        btnCasa.setBorderPainted(false);
	        btnCasa.setFocusPainted(false);
	        btnCasa.setBackground(new Color(210, 230, 210));
	        btnCasa.setOpaque(true);
	        btnCasa.setBorder(new RoundedBorder(borderRadius));
	        
	        btnCondominio.setBorderPainted(false);
	        btnCondominio.setFocusPainted(false);
	        btnCondominio.setBackground(new Color(210, 230, 210));
	        btnCondominio.setOpaque(true);
	        btnCondominio.setBorder(new RoundedBorder(borderRadius));
	        
	        btnApartamento.setBorderPainted(false);
	        btnApartamento.setFocusPainted(false);
	        btnApartamento.setBackground(new Color(210, 230, 210));
	        btnApartamento.setOpaque(true);
	        btnApartamento.setBorder(new RoundedBorder(borderRadius));
	        
	        // Adicionando os botões ao frame
	        add(btnCasa);
	        add(btnCondominio);
	        add(btnApartamento);
	        
	        // Configurando as propriedades do frame
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(300, 200);
	        setLocationRelativeTo(null); // Centraliza o frame na tela
	        setResizable(false);
	    }
	    
	    // Classe para criar um border arredondado
	    private static class RoundedBorder implements Border {
	        private int radius;
	        
	        public RoundedBorder(int radius) {
	            this.radius = radius;
	        }
	        
	        public Insets getBorderInsets(Component c) {
	            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
	        }
	        
	        public boolean isBorderOpaque() {
	            return true;
	        }
	        
	        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
	            g.drawRoundRect(x, y, width-1, height-1, radius, radius);
	        }
	    }
	    
	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new FrameExemplo().setVisible(true);
	            }
	        });
	    }
	}



