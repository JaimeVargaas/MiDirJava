package PrPrac16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;


public class Ejer2 extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public Ejer2() {
		
		JMenuBar menu = new JMenuBar();
		add(menu);
		setTitle("Mi menú de opciones");
		
		JMenu ent1 = new JMenu("Entrada 1");
		JMenu ent2 = new JMenu("Entrada 2");
		JMenu ayuda = new JMenu("Ayuda");
		menu.add(ent1);
		menu.add(ent2);
		menu.add(ayuda);
		
		JMenuItem subEnt1 = new JMenuItem("SubEntrada 1.1");
		ent1.add(subEnt1);
		
		JSeparator sep = new JSeparator();
		ent1.add(sep);
		
		JMenuItem subEnt2= new JMenuItem("SubEntrada 1.2");
		subEnt2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
		ent1.add(subEnt2);
		
		JMenu subEnt3= new JMenu("SubEntrada 1.3");
		ent1.add(subEnt3);
		JMenuItem msubEnt3 = new JMenuItem("SubEntrada 1.3.1");
		JCheckBoxMenuItem cb = new JCheckBoxMenuItem("SubEntrada 1.3.2");
		subEnt3.add(msubEnt3);
		subEnt3.add(cb);
		
		
		
		
		
		
		
		
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
