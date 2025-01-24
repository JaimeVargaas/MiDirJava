package jamon;

public class Metodos {
	
		
		//variables 
		public static final double arroba = 11.339f;
		public static final double kilo = 0.08f;
		
		
		//metodo para desglosar 
		public static String desglose(double d) {
			int euro,cent;
			
			euro = (int) d ;
			cent= (int)((d-euro)*100);
			if(cent==0) {
				return "Hay "+euro+" €";
			}else {
				return " Hay "+euro+" € y "+cent+" centimos";
			}
		}

	
		//Método que convierte de arrobas a kilos (1 @ equivale a 11.339 kilos)
		public static double kilos_arrobas(double arrobas) {
			return arrobas*kilo;
		}
		
		//Método que convierte de kilos a arrobas (1 kilo equivale a 0.088@)
		public static double arrobas_kilos(double kilos) {
			return kilos*arroba;
		}

		//Calculo de precio por kilo 
		
		public static double PrecioKilos(float precio) {
			return precio/arroba;
		}
		
		//Calculo de precio por arrobas
		public static double PrecioArrobas(float precio) {
			return precio*arroba;
		}
}
