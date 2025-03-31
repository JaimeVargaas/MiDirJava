package PrPac14;

import java.awt.*;

public class GUI01AWT {

	public static void main(String[] args) {
		
		//a. Crear un contenedor.
		Frame f = new Frame("Mi primer GUI");
		//b. Seleccionar un gestor de esquemas para la inserción de los componentes.
		f.setLayout(new FlowLayout());
		//c. Crear los componentes adecuados.
		Button bSi = new Button("Si");
		Button bNo = new Button("No");
		Label lNombre = new Label("Nombre");
		
		//d. Agregarlos al contenedor.
		f.add(lNombre);
		f.add(bSi);
		f.add(bNo);
		
		//f. Pedir el ajuste de los componentes al contenedor.
		f.pack();
		
		//e. Dimensionar el contenedor(opcional):
		f.setSize(400,200);

		//g. Mostrar el contenedor.
		f.setVisible(true);
		// Programar el evente de cierre de ventana
		f.addWindowListener(new controlVentana());;
		
		
		
		
		
		
		
	

	}

}
