package Ejer48_55;

public class Ejer50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int moneda;
		
		
		
		for (int cont = 0;cont <= 2;) {
		moneda=(int)(Math.random()*2);
		System.out.println(moneda);
			if (moneda == 1) {
			System.out.println("Cruz");
			cont = 0;
			}
			else {
				System.out.println("Cara");
				cont++;
			}
		}
			
		
		

		
	}

}
