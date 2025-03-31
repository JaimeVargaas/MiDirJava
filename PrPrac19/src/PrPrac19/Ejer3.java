package PrPrac19;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Ejer3 extends JFrame{
	private int cont = 1;
	public Ejer3() {
		setTitle("Prueba de eventos de mouse");
		
		// Panel oeste
		JPanel poeste = new JPanel(new GridLayout(4,1));
		add(poeste, BorderLayout.WEST);
		
		JCheckBox cb = new JCheckBox("Melón", true);
		JCheckBox cb2 = new JCheckBox("Naranja", false);
		JCheckBox cb3 = new JCheckBox("Plátano", false);
		JCheckBox cb4 = new JCheckBox("Manzana", true);
		
		poeste.add(cb);
		poeste.add(cb2);
		poeste.add(cb3);
		poeste.add(cb4);
		
		// Panel centro
		JPanel pcentro = new JPanel();
		add(pcentro, BorderLayout.CENTER);

		JTextArea ta = new JTextArea(10,15);
		
		JScrollPane sp = new JScrollPane(ta);
		pcentro.add(sp);
		
		
		// Eventos
		cb.addItemListener(new ItemListener() {	
			@Override
			public void itemStateChanged(ItemEvent e) {
				ta.append("Componente: " + cb.getText() + 
						"\nEstado actual:" + cb.isSelected()+
						"\nEstado actual:" + cont +
						"\n"+(cb.isSelected()? "Seleccionado":"No seleccionado") + "\n \n");
				cont++;
			}
		});
		
		cb2.addItemListener(new ItemListener() {	
			@Override
			public void itemStateChanged(ItemEvent e) {
				ta.append("Componente: " + cb2.getText() + 
						"\nEstado actual:" + cb2.isSelected()+
						"\nEstado actual:" + cont +
						"\n"+(cb2.isSelected()? "Seleccionado":"No seleccionado") + "\n \n");
				cont++;
			}
		});
		
		cb3.addItemListener(new ItemListener() {	
			@Override
			public void itemStateChanged(ItemEvent e) {
				ta.append("Componente: " + cb3.getText() + 
						"\nEstado actual:" + cb3.isSelected()+
						"\nEstado actual:" + cont +
						"\n"+(cb3.isSelected()? "Seleccionado":"No seleccionado") + "\n \n");
				cont++;
			}
		});
		
		cb4.addItemListener(new ItemListener() {	
			@Override
			public void itemStateChanged(ItemEvent e) {
				ta.append("Componente: " + cb4.getText() + 
						"\nEstado actual:" + cb4.isSelected()+
						"\nEstado actual:" + cont +
						"\n"+(cb4.isSelected()? "Seleccionado":"No seleccionado") + "\n \n");
				cont++;
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
		new Ejer3();
	}
}
