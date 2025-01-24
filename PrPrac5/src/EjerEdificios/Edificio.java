package EjerEdificios;

/*
 * Edificio: almacena información sobre su direccion, el número de habitaciones, el número de plantas
	y el área total de un determinado edificio. 
 */

public class Edificio {

	private Direccion dirEdificio; // Composicion
	private short numHabitaciones;
	private byte numPlantas;
	private float area;
	
	public Edificio(Direccion dirEdificio, short numHabitaciones, byte numPlantas, float area) {
		super();
		this.dirEdificio = dirEdificio;
		this.numHabitaciones = numHabitaciones;
		this.numPlantas = numPlantas;
		this.area = area;
	}
	
	public Edificio(String nomCalle, int numero, String codPostal,
				    short numHabitaciones, byte numPlantas, float area) {
		this(new Direccion(nomCalle, numero,codPostal), numHabitaciones, numPlantas, area);
	}

	public Direccion getDirEdificio() {return dirEdificio;}
	public short getNumHabitaciones() {return numHabitaciones;}
	public byte getNumPlantas() {return numPlantas;}
	public float getArea() {return area;}

	public void setDirEdificio(Direccion dirEdificio) {this.dirEdificio = dirEdificio;}
	public void setNumHabitaciones(short numHabitaciones) {this.numHabitaciones = numHabitaciones;}
	public void setNumPlantas(byte numPlantas) {this.numPlantas = numPlantas;}
	public void setArea(float area) {this.area = area;}

	
	public float calculaIBI() {
		return (this.area * 1.2f) + (this.numPlantas * 100);
	}
	
	
	@Override
	public String toString() {
		return  "\n"+this.getClass().getSimpleName().toUpperCase() +
				"\n\tIBI: " + this.calculaIBI() +
				"\n\tDireccón: " + this.dirEdificio.toString() +
				"\n\tArea: " + this.area +
				"\n\tNúmero de plantas: " + this.numPlantas + 
				"\n\tNúmero de habitaciones: " + this.numHabitaciones;
	}
	
	
}
