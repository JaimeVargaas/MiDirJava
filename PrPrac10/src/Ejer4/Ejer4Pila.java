package Ejer4;

import java.util.*;

public class Ejer4Pila {

	public static void main(String[] args) {
		Deque<Integer> miPila = new ArrayDeque<Integer>();
        
        miPila.addFirst(1);
        miPila.add(23); //equivale a addlast
        miPila.push(24);
        miPila.push(67);
        
        System.out.println(miPila);
        
        System.out.println("Primero de la fila " + miPila.peek());
        System.out.println("Primero de la fila " + miPila.element());
        System.out.println("Primero de la fila " + miPila.getFirst());
        
        System.out.println();
	}

}
