package PrPrac25;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Ejer2 {

	public static void main(String[] args) {
		
		byte [] buffer = new byte [1024*32];
		
		try(BufferedInputStream in = new BufferedInputStream(
											new FileInputStream(
												new File("./src/PrPrac25/buffered2.dat")));) {
			buffer = in.readAllBytes();
			
			
			System.out.println(Arrays.toString(buffer));
		}
		catch (FileNotFoundException e) {
			System.out.println("Problema al abrir el archivo");
		}
		catch (IOException e) {
			System.out.println("No se ha podido hacer correctamente");
		}
		
		

	}

}
