package Ejer2;

import java.util.Scanner;

/*
 * Programa que testea la libreria de opciones varias
 * 
 * @author Jaime Vargas
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte opcion;
		try (Scanner sc = new Scanner(System.in)) {
			do {
				 menu();
				 System.out.println("Elija una opción: ");
				 opcion = sc.nextByte();
				
		
			} // end do
			
			while (opcion!=8);
			
		} // end try
		
		
		
	} // end main
	
	
	/*
	 * Metodo que muestra una serie de "escribe"
	 */
	public static void menu() {
		System.out.println("\n\nMENÚ DE OPERACIONES");
		System.out.println("1.- Visualizar los números amigos entre dos dados.");
		System.out.println("2.- Factorial de un número.");
		System.out.println("3.- Función de Euler para un número.");
		System.out.println("4.- Averiguar si un número es primo o no.");
		System.out.println("5.- Visualizar los números perfectos que hay entre 1 y un número dado");
		System.out.println("6.- Visualizar los números amigos entre 1 y 500.");
		System.out.println("7.- Mostrar el combinatorio de dos números dados.");
		System.out.println("8.- Salir.");
	} // end menu
	
	
	/*
	 * Metodo que muestra una serie de "escribe" con las posiciones 
	 */
	

	public static long procesoFactorial(int num) {
		long fact = 1;
		
		if (num<0) return -1;
		
		for (int cont = 2;cont<=num;cont++) {
			fact = fact * cont;
		}	
		return fact;
	} // end procesoFactorial
	
	
	private static int calcularMCD(int a, int b) {
		while (b != 0) {
            int c = b;
            b = a % b;
            a = c;
        }
        return a;
	}
	
	
	
	public static int procesoEuler(int n) {
        int contador = 0;

        for (int i = 1; i < n; i++) {
            if (calcularMCD(i, n) == 1) {
                contador++; 
            }
        }

        return contador;
    }
	
	public static boolean procesoPrimo(int num) {
        int cont=1, total=0;

        while (cont < num +1) {
        	if (num % cont == 0) {
        		total++;
        	}
        	cont++;
        }
        if (total == 2) {
        	return true;
        }
        else {
        	return false;

        }

	}
	
	private static int sumDiv(int num) {
		int resultado = 0;
		if (num < 0 )
			return -1;
		for (int cont = 1; cont<num;cont++)
			if (num % cont == 0) {
				resultado = resultado + cont;
			}
		return resultado;
	}
	
	public static boolean procesoAmigos(int num, int num2) {
		
		Scanner sc = new Scanner(System.in);
		
		num= sc.nextInt();
		num2= sc.nextInt();
		
		if (num2 == sumDiv(num)) {
			return true;
		}
		else 
			return false;
	}
	
	
	public static boolean procesoPerfecto(int num) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if (num == sumDiv(num)) {
			return true;
		}
		else 
			return false;
	}
	
	public static double procesoCombinatorio(int a, int b) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		if ((a<0) || (a<b) || (a<b)) 
			return -1;
		else 
			return (double)procesoFactorial(a) / (procesoFactorial(b)* (procesoFactorial(a-b)));
				
	}
	
	
	
	
	
}
