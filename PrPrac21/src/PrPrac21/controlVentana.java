package PrPrac21;

import java.awt.event.*;

public class controlVentana extends WindowAdapter {
	// Metodo para el cierre de ventana
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);     
	}
}

	class ControlVentana implements WindowListener {

		public void windowOpened(WindowEvent e) {
			System.out.println("Ventana " + e.getWindow().getName() + " abierta");
		}
		
		public void windowClosing(WindowEvent e) {
			System.out.println("Cerrando ventana "+ e.getWindow().getName());
			e.getWindow().dispose();
		}
		
		public void windowClosed(WindowEvent e) {
			System.out.println("Ventana " + e.getWindow().getName() + " cerrada");
		}
		
		public void windowActivated(WindowEvent e) {
			System.out.println("Ventana " + e.getWindow().getName() + " activa (en uso)");
		}
		
		public void windowDeactivated(WindowEvent e) {
			System.out.println("Ventana " + e.getWindow().getName() + " desactivada(fuera de uso)");
		}
		
		public void windowIconified(WindowEvent e) {
			System.out.println("Ventana " + e.getWindow().getName() + " minimizada");
		}
		
		public void windowDeiconified(WindowEvent e) {
			System.out.println("Ventana " + e.getWindow().getName() + " restaurada");
		}


	}


