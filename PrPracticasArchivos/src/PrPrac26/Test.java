package PrPrac26;

import javax.swing.JFrame;

public class Test {

public static void main(String[] args) {
		
		// Crear un objeto Vista (Dise�a el GUI)
		Vista miVista = new Vista();
		
		// Crear un objeto Controlador (programa los eventos)
		// Controlador ctr = new Controlador(miVista);

		// Llamar al m�todo que a�ade "control" a los componentes
		// miVista.control(ctr);
		
		// Crear el objeto Ventana (JFrame)
		JFrame ventana = new JFrame("Ventas de billete de tren");
	
		// Colocar sobre el panel contenedor la vista (es un JPanel)
		ventana.setContentPane(miVista);
		
		// A�adir el control de cierre de ventana, pack, ....
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.pack();
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		
	}

}
