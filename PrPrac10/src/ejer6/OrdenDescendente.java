package ejer6;

import java.util.*;

public class OrdenDescendente implements Comparator<Alumno> {
	
	@Override
	public int compare(Alumno o1, Alumno o2) {
		int compareApellido1 = o1.getApellido1().compareTo(o2.getApellido1());
		
		return compareApellido1!=0?compareApellido1:o1.getDni().compareTo(o2.getDni());
	}


}
