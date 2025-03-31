package PrPrac15;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class Ejercicio1Herencia extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Ejercicio1Herencia() {
		// Grid layout lo que hace es ponerlo en cuadrados, como si fuera un array
		JPanel p1 = new JPanel(new GridLayout(2,1));
		
		ButtonGroup grupoBoton = new ButtonGroup();
		JButton b1 = new JButton("Botón 1");
		JButton b2 = new JButton("Botón 2");
		
		grupoBoton.add(b1);
		grupoBoton.add(b2);
		
		p1.add(b1);
		p1.add(b2);
		
		add(p1,BorderLayout.WEST);
		
		// ---------------------------------------------------------------------------------------
		JPanel p2 = new JPanel(new BorderLayout());
		JLabel etiqueta = new JLabel("Etiqueta");
		JTextArea ta = new JTextArea("Area de texto", 1,10);
		
		p2.add(etiqueta, BorderLayout.NORTH);
		p2.add(ta);
		
		add(p2, BorderLayout.CENTER);
		
		// ---------------------------------------------------------------------------------------
		JScrollPane p3 = new JScrollPane();
		String [] array = new String [15];
		
		for(int i = 0;i<array.length;i++) {
			array[i] = "Item número: " + (i+1);
		}
		
		JList<String> lista = new JList<String>(array);
		p3.setViewportView(lista);
		
		add(p3, BorderLayout.EAST);
		
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
		
		add(p4, BorderLayout.SOUTH);
		
		// ---------------------------------------------------------------------------------------
		pack();
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public static void main(String[] args) {
		new Ejercicio1Herencia();
	}

}
