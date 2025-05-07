package PrPrac25;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Ejer4 {

	public static void main(String[] args) {
		
		// coleccion de cadenas e caracteres
		List<String> coleccion = Arrays.asList(new String[] {"En un lugar de la Mancha",
															 "de cuyo nombre no quiero acordarme",
															  "No ha mucho tiempo que vivía un hidalgo"});
		
		
		
		// Escribir la colección anterior en un archivo de texdto con la ayuda de un "flujo(stream)" BufferedWriter
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("./src/PrPrac25/quijote.txt"), true))){
			
			// Recorrer la colecicion e ir escribiendo cada cadena en el archivo
			for(String elem:coleccion) {
				bw.write(elem);
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
