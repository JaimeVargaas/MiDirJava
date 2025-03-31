package PrPrac20;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Ejer1v2 extends JFrame{
	private JTextArea ta;
	public Ejer1v2() {
		ta = new JTextArea(10,20);
		
		// para que no se pueda escribir en el textarea
		ta.setEditable(false);
		
		JScrollPane sp = new JScrollPane(ta);
		add(sp);
		
		// Eventos
		ta.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				char tecla = e.getKeyChar();
				ta.setText(ta.getText()+"Tecla Pulsada y soltada " + tecla + "\n");
				if(tecla=='h' || tecla=='H')
					ta.setText(ta.getText()+"HOLA!!!!!" + "\n");
			}

			@Override
			public void keyReleased(KeyEvent e) {
				ta.setText(ta.getText()+"Tecla soltada" + "\n");

			}

			@Override
			public void keyPressed(KeyEvent e) {
				ta.setText(ta.getText()+"Tecla Pulsada" + "\n");

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
		new Ejer1v2();
	}
}
 	