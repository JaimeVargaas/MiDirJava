package Ejer2;

import java.util.*;

public class Empresa implements Comparable<Empleado> {
	private Set<Empleado> empleados;
	
	public Empresa() {this.empleados = new HashSet<Empleado>();}
	
	public Set<Empleado> getEmpleados() {return empleados;}
	public void setEmpleados(Set<Empleado> empleados) {this.empleados = empleados;}
	
	public boolean añadirEmpleado(Empleado o) {
		if (empleados.add(o))
			return true;
		else return false;
	}

	@Override
	public String toString() {
		String cad = "EMPLEADOS DE LA EMPRESA\n";
		
		for(Empleado o : empleados) {
			cad+= "\t"+o.toStringLineal() +"\n";
		}
		
		return cad;
	}
	
	public boolean buscarEmpleado(Empleado e) {
		boolean r = false;
		
		for(Empleado o : empleados) {
			if(o.getNombre().equals(e.getNombre()) && o.getFecha_nacimiento().equals(o.getFecha_nacimiento()))
				r=true;
		}
		
		return r;
	}
	
	public Empleado buscarEmpleado(String nombre, String fec) {
		Empleado r = null;
		
		for (Empleado o : empleados) {
			if(nombre.equals(o.getNombre()) && LibreriaFechasJava8.convierteStringToLocalDate(fec).equals(o.getFecha_nacimiento()))
				r = o;
		}
		
		return r;
	}
	
	public boolean borrarEmpleado(Empleado e) {
		if(empleados.remove(e))
			return true;
		else return false;
	}
	
	public Empleado borrarEmpleado(String nombre, String fec) {
		Empleado r = null;
		
		for (Empleado o : empleados) {
			if(nombre.equals(o.getNombre()) && LibreriaFechasJava8.convierteStringToLocalDate(fec).equals(o.getFecha_nacimiento())) {
				if (empleados.remove(o))
					r=o;
		}
	}
		return r;
	}
	
	public List<Empleado> ordenaSalarioNeto() {
		List<Empleado> copias = new ArrayList<Empleado>();
		copias.addAll(empleados);
		
		copias.sort(new OrdenDescendente());
		
		return copias;
	}
	
	public String toStringOrdenadaSalario() {
		List<Empleado> copias = new ArrayList<Empleado>();
		copias.addAll(ordenaSalarioNeto());
		

		
		String cad = "EMPLEADOS DE LA EMPRESA\n";
		
		for (Empleado o : copias) {
			cad+="\t" + o.getFecha_nacimiento().toString() + " " + o.getNombre() + " (Salario Neto: " + o.salarioNeto() + ")\n";
		}
		
		return cad;
	}
	
	public void agregarPlus(EmpleadoTiempoCompleto e) {
		
	}

	@Override
	public int compareTo(Empleado o) {
		Empleado o2 = null;
		int compara = o.getFecha_nacimiento().compareTo(o2.getFecha_nacimiento());
		if(compara!=0)
			return compara;
		compara = o.getNombre().compareTo(o2.getNombre());
		
		return compara;
	}
	
	
	


	
	
	
	
	
	
	
}
