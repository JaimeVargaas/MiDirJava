package Ejer1_2;

import java.util.*;

public class ejer2 {

	public static void main(String[] args) {
		List<String> miLista = new LinkedList<String>();
		miLista.add("Hola");
		miLista.add("Adiós");
		miLista.add("1DAW");
		miLista.add("Holaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		
		System.out.println("Lista recorrida con for each: ");
		for(String elem1: miLista) {
      	System.out.println(elem1);
      }
		
		System.out.println("\nLista recorrida hacia atrás con ListIterator y poniendola en mayuscula: ");
		// Recorrer la lista hacia atrás con listIterator
		String cadena;
		
		for(ListIterator<String> it=miLista.listIterator(miLista.size());it.hasPrevious();) {
		cadena = it.previous().toUpperCase();
		it.set(cadena);
		System.out.println(cadena);
		}
		
		System.out.println("\nLista recorrida hacia atrás con ListIterator: ");
		// Recorrer la lista hacia atrás con listIterator
		for(ListIterator<String> it=miLista.listIterator(miLista.size());it.hasPrevious();) {
			String cad = (String) it.previous();
			System.out.println(cad);
		}
		
		
		System.out.println("\nNúmero de elementos de la colección: " + miLista.size());
		System.out.println("Primero de la lista: " + miLista.getFirst());
		System.out.println("Primero de la lista: " + miLista.getLast());
		System.out.println("Cuarto de la lista: " + miLista.get(3));
		
		/*
		 * De forma análoga, prueba a borrar determinados elementos tanto con el método remove de la
		   interfaz List, como con el de la interfaz Iterator.
		 */
		
		// Borrado con el método remove de Lista
		if (miLista.remove("HASTA LUEGO"))
			System.out.println("La cadena HASTA LUEGO ha sido borrada");
		else 
			System.out.println("La cadena HASTA LUEGO no ha sido borrada");
		
		System.out.println("Borrado lemento posicion 0: " + miLista.remove(2));;
		
			
		// Borrado con el método remove de iterator
		for(Iterator<String> it = miLista.listIterator(); it.hasNext();) {
            if (it.next().equals("PEPE")) {
                it.remove();
            }
            }
		
		System.out.println("\nMétodo que sea propio de la clase: ");
		// Prueba a llamar algún método que sea propio de la clase (no de la interfaz List).
		Iterator<String> itInverso = ((LinkedList<String>)miLista).descendingIterator();
		while (itInverso.hasNext()) {
			System.out.println(itInverso.next());
		}
		
		// Prueba a ordenar tu lista, tanto de forma ascendente, como descendente.
		System.out.println("\nOrden ascendente: ");
		miLista.sort(null);
		System.out.println(miLista);
		
		System.out.println("\nOrden descendente: ");
		//Collections.reverseOrder(miLista);
		
}
	
}

