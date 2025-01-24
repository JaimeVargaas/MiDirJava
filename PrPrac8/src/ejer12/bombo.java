package ejer12;

import java.util.Arrays;

public class bombo {
	
	protected int numBolas;
	protected boolean [] bombo;
		
	public bombo(int numBolas, boolean[] bombo) {
		super();
		this.numBolas = numBolas;
		this.bombo = bombo;

		Arrays.fill(bombo, true);
	}
	

	public int getNumBolas() {return numBolas;}
	public void setNumBolas(int numBolas) {this.numBolas = numBolas;}
	public boolean[] getBombo() {return bombo;}
	public void setBombo(boolean[] bombo) {this.bombo = bombo;}

	
	public int extraeBola () {
		int num;
		do {
			num = (int)Math.random()*numBolas;
		}
		while (bombo[num]!=true);
		
		return num;
	}
	
	
	public boolean quedanbolas(int n) {
		boolean resultado = false;
		for(int cont=0;cont<bombo.length;cont++) {
			if (bombo[cont]==true)
				resultado = true;
	}
		return resultado;
	}
}
	
	
	

