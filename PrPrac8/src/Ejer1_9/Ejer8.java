package Ejer1_9;

public class Ejer8 {

	public static void main(String[] args) {
		int cont2 = 0;
		int [] array = new int[12];
		int [] array2 = new int[cont2];

		
		for (int cont=0;cont<array.length;cont++) {
			if(array[cont]%2==0 && array[cont]>2) {
				array2[cont2] = array[cont];
				cont2++;
			}
			System.out.print(array[cont] + " ");
			System.out.print(array2[cont2] + " ");
		}

	}

}
