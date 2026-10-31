package br.com.fiap.model;
import java.util.ArrayList;

public class Cotacao {

	private Cotador cotador;
	private Casa casa = new Casa ();
	private Apartamento apto = new Apartamento ();
	private Condominio cond = new Condominio ();
	private double valorCotacao1;
	private double valorCotacao2;
	private double valorCotacao3;
	private double assistenciaEspecial;
	private double assistenciaVIP;
	private ArrayList<Double> cot = new ArrayList<Double>();
	private String escolha;
	
	public ArrayList <Double> CotCalcular(double valor) {

	    ArrayList <Double> cot = new ArrayList <Double>();
	    
	if (cotador.getTpResidencia().equalsIgnoreCase("Casa")) {
	
                              // SEGUROS //
				System.out.println("Seguro Básico: "+ "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\n");
			this.valorCotacao1 = casa.SeguroBasico(valor) ;
			System.out.println(valorCotacao1);
			
			System.out.println("Seguro Intermediário: " + "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\nVendaval" + "\n");
			this.valorCotacao2 = casa.SeguroIntermediario(valor) ;
			System.out.println(valorCotacao2);
			
			System.out.println("Seguro Avançado: " + "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\nVendaval" + "\nVidros" + "\nVazamento de Tubulacoes" + "\n");
			this.valorCotacao3 = casa.SeguroCompleto(valor) ;
			System.out.println(valorCotacao3);
			
                                // ASSISTENCIAS //
			System.out.println("\nAssistencia Especial: " + "\n");
			this.assistenciaEspecial = casa.AssistenciaEspecial(valor);
			System.out.println(assistenciaEspecial);
			
			System.out.println("\nAssistencia VIP: " + "\n");
			this.assistenciaEspecial = casa.AssistenciaVIP(valor);
			System.out.println(assistenciaVIP);
			
			cot.add (valorCotacao1);
			cot.add (valorCotacao2);
			cot.add (valorCotacao2);
			
			return cot;
		
							// SEGUROS //
			} else if (cotador.getTpResidencia().equalsIgnoreCase(" Apartamento")) {
			System.out.println("Seguro Básico: "+ "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\n");
			this.valorCotacao1 = apto.SeguroBasico(valor) ;
			System.out.println(valorCotacao1);
			
			System.out.println("Seguro Intermediário: " + "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\nVendaval" + "\n");
			this.valorCotacao2 = apto.SeguroIntermediario(valor) ;
			System.out.println(valorCotacao2);
			
			System.out.println("Seguro Avançado: " + "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\nVendaval" + "\nVidros" + "\nVazamento de Tubulacoes" + "\n");
			this.valorCotacao3 = apto.SeguroCompleto(valor) ;
			System.out.println(valorCotacao3);
			
			 			// ASSISTENCIAS //
			System.out.println("\nAssistencia Especial: " + "\n");
			this.assistenciaEspecial = apto.AssistenciaEspecial(valor);
			System.out.println(assistenciaEspecial);
			
			System.out.println("\nAssistencia VIP: " + "\n");
			this.assistenciaEspecial = apto.AssistenciaVIP(valor);
			System.out.println(assistenciaVIP);
			
			
			cot.add (valorCotacao1);
			cot.add (valorCotacao2);
			cot.add (valorCotacao2);
			
			return cot;
		
							// SEGUROS //
		} else if (cotador.getTpResidencia().equalsIgnoreCase("Casa Condominio")) {
			System.out.println("Seguro Básico: "+ "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\n");
			this.valorCotacao1 = cond.SeguroBasico(valor);
			System.out.println(valor);
			
			System.out.println("Seguro Intermediário: " + "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\nVendaval" + "\n");
			this.valorCotacao2 = cond.SeguroIntermediario(valor);
			System.out.println(valor);
			
			System.out.println("Seguro Avançado: " + "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\nVendaval" + "\nVidros" + "\nVazamento de Tubulacoes" + "\n");
			this.valorCotacao3 = cond.SeguroCompleto(valor);
			System.out.println(valor);
			
							// ASSISTENCIAS //
			System.out.println("\nAssistencia Especial: " + "\n");
			this.assistenciaEspecial = cond.AssistenciaEspecial(valor);
			System.out.println(assistenciaEspecial);
			
			System.out.println("\nAssistencia VIP: " + "\n");
			this.assistenciaEspecial = cond.AssistenciaVIP(valor);
			System.out.println(assistenciaVIP);

			cot.add (valorCotacao1);
			cot.add (valorCotacao2);
			cot.add (valorCotacao2);
			
			return cot;

	}
	return cot;
		
			
	}
	    	
	       
	    
	}
