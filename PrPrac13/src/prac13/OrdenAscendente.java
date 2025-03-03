package prac13;
import java.util.Comparator;


public class OrdenAscendente implements Comparator<Equipo> {

	@Override
	public int compare(Equipo o1, Equipo o2) {
		int compareCodigo = Integer.compare(o2.puntosTotales(), o1.puntosTotales());
		
		if (compareCodigo==0)
			compareCodigo = Integer.compare((o2.getGolesFavor()-o2.getGolesContra()), (o1.getGolesFavor()-o1.getGolesContra()));
		
		if(compareCodigo==0)
			compareCodigo = o2.getNombre().compareTo(o1.getNombre());
		
		return compareCodigo;
	}


}