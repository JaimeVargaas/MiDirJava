package PrPac14;

import javax.swing.*;
import java.awt.*;

public class GUI03Swing {
	
	public static void main(String[] args) throws InterruptedException {
		JFrame f = new JFrame("Tercer GUI");
        JPanel panelLateral = new JPanel(new GridLayout(2,1));
        
        //Obtener el panel contenedor
        Container gcp = f.getContentPane();
        
        
        //b. Seleccionar un gestor de esquemas para la inserción de los componentes. 
        //gcp.setLayout(new BorderLayout(20,20)); //Con eso se pone una separacion
        
        //c. Crear los componentes adecuados. 
        JButton bNorte = new JButton("Norte");
        JButton bSur = new JButton("Sur");
        JButton bEste = new JButton("Este");
        JButton bP1 = new JButton("Panel1");
        JButton bP2 = new JButton("Panel2");
        JButton bCentro = new JButton("Centro");
        
        
        panelLateral.add(bP1);
        panelLateral.add(bP2);
        //Cambiar el tamaño del boton del centro
        //bCentro.setSize(100,100);
        
        //d. Agregarlos al contenedor. Poner para añadir los elementos al contenedor 
        gcp.add(bNorte,BorderLayout.NORTH);
        gcp.add(panelLateral,BorderLayout.WEST);
        gcp.add(bCentro,BorderLayout.CENTER);
        gcp.add(bEste,BorderLayout.EAST);
        gcp.add(bSur,BorderLayout.SOUTH);
        
        //f. Pedir el ajuste de los componentes al contenedor. Poner esto primero antes de las dimensiones
        f.pack();
        
        //e. Dimensionar el contenedor(opcional): 
        //f.setSize(400,200);
        
        //g. Mostrar el contenedor. 
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        
        //Programar el evento de cierre de ventana
        //f.addWindowListener(new ControlVentana());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Thread.sleep(5000);
        bSur.setVisible(false);
        
        //Hacer otra vez el pack para el reajuste de los componentes
        f.pack();
		

	}

	private static LayoutManager GridLayout(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

}
