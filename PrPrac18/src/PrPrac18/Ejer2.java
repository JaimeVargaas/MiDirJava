package PrPrac18;

import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejer2 extends JFrame{
	// se definen como variables de instancia, porque al usar eventos se tienen que usar fuera del constructor
	private int puntos = 0;
	private JLabel etiqueta;
	private JTextField dado1Apuesta;
	private JTextField dado2Apuesta;
	private JTextField dado1Resultado;
	private JTextField dado2Resultado;
	private JButton bLanza;
	private int dado1;
	private int dado2;
	
	public Ejer2() {
		setTitle("Jugar a los dados");
		this.setIconImage(new ImageIcon("./recursos/Dados.gif").getImage());

		
		JPanel pnorte = new JPanel();	
		add(pnorte, BorderLayout.NORTH);
		
		etiqueta = new JLabel("              Puntos obtenidos: " + puntos);
		etiqueta.setForeground(Color.red);
		etiqueta.setFont(new Font("Comic Sans MS", Font.BOLD|Font.ITALIC, 14));
		
		pnorte.add(etiqueta);
		
		// -----------------------------------------------------------------------
		JPanel pcentro = new JPanel();
		add(pcentro, BorderLayout.CENTER);
		
		// Panel oeste dentro del panel del centro
		JPanel poeste = new JPanel(new GridLayout(2,1));
		pcentro.add(poeste,BorderLayout.WEST);
		poeste.setBorder(new CompoundBorder(new TitledBorder("Apuesta Jugador"), new BevelBorder(BevelBorder.RAISED)));
		
		dado1Apuesta = new JTextField("",10);
		dado2Apuesta = new JTextField("",10);
		
		dado1Apuesta.setBorder(new CompoundBorder(new TitledBorder("Dado 1"), new BevelBorder(BevelBorder.RAISED)));
		dado2Apuesta.setBorder(new CompoundBorder(new TitledBorder("Dado 2"), new BevelBorder(BevelBorder.RAISED)));
		poeste.add(dado1Apuesta);
		poeste.add(dado2Apuesta);
		
		
		// Panel este dentro del panel del centro
		JPanel peste = new JPanel(new GridLayout(2,1));
		pcentro.add(peste);
		peste.setBorder(new CompoundBorder(new TitledBorder("Resultado"), new BevelBorder(BevelBorder.RAISED)));
		
		dado1Resultado = new JTextField("",10);
		dado2Resultado = new JTextField("",10);
		
		dado1Resultado.setBorder(new CompoundBorder(new TitledBorder("Dado 1"), new BevelBorder(BevelBorder.RAISED)));
		dado2Resultado.setBorder(new CompoundBorder(new TitledBorder("Dado 2"), new BevelBorder(BevelBorder.RAISED)));
		
		dado1Resultado.setEditable(false);
		dado2Resultado.setEditable(false);
		
		peste.add(dado1Resultado);
		peste.add(dado2Resultado);
		
		// -----------------------------------------------------------------------
		
		JPanel psur = new JPanel();
		add(psur, BorderLayout.SOUTH);
		
		bLanza = new JButton("Lanzar dados",
				 new ImageIcon("recursos/dados-03.gif"));
		bLanza.setBorder(new BevelBorder(BevelBorder.RAISED));
	
		psur.add(bLanza);
		// -----------------------------------------------------------------------
		
		// Evento que ocurre al pulsar el botón
		bLanza.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				dado1 = (int) (Math.random()*6+1);
				dado2 = (int) (Math.random()*6+1);
				dado1Resultado.setText(String.valueOf(dado1));
				dado2Resultado.setText(String.valueOf(dado2));
				
				int d1 = Integer.parseInt(dado1Apuesta.getText());
				int d2 = Integer.parseInt(dado2Apuesta.getText());
				
				
				if ((d1<1) || (d1>6) || (d2<1) || (d2>6))
					throw new NumberFormatException();
				
				if(d1 == dado1 && d2 == dado2)
					puntos+=25;
				else if (d1 == dado1 || d2 == dado2)
					puntos+=10;
				else
					puntos-=25;
				
				etiqueta.setText("              Puntos obtenidos: " + puntos);
			}
			catch (NumberFormatException a) {
				JOptionPane.showMessageDialog(null, "Los números tienen que ser entre 1 y 6");
			}	
			}
		});
		
		// -----------------------------------------------------------------------
		// Config de ventana
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ejer2();
	}
}
