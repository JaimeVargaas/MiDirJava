package ejemplosClase;

import java.util.ArrayList;
import java.util.*;

public class ejemplo1 {

	public static void main(String[] args) {
		
		// Crear una coleccion 
		Collection<Object> miColeccion = new ArrayList<Object>();
		
		// Añadir varios elementos
		miColeccion.add("Hola");
		miColeccion.add(12);
		miColeccion.add(76.23);
		miColeccion.add("Hasta luego");
		miColeccion.add(new Random());
		
		Libro libro1 = new Libro("El tiempo entre costuras","María Dueñas");
		Libro libro2 = new Libro("Una columna de fuego","Ken Follet");
		
		miColeccion.add(libro1);
		miColeccion.add(libro2);
		miColeccion.add(new Libro("El Señor de los anillos","J.R Tolkien"));
		miColeccion.add(Integer.valueOf(99));
		
		System.out.println("Mi colección: " + miColeccion);
		
		// Recorrer la colección con Iterator
		Iterator<Object> it = miColeccion.iterator();
		Object elemento = it.next(); // Primer elemento de la coleccion
		while(it.hasNext()) {
			System.out.println(elemento);
			elemento=it.next(); // Avanzo y recojo el siguiente elemento
		}
		System.out.println(elemento);
		
		System.out.println();
		// Otra forma de recorrer la coleccion
		for(Iterator<Object> it2=miColeccion.iterator();it2.hasNext();) {
			System.out.println(it2.next());
		}
		
		// Otra forma de recorrer la coleccion
		Object elem;
		for(Iterator<Object> it2=miColeccion.iterator();it2.hasNext();) {
			elem=it2.next();
			if(elem instanceof Integer)
				it2.remove();
			}
		
		


	}	

}
