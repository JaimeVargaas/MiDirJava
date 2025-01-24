package ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploExcepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte dadoAleatorio, dadoUsuario;
		
		try (Scanner sc = new Scanner(System.in)) {
			// simular el lanzamiento de un dado
			dadoAleatorio = (byte)((Math.random()*6)+1);
			
			System.out.println(dadoAleatorio);
			
			try {
			// Solicitar al usuario que haga su apuesta
			System.out.print("Indique su intento de adivinacion: ");
			dadoUsuario = sc.nextByte();
			
			if (dadoUsuario<1 || dadoUsuario>6) {
				throw new InputMismatchException();
			} // end if
			
			if (dadoAleatorio == dadoUsuario)
				System.out.println("Enhorabuena has ganado");
			else 
				System.out.println("Lo siento has perdido");
			System.out.println("El valor aleatorio era: " + dadoAleatorio);
			} // end try
			
			// Si pone cadena de caracteres muestra esto
			catch (InputMismatchException e) {
				System.out.println("Valor incorrecto, debe indicar un numero entre 1 y 6");
			}
			
		} // end try
				
		
		
	}

}
