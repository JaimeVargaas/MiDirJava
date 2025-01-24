package EjerCoche;

public class Coche {
	
	private String Modelo;
	private String Fabricante;
	private float Precio;
	public byte piva;
	
	// Constructores
	public Coche() {
	}
	
	public Coche(String m, String f, float pr, byte por) {
		this.Modelo=m;
		this.Fabricante=f;
		this.Precio=pr;
		this.piva=por;
	}
	
	public Coche(String m, String f, float pr) {
		this.Modelo=m;
		this.Fabricante=f;
		this.Precio=pr;
		this.piva=21;
	}
	
	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getFabricante() {
		return Fabricante;
	}

	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}

	public float getPrecioSinIva() {
		return Precio;
	}

	public void setPrecioSinIva(float precioSinIva) {
		Precio = precioSinIva;
	}

	public byte getPorcentajeDeIva() {
		return piva;
	}

	public void setPorcentajeDeIva(byte porcentajeDeIva) {
		piva = porcentajeDeIva;
	}

	
	// Metodo de objeto
	public void consulta() {
		System.out.println(this.toString());
	}
	
	private float precioReal() {
		return Precio + (Precio*piva)/100;
	}
	
	public void actualizarPrecio(byte porcentaje) {
		    double factor = 1 + (porcentaje / 100);
		    this.piva = (byte) (this.piva * factor);
	}

	public boolean equals(Object ob) {	
		Coche otroCoche = (Coche)ob;
		
		if (this.Fabricante.equals(otroCoche.getFabricante()) == true &&
			this.Modelo.equals(otroCoche.getModelo()) == true)
		    return true;
		else 
			return false;
	}
	
	@Override
	public String toString() {
		return "El modelo del coche es " + Modelo + ", el fabricante es "
				+ Fabricante + ", el precio es " + Precio + ", y el porcentaje del iva es " + piva;
	}
	
	
	
	
	
}
