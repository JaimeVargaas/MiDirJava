package PrPac14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class GUI02Swing {

	public static void main(String[] args) {
		JFrame f = new JFrame("Ejercicio 2");
		Container gcp = f.getContentPane();
		
		gcp.setLayout(new BorderLayout(20,20));
		
		JButton Norte = new JButton("Norte");
		JButton Oeste = new JButton("Oeste");
		JButton Centro = new JButton("Centro");
		Centro.setBackground(Color.GRAY);
		Centro.setPreferredSize(new Dimension(100,100));;
		
		JButton Este = new JButton("Este");
		JButton Sur = new JButton("Sur");
		
		gcp.add(Norte,BorderLayout.NORTH);
		gcp.add(Oeste, BorderLayout.WEST);
		gcp.add(Centro, BorderLayout.CENTER);
		gcp.add(Este, BorderLayout.EAST);
		gcp.add(Sur, BorderLayout.SOUTH);
		
		f.pack();
		
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
