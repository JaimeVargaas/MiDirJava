package Ejer18;

import java.util.Random;

public class Baraja {

	// Variables de instacia
	private Carta [] baraja;
	private byte posCartaBaraja;
	
	public Baraja() {
		// Variables locales
		byte valorAleatorio, paloAleatorio;
		
		// Array con los palos en formato cadena
		String [] arrayPalos = {Carta.PaloOros, Carta.PaloCopas, Carta.PaloBastos, Carta.PaloEspadas};
		
		Carta cartaTemporal; // Contendrá una carta generada aleatoriamente, si esta no existe previamente en el array, uno
							 // de los elementos del array apuntara a ella
		
		Random obRandom = new Random();
		
		// Dar valor a las variablers de instacia
		this.posCartaBaraja = 0;
		this.baraja = new Carta[40];
		
		// Generar las cartas aleatoriamente, de forma que van a quedar "Mezcladas en el array
		for (int cont=0;cont<this.baraja.length;cont++) {
			do {
				// Generar el aleatrorio con el valor de la carta (1 a 10)
				valorAleatorio = (byte)(obRandom.nextInt(10)+1);
				
				// Generar el aleatorio con palo de la carta (0 a 3)
				paloAleatorio = (byte)(obRandom.nextInt(4));
				
				// Crear el objeto con la carta temporal
				cartaTemporal = new Carta(arrayPalos[paloAleatorio], valorAleatorio);
			}
			while(existeCarta(cartaTemporal,cont));
		}
	}
	
	
}
