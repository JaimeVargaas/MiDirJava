package EjerRectangulo;

public class Rectangulo {
	private int ancho;
	private int alto;


public Rectangulo(int ancho,int alto) {
	this.ancho = ancho;
	this.alto = alto;
}
public Rectangulo() {
	this.ancho=0;
	this.alto=0;
}

public Rectangulo(int ancho) {
	this.ancho = ancho;
	this.alto = ancho;
}


public int area() {
	return this.ancho * this.alto;
	}

public int perimetro() {
	return (2*(this.ancho * this.alto));
}

public void agrandar(int factor) {
	if (factor<0)
		System.out.println("No puedes agrandar con números negativos");
	else 
		this.alto=this.alto + factor;
	 	this.ancho=this.ancho + factor;
}

public void agrandar(int ancho, int alto) {
	if (ancho < 0 || alto < 0) 
		System.out.println("No puedes agrandar con número negativos");
	else 
		this.ancho = this.ancho + ancho;
		this.alto = this.alto + alto;
}


public int getAncho() {return ancho;}
public void setAncho(int ancho) {
	if (ancho<0)
		System.out.println("No puedes poner un ancho negativo");
	else
	this.ancho = ancho;}
public int getAlto() {return alto;}

public void setAlto(int alto) {
	if (alto<0)
		System.out.println("No puedes poner un alto negativo");
	else
	this.alto = alto;}

@Override
public String toString() {
	return "Objeto tipo rectángulo" + 
			"\n\tAncho: " + this.ancho + 
			"\n\tAlto:" + this.alto;
}

public boolean equals(Object ob) {	
	Rectangulo otroRectangulo = (Rectangulo)ob;
	
	if (this.ancho == otroRectangulo.getAncho() &&
		this.alto == otroRectangulo.getAlto())
	    return true;
	else 
		return false;
}




}
