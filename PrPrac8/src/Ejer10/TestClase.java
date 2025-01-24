package Ejer10;

import java.util.Scanner;

public class TestClase {

	public static void main(String[] args) {
		int [] array = new int [10];
		int op;
		
		try (Scanner sc = new Scanner(System.in)) {
		do {
			menu();
			System.out.println("Elija la opción: ");
			op= sc.nextInt();
			
			switch(op) {
			case 1-> LibreriaClase.cargaTeclado(array, sc);
			case 2-> LibreriaClase.cargaAleatoria(array);
			case 3-> System.out.println(LibreriaClase.toString(array));
			case 4-> System.out.println(LibreriaClase.numMax(array));
			case 5 -> System.out.println(LibreriaClase.numMin(array));
			case 6 -> System.out.println(LibreriaClase.suma(array));
			case 10 -> System.out.println(LibreriaClase.busquedaLineal(array, 4));
			case 11 -> System.out.println(LibreriaClase.busquedaBinaria(array, 4));
			case 12 -> LibreriaClase.ordenarBurbuja(array);
			case 13 -> LibreriaClase.ordenarInsercion(array);
			case 14 -> LibreriaClase.ordenarSeleccion(array);
			case 15 -> LibreriaClase.ordenarShell(array);
			
			
			}
		}
		while(op!=17);
	}
	}
		
	/**
	 * Método que muestra el menú de operaciones por consola
	 */
	private static void menu() {
		System.out.println(" --- MENU DE OPERACIONES ---");
		System.out.println("1.- Carga de datos desde teclado");
		System.out.println("2.- Carga de datos aleatoria");
		System.out.println("3.- Mostrar array");
		System.out.println("4.- Valor máximo del array");
		System.out.println("5.- Valor minimo del array");
		System.out.println("6.- Suma de los elementos del array");
		System.out.println("7.- Insertar por posición");
		System.out.println("8.- Borrar por posición");
		System.out.println("9.- Borrar buscando el número");
		System.out.println("10.- Búsqueda lineal");
		System.out.println("11.- Búsqueda binaria o dicotómica");
		System.out.println("12.- Ordenación por el método de la burbuja");
		System.out.println("13.- Ordenación por el método de inserción");
		System.out.println("14.- Ordenación por el método de selección");
		System.out.println("15.- Ordenación por el método de Shell");
		System.out.println("16.- Desordenar array");
		System.out.println("17.- Salir");
}
}	
