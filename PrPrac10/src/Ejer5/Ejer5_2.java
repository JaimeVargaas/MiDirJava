package Ejer5;

import java.util.*;

public class Ejer5_2 {

	public static void main(String[] args) {
		Map<String,String> dic = new HashMap<>();
		
		// Añadir ()varias palabras a nuestro diccionario
		dic.put("coche", "car");
		dic.put("casa", "house");
		dic.put("amigo", "friend");
		dic.put("blanco", "white");
		dic.put("perro", "dog");
		dic.put("Perro", "Dog");
		
		// Obtener las claves
		// Obtén las claves de alguno de los diccionarios que has creado, y almacénalas en un Set.
		Set<String> claves = dic.keySet();
		System.out.println("Claves: " + claves);
		
		// Idem al apartado anterior pero en un conjunto ordenado
		SortedSet<String> claves2 = new TreeSet<>(claves);
		System.out.println("Claves 2: " + claves2);
		
		// Obtener las claves en un conjunto ordenado sin distinguir entre mayusculas y minusculas
		// en el constructor de la nueva colección especificaré la forma de ordenar con la ayuda de Comparator
		Set<String> claves3 = new TreeSet<>((o1, o2)->o1.compareToIgnoreCase(o2));
		claves3.addAll(dic.keySet());
		System.out.println("Claves 3: " + claves3);

		// Crea otra colección con los valores del mapa, por ejemplo, en un LinkedList, y ordénalos.
		LinkedList<String> mapa = new LinkedList<>(dic.values());
		System.out.println("Mapa de valores: " + mapa);
		

	}

}
