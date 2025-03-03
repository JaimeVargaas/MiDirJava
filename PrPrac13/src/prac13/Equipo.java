package prac13;

import java.util.Objects;

public class Equipo {

	private String nombre;
	private int partidosGanados,partidosEmpatados,partidosPerdidos;
	private int golesFavor,golesContra;
	
	public Equipo(String nombre) {
		this.nombre = nombre;
		this.partidosGanados = 0;
		this.partidosEmpatados = 0; 
		this.partidosPerdidos = 0;
		this.golesFavor = 0;
		this.golesContra = 0;
	}

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	public int getPartidosGanados() {return partidosGanados;}
	public void setPartidosGanados(int partidosGanados) {this.partidosGanados = partidosGanados;}

	public int getPartidosEmpatados() {return partidosEmpatados;}
	public void setPartidosEmpatados(int partidosEmpatados) {this.partidosEmpatados = partidosEmpatados;}

	public int getPartidosPerdidos() {return partidosPerdidos;}
	public void setPartidosPerdidos(int partidosPerdidos) {this.partidosPerdidos = partidosPerdidos;}
	
	public int getGolesFavor() {return golesFavor;}
	public void setGolesFavor(int golesFavor) {this.golesFavor = golesFavor;}

	public int getGolesContra() {return golesContra;}
	public void setGolesContra(int golesContra) {this.golesContra = golesContra;}
	
	
	public int partidosJugados() {
		return (this.partidosGanados + this.partidosEmpatados + this.partidosPerdidos); 
	}
	
	public int puntosTotales() {
		return ((this.partidosGanados * 3) + this.partidosEmpatados);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(nombre.toLowerCase(), other.nombre.toLowerCase());
	}
	
	public static boolean comparaNombreClase(String nom1, String nom2){
        if (nom1 == nom2) {
            return true;
        }
        return false;
    }
	
	public void partidoGanado() {this.partidosGanados++;}
	public void partidoEmpatado() {this.partidosEmpatados++;}
	public void partidoPerdido() {this.partidosPerdidos++;}
	
	public void golesAFavor(int goles) {
		this.golesFavor= this.golesFavor + goles;
	}
	
	public void golesEnContra(int goles) {
		this.golesContra= this.golesContra + goles;
	}

	@Override
	public String toString() {
		return "\t" + this.getNombre() +
			   "\n\tPartidos jugados: " + this.partidosJugados() +
			   "\n\tPartidos Ganados: " + this.partidosGanados +
			   "\n\tPartidos Empatados: " + this.partidosEmpatados +
			   "\n\tPartidos Perdidos: " + this.partidosPerdidos +
			   "\n\tGoles a favor: " + this.getGolesFavor() +
			   "\n\tGoles en contra: " + this.getGolesContra() +
			   "\n\tPuntos acumulados: " + this.puntosTotales();
	}
	
	public String toStringLineal() {
		return this.partidosJugados()+ " " + this.partidosGanados + " " + this.partidosEmpatados + " " + this.partidosPerdidos + " " + this.golesFavor + " " + this.golesContra + " " + this.puntosTotales();
	}
	
	
	
}
