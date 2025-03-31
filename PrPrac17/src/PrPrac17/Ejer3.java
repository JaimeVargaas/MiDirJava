package PrPrac17;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class Ejer3 extends JFrame {

	public Ejer3() {
		// Crear un objeto de tipo JFileChooser (ventana de diálogo para  
		// mostrar el explorador que permite abrir o guardar un documento) 
		JFileChooser fc = new JFileChooser("D:/1ºDAW");  // Poner una ruta válida en vuestro equipo 

		// Llamar al método que establece el JFileChooser en modo "abrir" 
		//fc.showOpenDialog(f); 

		// Llamar al método que establece el JFileChooser en modo "guardar" 
		fc.showSaveDialog(this); 

		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ejer3();
	}
	
}
