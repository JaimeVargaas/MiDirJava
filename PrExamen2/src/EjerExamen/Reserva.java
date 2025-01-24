package EjerExamen;

public class Reserva {
	private Cliente cli;
	private Vehiculo ve;
	private short numDias;
	private boolean seguro;
	
	public Reserva(Cliente cli, Vehiculo ve, short numDias, boolean seguro) {
		super();
		this.cli = cli;
		this.ve = ve;
		this.numDias = numDias;
		this.seguro = seguro;
	}
	
	public Cliente getCli() {return cli;}
	public void setCli(Cliente cli) {this.cli = cli;}
	public Vehiculo getVe() {return ve;}
	public void setVe(Vehiculo ve) {this.ve = ve;}
	public boolean isSeguro() {return seguro;}
	public void setSeguro(boolean seguro) {this.seguro = seguro;}
	public short getNumDias() {return numDias;}
	public void setNumDias(short numDias) {this.numDias = numDias;}

	public double pagoAlquiler() {
		double precioPorDia = ve.getPrecioPorDia() * this.numDias;
		double total = precioPorDia;
		
		if (ve.impuestoAnual()>100)
			total = total + 10;
		else 
			total = total + 5;
		
		if (seguro == true)
			total = total + (total * 0.2);
		if (cli.isVip()== true) 
			total = total - (total * 0.1);
		
		return total;
	}
	
	public boolean equals(Object ob) {	
		Reserva otraReserva = (Reserva)ob;
		
		if (this.cli.equals(otraReserva.getCli()) == true &&
			this.ve.equals(otraReserva.getVe()) == true && 
			this.numDias == (otraReserva.getNumDias()))
		    return true;
		else return false;
	}

	@Override
	public String toString() {
		return "Reserva: " + cli.getNombreCompleto() + " (DNI: " + cli.getDni() + " ) ha alquilado un " + ve.getModelo() + " por " + 
				this.numDias + " días." + " Precio total: " + this.pagoAlquiler();
	}
	
	public String toStringDetallado() {
		if (seguro == true) 
		return "Reserva: " + this.pagoAlquiler() +
				"\n\tCliente: " + cli +
				"\n\tVehiculo: " + ve +
				"\n\t\tPrecio Por día de alquiler: " + ve.getPrecioPorDia() +
				"\n\t\tImpuestos anuales: " + ve.impuestoAnual() +
				"\n\tDías de alquiler: " + this.numDias +
				"\n\tSeguro adicional: " + "Sí";
		
		else
			return "Reserva: " + this.pagoAlquiler() +
					"\n\tCliente: " + cli +
					"\n\tVehiculo: " + ve +
					"\n\t\tPrecio Por día de alquiler: " + ve.getPrecioPorDia() +
					"\n\t\tImpuestos anuales: " + ve.impuestoAnual() +
					"\n\tDías de alquiler: " + this.numDias +
					"\n\tSeguro adicional: " + "No";
	}
	
	
	


	
	
}
