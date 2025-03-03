package prac13;

import java.util.*;

public class Clasificacion {

	private List<Equipo> equipos;
	private List<Partido> partidos;
	
	public Clasificacion(List<Equipo> equipos, List<Partido> partidos) {
		this.equipos = new LinkedList<Equipo>();
		this.partidos = new LinkedList<Partido>();
		
	}
	
	private boolean anadirEquipo(Equipo e) {
		return this.equipos.add(e);
	}
	
	private void anadirPartido(Partido p) {
		Equipo local = buscarEquipo(p.getNombre1());
		Equipo visitante = buscarEquipo(p.getNombre2());
		
		this.partidos.add(p);
		
		if(p.getGolesAnfitrion()>p.getGolesVisitante()) {
			local.setPartidosGanados(local.getPartidosGanados()+1);
			visitante.setPartidosPerdidos(visitante.getPartidosPerdidos()+1);
		}

		else if (p.getGolesAnfitrion()<p.getGolesVisitante()) {
			local.setPartidosPerdidos(local.getPartidosPerdidos()+1);
			visitante.setPartidosGanados(visitante.getPartidosGanados()+1);
		}

		else {
			local.setPartidosEmpatados(local.getPartidosEmpatados()+1);
			visitante.setPartidosEmpatados(visitante.getPartidosEmpatados()+1);
		}
			
		local.setGolesFavor(local.getGolesContra()+p.getGolesAnfitrion());
		local.setGolesContra(local.getGolesContra()+p.getGolesVisitante());
		visitante.setGolesFavor(visitante.getGolesFavor()+p.getGolesVisitante());
		visitante.setGolesContra(visitante.getGolesContra()+p.getGolesVisitante());
	}
	
	private Equipo buscarEquipo(String nom) {
		Equipo res = null;
		for(Equipo e1 : this.equipos) {
			if (e1.getNombre().equalsIgnoreCase(nom))
				res = e1;
		}
		return res;
	}

	@Override
	public String toString() {
		this.equipos.sort(new OrdenAscendente());
		
		String cad = "CLASIFICACION" + 
				"\n\tPJ\tPG\tPE\tPP\tGF\tGC\tPuntos\tEquipo";
		for (Equipo e : this.equipos) {
			cad += e.toStringLineal();
		}
		
		return cad;
				
	}
	
	public String partidosFecha(String fecha) {
		LibreriaFechasJava8.convierteStringToLocalDate(fecha);
		String cad= "Partidos jugados el " + fecha;
		
		for (Partido p : partidos) {
			if(p.getFecha().equals(fecha))
				cad += "\n"+p.toString();	
		}
			
		return cad;
	}
	
}
