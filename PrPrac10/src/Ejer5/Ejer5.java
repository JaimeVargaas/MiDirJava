package Ejer5;

import java.util.*;

public class Ejer5 {

	public static void main(String[] args) {
		// Crear una coleccion tipo mapa
		// Map<String,String> miDiccionario = new HashMap<>();
		Map<String,String> miDiccionario = new LinkedHashMap<>();
		
		// Añadir ()varias palabras a nuestro diccionario
		miDiccionario.put("coche", "car");
		miDiccionario.put("casa", "house");
		miDiccionario.put("amigo", "friend");
		miDiccionario.put("blanco", "white");
		miDiccionario.put("perro", "dog");
		
		System.out.println(miDiccionario);
		
		// Prueba del método get
		System.out.println("Traducción de casa: " + miDiccionario.get("casa"));
		
		// -----------------------------------------------------------------------------------------------------
		
		// Crea un mapa a partir de otro ya creado, por ejemplo un TreeSet, a partir de un HashMap, o bien
		// con la ayuda del método putAll.
		
		SortedMap<String,String> dic2 = new TreeMap<>(miDiccionario);
		System.out.println("TreeMap: " + dic2);
		
		SortedMap<String,String> dic3 = new TreeMap<>(miDiccionario);
		dic3.putAll(miDiccionario);
		System.out.println("TreeMap: " + dic3);
		dic3.put("Rojo", "red");
		dic3.put("Negro", "Black");
		
		System.out.println("TreeMap: " + dic3);
		// -----------------------------------------------------------------------------------------------------
		
		// Prueba a crear un diccionario donde las claves estén ordenadas de forma inversa, prueba con clases
		// anónimas y con expresiones lambda.
		TreeMap<String,String> dic4 = new TreeMap<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		dic4.putAll(dic3);
		System.out.println("Diccionario ordenDescendente: " + dic4);
		
		// Idem pero con una expresion lambda
		
		TreeMap<String,String> dic6 = new TreeMap<> (
				(String o1, String o2) -> {return o2.compareTo(o1);}
		);
		dic6.putAll(dic3);
		System.out.println(dic6);
		
		// Idem pero con una expresion lambda, más reducido todavía
		
		TreeMap<String, String> dic7 = new TreeMap<>((o1,o2)->o2.compareTo(o1));
		dic7.putAll(dic3);
		System.out.println(dic7);
		
		
	}

}
