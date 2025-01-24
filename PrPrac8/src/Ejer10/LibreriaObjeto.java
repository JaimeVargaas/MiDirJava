package Ejer10;

public class LibreriaObjeto {
	
	private int [] array;
	
	public LibreriaObjeto(int tamaño) {
		this.array = new int[tamaño];
	}
	
	public LibreriaObjeto() {
		this(10);
	}
}
