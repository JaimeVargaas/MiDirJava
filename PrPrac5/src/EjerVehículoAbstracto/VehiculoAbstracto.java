package EjerVehículoAbstracto;

public abstract class VehiculoAbstracto {
	
	private String color;
	private byte numRuedas;
	private short cilindrada;
	private short potencia;
	
	public VehiculoAbstracto(String color) {
		this.color = color;}

	public VehiculoAbstracto(byte numRuedas) {
		this.numRuedas = numRuedas;}
	
	public VehiculoAbstracto(short cilindrada) {
		this.cilindrada = cilindrada;}
	
	public VehiculoAbstracto(String color, byte numRuedas) {
		this.color = color;
		this.numRuedas = numRuedas;}
	
	public VehiculoAbstracto(String color,byte numRuedas, short cilindrada) {
		this.numRuedas = numRuedas;}
	
	public VehiculoAbstracto(String color, byte numRuedas, short cilindrada, short potencia) {
		this.color = color;
		this.numRuedas = numRuedas;
		this.cilindrada = cilindrada;
		this.potencia = potencia;}

	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}
	public byte getNumRuedas() {return numRuedas;}
	public void setNumRuedas(byte numRuedas) {this.numRuedas = numRuedas;}
	public short getCilindrada() {return cilindrada;}
	public void setCilindrada(short cilindrada) {this.cilindrada = cilindrada;}
	public short getPotencia() {return potencia;}
	public void setPotencia(short potencia) {this.potencia = potencia;}

	@Override
	public String toString() {
		return "VehiculoAbstracto [color=" + color + ", numRuedas=" + numRuedas + ", cilindrada=" + cilindrada
				+ ", potencia=" + potencia + "]";
	}

	public abstract float impuesto();
	
	
}
