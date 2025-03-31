package Ejer1;

public class Test {

	public static void main(String[] args) {
		Juego j1 = new Juego("EA Sports Fc",Plataforma.XBOX,41);
		System.out.println(j1.toString());
		
		// -----------------------------------------------------------------------------------------------
		
		String juego [] = {"EA Sports Fc", "Mario Kart","Dragon Ball"};
		
		Ventas v1 = new Ventas(juego);
		System.out.println(v1.toString());
		
		System.out.println();
		System.out.println(v1.toStringVentasJuegos());
		
		System.out.println();
		System.out.println(v1.toStringVentasPlataforma());
		
		
		
		
	}

}
