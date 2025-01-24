package ejer4;

import java.util.Arrays;

public class ejer4_2 {

	public static void main(String[] args) {
		//Crea un objeto de tipo String con varias palabras 
		String cadena = new String ("Dale a tu cuerpo alegria macarena");
		System.out.println(cadena);

		System.out.println();
		//Modifica en la cadena anterior todas las veces que aparezca la vocal ‘a’ (minúscula) por ‘A’(mayúscula).
		String cambioMayusculas = cadena.replace('a', 'A');

		System.out.println(cambioMayusculas);
		System.out.println();

		//Crea un array de caracteres cuyos elementos serán los de la cadena anterior.
		char [] array= cadena.toCharArray();
		System.out.println(Arrays.toString(array));
		System.out.println();

		//Convierte la subcadena que creaste anteriormente a mayúscula, y que se quede modificada
		//internamente, es decir, no solo a la hora de imprimirla.
		String cadenaMayus = cadena.toUpperCase();
		System.out.println(cadenaMayus);

		System.out.println();

		//Comprueba si la cadena empieza por la palabra “Hola”.
		if(cadena.startsWith("Hola"))
			System.out.println("Si comienza");
		else 
			System.out.println("No comienza"); 

		System.out.println();

		//Busca una subcadena que exista dentro de tu cadena, y otra que no exista (indexOf), recordad que
		//en la cadena original la letra ‘a’ se había cambiado a mayúscula.
		if(cadena.indexOf("alegria macarena")==-1)  //PORQUE ES A -1??
			System.out.println("Cadena \"alegria macarena \"no existe");
		else 
			System.out.println("Cadena \"alegria macarena\" existe");

		if(cadena.indexOf("La bella noche")==-1)
			System.out.println("Cadena \"La bella noche \"no existe");
		else 
			System.out.println("Cadena \"La bella noche \" existe");


		//Busca todas las ocurrencias de una cadena.
		String ocurrencias = "macarena";
		int posi = cadena.indexOf(ocurrencias);

		while (posi != -1) {
			System.out.println("Se encontró la cadena en la posición: " + posi);
			posi = cadena.indexOf(ocurrencias, posi + 1);
		}

	}
	
}
