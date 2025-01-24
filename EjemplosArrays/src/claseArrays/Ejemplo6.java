package claseArrays;

public class Ejemplo6 {

// Ejemplo bucle for-each
	
	public static void main(String[] args) {
	
		int [] array = {1,2,3,4,5,6,7,8};
		char [] array2 = {'a','b','c','d','e','f'};
		
		
		// Recorrer el array con bucle for-each
		for(int elemento: array) {
			System.out.print(elemento + " ");
		}

		System.out.println();
		
		for(char elemento: array2) {
			System.out.print(elemento + " ");
		}
		
		System.out.println();
		
		// Crear una matriz y recorrerla con for-each
		int [][] matriz = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		for(int [] fila : matriz) {
			for(int elemento: fila) {
				System.out.print(elemento + " ");
			}
			}
		
	}

}
