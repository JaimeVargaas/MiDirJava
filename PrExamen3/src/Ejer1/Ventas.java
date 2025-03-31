package Ejer1;


public class Ventas {
	private String [] juegos;
	private int [][] ventas;
	
	
	
	public Ventas(String[] juegos) {
		this.juegos = juegos;
		this.ventas = new int[juegos.length][4];
		
		for(int fil=0;fil<ventas.length;fil++) {
			for(int col=0;col<ventas[fil].length;col++) {
				ventas[fil][col] = (int) (Math.random()*49);
			}	
		}	
	}

	public int[][] getVentas() {return ventas;}
	public void setVentas(int[][] ventas) {this.ventas = ventas;}

	public String[] getJuegos() {return juegos;}
	public void setJuegos(String[] juegos) {this.juegos = juegos;}

	@Override
	public String toString() {
		String cad= "SIMULACION VENTAS MENSUALES\n" + "PLAYSTATION\tXBOX\tNINTENDO\tPC\n";
		
		for(int fil=0;fil<ventas.length;fil++) {
			for(int col=0;col<ventas[fil].length;col++) {
			cad += ventas[fil][col] + "\t";	
			}
			cad+="("+juegos[fil]+")\n";
		}
		
		
		return cad;
	}
	
	public int [] getTotalVentasJuego() {
		int[] vent = new int[4];
		int res=0;

		for(int fil=0;fil<ventas.length;fil++) {
			for(int col=0;col<ventas[fil].length;col++) {
			res += ventas[fil][col];
	
		}
			vent[fil] = res;
			res=0;
		}
		return vent;

	}
	
	public String toStringVentasJuegos() {
		String cad = "Ventas totales por juego en las diferentes plataformas\n";
	   
		for(int i=0;i<juegos.length;i++) {
			cad+="\t"+ juegos[i] + ": " + getTotalVentasJuego()[i] + "\n";
		}
		
	   
	    return cad;
	}
	
	public int[] getVentasPlataforma() {
		int[] vent = new int[4];
		int res=0;
		
		for(int fil=0;fil<ventas.length;fil++) {
			for(int col=0;col<ventas[fil].length;col++) {
				
		}
			res += ventas[fil][fil];
			vent[fil] = res;
			res=0;
			
		}
		return vent;

	}
	
	public String toStringVentasPlataforma() {
	  String cad= "Ventas totales de juegos por plataformas\n";
	  
	  cad += "\tPLAYSTATION: " + getVentasPlataforma()[0] + "\n\tXBOX: " + getVentasPlataforma()[1] + 
			  "\n\tNINTENDO: " + getVentasPlataforma()[2] + "\n\tPC: " + getVentasPlataforma()[3];
	  
	  return cad;
	  
	}
	
	public int ventasPlataformaJuego(Plataforma p, String j) {}
	public int ventasPlataformaJuego(String p, String j) {}
	public String juegosVendidos(byte v) {}
	
	
	
}
