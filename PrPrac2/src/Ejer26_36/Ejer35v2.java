package Ejer26_36;

import java.util.Scanner;

public class Ejer35v2 {

	public static void main(String[] args) {

		int a, b;
		long factA=1, factB=1, factAB=1;
		double resultado;
		
		// Crear un objeto Scanner para la lectura de datos
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un valor para 'a': ");
		a = sc.nextInt();
		
		System.out.print("Introduzca un valor para 'b': ");
		b = sc.nextInt();
	
		sc.close();
		
		System.out.println("El factorial de a: " + factorial(a));
		
		System.out.println("El factorial de 3: " + factorial(3));

		resultado = factorial(a);
		if (resultado==-1)
			System.out.println("No se puede calcular el factorial de números negativos");
		else
			System.out.println("El factorial de a: " + resultado);
		
		int n = 8;
		if (factorial(n)==-1)  // Mal planteamiento
			System.out.println("No se puede calcular el factorial de números negativos");
		else
			System.out.println("El factorial de a: " + factorial(n));

		
		
		// Verificar si los valores que nos han dado son v�lidos para el c�lculo
		if ((a<b) || (a<0) || (b<0)) {
			System.out.println("Datos no v�lidos para el c�lculo");
		}
		else {
			System.out.println("El combinatorio de " + a + " sobre " + b + " es " + 
									((double)factorial(a)/(factorial(b)*factorial(a-b))));
		}
		
	}

	/**
	 * M�todo que calcula el <strong>factorial</strong> de un n�mero que recibe como par�metro
	 * 
	 * Ejemplos: 0! = 1
	 *           3! = 3 x 2 x 1 = 6 
	 *  		 No existe el factorial de los n�mero negativos
	 *  
	 * @param numero --> es el valor al que le vamos a calcular el factorial
	 * 
	 * @return --> Valor devuelto por el este m�todo
	 *             El factorial del n�mero calculado o -1 si el n�mero al que 
	 *             se le intenta calcular el factorial es negativo
	 */
	public static long factorial(int numero) {

		// Variables locales
		long fact = 1;
	
		if (numero<0) 
			return -1;
		
		// Calculamos el factorial del n�mero recibido como par�metros
		for (int cont=2; cont<=numero; cont++)  
			fact = fact * cont;
		
		// Devolver el c�lculo del factorial
		return fact;
	}
	
	
	
}
