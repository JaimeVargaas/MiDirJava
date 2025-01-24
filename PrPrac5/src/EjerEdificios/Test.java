package EjerEdificios;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// -----------------------------------------------------------------
		// Prueba clase Direccion
		// -----------------------------------------------------------------
		
		Direccion d1 = new Direccion("C/ Infante",37,"29200");
		Direccion d2 = new Direccion("C/ La Unión",2,"29532");
		
		d2.setNomCalle("C/ La Unión");
		
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		
		
		// -----------------------------------------------------------------
		// Prueba clase Edificio
		// -----------------------------------------------------------------
		
		Edificio e1 = new Edificio(d1,(short)10,(byte)2,200);
		Edificio e2 = new Edificio("C/ Ancha", 9, "29520", (short)25, (byte)3, 1000);
		
		System.out.println("IBI edificio 1: " + e1.calculaIBI());
		System.out.println("IBI del Ayuntamiento Fuente de Piedra: " + e2.calculaIBI());
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
		
		// -----------------------------------------------------------------
		// Prueba clase Casa
		// -----------------------------------------------------------------
		System.out.println("\nCASA");
		
		Casa c1 = new Casa(d2,(short)7,(byte)2,150,(byte)3,(byte)2);
		System.out.println("IBI de la casa: " + c1.calculaIBI());
		
		System.out.println(c1.toString());
		
		// -----------------------------------------------------------------
		// Prueba clase Colegio
		// -----------------------------------------------------------------
		Colegio cole1 = new Colegio(d1, (short)30, (byte)4,2000,(byte)20,(byte)4);
		System.out.println(cole1.toString());
		
		
		// -----------------------------------------------------------------
		// Prueba clase Guarderia
		// -----------------------------------------------------------------
		
		Guarderia g1 = new Guarderia (d2,(short)7, (byte)1,700,(byte)3,(byte)1,100);
		System.out.println(g1.toString());
		g1.saluda();
		
		Edificio g2 = new Guarderia (d2,(short)7, (byte)1,700,(byte)3,(byte)1,100);
		System.out.println(g2.toString());
		
		
	}

}
