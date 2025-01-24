package claseArrays;

import java.util.Arrays;

public class Ejemplo3 {

	public static void main(String[] args) {
	
		char [][] matriz = new char[15][20];
		for(int fila=0;fila<matriz.length;fila++) {
				Arrays.fill(matriz[fila],'-');
		}
		
		Arrays.fill(matriz[0], '*');
		Arrays.fill(matriz[matriz.length-1], '*');
		
		for(int fil = 1; fil < matriz.length - 1; fil++) {
	            Arrays.fill(matriz[fil], '-');
	            matriz[fil][0]='*';
	            matriz [fil][matriz[fil].length -1] = '*';
	         }
		
		
		// Mostrar
		for (int fil=0; fil<matriz.length;fil++) {
			for(int col=0;col<matriz[fil].length;col++) {
				System.out.print(matriz[fil][col] + " ");
			}
			System.out.println();
		}
		
	
	}

}
