import java.util.Locale;
import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte sem;
		
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.UK);
		System.out.print("Introduce el número del día de la semana que quieras: ");
		sem = sc.nextByte();
		
		// Sentencias de selección binaria anidadas
		if (sem == 1)
			System.out.println("Lunes");
		else 
			if (sem == 2)
				System.out.println("Martes");
			else 
				if (sem == 3)
					System.out.println("Miercoles");
				else 
					if (sem == 4)
						System.out.println("Jueves");
					else 
						if (sem == 5)
							System.out.println("Viernes");
						else 
							if (sem == 6)
								System.out.println("Sábado");
							else 
								System.out.println("Domingo");
		
		// sentencia else if
		if (sem == 1)
			System.out.println("Lunes");
		else if (sem == 2)
			System.out.println("Martes");
		else if (sem == 3)
			System.out.println("Miercoles");
		else if (sem == 4)
			System.out.println("Jueves");
		else if (sem == 5)
			System.out.println("Viernes");
		else if (sem == 6)
			System.out.println("Sábado");
		else 
			System.out.println("Domingo");
		
		
		// Con Switch versión Clásica
		
		switch (sem) {
		case 1: System.out.println("Lunes"); 
				System.out.println("Comienza la semana"); 	
		break;
		case 2: System.out.println("Martes");
		break;
		case 3: System.out.println("Miercoles"); 
		break;
		case 4: System.out.println("Jueves"); 
		break;
		case 5: System.out.println("Viernes"); 
		break;
		case 6: System.out.println("Sábado"); 
		break;
		case 7: System.out.println("Domingo");
		break;
		default: System.out.println("Día no válido");
		}
		
		
		// Con Switch versión Nueva
		switch (sem) {
		case 1 -> { System.out.println("Lunes"); 
				  System.out.println("Comienza la semana"); 	
		}
		case 2 -> System.out.println("Martes");
		case 3 -> System.out.println("Miercoles"); 
		case 4 -> System.out.println("Jueves"); 
		case 5 -> System.out.println("Viernes"); 
		case 6 -> System.out.println("Sábado"); 
		case 7 -> System.out.println("Domingo");
		default -> System.out.println("Día no válido");
		}
		
		
		
		
		sc.close();
		
		}
	}


