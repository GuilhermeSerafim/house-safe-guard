package br.com.fiap.model;
import br.com.fiap.view.Residencia;

public class Condominio implements Residencia{

	private double seguro;
	private double assistencia;
	
	@Override
	public double SeguroBasico(double valor) {
		// TODO Auto-generated method stub
		return seguro = ((valor / 100)*0.004)*30 ;
	}

	@Override
	public double SeguroIntermediario(double valor) {
		// TODO Auto-generated method stub
		return seguro = ((valor / 100)*0.0049)*30 ;
	}

	@Override
	public double SeguroCompleto(double valor) {
		return seguro = ((valor / 100)*0.0064)*30 ;
	}

	@Override
	public double AssistenciaEspecial(double valor) {
		// TODO Auto-generated method stub
		return assistencia = seguro + 0.05;
	}

	@Override
	public double AssistenciaVIP(double valor) {
		// TODO Auto-generated method stub
		return assistencia = seguro + (10/100);
	}

}
