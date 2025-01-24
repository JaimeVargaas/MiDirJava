
public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 18;
		byte edad = 18;
		
		if (numero == 100) {
			System.out.println("Enhorabuena");
			System.out.println("Has ganado");
		}
		
		else 
			System.out.println("Lo siento, has perdido");
		
		
		if (edad>18) // Mayores de edad
			System.out.println("Mayor de edad");
		else
			if (edad<18) // Menores de edad
				System.out.println("Menor de edad");
			else // 18 años
				System.out.println("Acabas de obtener la mayoría de edad");
		
		
		
		System.out.println("Fin del programa");
		
		
		
	}

}
