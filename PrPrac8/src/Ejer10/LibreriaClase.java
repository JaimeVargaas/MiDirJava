package Ejer10;

import java.util.Scanner;

public class LibreriaClase {
	
	
	// Método que carga el array recibido como parámetro con valores recogidos desde teclado
	public static void cargaTeclado(int [] array, Scanner sc) {
			for (int i=0; i<array.length;i++) {
				System.out.print("Introduzca elemento de posicion " + (i + 1)+ ":");
				array[i] = sc.nextInt();
	}
}
	
	public static void cargaAleatoria(int[]array) {
		for (int i=0; i<array.length;i++) {
			array[i] = (int)(Math.random()*50);
		}
	}
	
	public static String toString(int[]array) {
		String cadena = "Array: ";
		for (int i=0; i<array.length;i++) {
			cadena = cadena + array[i] + " ";
		}
		return cadena;
	}
	
	public static int numMax(int[]array) {
		int max=Integer.MIN_VALUE;
		for (int i=0; i<array.length;i++) {
			if (array[i]>max)
				max = array[i];
		}
		return max;
	}
	
	public static int numMin(int[]array) {
		int min=Integer.MAX_VALUE;
		for (int i=0; i<array.length;i++) {
			if (array[i]>min)
				min = array[i];
		}
		return min;
	}
	
	public static int suma(int[]array) {
		int total = 0;
		for (int i=0; i<array.length;i++) {
			total = total + array[i];
		}
		return total;
	}
	
	public static int busquedaLineal(int[]array, int numero) {
		int cont=-1;
		do {
			cont++;
		}
		while ((array[cont]!=numero) && (cont < (array.length-1)));
		if(array[cont]==numero) 
			return cont + 1;
		return -1;
	}
	
	public static int busquedaBinaria(int[]array, int numero){
		boolean sw = false;
		int mitad, primero = 0, ultimo = array.length-1;
		do{
			mitad = (primero + ultimo)/2;
			if(array[mitad]==numero)
				sw = true;
			else if(array[mitad]<numero)
				primero = mitad+1;
			else
				ultimo = mitad-1;
		}
		while ((sw == false) && (primero <= ultimo));
		if(sw == false)
			return -1;
		return mitad;
	}
	
	public static void ordenarBurbuja(int[]array) {
		int i=1, temp;
		boolean ordenado=false;
		
		while(i<array.length && ordenado == false){
			ordenado = true;
			for(int j=array.length-1; j>=i; j--){
				if(array[j]<array[j-1]){
					temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
					ordenado = false;
				}
			}
			i++;
		}
	}
	
	public static void ordenarInsercion(int [] array) {
		int j, aux;
		for (int i = 1; i<(array.length); i++) {
			aux = array[i];
			j = i-1;
			while ((j >= 0) && (array[j] > aux)) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = aux;
		}
	}
	
	public static void ordenarSeleccion(int [] array){
		int pos_menor, menor;
		for(int i=0; i<=array.length-2; i++){
			pos_menor=i;
			menor = array[i];
			for(int j= i+1; j<=array.length-1; j++){
				if(array[j]<menor){
					pos_menor = j;
					menor = array[j];
				}
			}
			array[pos_menor]=array[i];
			array[i]=menor;
		}
	}
	
	public static void ordenarShell(int [] array) {
		int sw, i, salto, aux, n;
		n = array.length-1;
		salto = n;
		while (salto != 1) {
			sw = 1;
			salto = salto/2;
			while (sw!=0) {
				i = 0;
				sw = 0;
				while (i <= (n-salto)) {
					if (array[i] > array[i+salto]) {
						aux = array[i+salto];
						array[i+salto] = array[i];
						array[i]= aux;
						sw = 1;
					}
					i++;
				}
			}
		}
	}
	
	public static void desordenarArray(int [] array) {
		int pos;
		for (int i=0; i<array.length;) {
			pos=array[i];
			i++;
			array[i] = pos;
		}
	}


}
