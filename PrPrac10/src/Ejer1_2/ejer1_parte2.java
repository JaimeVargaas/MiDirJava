package Ejer1_2;

import java.util.*;

public class ejer1_parte2 {

	public static void main(String[] args) {
		// Crear una colección de números tipo list
		List<Integer> miLista = new ArrayList<Integer>();
		
		miLista.add(25);
		miLista.add(78);
		miLista.add(10);
		miLista.add(17);
		miLista.add(99);
		System.out.println(miLista);
		
		// Recorrer la colección como si fuese un array
		for(int cont=0;cont<miLista.size();cont++) {
			System.out.print(miLista.get(cont) + " ");
		}
		
		if(miLista.contains(17))
			System.out.println("\nSI existe");
		else
			System.out.println("\nNO existe");
		
		miLista.remove(Integer.valueOf(17));
		
		// Esta sentencia daría error ya que intenta borrar el elemento que ocupa la posición 17
		// Lista.remove(17);
		
		System.out.println(miLista);
		
		miLista.sort(null);
		
		System.out.println(miLista);
		
		// Ordenar la colección de forma ascendente
		Collections.sort(miLista);
		
		System.out.println(miLista);
		
		// Ordenar la colección de forma descendente
		miLista.sort(new ComparatorInteger());
		System.out.println(miLista);
		
		
		
		
		
		
		
	}

}
