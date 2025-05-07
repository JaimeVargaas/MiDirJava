package PrPrac21;

import javax.swing.JFrame;

public class Ejer1 extends JFrame{

	/**
	* Constructor
	* @param s --> Título de la ventana
	* @param w --> Alto de la ventana
	* @param h --> Ancho de la ventana
	* @param lo --> Posición de la ventana
	*/
	
	public Ejer1(String s, int w, int h, int lo) {
		// Establecer el título de la ventana
		super(s);
		
		// Establecer un tamaño para la ventana (ancho y alto)
		setSize(w,h);
		
		// Poner visible la ventana
		setVisible(true);
		
		// Posicionar la ventana en las coordenadas indicadas
		setLocation(lo,100);
		
		// También podríamos usar el método setBounds, para unificar setSize y setLocation
		// setBounds(lo, 100, w, h);
		
		// Añado el control al cierre de la ventana
		addWindowListener(new controlVentana());

	}
	

	public static void main(String[] args) {
		new Ejer1("Prueba eventos de ventana 1",200,100,1);
		new Ejer1("Prueba eventos de ventana 2",100,50,200);
		new Ejer1("Prueba eventos de ventana 3",200,200,500);
	}

}
