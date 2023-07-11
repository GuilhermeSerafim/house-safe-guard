package br.com.fiap.model;

public class Casa implements Residencia{

	private double seguro;
	private double assistencia;
	
					// SEGUROS // 
	
	@Override
	public double SeguroBasico(double valor) {
		// TODO Auto-generated method stub
		return seguro = ((valor / 100)*0.006)*30 ;
	}

	@Override
	public double SeguroIntermediario(double valor) {
		// TODO Auto-generated method stub
		return seguro = ((valor / 100)*0.0069)*30 ;
	}

	@Override
	public double SeguroCompleto(double valor) {
		return seguro = ((valor / 100)*0.0084)*30 ;
	}

					// ASSISTENCIAS //
	
	@Override
	public double AssistenciaBasica(double assistencia) {
		// TODO Auto-generated method stub
		return assistencia;
	}

	
	@Override
	public double AssistenciaEspecial(double assistencia) {
		// TODO Auto-generated method stub
		return assistencia = 18.90;
	}

	@Override
	public double AssistenciaVIP(double valor) {
		// TODO Auto-generated method stub
		return assistencia = 24.90;
	}


}