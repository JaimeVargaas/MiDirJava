package PrPrac25;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Ejer6v4 {

	public static void main(String[] args) {
		
		try {
			List<String> miListaString = Files.readAllLines(Path.of("./src/PrPrac25/quijote.txt"),Charset.forName("ISO-8859-1"));
			
			for(String linea : miListaString) {
				System.out.println(linea);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
