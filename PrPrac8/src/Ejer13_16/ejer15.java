package Ejer13_16;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ejer15 {

	public static void main(String[] args) {
		int[][] matriz = new int [1][1];
		Scanner sc = new Scanner(System.in);
		
		
		leerMatriz(matriz, sc);
		Arrays.deepToString(matriz);
	}
	
	public static void leerMatriz(int [][] matriz, Scanner sc) {
			for(int col=0;col<matriz.length;col++) {
				for(int fil=0;col<matriz[col].length;col++) {
					System.out.print("Introduce el valor de la columna" + (col+1) + " y de la fila" + (fil+1));
					matriz[col][fil] = sc.nextInt();
				} 
				System.out.println();
			}
		}
	
	
	
	

}
