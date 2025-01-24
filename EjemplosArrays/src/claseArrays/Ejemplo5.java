package claseArrays;

import java.util.Arrays;

// ORdenar arrays, buscar numeros y duplicar

public class Ejemplo5 {

	public static void main(String[] args) {
		
		int [] array = {34,76,9,1,10,23,45,1,2,90,8,17};
		
		System.out.println("Array desordenado: " + Arrays.toString(array));

		Arrays.sort(array);
		
		// Busqueda binaria en un array ordenado
		System.out.println("Posición elemento 1: " + Arrays.binarySearch(array, 1));
		System.out.println("Posición elemento 9: " + Arrays.binarySearch(array, 9));
		System.out.println("Posición elemento 100: " + Arrays.binarySearch(array, 100));
		

		System.out.println("Array ordenado: " + Arrays.toString(array));
		
		
		
		// Copyof
		int [] a = {1,2,3,4,5,6,7,8,9};
		int [] b = Arrays.copyOf(a, a.length); //b es {1,2,3,4,5,6,7,8,9}
		int [] c = Arrays.copyOf(a, 12); //c es {1,2,3,4,5,6,7,8,9,0,0,0}
		int [] d = Arrays.copyOf(a, 3); //d es {1,2,3}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		
		// Copiar parte del array con copyofrange
		
		int [] a1 = {1,2,3,4,5,6,7,8,9};
		int [] b1 = Arrays.copyOfRange(a1, 3,6);
		
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(b1));
	}
	

}
