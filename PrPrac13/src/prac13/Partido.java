package prac13;

import java.time.LocalDate;

public class Partido {
	private String nombre1;
	private String nombre2;
	private LocalDate fecha;
	private int golesAnfitrion;
	private int golesVisitante;
	private String resultado;

	public Partido(String nombre1, String nombre2, String fecha, String resultado) {
		super();
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.fecha = LibreriaFechasJava8.convierteStringToLocalDate(fecha);
		
		String[] goles = resultado.split("-");
        this.golesAnfitrion = Integer.parseInt(goles[0]); 
        this.golesVisitante = Integer.parseInt(goles[1]);
	}
	public String getNombre1() {return nombre1;}
	public void setNombre1(String nombre1) {this.nombre1 = nombre1;}
	
	public String getNombre2() {return nombre2;}
	public void setNombre2(String nombre2) {this.nombre2 = nombre2;}

	public LocalDate getFecha() {return fecha;}
	public void setFecha(LocalDate fecha) {this.fecha = fecha;}
	
	public int getGolesAnfitrion() {return golesAnfitrion;}
	public void setGolesAnfitrion(int golesAnfitrion) {this.golesAnfitrion = golesAnfitrion;}
	public int getGolesVisitante() {return golesVisitante;}
	public void setGolesVisitante(int golesVisitante) {this.golesVisitante = golesVisitante;}
	
	public String resultado() {
		if (this.golesAnfitrion > this.golesVisitante)
			return "1";
		else if (this.golesAnfitrion < this.golesVisitante)
			return "2";
		else 
			return "X";
	}

	@Override
	public String toString() {
		return this.getNombre1() + this.getGolesAnfitrion() + "," + this.getNombre2() + this.getGolesVisitante();
	}
	
	
	
}
