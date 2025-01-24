package claseArrays;

import java.util.Arrays;

public class Ejemplo2 {

	public static void main(String[] args) {
		// Prueba de los métodos fill de la clase arrays
		
		int [] vector = new int [10];
		System.out.println(Arrays.toString(vector));
		
		// Rellenar el vector con el valor 7 en todos sus elementos
		for(int cont=0; cont<vector.length;cont++) {
			vector[cont] = 7;
		}
		System.out.println(Arrays.toString(vector));
		
		// Con el método fill de la clase arrays sería
		Arrays.fill(vector, 9);
		System.out.println(Arrays.toString(vector));
		
		Arrays.fill(vector, 2,6,1);
		System.out.println(Arrays.toString(vector));
		
		// Array de caracteres 
		char [] caracter = new char [10];
		Arrays.fill(caracter,'A');
		System.out.println(Arrays.toString(caracter));
		
		
		int[][] array = new int [6][5];
		
		for(int cont=0;cont<array.length;cont++) {
			Arrays.fill(array[cont], cont+1);
		}
		System.out.println(Arrays.deepToString(array));
		
		int [][] matriz = new int [9][5];
		for(int cont=0;cont<matriz.length;cont++) {
			Arrays.fill(matriz[cont],(int)(Math.pow(2, cont)));
		}
		System.out.println(Arrays.deepToString(matriz));
	}

}
