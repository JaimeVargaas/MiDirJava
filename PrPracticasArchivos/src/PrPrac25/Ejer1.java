package PrPrac25;

import java.io.*;
import java.util.Arrays;

public class Ejer1 {

	public static void main(String[] args) {
		
		BufferedOutputStream out = null;
		
		// Definir el buffer para la escritura como un array de 32 kilobytes
		byte [] buffer = new byte[1024*32];
		
		Arrays.fill(buffer, (byte)1);
		
		// Apertura del flujo de salida
		try {
			 out = new BufferedOutputStream(new 
												FileOutputStream(
													new File("./src/PrPrac25/Buffered.dat")));
			 
			 // escribir los datos del array en el archivo
			 try {
				out.write(buffer);
				System.out.println("El fichero ha sido creado correctamente");
			} catch (IOException e) {
				System.out.println("Problema al escribir en el archivo");
			}
			 
		} catch (FileNotFoundException e) {
			System.out.println("No se ha podido encontrar el archivo");
		}
		finally {
			try {
				out.close();
			} catch (IOException e) {
				System.out.println("No se ha podido cerrar el archivo");
			}
			catch (NullPointerException e2) {
				System.out.println("No se ha podido cerrar el archivo");
			}
		}
	}

}
