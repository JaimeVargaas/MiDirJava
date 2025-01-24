import java.util.Locale;
import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Definición de variales
		float num1;
		double num2;
		
		
		// Asignar valores a las variables anteriores
		// se puede poner de las dos formas, pero la segunda solo sirve para float
		num1 = (float)4.5;
		num1 = 4.5f;
		
		num2 = 75.89;
		
		System.out.println("Valor actual de num1 y num2: " + num1 + "," + num2);
		
		// Crear un objeto Scanner para poder solicitar datos por teclado
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		// Pedir valores por teclado para las variables anteriores
		System.out.print("Introduzca un valor float: ");
		num1 = sc.nextFloat();
		
		System.out.print("Introduzca un valor double: ");
		num2 = sc.nextFloat(); 
 		
		
		
		
		
		// Cerrar el objeto Scanner
		sc.close();
		
	}

}
