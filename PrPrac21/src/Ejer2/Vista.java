package Ejer2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;


public class Vista extends JPanel {
	private double cambioDolar;
	private String cambio;
    private JLabel etiquetaVisor;
    private JTextField tf;
    private JButton aEuros, aDolares, desglosar;
    private JTextArea resultado;
    private JScrollPane sp;
	
	public Vista() {
		
		try {
			// cambio a dolar
	    	this.cambio = JOptionPane.showInputDialog("Indique el cambio a dolar"); //Para crear la primera pantalla del programa
			cambioDolar=Double.parseDouble(cambio);
		}
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null,"No has introducido un número válido para el cambio, se tomará en 1");
			this.cambioDolar=1;
		}
		catch (NullPointerException e1) {
			JOptionPane.showMessageDialog(null,"No has introducido un número válido para el cambio, se tomará en 1");
			this.cambioDolar=1;
		}
		
		
    	this.setLayout(new BorderLayout());
    	
		//-------------------------------------------------------------------------------
		// Panel Norte
		//-------------------------------------------------------------------------------
		//Creamos un panel principal
    	JPanel panelNorte = new JPanel(new FlowLayout());
    	this.add(panelNorte, BorderLayout.NORTH);
    	
    	etiquetaVisor = new JLabel("Visor de resultado");
    	tf = new JTextField(10);
    	
    	panelNorte.add(etiquetaVisor);
    	panelNorte.add(tf);


    	//-------------------------------------------------------------------------------
    	// Panel Centro
    	//-------------------------------------------------------------------------------
    	JPanel panelCentro = new JPanel(new FlowLayout());
    	this.add(panelCentro, BorderLayout.CENTER);
    	
    	aEuros = new JButton("A euros");
    	aEuros.setForeground(Color.blue);
    	aEuros.setFont(new Font("Comic Sans MS", Font.BOLD|Font.ITALIC, 20));
    	
    	aDolares = new JButton("A dolares");
    	aDolares.setForeground(Color.blue);
    	aDolares.setFont(new Font("Comic Sans MS", Font.BOLD|Font.ITALIC, 20));
    	
    	desglosar = new JButton("Desglosar");
    	desglosar.setForeground(Color.blue);
    	desglosar.setFont(new Font("Comic Sans MS", Font.BOLD|Font.ITALIC, 20));
    		
    	panelCentro.add(aEuros);
    	panelCentro.add(aDolares);
    	panelCentro.add(desglosar);
    	
    	//-------------------------------------------------------------------------------
    	// Panel Sur
    	//-------------------------------------------------------------------------------
    	
    	resultado = new JTextArea(10,5);
    	resultado.setEditable(false);
    	sp = new JScrollPane(resultado);
    	
    	this.add(sp, BorderLayout.SOUTH);
	}
	
	// Controlador
	 public void control(Controlador ctr) {
		 this.aEuros.addActionListener(ctr);
		 this.aDolares.addActionListener(ctr);
		 this.desglosar.addActionListener(ctr);
	 }
	

	public String getCambio() {
		return cambio;
	}

	public JLabel getEtiquetaVisor() {
		return etiquetaVisor;
	}

	public JTextField getTf() {
		return tf;
	}

	public JButton getaEuros() {
		return aEuros;
	}

	public JButton getaDolares() {
		return aDolares;
	}

	public JButton getDesglosar() {
		return desglosar;
	}

	public JTextArea getResultado() {
		return resultado;
	}

	public JScrollPane getSp() {
		return sp;
	}

	public double getCambioDolar() {
		return cambioDolar;
	}
	
	
}
