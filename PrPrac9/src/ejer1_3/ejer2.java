package ejer1_3;

public class ejer2 {

	public static void main(String[] args) {
		// Número aleatorio entre 1 y 25
		int num1=(int)Math.random()*25+1;
		System.out.println(num1);
		
		// Calcular raíz cúbica
		byte trece = 13;
		short veinticinco = 125;
		
		System.out.println("Ráiz cúbica de 13: " + Math.cbrt(trece) + "\nRáiz cúbica de 125: " + Math.cbrt(veinticinco));
		
		// Método signum, para saber si es positivo negativo o cero
		System.out.println(Math.signum(trece));
		
		// Teorema de pitágoras
		double a=4.3,c=6.1;
		System.out.println("Téorema de pitágoras: " +Math.hypot(a, c));
		
		// Método IEEERemainder
		
		System.out.println("IEEERemainder(15.7, 3.1)" + Math.IEEEremainder(15.7, 3.1));
		System.out.println("IEEERemainder(16, 3)" + Math.IEEEremainder(16, 3));
	}

}
