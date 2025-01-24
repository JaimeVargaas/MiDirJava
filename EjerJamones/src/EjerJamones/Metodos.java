package EjerJamones;

public class Metodos {
	
	public static final double arroba = 11.339f;
	public static final double kilos = 0.088f;
	
	public static String desglosar(double d) {
		int euro, cent;
		
		euro = (int) d;
		cent = (int) ((d-euro) * 100);
		
		if (cent== 0) {
            return "Hay " + euro + " euros";
        }else {
            return "Hay " + euro + " euros y "+ cent + " centimos";
        }
	}
	
	public static double ArrobaAKilo (double kg) {
		return arroba*kg;
	}
	
	public static double KiloAArroba(double arroba) {
		return kilos*arroba;
	}
	
	public static double precioPorKilo (double precio) {
		return precio/arroba;
	}
	
	public static double precioPorArroba (double precio) {
		return precio*arroba;
	}
	
	
	
	
}
