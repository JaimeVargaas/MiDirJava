package ejemplos;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Muestra 5 veces un saludo*/
		System.out.println("\nPrueba con bucle for");
		for (int cont = 1; cont <= 5; cont++) {
			System.out.println("Hola");
		}
		
		// bucle while
		
		System.out.println("\nPrueba con bucle WHILE");
		int cont = 1;
		while (cont<=5) {
			System.out.println("Hola");
			cont ++;
		}
		
		// bucle do while
		System.out.println("\nPrueba con do while");
		cont = 1;
		do {
			System.out.println("hola");
			cont++;
		}
		while (cont<=5);
		
		
		
	}

}
