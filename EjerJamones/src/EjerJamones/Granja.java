package EjerJamones;

public class Granja {
	public String nombre;
	public boolean denominacionDeOrigen;
	public double precio;
	
	public Granja(String nombre, boolean denominacionDeOrigen, double precio) {
		super();
		this.nombre = nombre;
		this.denominacionDeOrigen = denominacionDeOrigen;
		this.precio = precio;
	}

	public Granja(String nombre) {
		super();
		this.nombre = nombre;
		this.denominacionDeOrigen = false;
		this.precio = 15;
	}
	
	public String origen() {
		if (this.denominacionDeOrigen==true)
			return "con denominación de origen";
		else 
			return "sin denominación de origen";
	}

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public boolean isDenominacionDeOrigen() {return denominacionDeOrigen;}
	public void setDenominacionDeOrigen(boolean denominacionDeOrigen) {this.denominacionDeOrigen = denominacionDeOrigen;}
	public double getPrecio() {return precio;}
	public void setPrecio(double precio) {this.precio = precio;}

	@Override
	public String toString() {
		return this.nombre + ", "+ this.origen() + " - Precio base @: " + this.precio;
	}
	
	
	
	
	
	
}
