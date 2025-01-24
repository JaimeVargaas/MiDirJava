package EjerEdificios;

public class Colegio extends Edificio {
	
	private byte numClases;
	private byte numOficinas;
	
	public Colegio(Direccion dirEdificio, short numHabitaciones, byte numPlantas, float area, byte numClases,
			byte numOficinas) {
		super(dirEdificio, numHabitaciones, numPlantas, area);
		this.numClases = numClases;
		this.numOficinas = numOficinas;
	}

	public byte getNumClases() {return numClases;}
	public byte getNumOficinas() {return numOficinas;}

	public void setNumClases(byte numClases) {this.numClases = numClases;}
	public void setNumOficinas(byte numOficinas) {this.numOficinas = numOficinas;}
	
	@Override
	public float calculaIBI() {
		
		float ibiEdificio = super.calculaIBI();
		return (ibiEdificio > 500 ? (ibiEdificio - 500) : 0);
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\n\tNúmero de clases: " + this.numClases +
				"\n\tNúmero de oficinas: " + this.numOficinas;
	}
	
	
}
