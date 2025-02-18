package Prac11;

import java.util.Objects;

public class Propiedad {

	private int codigo;
	private TipoPropiedad tipo;
	private String direccion;
	private double metros;
	private String descripcion;
	private double precio;
	
	public Propiedad(int codigo, TipoPropiedad tipo, String direccion, double metros,
			String descripcion, double precio) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.direccion = direccion;
		this.metros = metros;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	public int getCodigo() {return codigo;}
	public void setCodigo(int codigo) {this.codigo = codigo;}
	
	public TipoPropiedad getTipo() {return tipo;}
	public void setTipo(TipoPropiedad tipo) {this.tipo = tipo;}
	
	public String getDireccion() {return direccion;}
	public void setDireccion(String direccion) {this.direccion = direccion;}
	
	public double getMetros() {return metros;}
	public void setMetros(double metros) {this.metros = metros;}
	
	public String getDescripcion() {return descripcion;}
	public void setDescripcion(String descripcion) {this.descripcion = descripcion;}
	
	public double getPrecio() {return precio;}
	public void setPrecio(double precio) {this.precio = precio;}
	
	
	public double beneficio() {
		return (this.getPrecio() * 0.0075 + 150);
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Propiedad other = (Propiedad) obj;
		return codigo == other.codigo;
	}

	@Override
	public String toString() {
		return tipo.getDescripcion().toUpperCase() +
				"\n\tBeneficio obtenido: " + beneficio() +
				"\n\tSuperficie: " + this.metros +
				"\n\tDescripción: " + this.descripcion  +
				"\n\tDirección: " + this.direccion + 
				"\n\tPrecio: " + this.precio;
				
	}
	
	
	
	
	
	
}
