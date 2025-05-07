package PrPrac22;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class Vista extends JPanel {
	
	// variables de instancia
	private JButton [] bDigitos;
	private JButton [] bOperadores;
	private JButton bpunto,bIgual;
	private JTextField resultado;
	
	public Vista () {
		JPanel panelPrincipal = new JPanel(new BorderLayout(5,5));
		
		panelPrincipal.add(preparaPanelResultado(), BorderLayout.NORTH);
		panelPrincipal.add(preparaPanelCentro(), BorderLayout.CENTER);
		panelPrincipal.add(preparaPanelEste(), BorderLayout.EAST);
		
		// Añadir el panel principal al panel contenedor
		this.add(panelPrincipal);
	}
	
	private JPanel preparaPanelResultado() {
		resultado = new JTextField(10);
		resultado.setEditable(false);
		resultado.setBackground(Color.white);
		
		JPanel p = new JPanel();
		p.add(resultado);
		
		p.setBorder(new TitledBorder("Resultado"));
		
		return p;
	}
	
	private JPanel preparaPanelCentro() {
		// Pedir memoria para array
		bDigitos = new JButton[10];
		
		// Crear los botones que estarán dentro del array
		for(int cont=0;cont<this.bDigitos.length;cont++) {
			JButton b = new JButton(String.valueOf(cont));
			this.bDigitos[cont] = b;
			this.bDigitos[cont].setBackground(Color.cyan);
			this.bDigitos[cont].setBorder(new BevelBorder(BevelBorder.RAISED));
		}
		
		
		// Crear los botones del punto y del igual
		this.bpunto=new JButton(" . ");
		this.bIgual=new JButton(" = ");
		
		bpunto.setBackground(new Color(245, 245, 220));
		bIgual.setBackground(new Color(245, 245, 220));
		
		// preparar un panel con todo
		JPanel p = new JPanel(new GridLayout(4,3));
		for(int cont=0;cont<this.bDigitos.length;cont++) {
			p.add(bDigitos[cont]);
			
			if(cont==(bDigitos.length-2))
				p.add(bpunto);
		}
		
		
		p.add(bIgual);
		
		return p;
	}
	
	private JPanel preparaPanelEste() {
		
		bOperadores = new JButton[4];
		bOperadores[0] = new JButton(" + ");
		bOperadores[1] = new JButton(" - ");
		bOperadores[2] = new JButton(" * ");
		bOperadores[3] = new JButton(" / ");
		
		JPanel p = new JPanel(new GridLayout(4,1));
		for(int cont=0;cont<this.bOperadores.length;cont++) {
			bOperadores[cont].setBackground(new Color(245, 245, 220));
			p.add(bOperadores[cont]);
			
		}
		
		return p;
	}
	
	
	// Control de los botones
	public void Control(Controlador ctr) {
		for (int cont = 0;cont<this.bDigitos.length;cont++) {
			bDigitos[cont].addActionListener(ctr);
			bDigitos[cont].addKeyListener(ctr);
			bDigitos[cont].addFocusListener(ctr);
		}
		
		for (int cont = 0;cont<this.bOperadores.length;cont++) {
			bOperadores[cont].addActionListener(ctr);
			bOperadores[cont].addKeyListener(ctr);
			bOperadores[cont].addFocusListener(ctr);
		}
		
		bpunto.addActionListener(ctr);
		bpunto.addKeyListener(ctr);
		bpunto.addFocusListener(ctr);
		
		bIgual.addActionListener(ctr);
		bIgual.addKeyListener(ctr);
		bIgual.addFocusListener(ctr);
		
		resultado.addKeyListener(ctr);
		
	}

	public JButton[] getbDigitos() {
		return bDigitos;
	}

	public JButton[] getbOperadores() {
		return bOperadores;
	}

	public JButton getBpunto() {
		return bpunto;
	}

	public JButton getbIgual() {
		return bIgual;
	}

	public JTextField getResultado() {
		return resultado;
	}
	
	
	
}
