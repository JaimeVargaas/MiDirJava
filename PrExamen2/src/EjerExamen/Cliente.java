package EjerExamen;

public class Cliente {

	private String nombreCompleto;
	private String dni;
	private String numTelefono;
	private boolean vip = false;
	
	public Cliente(String nombreCompleto, String dni, String numTelefono) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.dni = dni;
		this.numTelefono = numTelefono;}

	public Cliente(String nombreCompleto, String dni) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.dni = dni;}

	public String getNombreCompleto() {return nombreCompleto;}
	public void setNombreCompleto(String nombreCompleto) {this.nombreCompleto = nombreCompleto;}
	public String getDni() {return dni;}
	public void setDni(String dni) {this.dni = dni;}
	public String getNumTelefono() {return numTelefono;}
	public void setNumTelefono(String numTelefono) {this.numTelefono = numTelefono;}
	public boolean isVip() {return vip;}
	public void setVip(boolean vip) {this.vip = vip;}

	@Override
	public String toString() {
		if (vip == false)
			return "Cliente: " + nombreCompleto + " (DNI: " + dni + ", Tlf.: " + numTelefono + " - NO VIP)";
		else
			return "Cliente: " + nombreCompleto + " (DNI: " + dni + ", Tlf.: " + numTelefono + " - VIP)";
	}
	
	public boolean equals(Object ob) {	
		Cliente otroCliente = (Cliente)ob;
		
		if (this.dni.equals(otroCliente.getDni())==true)
		    return true;
		else 
			return false;
	}

	
	
	
	
	
	
	
	
	
}
