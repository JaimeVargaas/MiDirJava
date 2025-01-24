package Ejer17;

public class Alumno implements Comparable<Alumno>{
	
	private String nombre;
	private float media;
	
	public Alumno(String nombre, float media) {
		this.nombre = nombre;
		this.media = media;
	}

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public float getMedia() {return media;}
	public void setMedia(float media) {this.media = media;}

	@Override
	public String toString() {
		return this.nombre + " (Nota media: " + this.media + ")\n";
	}

	@Override
	public int compareTo(Alumno o) {
		//return (int)(this.notaMedia - o.getNotaMedia());  //No funcionara bien con los decimales
		return Float.compare(this.media, getMedia());
		
		//return Float.valueOf(this.getNotaMedia()).compareTo(Float.valueOf(o.getNotaMedia()));
	}
	
	
	
}
