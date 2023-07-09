package br.com.fiap.model;

import java.util.ArrayList;

public interface CotCalcular {
	
	public static ArrayList <Double> CotCalcular(double valor) {
	    Cotador cotador;
        cotador = new Cotador() ;
        Casa casa = new Casa ();
        Apartamento apto = new Apartamento ();
        Condominio cond = new Condominio ();
        double valorCotacao1;
    	double valorCotacao2;
    	double valorCotacao3;
	    ArrayList <Double> cot = new ArrayList <Double>();


		if (cotador.getTpResidencia().equalsIgnoreCase("Casa")) {
					
					System.out.println("Seguro Básico: "+ "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\n");
				valorCotacao1 = casa.SeguroBasico(valor) ;
				System.out.println(valorCotacao1);
				
				System.out.println("Seguro Intermediário: " + "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\nVendaval" + "\n");
				valorCotacao2 = casa.SeguroIntermediario(valor) ;
				System.out.println(valorCotacao2);
				
				System.out.println("Seguro Avançado: " + "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\nVendaval" + "\nVidros" + "\nVazamento de Tubulacoes" + "\n");
				valorCotacao3 = casa.SeguroCompleto(valor) ;
				System.out.println(valorCotacao3);
				
				cot.add (valorCotacao1);
				cot.add (valorCotacao2);
				cot.add (valorCotacao2);
				
				return cot;
			
				} else if (cotador.getTpResidencia().equalsIgnoreCase(" Apartamento")) {
				System.out.println("Seguro Básico: "+ "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\n");
				valorCotacao1 = apto.SeguroBasico(valor) ;
				System.out.println(valorCotacao1);
				
				System.out.println("Seguro Intermediário: " + "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\nVendaval" + "\n");
				valorCotacao2 = apto.SeguroIntermediario(valor) ;
				System.out.println(valorCotacao2);
				
				System.out.println("Seguro Avançado: " + "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\nVendaval" + "\nVidros" + "\nVazamento de Tubulacoes" + "\n");
				valorCotacao3 = apto.SeguroCompleto(valor) ;
				System.out.println(valorCotacao3);
				
				cot.add (valorCotacao1);
				cot.add (valorCotacao2);
				cot.add (valorCotacao2);
				
				return cot;
			
			
			} else if (cotador.getTpResidencia().equalsIgnoreCase("Casa Condominio")) {
				System.out.println("Seguro Básico: "+ "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\n");
				valorCotacao1 = cond.SeguroBasico(valor);
				System.out.println(valor);
				
				System.out.println("Seguro Intermediário: " + "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\nVendaval" + "\n");
				valorCotacao2 = cond.SeguroIntermediario(valor);
				System.out.println(valor);
				
				System.out.println("Seguro Avançado: " + "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\nVendaval" + "\nVidros" + "\nVazamento de Tubulacoes" + "\n");
				valorCotacao3 = cond.SeguroCompleto(valor);
				System.out.println(valor);

				cot.add (valorCotacao1);
				cot.add (valorCotacao2);
				cot.add (valorCotacao2);
				
				return cot;

		}
		return cot;
			
				
		}			
	}



