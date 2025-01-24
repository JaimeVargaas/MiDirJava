package Ejer13_16;

import java.util.Arrays;
import java.util.Random;

public class ejer16 {

	// Número aleatorio
	private static Random aleatorio;
	
	// variables de instacia
	private boolean [][] baraja;
	private int cartasRestantes;

	// Inicializador estático
	static {
		aleatorio = new Random();
	}

	public ejer16() {
		// Inicializar el contador de cartas restantes
		this.cartasRestantes=40;
		
		// Pedir memoria para la matriz
		this.baraja = new boolean[4][10];
		
		// Rellenar toda la matriz con el valor true, porque están todas las cartas sin salir
		for(int fil=0;fil<baraja.length;fil++) {
			Arrays.fill(baraja[fil], true);
		}
	}
	
	// Métodos get y set
	public boolean[][] getBaraja() {return baraja;}
	public void setBaraja(boolean[][] baraja) {this.baraja = baraja;}
	public int getCartasRestantes() {return cartasRestantes;}
	public void setCartasRestantes(int cartasRestantes) {this.cartasRestantes = cartasRestantes;}
	
	public static Random getAleatorio() {
		return aleatorio;
	}
	
	// Método que comprueba si en la baraja quedan cartas
	public boolean quedanCartas() {
		return this.cartasRestantes>0;
	}

	// Método que permite sacar una carta de la baraja
	public int[] sacaCarta() {
		if (!quedanCartas()) return null;
		
	// Definir un array para guardar la fila y columna de la carta sacada
	int [] cartaSacada = new int[2];
	
	// Sacar una carta aleatorniamente (genenar una fila y una columna aleatoriamente)
	do {
		cartaSacada[0] = aleatorio.nextInt(4); // Generar un valor entre 0 y 3
		cartaSacada[1] = aleatorio.nextInt(10); // Generar un valor entre 0 y 9
	}
	while(this.baraja[cartaSacada[0]][cartaSacada[1]] == false);
	
	// Actualizar la carta sacada a false
	this.baraja[cartaSacada[0]][cartaSacada[1]] = false;
	
	// Bajamos uno las cartas restantes
	this.cartasRestantes--;
	
	return cartaSacada;
	}
	
	// Método para devolver la puntuación de la carta
	public float getPuntuacionCarta(int col) {
		if (col<7) 
			return col+1;
		else 
			return 0.5f;
	}
	
	// Método que devuelve el tipo de la carta
	public String toStringCarta(int palo, int valor) {
		String cad = "";
		
		switch (valor) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6: cad = (valor + 1) + "de "; break; 
		case 7: cad = "Sota de "; break;
		case 8: cad = "Caballo de "; break;
		case 9: cad = "Rey de ";break;
		}
		
		switch(palo) {
		case 0: cad = cad + "oros";break;
		case 1: cad = cad + "copas";break;
		case 2: cad = cad + "espadas";break;
		case 3: cad = cad + "bastos";break;
		}
		
		return cad;
	}
	
	// Devuelve un String con las cartas que quedan en la baraja
	@Override
	public String toString() {
		String cad = "\nEn la baraja quedan " + this.cartasRestantes + " cartas";

		for (int fil=0; fil<this.baraja.length; fil++) {
			for (int col=0; col<this.baraja [fil].length; col++) {
				if (this.baraja [fil] [col]) { // Si el elemento está a true
					cad =cad + "\n\t"+this.toStringCarta (fil, col); 
				} // end if
				
			} // end for (col)
		} // end for (fil)
		return cad;
	}
	
	
}
