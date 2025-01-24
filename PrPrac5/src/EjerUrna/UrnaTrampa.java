package EjerUrna;

public class UrnaTrampa extends Urna {

	public UrnaTrampa(int a, int b) {
		super(a, b);
	}

	public void cambiarColor() {
		if (super.getNumBlanco()>0 && super.getNumNegro()>0) {
			int probabilidad = (int) (Math.random()*1000);
			if (probabilidad < 1) {
				super.setNumBlanco(super.getNumBlanco()+1);
				super.setNumNegro(super.getNumNegro()-1);
			}
			else if (probabilidad >= 1 && probabilidad <2) {
				super.setNumBlanco(super.getNumBlanco()-1);
				super.setNumNegro(super.getNumNegro()+1);
			}
		}
	}
}
