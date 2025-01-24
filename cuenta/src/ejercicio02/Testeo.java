package ejercicio02;

public class Testeo {

	public static void main(String[] args) {

		//------------------------------------------------
		//CUENTA
		//----------------------------------------------
		Cuenta c1= new Cuenta("25351878J", "Natalia", 1000, 245);
		Cuenta c2= new Cuenta("25351878J", "Natalia", 100, 245);

		//System.out.println(c1.toString());
		
		c1.imposicion(50);
		System.out.println(c1.toString());
		
		if(c1.equals(c2)) {
			System.out.println("Las cuentas : c1 y c2, son iguales");
		}else {
			System.out.println("Las cuentas no son iguales");
		}
		
		c1.validarClave(245); 
		
		System.out.println("--------------------------------------");
		
		//-------------------------------------------------------
		//CUENTA JOVEN
		//-----------------------------------------------------
		CuentaJoven cj1= new CuentaJoven("25351878J", "Natalia", 100, 245,20);
		System.out.println(cj1.toString());
		cj1.reintegro(200);
		System.out.println("--------------------------------------");

		
		//---------------------------------------------------
		//CUENTA EMPRESA 
		//-----------------------------------------------
		CuentaEmpresa ce = new CuentaEmpresa("25351878J", "Natalia", 100, 245,"EMPRESA NATALIA");
		//System.out.println(ce.toString());
		
		ce.imposicion(200);
		ce.reintegro(100);
		//System.out.println(ce.toString());
		
		
		ce.reiniciarTotales();
		System.out.println(ce.toString());
		
		System.out.println("--------------------------------------------");
		//---------------------------------------------------------
		//CAJERO
		//--------------------------------------------------------
		Cajero ca1 = new Cajero(4, 5, 0, 2);
		System.out.println(ca1.toString());
		System.out.println();
		System.out.println("Hay un total de:"+ca1.disponible()+"€");
		System.out.println();
		System.out.println(ca1.sacar(c1,245,400));
		
		
	}

}
