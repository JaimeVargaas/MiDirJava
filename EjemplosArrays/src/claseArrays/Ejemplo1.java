package claseArrays;

import java.util.Arrays;

// Prueba de los métodos toString de la clase arrays

public class Ejemplo1 {

	public static void main(String[] args) {
		// definir un array de una dimensión
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		
		// mostrar el array
		System.out.print("Array(usando bucle): ");
		for (int cont=0;cont<array.length;cont++) {
			System.out.print(array[cont] + " ");
		}
		
		// Otra forma de mostrarlo es con el metodo toString de la clase arrays
		System.out.println("\nArray(usando clase arrays): " + Arrays.toString(array));
		
		// Definir una matriz
		int [][] matriz = {{1,2,3,4},
						   {5,6,7,8}};
		
		// mostrar la matriz por pantalla
		System.out.println("\nMatriz(usando bucle): ");
		for (int fil=0; fil<matriz.length;fil++) {
			for(int col=0;col<matriz[fil].length;col++) {
				System.out.print(matriz[fil][col] + " ");
			}
			System.out.println();
		}
		
		// Mostrar la matriz utilizando el método toString de Arrays
		System.out.println("\nMatriz(usando clase arrays y bucle): ");
		for (int cont=0;cont<matriz.length;cont++) {
			System.out.print(Arrays.toString(matriz[cont]));
			System.out.println();
		}
		
		// Mostrar la matriz con el método deepToString de arrays
		System.out.println("\nMatriz(usando clase arrays): "+ Arrays.deepToString(matriz));
	}

}
