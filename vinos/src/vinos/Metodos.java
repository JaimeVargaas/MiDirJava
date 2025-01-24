package vinos;

public class Metodos {

	//metdo que pase de hectolitros a litros 
	
	public static double hecto_Litros(double hecto) {
		return hecto*100;
	}
	
	
	//Metodo que haga el desglose de dinero en euros y centimos 
	
	public static String Desglose(double d) {
		int euro,cent;
		
		euro = (int) d ;
		cent= (int)((d-euro)*100);
		if(cent==0) {
			return "Hay "+euro+" €";
		}else {
			return d+" Hay "+euro+" € y "+cent+" centimos";
		}
		
		
	}
	
	
}
