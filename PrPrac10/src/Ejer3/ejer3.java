package Ejer3;

import java.util.*;

public class ejer3 {

	public static void main(String[] args) {
		// Crear un conjunto ordenado de libros
		SortedSet<Libro> misLibros = new TreeSet<>();
		
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

		//Recorremos la coleccion hacia atras ListIterator
        //teneos que convertir la coleccion en list, porque SortedSet, no dispone de ListIterator
        List<Libro> misLibros2 = new ArrayList<Libro>(misLibros);
        for(ListIterator<Libro> lit=misLibros2.listIterator(misLibros.size()-1);lit.hasPrevious();) {
            System.out.println(lit.previous());
        }

		// Añadir un libro repetido
		if (misLibros.add(new Libro("J.R.R. Tolkien","El Señor de los Anillos",true)))
			System.out.println("Libro añadido");
		else
			System.out.println("El libro no se ha podido añadir");

		System.out.println("\nColección tras un objeto repetido");
		// Mostrar la coleccion con for each
		for (Libro miLibro : misLibros) {
			System.out.println(miLibro);
		}
		
	}

}
