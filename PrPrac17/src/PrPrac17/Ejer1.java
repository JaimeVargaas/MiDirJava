package PrPrac17;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;

public class Ejer1 extends JFrame {
	public Ejer1() {
		
		setLayout(new BorderLayout(20,20));

		
		JPanel pnorte = new JPanel();
		add(pnorte, BorderLayout.NORTH);
		
		JLabel etiqueta = new JLabel("Esto es un ejercicio de JAVA");
		
		pnorte.add(etiqueta);
		
		// ----------------------------------------------------------------------------------------
		
		JPanel poeste = new JPanel(new GridLayout(3,1));
		add(poeste, BorderLayout.WEST);
		
		JButton b1 = new JButton("Botón 1");
		JButton b2 = new JButton("Botón 2");
		JButton b3 = new JButton("Botón 3");
		
		poeste.add(b1);
		poeste.add(b2);
		poeste.add(b3);
		
		// ----------------------------------------------------------------------------------------
		JScrollPane pcentro = new JScrollPane();
		add(pcentro, BorderLayout.CENTER);
		
		String [] array = new String [15];
		
		for(int i=0;i<array.length;i++) {
			array[i] = "Item número: " + (i +1);
		}
		
		JList <String> list = new JList<String>(array);
		pcentro.setViewportView(list);
		
		// ----------------------------------------------------------------------------------------
		JPanel psur = new JPanel(new FlowLayout());
		add(psur, BorderLayout.SOUTH);
		
		String [] array2 = {"Elección 1", "Elección 2","Elección 3","Elección 4",};
		JComboBox<String> eleccion = new JComboBox<String>(array);
		
		psur.add(eleccion);
		
		JLabel obs = new JLabel("Observación");
		psur.add(obs);
		
		JTextField tf = new JTextField(15);
		psur.add(tf);
		
		
		// ----------------------------------------------------------------------------------------

		JPanel peste = new JPanel(new GridLayout(4,1));
		add(peste, BorderLayout.EAST);
		
		JLabel edad = new JLabel("Marca tu edad: ");
		peste.add(edad);
		
		ButtonGroup grupoBoton = new ButtonGroup();
		JRadioButton rb1 = new JRadioButton("Menor de 20", true);
		JRadioButton rb2 = new JRadioButton("Mayor de 20 y Menor de 35");
		JRadioButton rb3 = new JRadioButton("Mayor de 35");
		
		grupoBoton.add(rb1);
		grupoBoton.add(rb2);
		grupoBoton.add(rb3);
		
		peste.add(rb1);
		peste.add(rb2);
		peste.add(rb3);
		
		peste.setBorder(new CompoundBorder(new TitledBorder("Borde compuesto"), new BevelBorder(BevelBorder.RAISED)));
		
		
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
