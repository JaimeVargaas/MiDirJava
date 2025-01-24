package jamon;

public class Pruebas {

	public static void main(String[] args) {

		 //-----------------------
        // PRUEBA CLASE DESGLOSE
        //-----------------------
        System.out.println("Desglose 12,50: "+Metodos.desglose((float) 12.5));
        System.out.println("10@ equivalen a: "+Metodos.arrobas_kilos(10));
        System.out.println("14@ equivalen a: "+Metodos.arrobas_kilos(14));
        System.out.println("10 kg equivalen a: "+Metodos.kilos_arrobas(10));
        System.out.println("Si la @ a 90€ el kilos estara a: "+Metodos.PrecioKilos(90));
        System.out.println("Si el kilo esta a 7.92 la arroba estara a: "+Metodos.PrecioArrobas((float) 7.92));

        //-----------------------
        // PRUEBA CLASE GRANJA
        //-----------------------

        Granja g1 = new Granja("Los Jamoneros Andaluces", true, 20f);
        Granja g2 = new Granja("Hermanos García, S.L", false, 17f);


        System.out.println("-------------------------------------------------------------------------");
        System.out.println(g1.toString());
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(g2.toString());
        System.out.println("-------------------------------------------------------------------------");

        //------------------------------------
        // PRUEBA CLASE CERDO Y CERDO IBERICO
        //------------------------------------

        Cerdo c1= new Cerdo("k345", g2, 14, 'H');
        JamonIbericoS c2 = new JamonIbericoS("L8772", g2, 14,'H',"Recebo");
        Cerdo c3 = new Cerdo("98-a1", g1, 15, 'H');
        JamonIbericoS c4 = new JamonIbericoS("Z98988", g1, 15, 'M',"Bellota");

        System.out.println("-------------------------------------------------------------------------");
        System.out.println(c1.toString());
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(c2.toString());
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(c3.toString());
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(c4.toString());

        System.out.println("Los cerdos c1 y c4 " + (c1.equals(c4)?"son el mismo cerdo":"son cerdos diferentes"));

        //------------------------------------
        // PRUEBA CLASE JAMONES
        //------------------------------------

        Jamon j1 = new Jamon(c1, 7f, 12);
        Jamon j2 = new Jamon(c2,(float) 7.6, 16);
        Jamon j3 = new Jamon(c3, 8f, 10);
        Jamon j4 = new Jamon(c4, 7f, 15);


        System.out.println("-------------------------------------------------------------------------");
        System.out.println(j1.toString());    
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(j2.toString());    
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(j3.toString());    
        System.out.println("-------------------------------------------------------------------------");
        System.out.println(j4.toString());    
	}
	

}
