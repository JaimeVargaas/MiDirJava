package PrPrac25;

import java.io.*;
import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		
		final int tamBuffer = 16*1024;
		
		
		BufferedInputStream bin = null; // flujo de lectura de bytes
		BufferedOutputStream bout = null; // flujo de escritura de bytes
		
		
		File archivoOriginal = solicitudNombre();
		
		
		try {
			bin = new BufferedInputStream(new FileInputStream(archivoOriginal));
			bout = new BufferedOutputStream(new FileOutputStream(new File("./src/PrPrac25/Copia" + archivoOriginal.getName())));
			
			int cantidadBytes = 0;
			byte[] buffer = new byte[tamBuffer];
			
			try {
                while ((cantidadBytes = bin.read(buffer,0,tamBuffer)) != -1) {
                    try {
                        bout.write(buffer,0, cantidadBytes);
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.println("--");
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				bin.close();
				bout.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		
	}

	
	// Metodo que slicita al usuario el nombre del archivo a copiar
	public static File solicitudNombre() {
		String nomArchivo;
		
		// Solicitar el nombre del archivo a copiar
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Nombre del archivo a copiar: ");
			nomArchivo = sc.nextLine();
			
		} 
		
		File archiFile = new File(nomArchivo);
		if(!archiFile.exists()) {
			System.out.println("Archivo no encontrado");
			System.exit(0);
		}
		
		return archiFile;
		
	}
	
}
