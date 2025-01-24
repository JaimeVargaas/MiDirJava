package EjerJamones;

public class Cerdos {
	private String numIdentificativo;
	private Granja gran;
	private double pesoArroba;
	private String raza;
	private char sexo;
	private Metodos met;
	
	public Cerdos(String numIdentificativo, Granja nombre, double pesoArroba, char sexo) {
		super();
		this.numIdentificativo = numIdentificativo;
		this.gran = nombre;
		this.pesoArroba = pesoArroba;
		this.raza = "Blanca";
		this.sexo = sexo;
	}

	public String getNumIdentificativo() {return numIdentificativo;}
	public void setNumIdentificativo(String numIdentificativo) {this.numIdentificativo = numIdentificativo;}
	public Granja getNombre() {return gran;}
	public void setNombre(Granja nombre) {this.gran = nombre;}
	public double getPesoArroba() {return pesoArroba;}
	public void setPesoArroba(double pesoArroba) {this.pesoArroba = pesoArroba;}
	public String getRaza() {return raza;}
	public void setRaza(String raza) {this.raza = raza;}
	public char getSexo() {return sexo;}
	public void setSexo(char sexo) {this.sexo = sexo;}
	public Metodos getMet() {return met;}
	public void setMet(Metodos met) {this.met = met;}
	
	
	public double precio() {
		double precio = ;
		if (this.sexo == "H") 
			
	}
	
	
	
	
	
	
	
	
}
