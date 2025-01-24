package EjerFraccion;

public class Fraccion {

	
	private int signo;
	private int numerador;
	private int denominador;
	
	
	public Fraccion(int n, int d) {
		if (d==0)
			System.out.println("Una fracción no puede tener como denominador el número 0");
		else {
			if (n * d < 0) {
				this.signo = -1;
			} // end if
			else {
					this.signo = 1;
				}
			
			this.numerador = Math.abs(n);
			this.denominador = Math.abs(n);
		} // end else
		
	}


	public int getSigno() {return signo;}
	public void setSigno(int signo) {this.signo = signo;}
	
	public int getNumerador() {return numerador;}
	public void setNumerador(int numerador) {this.numerador = numerador;}
	
	public int getDenominador() {return denominador;}
	public void setDenominador(int denominador) {this.denominador = denominador;}


	@Override
	public String toString() {
		if (signo==-1) 
			return "-" + this.numerador + "/" + this.denominador;
		else {
			return this.numerador + "/" + this.denominador;
		}
	}
	
	/*
	 * Devuelve una fracción invertida, lo que antes era el numeador 
	 * ahora será el denominador y viceversa
	 */
	
	public Fraccion invierte() {
		return new Fraccion(this.signo * this.denominador, this.numerador);
	}
	
	public Fraccion multiplica(int n) {
		return new Fraccion(this.signo * this.numerador * n, this.denominador);
	}
	
	public Fraccion multiplica(Fraccion f) {
		return new Fraccion(this.signo * this.numerador * f.getNumerador(),
							this.denominador * f.getDenominador());
	}
	
	public Fraccion divide(int n) {
		return new Fraccion(this.signo * this.numerador, this.denominador * n);
	}
	
	public Fraccion divide(Fraccion f) {
		return new Fraccion(this.signo * this.numerador * f.getDenominador(),
							this.denominador * f.getNumerador());
	}
	
	public Fraccion simplifica() {
		int s = this.signo;
		int n = this.numerador;
		int d = this.denominador;
		
		for (int i=Math.min(this.numerador, this.denominador);i>=2; i--) {
			if (((n % i ) == 0)  && ((d % i)== 0)) {
				n /= i;
				d /=i;
			}
		}
		return new Fraccion(s * n, d);
	}
	
}
