package vinos;

public class Vino {
	
	/*
	 * sobre el cual queremos conocer la siguiente información: su nombre, la cosecha de la que
	procede, el enólogo responsable de su elaboración, la maduración (en meses), el tipo de vino (blanco,
	rosado o tinto) y la graduación alcohólica que tiene.
	 */
	
	//variables de instancia 
	private String nombreVino;
	private Vendimia ven;
	private Enologo eno;
	private int maduracion;
	private String tipoVino;
	private float alcohol;
	private Metodos met;
	
	
	//variables fijas 
	private static final double iva = 0.21;
	private static final double menos15 = 38.48;
	private static final double mas15 = 64.13;
	
	
	//Constructor 
	public Vino(String nombreVino, Vendimia ven, Enologo eno, int maduracion, String tipoVino, float alcohol) {
		super();
		this.nombreVino = nombreVino;
		this.ven = ven;
		this.eno = eno;
		this.maduracion = maduracion;
		this.tipoVino = tipoVino;
		this.alcohol = alcohol;
	}

	
	//getters and setters
	
	public String getNombreVino() {return nombreVino;}
	public void setNombreVino(String nombreVino) {this.nombreVino = nombreVino;}

	public Vendimia getVen() {return ven;}
	public void setVen(Vendimia ven) {this.ven = ven;}

	public Enologo getEno() {return eno;}
	public void setEno(Enologo eno) {this.eno = eno;}

	public int getMaduracion() {return maduracion;}
	public void setMaduracion(int maduracion) {this.maduracion = maduracion;}

	public String getTipoVino() {return tipoVino;}
	public void setTipoVino(String tipoVino) {this.tipoVino = tipoVino;}

	public float getAlcohol() {return alcohol;}
	public void setAlcohol(float alcohol) {this.alcohol = alcohol;}

	public static double getIva() {return iva;}
	public static double getMenos15() {return menos15;}
	public static double getMas15() {return mas15;}
	
	
	
	//Metodo que clasifique los vinos 
	//Joven, Crianza, Reserva y Gran Reserva.

	private String clasificacionVinos() {

		switch(tipoVino) {
		case"Tinto"->{
			if(this.maduracion>=24) {
				return"Crianza";
			}
			else if(this.maduracion>=36) {
				return " Reserva ";
			}
			else if(this.maduracion>=60) {
				return" Gran reserva";
			}
			else {
				return " Joven";
			}

		}
		case "Blanco" ,"Rosado" ->{
			if(this.maduracion>=18) {
				return"Crianza";
			}
			else if(this.maduracion>=24) {
				return "Reserva";
			}
			else if(this.maduracion>=48) {
				return"Gran reserva";
			}
			else {
				return "Joven";
			}
		}

		default ->{
			return "Error";
		}


		}

	}

	
	//Metodo que calcule el precio en bruto
	public double precioBruto() {
		double precio =0;
		
		//0.10 centimos por mes de maduracion
		precio+=(this.maduracion*0.10);
		
		//metodo de la uva
		if(ven.isUva()==true) {
			precio+=1.20;
		}
		else {
			precio +=1.50;
		}
		
		//Si la recogida de la uva es manual, su coste se incrementa en 3€, pero si es mecánica, solo se
		//incrementa en 50 céntimos.
		if(ven.isRecogida()==true) {
			precio+=0.50;
		}else {
			precio+=3;
		}
		
		//También habrá que sumar un 3% de la minuta por hora que cobra el enólogo responsable.
		precio+=(eno.getMinuta()*0.3);
		
		
		
		return precio;
		
	}
	
	//Método que calcule el precio de venta del vino, es decir, tras aplicarle los impuestos anteriormente explicados.
	public double VentaVino() {
		double precioVi= precioBruto();
		
		precioVi+=(precioVi*iva);
		
		if(alcohol<15) {
			precioVi+=menos15;
		}else {
			precioVi+=mas15;
		}
		return precioVi;
	}
	
	//Metodo toString redefinido 
	
	@Override
	public String toString() {
		return "Vino: "+this.nombreVino+"-"+this.tipoVino+" "+this.clasificacionVinos()+
				"\n\tVendimia:"+ven.toString()+
				"\n\tEnologo:"+eno.toString()+
				"\n\tMaduracion en meses:"+this.maduracion+
				"\n\tGraduacion:"+this.alcohol+
				"\n\tPrecio Bruto:"+met.Desglose(this.precioBruto());
	}
	

	

}
