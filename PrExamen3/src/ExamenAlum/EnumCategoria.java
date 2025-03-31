package ExamenAlum;

public enum EnumCategoria {
	
	PROGRAMADOR_JUNIOR(1500), 
	PROGRAMADOR_SENIOR(2000) ,
	JEFE_DE_EQUIPO(2500),
	ANALISTA(2800),
	JEFE_DE_PROYECTO(3500);

	private int su;
	
	EnumCategoria(int i) {
		this.su = i;
	}
	
	public int getSueldo() {return su;}
	
}
