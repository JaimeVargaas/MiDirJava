package PrPrac25;

import java.io.Serializable;

public class Persona implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4109354817451661327L;
	/**
	 * 
	 */
	private String nombre, apellido,telefono;

	public Persona(String nombre, String apellido, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + "]";
	}
	
	
	
}
