package PrPrac26;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class Vista extends JPanel{
	// variables de instancia del panel norte g
	private JLabel titulo, x1, x2, y1,y2, coorOrigen, coorDestino;
	private JTextField x1tf, y1tf, x2tf, y2tf;
	
	// variables de instancia del panel centro
	private JLabel tipoDescuento, billeteFamiliar, descuentoAplicar;
	private JComboBox<String> descuento;
	private JCheckBox familia;
	
	// variables de instancia del panel sur
	private JLabel distancia, precioBillete;
	private JButton calcular, cancelar, venderBillete;
	
	public Vista() {
    	
    	//Creamos un panel principal
    	JPanel panelPrincipal = new JPanel();
    	panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
    	panelPrincipal.setBorder(new EmptyBorder(15,15,15,15));

    	
    	panelPrincipal.add(panelNorte(), BorderLayout.NORTH);
    	panelPrincipal.add(panelCentro(), BorderLayout.CENTER);
    	panelPrincipal.add(panelSur(), BorderLayout.SOUTH);
    	
    	// añadir paneles
    	this.add(panelPrincipal);
    	
    }
	
	private JPanel panelNorte() {
		titulo = new JLabel("VENTA DE BILLETES DE TREN");
		Font fuente = new Font("Calibri", 3, 23);
        titulo.setFont(fuente);
        
        JPanel pNorte = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        pNorte.add(titulo);
        
        
        // primera linea
        coorOrigen = new JLabel("Coordenadas de origen:       ");
        
        x1 = new JLabel("X");
        x1tf = new JTextField("0",3);
        
        y1 = new JLabel("Y");
        y1tf= new JTextField("0",3);

        // Segunda linea
        coorDestino = new JLabel("Coordenadas de Destino:       ");

        x2 = new JLabel("X");
        x2tf = new JTextField("0",3);

        y2 = new JLabel("Y");
        y2tf= new JTextField("0",3);
  
        // Panel sur dentro del panel norte
        JPanel pSur = new JPanel(new GridLayout(2,1));
        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
        
        p1.add(coorOrigen);
        p1.add(x1);
        p1.add(x1tf);
        p1.add(y1);
        p1.add(y1tf);
        p2.add(coorDestino);
        p2.add(x2);
        p2.add(x2tf);
        p2.add(y2);
        p2.add(y2tf);
        pSur.add(p1); 
        pSur.add(p2); 
        
        JPanel p = new JPanel(new BorderLayout(0,5));
        pSur.setBorder(new TitledBorder("Indique las coordenadas origen/destino "));
        p.add(pNorte, BorderLayout.NORTH);
        p.add(pSur, BorderLayout.CENTER);
        
        return p;
	}
	
	private JPanel panelCentro() {
		tipoDescuento = new JLabel("Tipo descuento");
		
		String [] array = {enumDescuento.sinDescuento.getDescripcion(),
						   enumDescuento.menor7Años.getDescripcion(),
						   enumDescuento.menor12Años.getDescripcion(),
						   enumDescuento.menor18Años.getDescripcion(),
						   enumDescuento.desempleado.getDescripcion(),
						   enumDescuento.jubilado.getDescripcion(),
						   enumDescuento.universitario.getDescripcion()
						  };
		descuento = new JComboBox<String>(array);
		
		familia = new JCheckBox();
		billeteFamiliar = new JLabel("Billete familiar       ");
		descuentoAplicar = new JLabel("Descuento a aplicar: 0%");
		
		JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p.setBorder(new TitledBorder("Posibles descuentos"));
		
		p.add(tipoDescuento);
		p.add(descuento);
		p.add(familia);
		p.add(billeteFamiliar);
		p.add(descuentoAplicar);
		
		return p;
	}
	
	private JPanel panelSur() {
		distancia = new JLabel("Distancia: 0.00km");
		precioBillete = new JLabel("Precio Billete: 0€");
		
		JPanel pNorte = new JPanel(new BorderLayout());
		pNorte.setBorder(new TitledBorder("Distancia y precio a pagar"));
		
		distancia.setHorizontalAlignment(JLabel.CENTER);
		precioBillete.setHorizontalAlignment(JLabel.CENTER);
		
		pNorte.add(distancia, BorderLayout.NORTH);
		pNorte.add(precioBillete, BorderLayout.SOUTH);
		
		
		calcular = new JButton("Calcular");
		cancelar = new JButton("Cancelar");
		venderBillete = new JButton("Vender billete");
		
		JPanel pSur = new JPanel(new FlowLayout(FlowLayout.CENTER));
		pSur.add(calcular);
		pSur.add(cancelar);
		pSur.add(venderBillete);
		
		JPanel p = new JPanel(new BorderLayout());
		p.add(pNorte, BorderLayout.NORTH);
		p.add(pSur, BorderLayout.SOUTH);
		
		return p;
	}
	
}
