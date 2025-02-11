package Ejer3;

import java.util.*;

public class Ejer3v2 {

	// Crear una coleccion de libros y la guardaremos en una lista
	
	public static void main(String[] args) {
		// crear una lista de libros
		List<Libro> misLibros = new ArrayList<Libro>();

		// Añadir varios libros
		misLibros.add(new Libro("María Dueñas","Entre costuras",false));
		misLibros.add(new Libro("Sarah Lark","En el país de la nube blanca",true));
		misLibros.add(new Libro("Eduardo Punset","Viaje al optimismo",false));
		misLibros.add(new Libro("María Dueñas","Misión olvido",true));
		misLibros.add(new Libro("J.R.R. Tolkien","El Señor de los Anillos",true));
		misLibros.add(new Libro("J.R.R. Tolkien","El Hobbit",true));
		misLibros.add(new Libro("J.R.R. Tolkien","El Silmarillion",true));
		misLibros.add(new Libro("Kate Morton","El jardín olvidado",true));
		misLibros.add(new Libro("Sarah Lark","La canción de los maoríes",true));

		// System.out.println(misLibros);

		// Mostrar la coleccion con for each
		for (Libro miLibro : misLibros) {
			System.out.println(miLibro);
		}
		
		// Ordenamos la coleccion por su orden natural
		// misLibros.sort(null);
		Collections.sort(misLibros);
		System.out.println("\nLibros ordenamos por orden natural");
		for (Libro miLibro : misLibros) {
			System.out.println(miLibro);
		}
		
		// Ordenar la coleccion en orden inverso
		System.out.println("\nLibros ordenados por orden natural, en sentido inverso");
		Collections.reverse(misLibros);
		for (Libro miLibro : misLibros) {
			System.out.println(miLibro);
		}
		
		// Ordenar la coleccion por un orden alternativo
		// Primero por autor ascendente y despues por titulo de libro descendente
		System.out.println("\nColección en orden alternativo");
		misLibros.sort(new OrdenAlternativo());
		for (Libro miLibro : misLibros) {
			System.out.println(miLibro);
		}
		
		
		// Hacer lo mismo con clase anonima
		Collections.sort(misLibros,
				new Comparator<Libro>() {
			@Override
			public int compare(Libro o1, Libro o2) {
				int compara = o1.getAutor().compareTo(o2.getAutor());

				if (compara!=0) // Autores diferentes
					return compara;
				return o2.getTitulo().compareTo(o1.getTitulo());
			}

		}// End clase anonima
				); // Cierre metodo
		
		System.out.println("\nLibros ordenados (Orden alternativo): " + misLibros);
		
		
	}

}
