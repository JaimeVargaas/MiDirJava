package EjerVehículoAbstracto;

public abstract class Motocicleta extends VehiculoAbstracto {
	
	public byte numOcupantes;
	private static final byte numRuedasMoto = (byte) 2;
	
	public Motocicleta() {
		super(numRuedasMoto);}

	public Motocicleta(byte numOcupantes) {
		super(numRuedasMoto);
		this.numOcupantes = numOcupantes;}

	public Motocicleta(String color) {
		super(color);}

	public Motocicleta(String color, short cilindrada) {
		super(color, numRuedasMoto, cilindrada);}

	public Motocicleta(String color, short cilindrada, short potencia) {
		super(color, numRuedasMoto, cilindrada, potencia);}

	public byte getNumOcupantes() {return numOcupantes;}
	public void setNumOcupantes(byte numOcupantes) {this.numOcupantes = numOcupantes;}
	public static byte getNumruedasmoto() {return numRuedasMoto;}

	@Override
	public String toString() {
		return "Motocicleta [numOcupantes=" + numOcupantes + ", toString()=" + super.toString() + "]";
	}

	public float impuesto() {
		return ((super.getCilindrada()/30)+(super.getPotencia()*30));}
	
	
	

	
	
	
	
	
	
	
	
}
