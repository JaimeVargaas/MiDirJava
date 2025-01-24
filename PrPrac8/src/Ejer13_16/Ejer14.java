package Ejer13_16;

import java.util.Arrays;

public class Ejer14 {

	public static void main(String[] args) {
		int [][] a = new int [6][8];
		int [] b = new int [6];
		int [] c = new int [8];
		
		for(int fil=0;fil<a.length;fil++) {
			for(int col=0;col<a[fil].length;col++) {
				a[fil][col] = (int)(Math.random()*10+1);
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(a));
		
		
		// Suma de filas
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b[i] += a[i][j];
				c[j] += a[i][j];
			}
		}
		
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
	}

}
