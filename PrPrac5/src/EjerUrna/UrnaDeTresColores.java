package EjerUrna;

public class UrnaDeTresColores extends Urna {
	public UrnaDeTresColores(int a, int b,int c) {
		super(a, b);
		this.numRojo = c;
	}
	
	private int numRojo;
	
	@Override
	public char sacaBola() {
		if ((int)(Math.random()*3+1) == 1) {
			setNumBlanco(getNumBlanco()-1);
			return 'B';
		}
		else 
			return super.sacaBola();	
	}
	
	@Override
    public void meteBola(char color) {
        if (color == 'R') {
            this.numRojo ++;
        }
        else
            super.meteBola(color);
	}
	
	
	@Override
	public boolean quedaMasDeUnaBola() {
		if ((super.getNumBlanco()+super.getNumNegro()+ this.numRojo)>= 2)
			return true;
		else 
			return false;
	}
	
	
	public int getNumRojo() {return numRojo;}
	public void setNumRojo(int numRojo) {this.numRojo = numRojo;}

	@Override
	public String toString() {
		return "Urna [numBlanco=" + super.getNumBlanco() + ", numNegro=" + super.getNumNegro() + "numRojo=" + numRojo +"]";
	}

	
	
	
	
}
