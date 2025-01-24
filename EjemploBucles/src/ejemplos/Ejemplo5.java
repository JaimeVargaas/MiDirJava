package ejemplos;

import java.util.Scanner;

public class Ejemplo5 {

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
		
		do {
			
			System.out.print("Introduce un número: ");
			num = sc.nextInt();
			
			
			suma = suma + num;
			cont++;
		}
		
		while (num>0);

		//posible arreglo para no contar el ultimo valor , el de salida
		cont --;
		suma = suma - num;
		
		media = (double)suma / cont;
		System.out.println("La media es " + media);
		
		
		
		
		
		
		
		sc.close();
		
	}

}
