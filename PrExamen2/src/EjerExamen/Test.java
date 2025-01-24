package EjerExamen;

public class Test {

	public static void main(String[] args) {
		
		// -----------------------------------------------------------------
		// Prueba clase Cliente
		// -----------------------------------------------------------------
		
		Cliente C1 = new Cliente("Jaime Vargas","12345678K","666295066");
		Cliente C2 = new Cliente("Cristian Romero","12345428K","656425066");
		System.out.println(C1.toString());
		System.out.println(C2.toString());
		System.out.println(C1.equals(C2));
		
		// -----------------------------------------------------------------
		// Prueba clase Vehiculo
		// -----------------------------------------------------------------
		
		Vehiculo V1 = new Turismos("ABC1234", "Hyundai Tucson",(byte)5,25,(float)6.4,"Compacto",false);
		Vehiculo V2 = new Furgonetas("XYZ5678", "Renault Kango",(byte)3, 35.4, (float)10,(byte) 6);
		System.out.println(V1.toString());
		System.out.println(V2.toString());
		System.out.println(V1.equals(V2));
		
		// -----------------------------------------------------------------
		// Prueba clase Reserva
		// -----------------------------------------------------------------
		
		Reserva R1 = new Reserva(C2, V2, (short)5, false);
		Reserva R2 = new Reserva(C2, V2, (short)5, false);
		System.out.println(R1.toString());
		System.out.println(R2.toString());
		System.out.println(R1.equals(R2));
		System.out.println(R1.toStringDetallado());
		

		
		
	}

}
