package InterfazGraf;

import java.awt.*;

import javax.swing.*;

public class Prueba extends JFrame {
	private JLabel pesperando;
	public Prueba() {
		JMenuBar menu = new JMenuBar();
		add(menu);
		setTitle("Prueba");
		
		JMenu archivo = new JMenu("Archivo");
		menu.add(archivo);
		
		
		JMenuItem nuevo = new JMenuItem("Nuevo"); 		
		archivo.add(nuevo);
		
		JMenu editar = new JMenu("Editar");
		menu.add(editar);
		
		// ---------------------------------------------------------------------
		
		
		
		// ---------------------------------------------------------------------
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
	
	public static void main(String[] args) {
		new Prueba();
	}
	
}
