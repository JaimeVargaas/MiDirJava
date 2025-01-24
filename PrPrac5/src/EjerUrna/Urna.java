package EjerUrna;

public class Urna {
	private int numBlanco;
	private int numNegro;
	
	public Urna(int a, int b) {
		this.numBlanco = a;
		this.numNegro = b;
	}
	
	public char sacaBola() {
		if ((int)(Math.random()*2+1) == 1) {
			this.numBlanco = this.numBlanco -1;
			return 'B';
		}
		else {
			this.numNegro= this.numNegro -1;
			return 'N';
		}	
	}
	
	public void meteBola(char Color) {
		if (Color == 'B') {
			this.numBlanco = this.numBlanco +1;
		}
		
		else  {
			this.numNegro= this.numNegro +1;
		}
	}
	
	public boolean quedanBolas() {
		if (numBlanco + numNegro > 0)
			return true;
		else 
			return false;
	}
	
	public boolean quedaMasDeUnaBola() {
		if (numBlanco + numNegro >= 2)
			return true;
		else 
			return false;
	}
	
	private int totalBolas() {
		return (numBlanco + numNegro);
		}
	
	public int getNumBlanco() {return numBlanco;}
	public void setNumBlanco(int numBlanco) {this.numBlanco = numBlanco;}
	public int getNumNegro() {return numNegro;}
	public void setNumNegro(int numNegro) {this.numNegro = numNegro;}

	@Override
	public String toString() {
		return "Urna [numBlanco=" + numBlanco + ", numNegro=" + numNegro + "]";
	}

	

	
	
	
}
