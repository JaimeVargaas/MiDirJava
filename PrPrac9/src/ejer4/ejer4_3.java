package ejer4;

import java.util.Arrays;

public class ejer4_3 {

	public static void main(String[] args) {
		//Objeto toString que contenga varias palabras 
		String cadena = new String("Hola buenos dias. Tengo un coche negro, una moto negra y una casa negra");

		//Extrae de tu cadena la segunda palabra y almacénala en una nueva cadena.
		int posIni= cadena.indexOf(" ")+1;
		int posFin= cadena.indexOf(" ",posIni);

		if(posIni==0) {
			System.out.println("No existe segunda palabra");
		}
		else {
			String segundaPalabra= cadena.substring(posIni,posFin);
			System.out.println("Segunda palabra:"+segundaPalabra);
		}
		/*Segundo planteamiento*/
		String [] arrayCadenas = cadena.split("[ ,.:;]");
		System.out.println(Arrays.toString(arrayCadenas));

		System.out.println("Fecha separada por tokens: "+Arrays.toString("15/08/2022".split("[/]")));

		//A partir de un array de caracteres crea un objeto de tipo cadena.
		char [] arrayCaracter = {'H','o','l','a',' ','P','e','p','e'};
		char  [] arrayCaracter2 = "Hola, Pepe".toCharArray();
		System.out.println(arrayCaracter);
		System.out.println(arrayCaracter2);

		String cadenaArray1= new String(arrayCaracter);
		String cadenaArray2= String.valueOf(arrayCaracter);
		String cadenaArray3=String.copyValueOf(arrayCaracter2);


		System.out.println(cadenaArray1);
		System.out.println(cadenaArray2);
		System.out.println(cadenaArray3);

		//Muestra el valor Unicode de cada uno de los caracteres de la cadena anterior (codePointAt).
		for(int cont=0; cont<cadenaArray1.length();cont++) {
			System.out.println("Caracter:"+cadenaArray1.charAt(cont)+"\tCodigo unicode " + 
					cadenaArray1.codePointAt(cont));

			System.out.println("*----------*-*-*-*-*-*-*-*-*-*-*-*");
			//Crea un objeto de tipo StringBuffer, y prueba diferentes formas de concatenación con el método Append.
			StringBuffer cadena1 = new StringBuffer("hola que tal");
			System.out.println(cadena1.capacity()+" "+cadena1.length());

			cadena1.append(", espero que bien");
			cadena1.append(100);
			cadena1.append(true);
			cadena1.append("---");
			cadena1.append(12.55374);

			System.out.println(cadena1);
			System.out.println(cadena1.capacity()+" "+ cadena1.length());

			System.out.println("*----------*-*-*-*-*-*-*-*-*-*-*-*");
			//Insertar al objeto anterior una subcadena, a partir de la posición 7.
			cadena1.insert(4,"patata");
			System.out.println(cadena1);

			System.out.println("*----------*-*-*-*-*-*-*-*-*-*-*-*");
			//Invertir una cadena 
			StringBuffer cadena2 = new StringBuffer("hola que tal");	
			cadena2.reverse();
			System.out.println(cadena2);

			System.out.println("*----------*-*-*-*-*-*-*-*-*-*-*-*");
			//A partir de un array de tipo byte que contiene números de un dígito, y con la ayuda del método
			//reverse de la clase StringBuffer, invierte el citado array.
			byte [] arrayBytes = {1,2,3,4,5};
			System.out.println(Arrays.toString(arrayBytes));

			//Creo un objeto tipo String a partir del array de tipo byte
			String cadenaByte = new String(arrayBytes);
			System.out.println(cadenaByte);

			//Creo un objeto Stringbuffer a partir del objeto anteriror y lop invierto
			StringBuffer arrayStringBuffer= new StringBuffer(cadenaByte);
			arrayStringBuffer.reverse();

			//Obtener los bytes del objeto invertido StringBuffer , convirtiendolo previamente en String
			cadenaByte = arrayStringBuffer.toString();
			arrayBytes=cadenaByte.getBytes();

			//Mostramos el resultado
			System.out.println(Arrays.toString(arrayBytes));

			//Segundo procedimiento 
			arrayBytes = (new StringBuffer(new String(arrayBytes)).reverse().toString().getBytes());
			System.out.println(Arrays.toString(arrayBytes));
		}


	}

}
