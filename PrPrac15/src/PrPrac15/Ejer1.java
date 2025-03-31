package PrPrac15;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;


public class Ejer1 {

	public static void main(String[] args) {
		JFrame f = new JFrame("Ejercicio 1");
		Container c = f.getContentPane();
		// Grid layout lo que hace es ponerlo en cuadrados, como si fuera un array
		JPanel p1 = new JPanel(new GridLayout(2,1));
		
		ButtonGroup grupoBoton = new ButtonGroup();
		JButton b1 = new JButton("Botón 1");
		JButton b2 = new JButton("Botón 2");
		
		grupoBoton.add(b1);
		grupoBoton.add(b2);
		
		p1.add(b1);
		p1.add(b2);
		
		c.add(p1,BorderLayout.WEST);
		
		// ---------------------------------------------------------------------------------------
		JPanel p2 = new JPanel(new BorderLayout());
		JLabel etiqueta = new JLabel("Etiqueta");
		JTextArea ta = new JTextArea("Area de texto", 1,10);
		
		p2.add(etiqueta, BorderLayout.NORTH);
		p2.add(ta);
		
		c.add(p2, BorderLayout.CENTER);
		
		// ---------------------------------------------------------------------------------------
		JScrollPane p3 = new JScrollPane();
		String [] array = new String [15];
		
		for(int i = 0;i<array.length;i++) {
			array[i] = "Item número: " + (i+1);
		}
		
		JList<String> lista = new JList<String>(array);
		p3.setViewportView(lista);
		
		c.add(p3, BorderLayout.EAST);
		
		// ---------------------------------------------------------------------------------------
		JPanel p4 = new JPanel(new FlowLayout());
		JTextField ta1 = new JTextField("Campo de texto");
		p4.add(ta1);
		
		JCheckBox cb = new JCheckBox("CheckBox");
		p4.add(cb);
		
		String [] array2 = new String[5];
		for(int i = 0;i<array2.length;i++) {
			array2[i] = "Opción: " + (i+1);
		}
		JComboBox<String> op = new JComboBox<String>(array2);
		p4.add(op);
		
		c.add(p4, BorderLayout.SOUTH);
		
		// ---------------------------------------------------------------------------------------
		f.pack();
		f.setVisible(true);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
