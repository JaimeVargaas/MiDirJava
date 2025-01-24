package EjerEdificios;

public class Casa extends Edificio{
	
	private byte numDormitorios;
	private byte numBaños;
	
	public Casa(Direccion dirEdificio, short numHabitaciones, byte numPlantas, float area, byte numDormitorios, byte numBaños) {
		super(dirEdificio, numHabitaciones, numPlantas, area);
		
		this.numDormitorios = numDormitorios;
		this.numBaños = numBaños;
	}
	
	public Casa(String nomCalle, int numero, String codPostal,
				short numHabitaciones, byte numPlantas,
				float area, byte numDormitorios, byte numBaños) {
		
		this(new Direccion (nomCalle,numero,codPostal),
				numHabitaciones, numPlantas, area,numDormitorios,numBaños);
	}

	public byte getNumDormitorios() {return numDormitorios;}
	public byte getNumBaños() {return numBaños;}
	
	public void setNumDormitorios(byte numDormitorios) {this.numDormitorios = numDormitorios;}
	public void setNumBaños(byte numBaños) {this.numBaños = numBaños;}
	
	@Override
	// Se calcula igual, pero se suman 10 por cada baño
	
	public float calculaIBI() {
		return super.calculaIBI() + this.numBaños * 10;
	}
	
	
	// Redefinir tostring de la clase edificio
	@Override 
	public String toString() {
		return super.toString() +
				"\n\tNúmero de dormitorios: " + this.numDormitorios +
				"\n\tNúmero de baños: " + this.numBaños;
	}
	
}
