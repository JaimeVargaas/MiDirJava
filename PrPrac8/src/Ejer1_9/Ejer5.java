package Ejer1_9;

public class Ejer5 {

	public static void main(String[] args) {
		
		int [] array = new int [20];
		int cont=0, total=0;
		for (int i=0;i<array.length;i++) {
			array[i] = (int)(Math.random()*100);
			System.out.println("Posición "+ i + ": " +array[i]+ " ");
			if(array[i]%2==0) {
				cont++;
				total = total + array[i];
			}
		}
		System.out.println("El total es " + total + " y hay " + cont + " números pares");
		

	}

}
