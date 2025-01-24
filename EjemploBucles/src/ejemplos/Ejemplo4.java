package ejemplos;

import java.util.Scanner;

public class Ejemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Calculo de la media aritmetica de una serie de números, hasta que me den un
 * valor 0 o negativo, es decir, sólo serán válidos números positivos
 * */
		
		int num, suma= 0, cont= 0;
		double media;
		
		Scanner sc = new Scanner(System.in);
		// bucle while
		// Lectura del primer número fuera del bucle while
		System.out.print("Introduce un número: ");
		num = sc.nextInt();
		
		while (num > 0) {
			
			suma = suma + num;
			cont++;
			
			// Lectura del resto de valores
			System.out.print("Introduce un número: ");
			num = sc.nextInt();
			
			}
		media = (double)suma / cont;
		System.out.println("La media es " + media);
		
		
		
		
		
		
		
		sc.close();
		
	}

}
