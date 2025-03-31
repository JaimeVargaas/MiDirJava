package PrPrac19;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class Ejer2 extends JFrame {
	public Ejer2() {
		setTitle("Prueba eventos de ratón");
		setPreferredSize(new Dimension(500,200));
		
		JPanel panel = new JPanel();
		add(panel);

		JLabel eti1 = new JLabel("");
		JLabel eti2 = new JLabel("");

		panel.add(eti1);
		panel.add(eti2);
		
		panel.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				eti1.setText(e.getX()+"");
				eti2.setText(e.getY()+"");
				eti1.setForeground(Color.red);
				eti2.setForeground(Color.red);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				eti1.setText(e.getX()+"");
				eti2.setText(e.getY()+"");
				eti1.setForeground(Color.blue);
				eti2.setForeground(Color.blue);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				eti1.setText(e.getX()+"");
				eti2.setText(e.getY()+"");
				eti1.setForeground(Color.red);
				eti2.setForeground(Color.red);
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				eti1.setText(e.getX()+"");
				eti2.setText(e.getY()+"");
				eti1.setForeground(Color.blue);
				eti2.setForeground(Color.blue);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				eti1.setText(e.getX()+"");
				eti2.setText(e.getY()+"");
				eti1.setForeground(Color.red);
				eti2.setForeground(Color.red);
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
		new Ejer2();
	}
}
