package br.com.fiap.model;

public interface Residencia {

	/////////////////////////// METODO DO SEGURO ////////////////////////////////////////
	public double SeguroBasico (double valor);
	public double SeguroIntermediario (double valor);
	public double SeguroCompleto  (double valor);

	/////////////////////////// METODO DA ASSISTENCIA ////////////////////////////////////////
	public double AssistenciaEspecial (double valor);
	public double AssistenciaVIP (double valor);
	double AssistenciaBasica(double assistencia);
}
