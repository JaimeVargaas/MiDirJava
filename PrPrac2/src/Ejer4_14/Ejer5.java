package Ejer4_14;

public class Ejer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte num = 32;

		if (num<60)
			System.out.println("Has obtenido el grado E");
		else 
			if (num>60 && num<69)
				System.out.println("Has obtenido el grado D");

		if (num>70 && num<79)
			System.out.println("Has obtenido el grado C");
		else 
			if (num>80 && num<89)
				System.out.println("Has obtenido el grado B");
		if (num>=90)
			System.out.println("Has obtenido el grado A");
	}

}
