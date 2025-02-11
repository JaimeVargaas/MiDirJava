package ejer6;

import java.util.Collections;
import java.util.Comparator;


public class test {

	public static void main(String[] args) {
		Alumno a1 = new Alumno((byte)1,"María","García","García","27/02/1987","C/ Alameda, 23", "11111111");
		Alumno a2 = new Alumno((byte)2,"Ana","García","García","12/05/2003","C/ Alameda, 23", "22222222");
		Alumno a3 = new Alumno((byte)3,"Juan","García","Blanco","21/09/1996","C/ La silla, 10", "343434334");
		Alumno a4 = new Alumno((byte)4,"José","García","Blanco","15/10/2003","Avda. Andalucía, s/n", "343423112");
		Alumno a5 = new Alumno((byte)5,"María Isabel","López","Jiménez","01/03/2002","C/ El Plato, 12", "676754534");
		Alumno a6 = new Alumno((byte)6,"Luis","González","Pozo","50/03/2000","C/ Nueva, 1", "12345678");
		Alumno a7 = new Alumno((byte)7,"Francisco","Ruiz","Romero","29/02/2000","Carretera Los Prados, km 4","98765433");
		Alumno a8 = new Alumno((byte)8,"Carmen","Romero","Sierras","27/08/1987","C/ El duende, 10", "11223344");
		Alumno a9 = new Alumno((byte)9,"Manuel","Romero","Blanco","18/01/1999","C/ Santa Clara, 18", "654332657");
		Alumno a10= new Alumno((byte)10,"Manuel","Romero","Blanco","12/09/2003","Avda. La Constitución,2", "99999999");
		
		System.out.println("ToStringCompleto: \n" + a6.toStringCompleto());
		System.out.println("ToStringFechaNombre: \n" + a6.toStringFechaNombre());
		System.out.println("ToString: \n" + a6.toString());
		
		Grupo g1 = new Grupo();
		g1.añadeAlumno(a3);
		g1.añadeAlumno(a4);
		g1.añadeAlumno(a9);
		g1.añadeAlumno(a8);
		
		GrupoV2 g2 = new GrupoV2();
		g2.add(a1);
		g2.add(a10);
		g2.add(a2);
		g2.add(a5);
		g2.add(a7);
		
		
		// ORDENACIÓN POR EL ORDEN NATURAL
		System.out.println("\nLISTA CON ALUMNOS ORDENADOS POR ORDEN NATURAL");
		
		// ORdenar los alumnos con el método sort de la colección
		g1.getMiGrupo().sort(null);
		g2.sort(null);
		
		// Ordenar con el método sort de la clase colectioons
		Collections.sort(g1.getMiGrupo());
		Collections.sort(g2);
		
		System.out.println(g1.toString());
		System.out.println(g2.toString());
		
		// Orden alterno de apellido1 y dni
		g1.getMiGrupo().sort(new OrdenDescendente());
		System.out.println(g1);
		
		// Orden alterno por edad
		Collections.sort(g1.getMiGrupo(),
				new Comparator<Alumno>() {
			@Override
			public int compare(Alumno o1, Alumno o2) {
				return LibreriaFechasJava8.getEdad(o1.getFecNac2()) - 
								LibreriaFechasJava8.getEdad(o2.getFecNac2());
			}
		}// End clase anonima
				); // Cierre metodo
		
		System.out.println(g1);
	
		
	}

}
