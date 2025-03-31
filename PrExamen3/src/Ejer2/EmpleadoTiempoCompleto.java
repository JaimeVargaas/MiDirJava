package Ejer2;

import ExamenAlum.EnumCategoria;
import ExamenAlum.EnumPlus;

public class EmpleadoTiempoCompleto extends Empleado{

	
	private int numTrienios;
	private EnumPlus plus;
	public EmpleadoTiempoCompleto(String nombre, String fecha_nacimiento, EnumCategoria categoriaProfesional,
			int hijos, int numTrienios, EnumPlus plus) {
		super(nombre, fecha_nacimiento, categoriaProfesional, hijos);
		this.numTrienios = numTrienios;
		this.plus = plus;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "\n\tEmpleado a tiempo completo" +
				"\n\tNúmero de trienios: " + this.numTrienios +
				"\n\tPlus: " + (plus.getPlus()>0?plus.getPlus():"No tiene");
	}
	
	
	public String toStringLineal() {
		return super.toStringLineal() + "EmpleadoTiempoCompleto";
	}
	
}
