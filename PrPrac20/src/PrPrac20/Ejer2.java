package PrPrac20;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Ejer2 extends JFrame{
	public Ejer2() {
		setTitle("Personaliza tu coche");
		setPreferredSize(new Dimension(300,400));
		
		// Panel norte
		JPanel pnorte = new JPanel();
		// Como el flowlayout pero vertical
		pnorte.setLayout(new BoxLayout(pnorte, BoxLayout.Y_AXIS));
		
		add(pnorte, BorderLayout.NORTH);
		pnorte.setBorder(new CompoundBorder(new TitledBorder("Elija extras"), new BevelBorder(BevelBorder.RAISED)));
		
		JCheckBox cb1 = new JCheckBox("Diesel", true);
		JCheckBox cb2 = new JCheckBox("Asientos deportivos", true);
		JCheckBox cb3 = new JCheckBox("Tapicerías de cuero", true);
		cb3.setEnabled(false);
		JCheckBox cb4 = new JCheckBox("Llantas de aleación", false);
		JCheckBox cb5 = new JCheckBox("Pintura metalizada", true);
		
		pnorte.add(cb1);
		pnorte.add(cb2);
		pnorte.add(cb3);
		pnorte.add(cb4);
		pnorte.add(cb5);
		  
		// Panel centro 
		JPanel pcentro = new JPanel();
		pcentro.setLayout(new BoxLayout(pcentro, BoxLayout.Y_AXIS));
		add(pcentro, BorderLayout.CENTER);
		
		// Panel norte del centro
		JPanel pcentronorte = new JPanel();
		pcentro.add(pcentronorte, BorderLayout.NORTH);
		
		pcentronorte.setBorder(new CompoundBorder(new TitledBorder("Elija número de llantas"), new BevelBorder(BevelBorder.RAISED)));
		
		String [] array = {"Tres radios", "Cuatro radios","Cinco radios", "Seis radios", "Siete radios", "Ocho radios"};
		
		JComboBox<String> cb = new JComboBox<String>(array);
		pcentronorte.add(cb);
		
		cb.setEnabled(false);
		
		// Panel sur del centro
		JPanel pcentrosur = new JPanel();
		pcentro.add(pcentrosur);
		pcentrosur.setBorder(new CompoundBorder(new TitledBorder("Elija color"), new BevelBorder(BevelBorder.RAISED)));
		
		JScrollPane sp = new JScrollPane();
		pcentrosur.add(sp);
		
		String [] array2 = {"Rojo", "Verde"};
		
		// Lista para almacenar las opciones elegibles
		JList<String> lista = new JList<String>(array2);
		
		JScrollPane sp2 = new JScrollPane(lista);
		pcentrosur.add(sp2);
		
		sp2.setPreferredSize(new Dimension(80,35));
		
		// Panel sur
		JPanel psur = new JPanel();
		add(psur, BorderLayout.SOUTH);
		psur.setLayout(new BoxLayout(psur, BoxLayout.Y_AXIS));
		
		psur.setBorder(new CompoundBorder(new TitledBorder("Acciones realizadas"), new BevelBorder(BevelBorder.RAISED)));
		
		JLabel inf = new JLabel("                                Información");
		inf.setForeground(Color.blue);
		
		psur.add(inf);
		
		// Config de ventana
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// Evento de activacion pinturas metalizadas
		cb5.addItemListener(
			(e) -> {
				if (cb5.isSelected())
					lista.setEnabled(true);
				else {
					lista.setEnabled(false);
					inf.setText("                                Información");
				}
			}
		);
		
		// Evento de activacion de tapiceria de cuero
		cb2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(!cb2.isSelected())
				cb3.setSelected(false);
				
				else cb3.setSelected(true);
			}
		});
		
		// Evento que te muestra información a cada elemento seleccionado
		lista.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				String seleccionado = lista.getSelectedValue();
				
				if (seleccionado.equals("Rojo"))
					inf.setText("                   La llanta roja reluce mucho");
				else
					inf.setText("             La llanta verde es la más vendida");
			}
		});
		
		cb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String seleccion;
				seleccion = (String) cb.getSelectedItem();
				
				switch(seleccion) {
				case "Tres radios": 
					inf.setText("Has seleccionado una llanta de tres radios");
					break;
				case "Cuatro radios":
					inf.setText("Has seleccionado una llanta de cuatro radios");
					break;
				case "Cinco radios":
					inf.setText("Has seleccionado una llanta de cinco radios");
					break;
				case "Seis radios":
					inf.setText("Has seleccionado una llanta de seis radios");
					break;
				case "Siete radios":
					inf.setText("Has seleccionado una llanta de siete radios");
					break;
				case "Ocho radios":
					inf.setText("Has seleccionado una llanta de ocho radios");
					break;
				default:
					inf.setText("                                Información");
					break;
				}
				
				
			}
		});
		
		// Evento de activacion el radio de las llantas
		cb4.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (cb4.isSelected())
					cb.setEnabled(true);
				else {
					cb.setEnabled(false);
					inf.setText("                                Información");}
			}
		});
	}

	public static void main(String[] args) {
		new Ejer2();
	}
}
