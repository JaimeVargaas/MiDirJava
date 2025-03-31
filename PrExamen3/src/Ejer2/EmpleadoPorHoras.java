package Ejer2;

import ExamenAlum.EnumCategoria;

public class EmpleadoPorHoras extends Empleado {

	
	public EmpleadoPorHoras(String nombre, String fecha_nacimiento, EnumCategoria categoriaProfesional, int numHijos, int horas) {
		super(nombre, fecha_nacimiento, categoriaProfesional, numHijos);
		super.setHoras(horas);
	}

	@Override
	public String toString() {
		return super.toString() + "\n\tEmpleado por horas: " + super.getHoras() + " Horas trabajadas";
	}
	
	public String toStringLineal() {
		return super.toStringLineal() + "EmpleadoPorHoras";
	}
	
	
	
}
