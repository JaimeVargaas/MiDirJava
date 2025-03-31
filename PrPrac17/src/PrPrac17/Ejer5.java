package PrPrac17;

import javax.swing.JOptionPane;

public class Ejer5 {
	public static void main(String[] args) {
		try {
		String num = JOptionPane.showInputDialog("Escribe un número: ");
		
		
		if(num.equals("")) {
			  JOptionPane.showMessageDialog(null, "Dato Incorrecto","Error",JOptionPane.ERROR_MESSAGE);
		}
		else {
			
			 JOptionPane.showMessageDialog(null, "El número introducido es: " + num);
		}
		int numero = Integer.valueOf(num); 
		if(numero == 100)
			JOptionPane.showMessageDialog(null, "Enhorabuena, has ganado un premio");
		}
		
		catch (NullPointerException e) {
			System.out.println("Entrada cancelada");
		}
		
	}
}
