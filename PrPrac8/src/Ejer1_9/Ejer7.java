package Ejer1_9;

public class Ejer7 {

	public static void main(String[] args) {
		
		int [] array = new int [50];
		int numero;
		
		for (int i=0;i<array.length;i++) {
			
			do {
			numero = (int)(Math.random()*100)+1;
			}
			
			while(existe(array, numero,i)==true);

			array[i] = numero;
			System.out.print(array[i] + " ");
			}
		
		
		}
	
	public static boolean existe(int [] array, int num, int tope) {
		boolean sw = false;
		int cont = 0;
		while(cont<tope && sw==false) {
			if (array[cont]==num)
				sw=true;
			cont++;
		}
		return sw;
	}
}
