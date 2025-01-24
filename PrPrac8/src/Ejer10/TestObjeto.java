package Ejer10;

import java.util.Scanner;

public class TestObjeto {


		
		public static void main(String[] args) {
			LibreriaObjeto miLib = new LibreriaObjeto();
			int op;
			
			try (Scanner sc = new Scanner(System.in)) {
			do {
				menu();
				System.out.println("Elija la opción: ");
				op= sc.nextInt();
				
				switch(op) {
				case 1-> LibreriaClase.cargaTeclado(sc);
				case 2-> LibreriaClase.cargaAleatoria();
				case 3-> System.out.println();
				}
			}
			while(op!=17);
		}
		}
	}

