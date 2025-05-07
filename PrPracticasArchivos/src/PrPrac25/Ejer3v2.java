package PrPrac25;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Ejer3v2 {

	public static void main(String[] args) {
		String s = "En un lugar de la Mancha de cuyo nombre no quiero acordarme, " +
				   "no ha mucho tiempo que vivia un hidalgo de los de lanza en " +
				   "astillero, adarga antigua, rocin flaco y galgo corredor...";
		
		try (BufferedWriter f = Files.newBufferedWriter(Path.of("./src/PrPrac25/introquijote"),
				Charset.defaultCharset(),
				StandardOpenOption.APPEND, StandardOpenOption.CREATE)) {
			for (int i = 0; i < s.length(); i++) {
				f.write((byte)s.charAt(i));
			}
			
		} catch (IOException e) {
			System.out.println("No se ha podido escribir");
		}

	}

}
