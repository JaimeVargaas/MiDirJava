package ExamenAlum;

public enum EnumPlus {
	
	ACTIVIDAD(50),
	ASISTENCIA(30),
	FLEXIBILIDAD(60), 
	BENEFICIOS_EXTRAS(100),
	FORMACION(80),
	RESIDENCIA(200),
	TRABAJO_FIN_DE_SEMANA(250),
	NOCTURNIDAD(100);
	
	private int su;
	
	EnumPlus(int i) {
		this.su = i;
	}
	
	public int getPlus() {return su;}
	
}
