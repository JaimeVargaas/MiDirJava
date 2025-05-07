package PrPrac25;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;


public class Ejer12 {

	public static void main(String[] args) {
		
		String [] nombre ={"Jaime", "Lucía","Alba","Natalia","Ivan"};
		String [] apellidos = {"Vargas", "Báez", "Ramírez", "Cabello", "Molero"};
		String [] tlf = {"661227373", "123456789", "4323412432","123254123","123456789"};

		// ----------------------------------------------------------		
		// Escritura en el fichero
		// ----------------------------------------------------------

		try (ObjectOutputStream oos = new ObjectOutputStream(
									  	new FileOutputStream(
									  		new File("./src/PrPrac25/escribirObjeto.txt")));) {
			
			System.out.println("El archivo se ha creado correctamente");
			
			for (int i = 0; i < nombre.length; i++) {
				oos.writeObject(new Persona(nombre[i], apellidos[i], tlf[i]));
			}
			
		}  catch (IOException e) {
			   e.printStackTrace();
		    }


		// ----------------------------------------------------------		
		// Lectura del fichero
		// ----------------------------------------------------------
		try {  // try 1
			File f = null;
			ObjectInputStream ois = null;
			Persona pers = null;
			
			try{  // try 2
				f = new File("./src/PrPrac25/escribirObjeto.txt");
				if (f.exists()) {
					ois  = new ObjectInputStream(new FileInputStream(f));
					while (true) { 
						pers = (Persona)ois.readObject();
						System.out.println(pers.toString());
					}  // end while
				} // end if
			}  // end try 2
			catch (EOFException eof) {
				System.out.println(" ....................... ");
			}
			catch (FileNotFoundException fnf) {
				System.err.println("Fichero no encontrado "+ fnf);
			}
			catch (IOException e) {
				System.err.println("Se ha producido una IOException");
				e.printStackTrace();
			}
			catch (Throwable e) {
				System.err.println("Error de programa");
				e.printStackTrace();
			}
			finally {
				 if (ois!=null) {ois.close();}
			}
		} // end try 1
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
