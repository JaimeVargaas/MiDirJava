package Ejer2;

import javax.swing.JFrame;

public class test {
	
	public static void main(String[] args) {
		// Crear un objeto Vista (Dise�a el GUI)
		Vista miVista = new Vista();

		// Crear un objeto Controlador (programa los eventos)
		 Controlador ctr = new Controlador(miVista);

		// Llamar al m�todo que a�ade "control" a los componentes
		 miVista.control(ctr);

		// Crear el objeto Ventana (JFrame)
		JFrame ventana = new JFrame("Eventos tipo check, combo y lista");

		// Colocar sobre el panel contenedor la vista (es un JPanel)
		ventana.setContentPane(miVista);

		// A�adir el control de cierre de ventana, pack, ....
		// Config de ventana
		ventana.pack();
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		ventana.setResizable(false);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
