package br.com.fiap.view;

//import br.com.fiap.model.Contador;

public interface ResidenciaCasa {
	

	//	private Contador contador;

		public static  double SeguroBasico (double seguro, double valor) {
			return seguro = ((valor / 100)*0.006)*30 ;
		}
			
		
		public static double SeguroIntermediario (double seguro, double valor) {
			return seguro = ((valor / 100)*0.0069)*30 ;
		}
		
		public static double SeguroAvancado (double seguro, double valor) {
			return seguro = ((valor / 100)*0.0084)*30 ;
		}
		
		public static double AssistenciaEspecial (double seguro,double assistencia) {
			return assistencia = seguro + 0.05;
		}
		
		public static double AssistenciaVIP (double seguro, double assistencia) {
			return assistencia = seguro + 0.1;
		}
	}


