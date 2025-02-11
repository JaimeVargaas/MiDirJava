package Ejer4;

import java.util.*;
import java.util.Queue;

public class Ejer4 {

	public static void main(String[] args) {
		Queue<Integer> miCola = new LinkedList<>();
		
		// tanto add como offer añaden elementos al final de la cola, si la cola es de tamaño restringido es preferible utilizar offer, 
		// offer devuelve true o false
		miCola.add(1);
		miCola.add(2);
		miCola.add(6);
		miCola.add(4);
		miCola.add(76);
		miCola.add(9);
		
		System.out.println(miCola);
		
		// Para consultar el primer elemento de la cola tenemos element y peek
		System.out.println("Primer elemento de la cola: " + miCola.peek());
		System.out.println("Primer elemento de la cola: " + miCola.element());
		
		// Para borrar elementos tenemos remove ( lanza una excepcion si no hay elementos) o poll, devuelve null si no hay elementos
		Integer primero = miCola.poll();
		Integer segundo = miCola.remove();
		System.out.println("Elementos eliminados: " + primero + " y " + segundo);
		System.out.println(miCola);
		
	}

}
