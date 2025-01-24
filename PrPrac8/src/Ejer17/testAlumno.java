package Ejer17;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class testAlumno {

	public static void main(String[] args) {
		
	// Alumno a1 = new Alumno("Pepe",8.7f);
	// System.out.println(a1);
		
		// Definir un array para almacenar 6 alumnos
		Alumno [] clase = new Alumno [6];
		
		// carga fija de los alumnos
		cargaFija(clase);
		
		// Carga desde teclado de alumnos
		//cargaTeclado(clase);
		
		// Mostrar el array
		// System.out.println(Arrays.toString(clase));
		
		// Mostrar el array con un método propio
		System.out.println(muestraArray(clase));
		
		// Modificar nota de un alumno
		if(modificarNota("Sofía Moreno Luna",7.5f,clase))
			System.out.println("Nota modificada");
		else
			System.out.println("Alumno no encontrado");
		
		
	}

	
	// Método que solicita los datos del alumno por consola
	public static void cargaTeclado(Alumno[] clase) {
		// Variables locales
		String nom;
		float nota;
		
		try(Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH)) {
			for(int cont=0;cont<clase.length;cont++) {
				System.out.print("Nombre del alumno: ");
				nom= sc.nextLine();
				
				try {
				System.out.print("Nota media del alumno: ");
				nota = sc.nextFloat();
				
				if (nota<0 || nota>10) {
					throw new InputMismatchException();
				}
				}
				catch(InputMismatchException e) {
					System.out.println("Nota erronea");
					nota = -1;
				}
				
				// Crear el objeto alumno
				clase[cont] = new Alumno(nom,nota);
				
				// Limpiar el buffer de teclado
				sc.nextLine();
				
			}
		}	
		
	}
	public static void cargaFija(Alumno [] clase) {
		clase[0] = new Alumno("Juan Luis Moreno Fuentes",7.9f);
		clase[1] = new Alumno("María Sierras García",2);
		clase[2] = new Alumno("Pepe Muriel Báez",2.3f);
		clase[3] = new Alumno("Alberto Pérez Ruiz",9.5f);
		clase[4] = new Alumno("Sofía Moreno Luna",7.2f);
		clase[5] = new Alumno("Rafael Figueroa Montilla",5);
	}
	
	public static String muestraArray(Alumno [] clase) {
		String cad = "Clase de 1º DAW" + 
					 "\n--------------\n";
		
		for (Alumno alum: clase) {
			cad = cad + alum;
		}
		return cad;
	}
	
	
	// Método que busca el alumno con la nota media mas alta
		public static Alumno alumnoDestacado(Alumno [] clase) {
			Alumno a1 = clase[0];
			for(int cont=0;cont<clase.length;cont++) {
				if(clase[cont].getMedia()>a1.getMedia())
					a1=clase[cont];
			}
			
			return a1;
		}
		
		public static boolean modificarNota(String nom, float nuevaNota, Alumno [] clase) {
			boolean resultado=false;
			for(int cont=0;cont<clase.length&&!resultado;cont++) {
				if(clase[cont].getNombre().equalsIgnoreCase(nom)) {
					clase[cont].setMedia(nuevaNota);
					resultado=true;
				}
			}
			return resultado;
		}
		
		
	}








