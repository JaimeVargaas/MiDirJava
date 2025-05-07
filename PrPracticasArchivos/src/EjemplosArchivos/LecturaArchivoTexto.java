package EjemplosArchivos;

import java.io.*;

public class LecturaArchivoTexto {
	public static void main(String[] args) {
		
		String cadena;
		BufferedReader flujoIn = null;
		System.out.println("---------------------------------Inicio del programa--------------------------------");
		
		try {
		flujoIn = new BufferedReader(
				  new FileReader(
				  new File("./src/EjemplosArchivos/Prueba.txt"))
				);
		
		cadena = flujoIn.readLine(); // lectura del primer caracter
		while(cadena!=null) {
			System.out.println(cadena);
			cadena = flujoIn.readLine(); // lectura de otro caracter
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
		System.out.println("---------------------------------Final del programa---------------------------------");
	}
}
