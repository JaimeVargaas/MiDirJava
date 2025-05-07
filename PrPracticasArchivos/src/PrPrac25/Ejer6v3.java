package PrPrac25;

import java.io.*;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ejer6v3 {
	public static void main(String[] args) {
		try (BufferedReader br = Files.newBufferedReader(Paths.get("./src/PrPrac25/quijote.txt"),Charset.forName("ISO-8859-1"))) {

			String i;

			while ((i = br.readLine())!=null) {
				System.out.print(i);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
