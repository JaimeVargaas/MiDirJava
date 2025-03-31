package PrPrac16;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejer3 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Ejer3() {

	setTitle("Mi calculadora");
	
	JPanel p1 = new JPanel(new FlowLayout());
	add(p1, BorderLayout.NORTH);
	
	JLabel etiqueta = new JLabel("Resultado");
	
	JTextField res = new JTextField(15);
	p1.add(etiqueta);
	p1.add(res);
	res.setEditable(false);
	
	
	// ----------------------------------------------------------------------------------------
	JPanel p2 = new JPanel(new GridLayout(4,4));
	add(p2, BorderLayout.CENTER);
	JButton b1 = new JButton("1");	
	JButton b2 = new JButton("2");	
	JButton b3 = new JButton("3");	
	JButton b4 = new JButton("+");	
	JButton b5 = new JButton("4");	
	JButton b6 = new JButton("5");	
	JButton b7 = new JButton("6");	
	JButton b8 = new JButton("-");	
	JButton b9 = new JButton("7");	
	JButton b10 = new JButton("8");	
	JButton b11 = new JButton("9");	
	JButton b12 = new JButton("*");	
	JButton b13 = new JButton("0");	
	JButton b14 = new JButton("C");	
	JButton b15 = new JButton("=");	
	JButton b16 = new JButton("/");	
	
	p2.add(b1);
	p2.add(b2);
	p2.add(b3);
	p2.add(b4);
	p2.add(b5);
	p2.add(b6);
	p2.add(b7);
	p2.add(b8);
	p2.add(b9);
	p2.add(b10);
	p2.add(b11);
	p2.add(b12);
	p2.add(b14);
	p2.add(b13);
	p2.add(b15);
	p2.add(b16);
	
	// ----------------------------------------------------------------------------------------
	JPanel p3 = new JPanel(new GridLayout());
	add(p3, BorderLayout.SOUTH);
	
	ButtonGroup grupoBoton = new ButtonGroup();
	JRadioButton rb1 = new JRadioButton("Dec", true);
	JRadioButton rb2 = new JRadioButton("Bin");
	JRadioButton rb3 = new JRadioButton("Hex");
	JRadioButton rb4 = new JRadioButton("Oct");
	
	grupoBoton.add(rb1);
	grupoBoton.add(rb2);
	grupoBoton.add(rb3);
	grupoBoton.add(rb4);
	
	p3.add(rb1);
	p3.add(rb2);
	p3.add(rb3);
	p3.add(rb4);
	
	
	// ----------------------------------------------------------------------------------------
	
	b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			res.setText(res.getText()+"1");
		}
	});
	
	b2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			res.setText(res.getText()+"2");
		}
	});
	
	b3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			res.setText(res.getText()+"3");
		}
	});

	b5.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			res.setText(res.getText()+"4");
		}
	});

	b6.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			res.setText(res.getText()+"5");
		}
	});

	b7.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			res.setText(res.getText()+"6");
		}
	});

	b9.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			res.setText(res.getText()+"7");
		}
	});

	b10.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			res.setText(res.getText()+"8");
		}
	});

	b11.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			res.setText(res.getText()+"9");
		}
	});

	b13.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			res.setText(res.getText()+"0");
		}
	});


	b4.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			res.setText(res.getText()+" + ");
		}
	});

	b8.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			res.setText(res.getText()+" - ");
		}
	});

	b12.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			res.setText(res.getText()+" * ");
		}
	});
	
	b16.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			res.setText(res.getText()+" / ");
		}
	});
	
	b14.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			res.setText("");
		}
	});
	
	b15.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			
			String res1 = res.getText();
			double res2 = Double.parseDouble(res1);
			String res3 = String.valueOf(res2);
			res.setText(res3);
		}
	});
	
	
	// ----------------------------------------------------------------------------------------
	add(new Label("               "),BorderLayout.EAST);
	add(new Label("               "),BorderLayout.WEST);
	
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
