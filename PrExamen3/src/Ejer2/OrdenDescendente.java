package Ejer2;

import java.util.Comparator;

public class OrdenDescendente implements Comparator<Empleado>{

	@Override
	public int compare(Empleado o1, Empleado o2) {
		int compare = Float.compare(o1.salarioNeto(), o2.salarioNeto());
		return compare;
	}

	
}
