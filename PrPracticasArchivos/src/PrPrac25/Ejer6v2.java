package PrPrac25;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejer6v2 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader(new File("./src/PrPrac25/quijote.txt")));) {
			
			int i;
			
			while ((i = br.read())!=-1) {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
