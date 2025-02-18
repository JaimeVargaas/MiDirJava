package ejer6;

import java.util.*;

public class Grupo {
	// Variables de instancia
	private List<Alumno> miGrupo;

	public Grupo() {
		this.miGrupo = new LinkedList<Alumno>();
	}
	
	public boolean añadeAlumno(Alumno alum) {
		return this.miGrupo.add(alum);
	}

	public List<Alumno> getMiGrupo() {return miGrupo;}
	public void setMiGrupo(List<Alumno> miGrupo) {this.miGrupo = miGrupo;}

	@Override
	public String toString() {
		String cad = "\nLista de clase" + "\n-----------------------\n";
		
		for (Alumno alumnoClase : miGrupo) {
			cad = cad + alumnoClase.toString();
		}
		
		return cad;
	}
	

}

