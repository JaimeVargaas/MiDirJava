package Ejer2;


import ExamenAlum.EnumCategoria;
import ExamenAlum.EnumPlus;

public class Test {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado("Jaime","31/12/2020",EnumCategoria.JEFE_DE_PROYECTO,0);
		System.out.println(e1.toString());
		System.out.println(e1.toStringLineal());
		
		System.out.println();
		
		Empleado e2 = new EmpleadoPorHoras("Jaime","01/08/2006",EnumCategoria.PROGRAMADOR_JUNIOR,0,120);
		System.out.println(e2.toString());
		System.out.println(e2.toStringLineal());
		
		System.out.println();
		
		Empleado e3 = new EmpleadoTiempoCompleto("Jaime","05/01/2002",EnumCategoria.JEFE_DE_EQUIPO,0,2,EnumPlus.BENEFICIOS_EXTRAS);
		System.out.println(e3.toString());
		System.out.println(e3.toStringLineal());
		
		
		System.out.println();
		
		Empresa e = new Empresa();
		
		
		e.añadirEmpleado(e1);
		e.añadirEmpleado(e2);
		e.añadirEmpleado(e3);
		
		System.out.println(e.toString());
		
		e.ordenaSalarioNeto();
		System.out.println(e.toStringOrdenadaSalario());
	}

}
