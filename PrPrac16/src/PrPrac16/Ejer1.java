package PrPrac16;

import javax.swing.*;
import java.awt.*;

public class Ejer1 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Ejer1() {
	JPanel jp = new JPanel(new GridLayout(4,2));
	
	JButton b1 = new JButton("Primero");
	b1.setBackground(Color.magenta);
	b1.setToolTipText("Botón primero");
	
	JButton b2 = new JButton("Segundo");
	b2.setBackground(Color.DARK_GRAY);
	b2.setToolTipText("Botón segundo");
	
	JButton b3 = new JButton("Tercero");
	b3.setBackground(Color.blue);
	b3.setToolTipText("Botón tercero");
	
	JButton b4 = new JButton("Cuarto");
	b4.setToolTipText("Botón cuarto");
	
	JButton b5 = new JButton("Quinto");
	b5.setToolTipText("Botón quinto");
	
	JButton b6 = new JButton("Sexto");
	b6.setToolTipText("Botón sexto");
	
	JButton b7 = new JButton("Séptimo");
	b7.setToolTipText("Botón séptimo");
	
	JButton b8 = new JButton("Octavo");
	b8.setToolTipText("Botón octavo");
	
	jp.add(b1);
	jp.add(b2);
	jp.add(b3);
	jp.add(b4);
	jp.add(b5);
	jp.add(b6);
	jp.add(b7);
	jp.add(b8);
	
	JScrollPane p1 = new JScrollPane(jp);
	p1.setPreferredSize(new Dimension(130,110));
	
	add(p1);
	
	pack();
	setVisible(true);
	setResizable(false);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	public static void main(String[] args) {
		new Ejer1();
	}
}
