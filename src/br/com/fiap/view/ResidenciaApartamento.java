package br.com.fiap.view;

//import br.com.fiap.model.Contador;

public interface ResidenciaApartamento {



	//	private Contador contador;

		public static  double SeguroBasico (double seguro, double valor) {
			return seguro = ((valor / 100)*0.002)*30 ;
		}
			
		
		public static double SeguroIntermediario (double seguro, double valor) {
			return seguro = ((valor / 100)*0.0029)*30 ;
		}
		
		public static double SeguroAvancado (double seguro, double valor) {
			return seguro = ((valor / 100)*0.0044)*30 ;
		}
		
		public static double AssistenciaEspecial (double seguro,double assistencia) {
			return assistencia = seguro + 0.05;
		}
		
		public static double AssistenciaVIP (double seguro,double assistencia) {
			return assistencia = seguro + 0.1;
		}
	}

