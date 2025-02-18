package Prac11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Inmobiliaria implements GestionInmobiliaria{
	 List<Propiedad> prop = new ArrayList<>();
	 
	 
	public Inmobiliaria(List<Propiedad> prop) {
		super();
		this.prop = prop;
	}
	
	public Inmobiliaria() {
		 List<Propiedad> prop = new ArrayList<>();
	}

	public List<Propiedad> getProp() {return prop;}
	public void setProp(List<Propiedad> prop) {this.prop = prop;}

	@Override
	public String toString() {
		return "Inmobiliaria [prop=" + prop + "]";
	}

	@Override
	public boolean añade(Propiedad ob) {
		return false;
	}

	@Override
	public Propiedad buscar(int cod) {
		return null;
	}

	@Override
	public boolean buscar(Propiedad p) {
		return false;}
	
	@Override
	public boolean borra(int cod) {
		return false;
	}
	
	
	List<Propiedad> getPropiedadesOrdenPrecio() {
		 List<Propiedad> newProp = new ArrayList<Propiedad>(prop);
		 
		 // newProp.addAll(prop);
		 newProp.sort(new Comparator<Propiedad>() {	 
			 
			 
			@Override
			public int compare(Propiedad o1, Propiedad o2) {
				return Double.compare(o1.getPrecio(), o2.getPrecio());
			}
		 });
		 
		 return newProp;
	}
	
	
	String getPropiedadesOrdenPrecioString() {
		 String cad= "\nLISTA ORDENADA POR PRECIO" ;
		 List<Propiedad>lista=this.getPropiedadesOrdenPrecio();
		 
		 for(Propiedad p : lista) {
			 cad += p.getCodigo() + " - " + p.getPrecio() + " - " + p.getTipo() + "\n";
		 }
		 
		 return cad;
				 
					
					
				
	}
	

}
	
