package EjemplosArchivos;

import java.io.*;

public class LecturaArchivoTexto2 {
	public static void main(String[] args) {
		
		int caracter;
		BufferedReader flujoIn = null;
		System.out.println("---------------------------------Inicio del programa--------------------------------");
		
		try {
		flujoIn = new BufferedReader(
				  new FileReader(
				  new File("./src/EjemplosArchivos/Prueba.txt"))
				);
		
		caracter = flujoIn.read(); // lectura del primer caracter
		while(caracter!=-1) {
			System.out.print((char)caracter);
			caracter = flujoIn.read(); // lectura de otro caracter
		}
		
		
		}
		catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		// Cierre del archivo
		try {
			flujoIn.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (NullPointerException e) {
			System.out.println("Problema al cerrar el archivo");
		}
		System.out.println("\n---------------------------------Final del programa---------------------------------");
	}
}
