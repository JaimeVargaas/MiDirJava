package PrPac14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class GUI04Swing {

	public static void main(String[] args) {
		JFrame f = new JFrame("Ejercicio 2");
		Container gcp = f.getContentPane();
		JPanel panel = new JPanel(new GridLayout(2,1));
		
		ButtonGroup grupoBotones = new ButtonGroup();
		
		JRadioButton radioHombre = new JRadioButton("Hombre", false);
		JRadioButton radioMujer = new JRadioButton("Mujer", true);
		
		grupoBotones.add(radioHombre);
		grupoBotones.add(radioMujer);
		
		panel.add(radioHombre);
		panel.add(radioMujer);
		
		JButton Norte = new JButton("Norte");
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
		gcp.add(panel, BorderLayout.WEST);
		gcp.add(Centro, BorderLayout.CENTER);
		gcp.add(Este, BorderLayout.EAST);
		gcp.add(Sur, BorderLayout.SOUTH);
		
		
		f.pack();
		f.setVisible(true);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
