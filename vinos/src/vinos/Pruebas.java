package vinos;

public class Pruebas {

	public static void main(String[] args) {

		
		//------------------------------------------------------------------------
		/*
		 * ENOLOGO
		 */
		Enologo e1 = new Enologo("Raul",35,true);
		Enologo e2 = new Enologo("Raul",35,true);
		
		System.out.println(e1.toString());
		
		System.out.println(e1.equals(e2));
		
		System.out.println("--------------------");
		//-----------------------------------------------------------------
		/*
		 * VENDIMIA 
		 */
		Vendimia v1 = new Vendimia("Cortijo Los Juanes, verano 2015",true,true);
		System.out.println(v1.toString());
		System.out.println("---------------");
		//-----------------------------------------------------------------------
		/*
		 * VINO
		 */
		Vino vi1 = new Vino ("hola",v1,e1,39,"Blanco",(float) 40.58);
		
		System.out.println(vi1.toString());
		
		System.out.println("---------------------------------------");
		//--------------------------------------------------------------------------
		/*
		 * VINO RESERVA
		 */
		Reserva r1 = new Reserva ("hola",v1,e1,39,"Blanco",40,"Manzanilla Sanlúcar de Barrameda");
		System.out.println(r1.toString());
		
		//--------------------------------------------------------------------------
		/*
		 * VINO GRAN RESERVA
		 */
		GranReserva gr1 = new GranReserva("hola",v1,e1,39,"Blanco",40,"Manzanilla Sanlúcar de Barrameda","cebo");
		System.out.println(gr1.toString());
	}

}
