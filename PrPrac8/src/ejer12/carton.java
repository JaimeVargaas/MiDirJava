package ejer12;

public class carton {
	// Variable de clase con el número de numeros que tendrá cada carton
	private static byte tamañoCarton = 15;
	
	// Variable de instacia
	private int contAciertos;
	private int [] arrayCarton;
	private int nbolas;
	
	// Constructor
	public carton(int numBolasBombo) {
		int i,aux;
		this.contAciertos = 0;
		this.arrayCarton = new int [tamañoCarton];
		this.nbolas = numBolasBombo;
		
		for (i=0;i<arrayCarton.length;i++) {
			do {
				aux=(int)(Math.random()*nbolas);
			}
			while (existeNumero(aux)==true);
			arrayCarton[i]=aux;
		}
	}
	
	
}
