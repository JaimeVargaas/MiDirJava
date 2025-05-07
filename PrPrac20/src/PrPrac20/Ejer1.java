package PrPrac20;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Ejer1 extends JFrame{
	public Ejer1() {
		// Crear elementos
		JButton b1 = new JButton("Primero");	
		JButton b2 = new JButton("Segundo");
		JLabel etiqueta = new JLabel(" ");
		
		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.CENTER);
		add(etiqueta, BorderLayout.SOUTH);
		
		// Eventos
		b1.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				char tecla = e.getKeyChar(); 
				etiqueta.setText(etiqueta.getText()+tecla);
				
				if(e.getKeyChar()=='*') System.exit(0);
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
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
