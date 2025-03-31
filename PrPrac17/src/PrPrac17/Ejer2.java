package PrPrac17;

import java.awt.*;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class Ejer2 extends JFrame{

	public Ejer2() {
	JPanel p = new JPanel(new FlowLayout());
	add(p, BorderLayout.NORTH);
	
	setPreferredSize(new Dimension(500,200));
	JButton b1 = new JButton("Botón 1");
	JButton b2 = new JButton("Botón 2");
		
	p.add(b1);
	p.add(b2);
	
	JDialog d = new JDialog(this,"Título de diálogo",false); 
	// this es el JFrame, he heredado de JFrame 
	
	d.setLayout(new FlowLayout()); 

	d.add(new JLabel("Esto es una ventana de diálogo")); 
	d.add(new JButton("OK")); 
	d.pack(); 
	d.setSize(200, 90); 
	d.setResizable(false); 
	d.setVisible(true); 
	d.setLocationRelativeTo(this); 
	//d.setLocation(200,200); 

	// Controlar el cierre del diálogo, OJO, se oculta, no se sale de la aplicación 
	d.setDefaultCloseOperation(HIDE_ON_CLOSE); 
	pack();
	setLocationRelativeTo(null);
	setVisible(true);
	setResizable(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	
	public static void main(String[] args) {
		new Ejer2();
	}
}