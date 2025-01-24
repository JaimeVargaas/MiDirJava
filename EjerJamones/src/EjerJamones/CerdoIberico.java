package EjerJamones;

public class CerdoIberico extends Cerdos{
	private String tipo;

	public CerdoIberico(String numIdentificativo, Granja nombre, double pesoArroba, String raza, char sexo,
			String tipo) {
		super(numIdentificativo, nombre, pesoArroba, sexo);
		super.setRaza("Ibérico");
		this.tipo = tipo;
	}
	
	
}
