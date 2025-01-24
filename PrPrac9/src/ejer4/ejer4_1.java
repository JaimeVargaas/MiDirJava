package ejer4;

public class ejer4_1 {

	public static void main(String[] args) {

		/*
		 * Crea un objeto de tipo String que contenga varias palabras.
		 */
		String cadena = "En un lugar de la mancha, cuyo lugar no quiero acordarme";

		// Averigua la longitud de la cadena.
		System.out.println("Longitud de la cadena: " + cadena.length());

		// Muestra el carácter que se encuentra en la posición 2 de tu cadena.
		System.out.println(cadena.charAt(1));

		//Mostrar todas las vocales de una cadena
		System.out.print("Vocales de la cadena: ");
		char [] arraycadena= cadena.toCharArray();
		int cont=0;

		for(int i=0; i<arraycadena.length;i++) {

			char letraChar = cadena.charAt(i);

			String letraString = Character.toString(letraChar);

			if(letraString.matches("[aeiouAEIOU]")) {
				System.out.print(letraChar+" ");
				cont++;
			}
		}
		System.out.println("\nVocales totales: " + cont);

		System.out.println();
		
		// Segundo planteamiento
		System.out.println("Vocales de la cadena: " );
		for (int i=0;i<cadena.length();i++) {
			if (Character.toString(cadena.charAt(cont)).matches("[aeiouAEIOU]"))
				System.out.println(cadena.charAt(cont) + " ");
		} 

		//Extraer la penúltima letra de una cadena.
		char penultimaLetra = cadena.charAt(cadena.length()-2);
		System.out.println("La ultima letra es:"+penultimaLetra);

		System.out.println();

		//Extrae y almacena en otro objeto del mismo tipo toda la cadena excepto los 2 primeros caracteres(subcadena).
		String nuevaCadena = cadena.substring(2);
		System.out.println("Nueva cadena es:"+nuevaCadena);

		System.out.println();

		//Extrae y almacena en otro objeto del mismo tipo toda la cadena excepto los 2 primeros caracteres y
		//los dos últimos caracteres.
		String nuevaCadena2 = cadena.substring(2,cadena.length()-2);
		System.out.println("Nueva cadena es:"+nuevaCadena);


	}	

}
