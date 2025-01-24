package EjemMatrices;

public class Ejemplo1 {

	public static void main(String[] args) {
		// Definir una matriz de 4 filas y 7 columnas
		int [][] matriz = new int [4][7];
		
		// Rellenar la matriz de valores aleatorios
		for(int fil=0;fil<matriz.length;fil++) {
			for(int col=0;col<matriz.length;col++) {
				matriz[fil][col] = (int)(Math.random()*40);
			}

		}
		
		// mostrar el contenido de la matriz
		System.out.println("Matriz: ");
		for(int fil=0;fil<matriz.length;fil++) {
			for(int col=0;col<matriz.length;col++) {
				System.out.print(matriz[fil][col]+"\t" );
			}
			System.out.println();

		}
		
		
	}
	
}
