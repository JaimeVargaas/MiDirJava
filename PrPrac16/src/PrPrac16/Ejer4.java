package PrPrac16;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Ejer4 extends JFrame{
	public Ejer4() {
		
		JMenuBar jmb = new JMenuBar();
		add(jmb, BorderLayout.NORTH);
		
		setLayout(new BorderLayout());
		
		JMenu menu1 = new JMenu("Archivo");
		JMenu menu2 = new JMenu("Edición");
		JMenu menu3 = new JMenu("Ver");
		JMenuItem subEnt1 = new JMenuItem("Normal");
		JMenuItem subEnt2 = new JMenuItem("Diseño de página");
		JMenuItem subEnt3 = new JMenuItem("Esquema");
		
		JSeparator sep = new JSeparator();
		
		JMenu subEnt4 = new JMenu("Barra de herramientas");
		JCheckBoxMenuItem formato = new JCheckBoxMenuItem("Formato", true);
		JCheckBoxMenuItem estandar = new JCheckBoxMenuItem("Estándar", false);
		JCheckBoxMenuItem dibujo = new JCheckBoxMenuItem("Dibujo", true);
		
		subEnt4.add(formato);
		subEnt4.add(estandar);
		subEnt4.add(dibujo);
		
		
		JMenuItem subEnt5 = new JMenuItem("Mapa del documento");
		
		JSeparator sep2 = new JSeparator();
		
		JMenuItem subEnt6 = new JMenuItem("Zoom");
		subEnt6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
		
		menu3.add(subEnt1);
		menu3.add(subEnt2);
		menu3.add(subEnt3);
		menu3.add(sep);
		menu3.add(subEnt4);
		menu3.add(subEnt5);
		menu3.add(sep2);
		menu3.add(subEnt6);
			
		// ----------------------------------------------------------------------------------------
		
		JMenu menu4 = new JMenu("Ayuda");
		
		jmb.add(menu1);
 		jmb.add(menu2);
		jmb.add(menu3);
		jmb.add(menu4);

		add(jmb);
		
		// ----------------------------------------------------------------------------------------
		JPanel p1 = new JPanel(new FlowLayout());
		add(p1, BorderLayout.SOUTH);
		
		String [] array = {"Courier New", "Times New Roman", "Arial"};
		JComboBox<String> letras = new JComboBox<String>(array);
		
		p1.add(letras);
		
		JCheckBox cb1 = new JCheckBox("Negrita", true);
		JCheckBox cb2 = new JCheckBox("Cursiva", true);
		JCheckBox cb3 = new JCheckBox("Subrayado", false);
		
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		
		cb1.setFont(new Font("Comic Sans MS", Font.BOLD|Font.ITALIC, 25));
		cb1.setForeground(Color.gray);
		cb1.setBackground(Color.orange);
		cb2.setBackground(Color.orange);
		cb3.setBackground(Color.orange);
		p1.setBackground(Color.orange);
		
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Ejer4();
	}
}
