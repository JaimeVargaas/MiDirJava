package EjemplosArchivos;

import java.io.*;

public class EscrituraArchivoTexto {

	public static void main(String[] args) {
		
		BufferedWriter flujoEscritura = null;
		
		try {
			// Apertura del flujo de escritura en modo "append"
			flujoEscritura = new BufferedWriter(
					         	new FileWriter(
					         		new File("./src/EjemplosArchivos/Prueba.txt"),true));
			flujoEscritura.write("\nLínea añadida");
			flujoEscritura.write("2");
			
			
			// flujoEscritura.flush();
			flujoEscritura.write("\nFin");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				flujoEscritura.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
