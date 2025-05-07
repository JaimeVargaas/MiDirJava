package PrPrac25;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Ejer2v2 {

	public static void main(String[] args) {
		
		byte [] buffer = new byte [1024*32];
		
		try(InputStream in = Files.newInputStream(Path.of("./src/PrPrac25/buffered2.bat"))) {
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
