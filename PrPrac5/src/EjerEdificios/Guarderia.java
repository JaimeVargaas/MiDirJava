package EjerEdificios;

public class Guarderia extends Colegio{

	private float areaJuegos;

	public Guarderia(Direccion dirEdificio, short numHabitaciones, byte numPlantas, float area, byte numClases,
			byte numOficinas, float areaJuegos) {
		super(dirEdificio, numHabitaciones, numPlantas, area, numClases, numOficinas);
		this.areaJuegos = areaJuegos;
	}

	public float getAreaJuegos() {return areaJuegos;}
	public void setAreaJuegos(float areaJuegos) {this.areaJuegos = areaJuegos;}
	
	@Override
	public float calculaIBI() {
		return 0;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\n\tArea de juegos: " + this.areaJuegos;
	}
	
	public void saluda() {
		System.out.println("Hola, soy un método de la clase guardería");
	}
	
}
