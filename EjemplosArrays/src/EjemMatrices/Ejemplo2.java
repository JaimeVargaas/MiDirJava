package EjemMatrices;

public class Ejemplo2 {

	public static void main(String[] args) {
		int [][] matriz = {{1,2,3},
						   {4,6,7,8,9},
						   {24,34,55},
						   {9,8,7,6}};
		
		System.out.println("Matriz: ");
		for(int fil=0;fil<matriz.length;fil++) {
			for(int col=0;col<matriz[fil].length;col++) {
				System.out.print(matriz[fil][col]+"\t" );
			}
			System.out.println();
		}

	}

}
