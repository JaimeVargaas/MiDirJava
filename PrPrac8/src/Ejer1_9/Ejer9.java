package Ejer1_9;

public class Ejer9 {

	public static void main(String[] args) {
		int [] array = new int[25];
		
		for(int i=0;i<array.length;i++) {
			array[i] = (int)(Math.random()*100);
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		for(int i=24; i>=0;i--) {
			System.out.print(array[i] + " ");
		}
		

	}

}
