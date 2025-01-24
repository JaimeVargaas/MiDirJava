package jamon;

public class Jamon {

	//variables de instancia 
	private Cerdo cer;
	private double peso_kilos;
	private int meses;
	private Metodos met;
	
	//constructor 
	public Jamon(Cerdo cer, double peso_kilos, int meses) {
		this.cer = cer;
		this.peso_kilos = peso_kilos;
		this.meses = meses;
	}
	
	//Metodos getter's and setter's
	public Cerdo getCer() {
		return cer;
	}

	public void setCer(Cerdo cer) {
		this.cer = cer;
	}

	public double getPeso_kilos() {
		return peso_kilos;
	}

	public void setPeso_kilos(double peso_kilos) {
		this.peso_kilos = peso_kilos;
	}

	public int getMeses() {
		return meses;
	}

	public void setMeses(int meses) {
		this.meses = meses;
	}
	
	//Metodo que te diga si es de bodega, reserva o gran reserva 
	
	public String Tipo() {
		
		 if(this.meses>=12) {
			return "Jamon de reserva";
		}
		else if(this.meses>=15) {
			return "Jamon gran reserva";
			
		}
		 return "Bodega";
	}
	
	//
	
	
	//Metodo calculo dinero 2
	public double Dinero2() {
		double precio = met.PrecioKilos((float) this.cer.Precio());
		
		if(this.meses>=9 && this.meses<=12) {
			return precio+=10;
		}
		else if(this.meses>=13 && this.meses<=15) {
			return precio+=20;
		}
		
		return precio+=50;
		
	}
	
	
	
	
	//Metodo toString redefinido
	@Override 
	public String toString() {
		return "Tipo de raza:"+cer.sex()+"\n\tPeso:"+this.peso_kilos+"\n\tMeses de curacion"+this.meses+"("+this.Tipo()+")"
				+"\n\tPrecio jamon:"+met.desglose(this.Dinero2());
		
	}
	
	
	
}
