package Ejer1_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;


public class ejer1 {
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
		Object element;
        for(Iterator<Object> it2 = miColeccion.iterator(); it2.hasNext();) {
            element = it2.next();
            if (element instanceof Integer) {
                it2.remove();                
            }
         }
        
        System.out.println();
        
        // Busca uno de los libros que has añadido, y modifícale su título para que aparezca todo en mayúscula.
        // Recorrer la colección con for-each
        Object elemento5;
        for(Iterator<Object> it2 = miColeccion.iterator(); it2.hasNext();) {
        	elemento5 = it2.next();
        	if(elemento5 instanceof Libro) { // Comprueba si este objeto es un libro
        		Libro libroBuscado =(Libro)elemento5;	
        		if(libroBuscado.getTitulo().equals("Una columna de fuego"))
        			libroBuscado.setTitulo(libroBuscado.getTitulo().toUpperCase());
        	}	  
        }
        
        // ------------------------------------------------------------------------------------------------
        
        System.out.println("\nColección tras la modificación del título a mayúscula de un libro");
        // Recorrer la colección con for-each>
        System.out.println("\nColección tras el borrado de los números:");
        for(Object elem1: miColeccion) {
        	System.out.println(elem1);
        }
        
        
        // ------------------------------------------------------------------------------------------------
        // Método contains
        if(miColeccion.contains("Hola"))
        	System.out.println("Si contiene la cadena Hola");
        else
        	System.out.println("No contiene la cadena Hola");
        
        if(miColeccion.contains("76.23"))
        	System.out.println("Si contiene el número 76.23");
        else
        	System.out.println("No contiene el número 76.23");
     
        if(miColeccion.contains(libro1))
        	System.out.println("SI existe el libro 1");
        else 
        	System.out.println("NO existe el libro 1");
        
        if(miColeccion.contains(new Libro("El Señor de los anillos","J.R Tolkien")))
        	System.out.println("SI existe el libro 1");
        else 
        	System.out.println("NO existe el libro 1");
        
        
        // ------------------------------------------------------------------------------------------------
        // Método remove
 
     
        if(miColeccion.remove(libro1))
        	System.out.println("Libro borrado");
        else 
        	System.out.println("Libro NO borrado");
        
        if(miColeccion.remove(new Libro("El Señor de los anillos","J.R Tolkien")))
        	System.out.println("Libro borrado");
        else 
        	System.out.println("Libro NO borrado");
	}	

}
