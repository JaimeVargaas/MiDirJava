package PrPrac26;

public class Punto {
	private double x,y;

	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	public double distancia(double x1, double y1, double x2, double y2) {
		
		double cuadra1 = Math.pow((x2-x1), 2);
		double cuadra2 = Math.pow((y2-y1), 2);
		
		return Math.sqrt((cuadra1 + cuadra2));
	}
	
	public double distancia(Punto p1, Punto p2) {
		double cuadra1 = Math.pow((p2.getX()-p1.getX()), 2);
		double cuadra2 = Math.pow((p2.getY()-p1.getY()), 2);
		
		return Math.sqrt((cuadra1+cuadra2));
	}
	
}
