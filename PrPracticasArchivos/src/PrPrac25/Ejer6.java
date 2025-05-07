package PrPrac25;

import java.io.*;

public class Ejer6 {

	public static void main(String[] args) {
		try(FileReader fr = new FileReader("./src/PrPrac25/quijote.txt")) {
			int i;
			while ((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
