package Ejer13_16;

public class Ejer13 {

	public static void main(String[] args) {
		int [][] matriz = new int [3][6];
		
		matriz[0][0] = 0;
		matriz[0][1] = 30;
		matriz[0][2] = 2;
		matriz[0][5] = 5;
		matriz[1][0] = 75;
		matriz[1][4] = 0;
		matriz[2][2] = -2;
		matriz[2][3] = 9;
		matriz[2][5] = 11;
		
		System.out.println("Matriz: ");
		for(int fil=0;fil<matriz.length;fil++) {
			for(int col=0;col<matriz[fil].length;col++) {
				System.out.print(matriz[fil][col]+"\t" );
			}
			System.out.println();
		}
	}

}
