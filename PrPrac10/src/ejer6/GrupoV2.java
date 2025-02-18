package ejer6;

import java.util.*;

public class GrupoV2 extends LinkedList<Alumno> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7473028938181569368L;

	@Override
	public String toString() {
		String cad = "\nLista de clase" + "\n-----------------------\n";
		
		for (Alumno alumnoClase : this) {
			cad = cad + alumnoClase.toString();
		}
		
		return cad;
	}
}
