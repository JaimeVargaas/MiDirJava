package EjerEdificios;

public class Direccion {

	/* 
	 * Variables de instancia
	 */
	private String nomCalle;
	private int numero;
	private String codPostal;
	
	public Direccion(String nomCalle, int numero, String codPostal) {
		super();
		this.nomCalle = nomCalle;
		this.numero = numero;
		this.codPostal = codPostal;
	}

	public String getNomCalle() {return nomCalle;}
	public void setNomCalle(String nomCalle) {this.nomCalle = nomCalle;}
	public int getNumero() {return numero;}
	public void setNumero(int numero) {this.numero = numero;}
	public String getCodPostal() {return codPostal;}
	public void setCodPostal(String codPostal) {this.codPostal = codPostal;}
	
	@Override
	public String toString() {
		return this.nomCalle + ", " + this.numero + " - " + this.codPostal;
	}
	
	
	
}
