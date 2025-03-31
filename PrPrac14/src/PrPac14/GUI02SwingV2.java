package PrPac14;

import java.awt.BorderLayout;

import java.awt.*;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI02SwingV2 {

	public static void main(String[] args) {
		JFrame f = new JFrame("Ejercicio 2");
		Container gcp = f.getContentPane();
		
		gcp.setLayout(new BorderLayout(110,110));
		
		JButton Norte = new JButton("Norte");
		JButton Oeste = new JButton("Oeste");
		JButton Centro = new JButton("Centro");
		
		// Cambiar tamaño y color de centro
		Centro.setBackground(Color.GRAY);
		Centro.setPreferredSize(new Dimension(80,80));
		
		// Crear un panel sobre el que colocaremos el boton del centro
		JPanel p = new JPanel(); // Por defecto tiene FLowLayour como gestor de esquemas
		p.add(Centro);
		
		JButton Este = new JButton("Este");
		JButton Sur = new JButton("Sur");
		
		gcp.add(Norte,BorderLayout.NORTH);
		gcp.add(Oeste, BorderLayout.WEST);
		gcp.add(Centro, BorderLayout.CENTER);
		gcp.add(Este, BorderLayout.EAST);
		gcp.add(Sur, BorderLayout.SOUTH);
		
		f.pack();
		
		f.setVisible(true);
		
		// bloquear cambio de tamaño de ventana
		f.setResizable(false);
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}

}
