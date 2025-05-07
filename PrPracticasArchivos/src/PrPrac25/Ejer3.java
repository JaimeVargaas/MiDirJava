package PrPrac25;

import java.io.*;

public class Ejer3 {

	public static void main(String[] args) {
		String s = "En un lugar de la Mancha de cuyo nombre no quiero acordarme, " +
				   "no ha mucho tiempo que vivia un hidalgo de los de lanza en " +
				   "astillero, adarga antigua, rocin flaco y galgo corredor...";
		
		try (FileWriter f = new FileWriter(new File("./src/PrPrac25/introquijote.txt"));) {
			for (int i = 0; i < s.length(); i++) {
				f.write((byte)s.charAt(i));
			}
			
		} catch (IOException e) {
			System.out.println("No se ha podido escribir");
		}

	}

}
