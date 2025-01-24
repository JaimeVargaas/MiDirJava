package Ejer48_55;

public class Ejer51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double enc;
		
		for (int cont = 0; cont<=15;cont++) {
			System.out.print("Encuentro " + cont+":");
			enc = Math.random();
			if (enc < 0.5) 
			System.out.println("1");
			else if (enc < 0.8)
				System.out.println("x");
			else System.out.println("2");
			
		}
		
		
		
	}

}
