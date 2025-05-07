package PrPrac26;

public enum enumDescuento {
	menor7Años("Menor de 7 años"),menor12Años("Menor de 12"),
	menor18Años("Menor de 18 años"), jubilado ("Jubilado"), 
	universitario("Universitario"), desempleado("Desempleado"),
	sinDescuento("Sin descuento"); 
	
	private String desc;
	
	enumDescuento(String d) {
		this.desc=d;
	}
	
	public String getDescripcion() {
		return desc;
	}
}
