package EjerVehículoAbstracto;

public abstract class Camion extends VehiculoAbstracto {
	
	private byte numEjes;

	public Camion(byte numRuedas) {
		super(numRuedas);}

	public Camion(String color, byte numRuedas) {
		super(color, numRuedas);}

	public Camion(String color, byte numRuedas, short cilindrada) {
		super(color, numRuedas, cilindrada);}

	public Camion(String color, byte numRuedas, short cilindrada, short potencia) {
		super(color, numRuedas, cilindrada, potencia);}

	public Camion(String color, byte numRuedas, short cilindrada, short potencia, byte numEjes) {
		super(color, numRuedas, cilindrada, potencia);
		this.numEjes = numEjes;}
		
	public byte getNumEjes() {return numEjes;}
	public void setNumEjes(byte numEjes) {this.numEjes = numEjes;}

	@Override
	public String toString() {
		return "Camion [numEjes=" + numEjes + ", toString()=" + super.toString() + "]";
	}

	public float impuesto(float cilindrada, int potencia, int numRuedas, short numEjes) {
		cilindrada = (super.getCilindrada()/30);
		potencia = (super.getPotencia()*20);
		numRuedas = (super.getNumRuedas()*20);
		numEjes = (short)(this.numEjes*50);
		return (cilindrada + potencia + numRuedas + numEjes);
	}
	

	

	



	
	
}
