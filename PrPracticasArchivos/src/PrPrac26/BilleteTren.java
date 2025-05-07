package PrPrac26;


public class BilleteTren {
	private Punto origen, destino;
	private enumDescuento desc;
	private double distancia;
	public BilleteTren(Punto origen, Punto destino, enumDescuento desc) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.desc = desc;
		this.distancia = origen.distancia(origen, destino);
	}
	public Punto getOrigen() {
		return origen;
	}
	public Punto getDestino() {
		return destino;
	}
	public enumDescuento getDesc() {
		return desc;
	}
	public double getDistancia() {
		return distancia;
	}
	@Override
	public String toString() {
		return "BilleteTren" + 
				"\nOrigen: " + this.origen.getX() + this.origen.getY() +
				"\nDestino: " + this.destino.getX() + this.destino.getY() +
				"\nDescuento aplicado: " + getPorcentaje(this.desc) + "(" +this.desc.getDescripcion() + ")"+
				"\nDistancia: " + this.getDistancia() +
				"\nCoste del billete: " + this.getPrecio();
	}
	
	public static short getPorcentaje(enumDescuento descuento) {
		if(descuento.equals(enumDescuento.menor7Años))
			return 100;
		if(descuento.equals(enumDescuento.menor12Años))
			return 50;
		if(descuento.equals(enumDescuento.menor18Años))
			return 25;
		if(descuento.equals(enumDescuento.universitario))
			return 40;
		if(descuento.equals(enumDescuento.jubilado))
			return 25;		
		if(descuento.equals(enumDescuento.desempleado))
			return 10;
		else return 0;	
	}
	
	public float calculaPrecio() {
		float precio = (float) (this.distancia*0.20);
			
		if(this.distancia>1||this.distancia<=20)
			precio = (float) (this.distancia*0.20);
		else if(this.distancia>20||this.distancia>=50)
			precio = (float) (this.distancia*0.18);
		else if(this.distancia>50)
			precio = (float) (this.distancia*0.16);
		
		
		return precio;
	}
	
	public String getPrecio() {
		String cadena=null;
		double importe = calculaPrecio();
		
		double [] monedas={500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.20, 0.10, 0.05, 0.02, 0.01};
		 
        // Creamos un array con 0 de longitud igual a la cantidad de monedas
        // Este array contendra las monedas a devolver
        double [] devolver={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
 
        // Recorremos todas las monedas
        for(int i=0;i<monedas.length;i++)
        {
            // Si el importe actual, es superior a la moneda
            if(importe>=monedas[i])
            {
                // obtenemos cantidad de monedas
                devolver[i]=Math.floor(importe/monedas[i]);
 
                // actualizamos el valor del importe que nos queda por didivir
                importe=importe-(devolver[i]*monedas[i]);
            }
        }
 
        for(int i=0;i<monedas.length;i++)
        {
            if(devolver[i]>0)
            {
                if(monedas[i]>2)
                {
                    cadena+="Hay "+devolver[i]+" billetes de: "+monedas[i]+" Euros\n";
                }else{
                    cadena+="Hay "+devolver[i]+" monedas de: "+monedas[i]+" Euros\n";
                }
            }
        }
    
		return cadena;
	}
}
