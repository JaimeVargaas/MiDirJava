import java.util.Scanner;

public class Ejemplo2 {

/** 
 * Ejemplo de prueba de la E/S estándar
 * 
 * @author Jaime
 * @param args 
 * Método principal
 */
	
	public static void main(String[] args) {
		
		// Definir, declarar o pedir memoria para varias variables
		int num1=100, num2, suma;
		
		
		// Inicializar num2
		num2 = 0;
		
		
		System.out.println("La variable num1 contiene:" + num1);
		
		// Crear un objeto Scanner para poder solicitar datos por teclado
		Scanner sc = new Scanner(System.in);
		
		// Solicitar dos números al usuario para posteriormente sumarlos
		System.out.print("Introduzca el primer número: ");
		num1 = sc.nextInt();
		
		System.out.print("Introduzca el segundo número: ");
		num2 = sc.nextInt(); 
		
		// Sumo los dos valores anteriores y guardo el resultado en la variable suma
		suma = num1 + num2;
		
		System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma);
		
		// Cerrar el objeto Scanner
		sc.close();
		
		// Esta sentencia daría error porque el scanner esta cerrado
		// num1 = sc.nextInt(); 
		
		System.out.println("Fin del programa"); 
		
	}

}


