package EjerExamen;

public class UtilidadesVehiculos {

	public static final double milla = 0.621371;
	public static final double km= 1.60934;
	
	public static double KMAMillas(double kilometros) {
		return kilometros*milla;
	}
	
	public static double millasAKM(double millas) {
		return millas*km;
	}
	
	public static double combustibleConsumido (double kmRecorridos, float consumoPorKm, float precioCombustiblePorLitro) {
		return (kmRecorridos/consumoPorKm)*precioCombustiblePorLitro;
	}
	
}
