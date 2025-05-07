package PrPrac22;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.UIManager;

// teclado o pulsar una tecla del teclado(keylstener)
//accion o pulsar un boton con el ratón(actionlistener)
//foco o ganar o perder el foco de un boton(focuslistener)

public class Controlador implements ActionListener,KeyListener,FocusListener {
	
	// Variables de instancia
	private Vista miVista;
	private ProcesaDatos pd;
	
	public Controlador(Vista v) {
		miVista=v;
		pd = new ProcesaDatos(miVista.getResultado());
	}
	
	// metodos de la interfaz focuslistener
	@Override
	public void focusGained(FocusEvent e) {
		e.getComponent().setBackground(Color.gray);
	}

	@Override
	public void focusLost(FocusEvent e) {
		// primera forma: preguntando por el texto del boton
//		JButton botonPulsado = (JButton) e.getSource();
//		if(botonPulsado.getText().equalsIgnoreCase(" + ")||botonPulsado.getText().equalsIgnoreCase(" - ")||
//		   botonPulsado.getText().equalsIgnoreCase(" / ")||botonPulsado.getText().equalsIgnoreCase(" * ")||
//		   botonPulsado.getText().equalsIgnoreCase(" . ")||botonPulsado.getText().equalsIgnoreCase(" = "))
//			e.getComponent().setBackground(UIManager.getColor("Button.setbackground"));
//		else
//			e.getComponent().setBackground(Color.cyan);
//		
		// segunda forma: preguntando directamente por el componente
//		if(e.getSource() == miVista.getbIgual() || 
//		   e.getSource() == miVista.getBpunto() ||
//		   e.getSource() == miVista.getbOperadores()[0] ||
//		   e.getSource() == miVista.getbOperadores()[1] ||
//		   e.getSource() == miVista.getbOperadores()[2] || 
//		   e.getSource() == miVista.getbOperadores()[3])
//			e.getComponent().setBackground(UIManager.getColor("Button.background"));
//		
//		else
//			e.getComponent().setBackground(Color.cyan);
		
		// Tercera forma: convirtiendo el texto del boton en un número, si salta la excepciçon, sabemos que no se trata de un dígito
		// y sino salta la excepcion sabemso que si se trata de un dígito
//		JButton botonPulsado = (JButton)e.getSource();
//
//		try {
//			Integer.parseInt(botonPulsado.getText());
//			e.getComponent().setBackground(Color.cyan);
//		}
//		catch(NumberFormatException e1) {
//			e.getComponent().setBackground(UIManager.getColor("Button.background"));
//		}
		
		// cuarta forma: con expresiones regulares
		JButton botonPulsado = (JButton)e.getSource();
		if(botonPulsado.getText().matches("[0-9]"))
			e.getComponent().setBackground(Color.cyan);
		else
			e.getComponent().setBackground(UIManager.getColor("Button.background"));
	}

	// metodos de la interfaz actionlistener
	@Override
	public void keyTyped(KeyEvent e) {
		// Obtener el valor de la tecla pulsada
		char valorTecla = e.getKeyChar();
		
		// Definir una variable de tipo JButton que será una referencia al botón cuyo valor coincide con el de la tecla pulsada,
		// sino coincide la tecla con ningún valor, esta variable estará a null
		JButton botonPulsado = null;
		try {
		botonPulsado = asignaFoco(valorTecla);
			if(botonPulsado!=null)
				pd.procesa(valorTecla);
		}
		catch (MiExcepcion e2) {
			botonPulsado.setBackground(Color.red);
			miVista.getResultado().setText(e2.getMessage());
		}
	}
	
	public JButton asignaFoco(char valorTecla) {
		
		JButton botonPulsado = switch (valorTecla) {
			case '+' -> miVista.getbOperadores()[0]; 
			case '-' -> miVista.getbOperadores()[1];
			case '*' -> miVista.getbOperadores()[2]; 
			case '/' -> miVista.getbOperadores()[3]; 
			case '.' -> miVista.getBpunto(); 
			case '=' -> miVista.getbIgual(); 
			case '0','1','2','3','4','5','6','7','8','9'
			   -> miVista.getbDigitos()[valorTecla-48]; 
			               // Se resta 48 porque está devolviendo el valor ascii del número
			default -> null;
		};
		
		if (botonPulsado!=null)
			botonPulsado.requestFocus();  // Asigno el foco a ese botón
		
		return botonPulsado;
	}

	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}
	
	// metodos de la interfaz actionlistener
	@Override
	public void actionPerformed(ActionEvent e) {
		// obtener una referencia al boton pulsado
		JButton botonPulsado = (JButton) e.getSource();
		
		// Guardar el caracter del boton pulsado
		char valorBoton = botonPulsado.getActionCommand().charAt(0);
		
		try {
			pd.procesa(valorBoton);
		}
		catch(MiExcepcion e1) {
			botonPulsado.setBackground(Color.red);
			miVista.getResultado().setText(e1.getMessage());
		}
		
	}
}
	

