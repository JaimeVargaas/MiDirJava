package pasoParametros;

public class Ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		
		System.out.println("Inicio programa");
		 cambiaValor(x);
		 System.out.println(x); // Imprimirá 5, no 10
		 
		 x = x +2; // x es igual a 7
		 cambiaValor(x);
		 }
		 public static void cambiaValor(int number) {
		 System.out.println("Acabo de entrar al método");
		 number = 10; // Este cambio no afecta a 'x'
		 System.out.println("Fin del método");
		 }
	} 
