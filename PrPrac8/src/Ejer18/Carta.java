package Ejer18;

import java.util.Objects;

public class Carta implements Palos{
	
	// Variables de instancia
	private String palo;
	private byte valor;
	
	public Carta(String palo, byte valor) {
		this.palo = palo;
		this.valor = valor;
	}

	public String getPalo() {return palo;}
	public void setPalo(String palo) {this.palo = palo;}
	public byte getValor() {return valor;}
	public void setValor(byte valor) {this.valor = valor;}
	
	@Override
	public String toString() {
		String cad = "";
		
		switch (valor) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6: cad = (this.valor + 1) + "de " + this.palo; break; 
		case 7: cad = "Sota de "+ this.palo; break;
		case 8: cad = "Caballo de "+ this.palo; break;
		case 9: cad = "Rey de "+ this.palo;break;
		case 10: cad= "Rey de " + this.palo;break;
		}
	
		return cad;
	}

	@Override
	public boolean equals(Object o) {
		Carta otraCarta = (Carta) o;
		return Objects.equals(this.getPalo(), otraCarta.palo) && this.getValor() == otraCarta.getValor();
	}
	
	public float getPuntos7Media() {
		if(this.valor<=7)
			return this.valor;
		return 0.5f;
	}
	
	
}
