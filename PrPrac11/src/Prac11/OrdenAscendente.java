package Prac11;
import java.util.Comparator;


public class OrdenAscendente implements Comparator<Propiedad> {
	
	@Override
	public int compare(Propiedad o1, Propiedad o2) {
		int compareCodigo = o2.getCodigo() - (o1.getCodigo());
		
		return compareCodigo;
	}


}