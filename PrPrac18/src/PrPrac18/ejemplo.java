package PrPrac18;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class ejemplo extends JFrame{
	
	 	private JTextField tf;
	 	private JPasswordField tf1;
	 	private JLabel intr;
	
	public ejemplo() {
		setTitle("Ventana password");
		
		JPanel pcentro = new JPanel(new GridLayout(2,3));
		add(pcentro);
		
		JLabel usuario = new JLabel("Usuario");
		pcentro.add(usuario);

		tf = new JTextField();
		pcentro.add(tf);

		JButton b1 = new JButton("Aceptar");
		pcentro.add(b1);
		// ------------------------------------------------------
		
		JLabel contraseña = new JLabel("Contraseña");
		pcentro.add(contraseña);

		tf1 = new JPasswordField();
		pcentro.add(tf1);

		JButton b2 = new JButton("Cancelar");
		pcentro.add(b2);
		
		// ------------------------------------------------------
		JPanel psur = new JPanel();
		add(psur, BorderLayout.SOUTH);
		
		intr = new JLabel("Introduzca usuario y clave");
		psur.add(intr);
		
		// ------------------------------------------------------
		// Config de ventana
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// evento aceptar
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (tf.getText().equals("Jaime") && tf1.getText().equals("hola")) {
					intr.setText("Datos correctos");
					intr.setForeground(Color.black);
				}
				else {
					intr.setText("Datos incorrectos");
					intr.setForeground(Color.red);
				}
			}
		});
		
		
		// evento cancelar
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText("");
				tf1.setText("");
				intr.setText("Introduzca usuario y clave");
				intr.setForeground(Color.black);
			}
		});

	}

	public static void main(String[] args) {
		new ejemplo();
	}
}
