package PrPac14;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;

public class GUI01Swing {

	public static void main(String[] args) {
		//a. Crear un contenedor.
		JFrame f = new JFrame("Mi primer GUI");
		
		// Obtener el panel contenedor
		Container gcp = f.getContentPane();
		
		//b. Seleccionar un gestor de esquemas para la inserción de los componentes.
		gcp.setLayout(new FlowLayout());
		
		//c. Crear los componentes adecuados.
		JButton bSi = new JButton("Si");
		JButton bNo = new JButton("No");
		JLabel lNombre = new JLabel("Nombre");

		//d. Agregarlos al contenedor.
		gcp.add(lNombre);
		gcp.add(bSi);
		gcp.add(bNo);

		//f. Pedir el ajuste de los componentes al contenedor.
		f.pack();

		//e. Dimensionar el contenedor(opcional):
		f.setSize(400,200);

		//g. Mostrar el contenedor.
		f.setVisible(true);
		// Programar el evente de cierre de ventana
		// f.addWindowListener(new controlVentana());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
