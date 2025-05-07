package Ejer2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Controlador implements ActionListener{

private Vista miVista;

	public Controlador(Vista v) {
		miVista = v;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		try {
			JButton bPulsado = (JButton) e.getSource();
			double num = Double.parseDouble(miVista.getTf().getText());
			double dolares = miVista.getCambioDolar();


			if(bPulsado.getText().equalsIgnoreCase("A euros")) {
				miVista.getTf().setText(String.valueOf(num/dolares));
			}

			if(bPulsado.getText().equalsIgnoreCase("A dolares")) {
				miVista.getTf().setText(String.valueOf(num*dolares));
			}
		}// End try
		
		catch (NumberFormatException e1) {
			JOptionPane.showMessageDialog(null, "Debe introducir un número.");
		}


	}
	
	
	
}
