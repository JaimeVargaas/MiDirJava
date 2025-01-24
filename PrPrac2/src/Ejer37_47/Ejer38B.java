package Ejer37_47;



import java.util.Scanner;

public class Ejer38B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	
		float numero;
		char opcion;

		do {
			System.out.println("Introduce uno de estos caracteres: \n"
					+ "F: Factorial.\n"
					+ "R: division por el numero indicado.\n"
					+ "C: Cuadrado.\n"
					+ "T: Para finalizar.");
			
			opcion = sc.nextLine().charAt(0);
			
			opcion = Character.toUpperCase(opcion);
			
			
			try {
			switch (opcion) {

			case 'F': 
				System.out.println("Introduce el numero: ");
				numero = sc.nextInt();
				int fact=1;

				for (int cont=2; cont<=numero; cont++) {
					fact = fact * cont;
				}
				System.out.println("El factorial es: "+fact); 
				
				sc.nextLine();  // Limpiar el buffer de entrada de datos
				break;

			case 'R':
				System.out.println("Introduce un numero: ");
				numero = sc.nextInt();
					System.out.println((100/numero));
				
				sc.nextLine();  // Limpiar el buffer de entrada de datos
				break;

			case 'C':
				System.out.println("Introduce un numero: ");
				numero = sc.nextInt();

				System.out.println("El cuadrado de "+numero+" es: "+(float)(Math.pow(numero, 2))); 
				sc.nextLine();  // Limpiar el buffer de entrada de datos
				break;

			case 'T': break;
			
			default: System.out.println("Introduce solo uno de los cuatro caracteres, gracias.");
			}//End switch
			
			} // end try
			catch (ArithmeticException e) {
				System.out.println("Error no se puede divisir por 0");
				sc.nextLine();
			}
			
		}//End do
		while (opcion!='T');

		System.out.println("Gracias y adios!");

		sc.close();
	}

}






