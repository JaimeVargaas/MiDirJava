package Prac11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
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
		boolean conf=true;
		for(Iterator<Propiedad> ite = prop.iterator();ite.hasNext();) {
			if(ite.next().getCodigo()==ob.getCodigo()) {
				return conf;
			}
		}
		if(conf) {
			prop.add(ob);
			return conf;
		}else {return conf;}
	}

	@Override
	public Propiedad buscar(int cod) {
		Propiedad pr= new Propiedad(1,TipoPropiedad.local,"", 29,"",290000);
		Propiedad elem=null;
		for(Iterator<Propiedad> ite = prop.iterator();ite.hasNext();) {
			elem=ite.next();
			if(elem.getCodigo()==cod) {
				pr=elem;
			}
		}
		return pr;
	}

	@Override
	public boolean buscar(Propiedad p) {
		return prop.contains(p);
	}
	
	@Override
	public boolean borra(int cod) {
		Propiedad elem=null;
		Propiedad elemDelete=null;
		boolean conf=false;
		for(Iterator<Propiedad> ite = prop.iterator();ite.hasNext();) {
			elem=ite.next();
			if(elem.getCodigo()==cod) {
				elemDelete=elem;
				conf=true;
			}
		}
		if(conf) {
			prop.remove(elemDelete);
			return conf;
		}else
			return conf;
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
	
