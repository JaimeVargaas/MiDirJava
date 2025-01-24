package jamon;


public class Cerdo {
	
	//variables de instancia 
	private String num_identificativo;
	private Granja gran;
	private double peso_arroba;
	private char sexo;
	private String raza;
	private Metodos met;
	
	
		//nos falta lo de tipo de iberico no entendemos
	
	//Contructor 
	public Cerdo(String ni, Granja g, double pa, char s) {
		super();
		this.num_identificativo = ni;
		this.gran = g;
		this.peso_arroba = pa;
		this.sexo = s;
		this.raza = "blanca";
	}
	
	//getters and setters

	public String getNum_identificativo() {return num_identificativo;}
	public void setNum_identificativo(String num_identificativo) {this.num_identificativo = num_identificativo;}


	public Granja getGran() {return gran;}
	public void setGran(Granja gran) {this.gran = gran;}

	public double getPeso_arroba() {return peso_arroba;}
	public void setPeso_arroba(double peso_arroba) {this.peso_arroba = peso_arroba;}

	public String isRaza() {return raza;}
	public void setRaza(String raza) {this.raza = "blanca";}


	public char getSexo() {return sexo;}
	public void setSexo(char sexo) {this.sexo = sexo;}
	
	
	
	//metodo para hembra y macho
	public String sex() {
		if(this.sexo=='H') {
			return "Hembra";
		}
		else {
			return "macho";
		}
	}
	
	
	//Metodo de precio 
	public double Precio() {
		float precio=(float) this.gran.getPrecio();
		
		if(this.sexo=='H') {
			precio+=2;
		}
		
		else if(gran.getDenominacion()==true) {
			precio+=7;
		}
		
		return precio;
	
	}
	
	//Metood toString 
	@Override 
	public  String toString() {
		return "\nIdentificacion:"+this.num_identificativo+
				"\nProcedencia:"+gran.toString()+
				"\nPeso:"+this.peso_arroba +"("+met.arrobas_kilos(peso_arroba)+")"+
				"\nPrecio por arroba:"+met.PrecioArrobas((float) Precio())+
				"\nSexo:"+sex()+
				"\nRaza:"+this.raza;
	}
	
	//Meto equals -- identificación y su sexo.
	@Override 
	public boolean equals(Object ob) {
		Cerdo miCerdo= (Cerdo)ob;

		if(this.num_identificativo.equals(miCerdo.num_identificativo)&& this.sexo ==miCerdo.sexo) {
			return true;
		}
		return false;
		
	}
	
	

}
