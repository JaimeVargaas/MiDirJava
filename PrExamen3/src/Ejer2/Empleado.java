package Ejer2;

import java.time.LocalDate;

import ExamenAlum.EnumCategoria;

public class Empleado {

	private String nombre;
	private LocalDate fecha_nacimiento;
	private EnumCategoria categoriaProfesional;
	private int numHijos;
	private int horas;
	
	
	public Empleado(String nombre, String fecha_nacimiento, EnumCategoria categoriaProfesional, int numHijos) {
		this.nombre = nombre;
		this.fecha_nacimiento = LibreriaFechasJava8.convierteStringToLocalDate(fecha_nacimiento);
		this.categoriaProfesional = categoriaProfesional;
		this.numHijos = numHijos;		
	}
	
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public LocalDate getFecha_nacimiento() {return fecha_nacimiento;}
	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {this.fecha_nacimiento = fecha_nacimiento;}
	public EnumCategoria getCategoriaProfesional() {return categoriaProfesional;}
	public void setCategoriaProfesional(EnumCategoria categoriaProfesional) {this.categoriaProfesional = categoriaProfesional;}
	public int getNumHijos() {return numHijos;}
	public void setNumHijos(int numHijos) {this.numHijos = numHijos;}
	public int getHoras() {return horas;}
	public void setHoras(int horas) {this.horas = horas;}
	
	
	 
	public float salario() {
		float total;
		total = categoriaProfesional.getSueldo();
		
		total += (this.numHijos * 50);
		return total;
	}
	
	
	public float salarioNeto() {
		float total = this.salario();
		if (this.salario()< 1500) {
			total = (float) (total * 0.91);
		}else if (this.salario()>= 1500) {
			total = (float) (total*0.86);
		}else if (this.salario() >= 2500) {
			total = (float) (total * 0.81);
		}else {
			total = (float) (total * 0.76);
		}
		
		return total;
	}

	@Override
	public String toString() {
		return this.getNombre() + " - Categoría: " + this.getCategoriaProfesional() +
				"\n\tFecha de nacimiento: " + this.getFecha_nacimiento().toString() +" (" +LibreriaFechasJava8.getEdad(fecha_nacimiento) + " años)" +
				"\n\tSalario Bruto: " + this.salario() + "€" +
				"\n\tSalario Neto: " + this.salarioNeto() + "€" +
				"\n\tHijos: " + this.getNumHijos();
	}
	
	public String toStringLineal() {
		return getFecha_nacimiento().toString() + " " + getNombre() + " (Salario neto: " + salarioNeto() + "€) - Empleado";
	}
	
	
	
	
	
	
}
