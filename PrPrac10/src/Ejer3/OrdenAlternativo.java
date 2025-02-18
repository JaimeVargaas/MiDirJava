package Ejer3;

import java.util.Comparator;

public class OrdenAlternativo implements Comparator<Libro> {

	@Override
	public int compare(Libro o1, Libro o2) {
		int compara = o1.getAutor().compareTo(o2.getAutor());
		
		if (compara!=0) // Autores diferentes
			return compara;
		return o2.getTitulo().compareTo(o1.getTitulo());
	}

}
