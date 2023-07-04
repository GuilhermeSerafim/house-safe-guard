package br.com.fiap.view;

import java.util.ArrayList;

import br.com.fiap.model.Contador;

public interface CotCalcular {
	
	public static ArrayList <Double> CotCalcular(double valor) {
	    Contador contador;
        contador = new Contador() ;
        double valorCotacao1;
    	double valorCotacao2;
    	double valorCotacao3;




		  
	    ArrayList <Double> cot = new ArrayList <Double>();


	    	
	if (contador.getTpResidencia().equalsIgnoreCase("Casa")) {
				
				System.out.println("Seguro Básico: "+ "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\n");
			valorCotacao1 = ((valor / 100)*0.006)*30 ;
			System.out.println(valorCotacao1);
			
			System.out.println("Seguro Intermediário: " + "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\nVendaval" + "\n");
			valorCotacao2 = ((valor / 100)*0.0069)*30 ;
			System.out.println(valorCotacao2);
			
			System.out.println("Seguro Avançado: " + "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\nVendaval" + "\nVidros" + "\nVazamento de Tubulacoes" + "\n");
			valorCotacao3 = ((valor / 100)*0.0084)*30 ;
			System.out.println(valorCotacao3);
			
			cot.add (valorCotacao1);
			cot.add (valorCotacao2);
			cot.add (valorCotacao2);
			
			return cot;
		
			} else if (contador.getTpResidencia().equalsIgnoreCase(" Apartamento")) {
			System.out.println("Seguro Básico: "+ "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\n");
			valorCotacao1 = ((valor / 100)*0.002)*30 ;
			System.out.println(valorCotacao1);
			
			System.out.println("Seguro Intermediário: " + "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\nVendaval" + "\n");
			valorCotacao2 = ((valor / 100)*0.0029)*30;
			System.out.println(valorCotacao2);
			
			System.out.println("Seguro Avançado: " + "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\nVendaval" + "\nVidros" + "\nVazamento de Tubulacoes" + "\n");
			valorCotacao3 = ((valor / 100)*0.0044)*30 ;
			System.out.println(valorCotacao3);
			
			return cot;
		
		
		} else if (contador.getTpResidencia().equalsIgnoreCase("Casa Condominio")) {
			System.out.println("Seguro Básico: "+ "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\n");
			valorCotacao1 = ResidenciaCondomio.SeguroBasico(valor);
			System.out.println(valor);
			
			System.out.println("Seguro Intermediário: " + "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\nVendaval" + "\n");
			valorCotacao2 = ResidenciaCondomio.SeguroIntermediario(valor);
			System.out.println(valor);
			
			System.out.println("Seguro Avançado: " + "\nSeguro Incendio" + "\nSeguro Roubo" + "\nSeguro Danos Eletricos" +"\nDesp Aluguel" + "\nRC Familiar" + "\nVendaval" + "\nVidros" + "\nVazamento de Tubulacoes" + "\n");
			valorCotacao3 = ResidenciaCondomio.SeguroAvancado(valor);
			System.out.println(valor);
			return cot ;

	}
	return cot;
		
			
	}

}
