package PrPrac18;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

public class Ejer1 extends JFrame implements FocusListener{

	private JTextArea ta;

	public Ejer1() {
		ta = new JTextArea(10, 30);
		JPanel p1 = new JPanel(new FlowLayout());
		add(p1, BorderLayout.NORTH);

		JTextField tf = new JTextField("Campo de texto",10);
		tf.addFocusListener(this);
		p1.add(tf);

		JLabel etiqueta = new JLabel("Una Etiqueta");
		etiqueta.addFocusListener(this);
		p1.add(etiqueta);

		String [] array = new String [10];

		for(int i = 0; i<array.length;i++) {
			array[i] = "Selecciona Item #" + i;
		}

		JComboBox<String> cb = new JComboBox<String>(array);
		cb.addFocusListener(this);
		p1.add(cb);

		JButton boton = new JButton("Botón");
		p1.add(boton);

		// -----------------------------------------------------------------------
		JScrollPane p2 = new JScrollPane();
		add(p2);

		String [] array2 = new String [10];

		for(int i = 0; i<array2.length;i++) {
			array2[i] = "Lista Item #" + i;
		}


		JList<String> lista = new JList<String>(array2);
		lista.addFocusListener(this);
		p2.setViewportView(lista);

		// ----------------------------------------------------------------------
		JScrollPane p3 = new JScrollPane();
		add(p3, BorderLayout.SOUTH);

		p3.setViewportView(ta);


		// ----------------------------------------------------------------------
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}
	
	public static void main(String[] args) {
		new Ejer1();
	}

	@Override
	public void focusGained(FocusEvent e) {
		ta.append("Foco ganado: " + e.getComponent().toString() + "\n");
	}

	@Override
	public void focusLost(FocusEvent e) {
		ta.append("Foco perdido: " + e.getComponent().toString() + "\n");
		
	}
}
