package Ejer1_9;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		
		byte alumnos;
		float total=0,mayor=0,menor=15;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Introduce el número de alumnos: ");
			alumnos = sc.nextByte();
			
			float [] array = new float [alumnos];
			
			for (int i=0;i<array.length;i++) {
				System.out.print("Introduce la nota para alumno " + (i+1) + ": ");
				array[i] = sc.nextFloat();
				total = total + array[i];
				if (array[i] > mayor)
					mayor=array[i];
				if (array[i] < menor)
					menor = array[i];
			}
			
			System.out.println("La nota media de la clase es: " + (total/alumnos) + " La nota más alta es: " + mayor +
					" La nota más baja es: " + menor);
		}

	}

}
