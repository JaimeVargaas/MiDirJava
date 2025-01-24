package ejercicio02;

public interface InterfazCajero {

	//constructor no lo metemos no es recomendable
	
	double disponible();
	
	//toString no lo metemos no es recomendable
	
	String sacar(Cuenta c, int pin, int cantidad);
}
