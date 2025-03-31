package PrPrac19;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Ejer1 extends JFrame{
	private JLabel tf;
	
	public Ejer1() {
		
		setTitle("Prueba eventos de ratón");
		setPreferredSize(new Dimension(500,200));
		
		JPanel pcentro = new JPanel();
		add(pcentro, BorderLayout.CENTER);
		
		
		JButton b1 = new JButton("Bienvenido");
		pcentro.add(b1);
		b1.setBackground(Color.CYAN);
		b1.setMargin(new Insets(45, 45, 45, 45));
	
		
		// Acciones del boton
		b1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				tf.setText("Botón soltado en la posición " + e.getX() + " " + e.getY());
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				tf.setText("Botón pulsado en la posición " + e.getX() + " " + e.getY());
			}
			
			@Override
			public void mouseExited(MouseEvent e) {	
				tf.setText("Salir de un componente del ratón");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				tf.setText("Entrar en un componente del raton");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				tf.setText("Botón pulsado y soltado");
				
			}
		});
		
		// Textfield de abajo
		JPanel psur = new JPanel();
		add(psur, BorderLayout.SOUTH);
		
		
		tf = new JLabel("");
		psur.add(tf);
		
		
		// Config de ventana
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ejer1();
	}
}
