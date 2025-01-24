package ejer1_10;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class Ejercicio8b {
			public static void main(String[] args) {
			 // Constantes
			 final int n = 10;
			 // Variables
			 int a, b, c=0;
			 a = Integer.parseInt(args[0]);
			 b = Integer.parseInt(args[1]);
			 
			 c = a - b + n;
			 c = c + c;
			 b = a + b - c;
			 a = a + b - c;
			 a = n * a;
			 System.out.println(a);
			

		
	}

}
}
