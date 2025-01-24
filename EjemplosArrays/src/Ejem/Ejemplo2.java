package Ejem;

public class Ejemplo2 {

	public static void main(String[] args) {
		
		// Definir un array de 4 elementos de tipo entero
		int [] array = new int[12];
		
		// Generar los valores aleatoriamente
		System.out.print("Contenido del array: ");
		for (int i=0; i<array.length;i++) {
			array[i] = (int)(Math.random()*50);
			System.out.print(array[i]+ " ");
		}
		
		// Crear un array de 8 elementos de tipo entero, asignando el valor directamente
		int [] array2 = {45,12,1,67,1,22,65,100};
		
		System.out.print("\nContenido del segundo array: ");
		for (int i=0; i<array2.length;i++) {
			System.out.print(array2[i]+ " ");
		}
		
		// Crear un tercer array cuyos elementos son de tipo caracter
		char[] array3 = {'a','b','c','$','€'};
		
		System.out.print("\nContenido del tercer array: ");
		for (int i=0; i<array3.length;i++) {
			System.out.print(array3[i]+ " ");
		}
		
	}

}
