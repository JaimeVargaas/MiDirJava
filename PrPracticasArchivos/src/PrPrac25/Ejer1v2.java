package PrPrac25;

import java.io.*;
import java.util.Arrays;

public class Ejer1v2 {

	public static void main(String[] args) {
		
		
		// Definir el buffer para la escritura como un array de 32 kilobytes
		byte [] buffer = new byte[1024*32];
		
		Arrays.fill(buffer, (byte)1);
		
		try (BufferedOutputStream salidaTexto = new BufferedOutputStream(
				new FileOutputStream(
						new File("./src/prPrac25/buffered2.dat")));){

			//Escribimos en el archivo
			salidaTexto.write(buffer);
			System.out.println("El fichero ha sido creado correctamente");

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("Archivo no encontrado");
		} catch (IOException e) {
			System.out.println("Problema al escribir en el archivo");
		}


	}

}


