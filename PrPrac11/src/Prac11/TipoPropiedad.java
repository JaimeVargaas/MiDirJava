package Prac11;

public enum TipoPropiedad {
	local("Local comercial"), 
	aparcamiento("Plaza de aparcamiento"),
	vivienda("Vivienda"),
	finca("Finca Rústica"),
	solar("Solar");
	private String descripcion;

	TipoPropiedad(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {return descripcion;}

	

	

}
