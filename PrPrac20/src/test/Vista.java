package test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;



public class Vista extends JPanel {
	 private JCheckBox diesel, asientos, tapiceria, llantas, pintura;
	    private JComboBox<String> cbRadios;
	    private JList<String> listaColores;
	    private JLabel etiqueta;
	    private JScrollPane scrollLista;
	    
	    private Map<String,Color> mapaColores;
	    
	    public Vista() {
	    	
	    	//Creamos un panel principal
	    	JPanel panelPrincipal = new JPanel();
	    	panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
	    	panelPrincipal.setPreferredSize(new Dimension(300,350));
	    	panelPrincipal.setBorder(new EmptyBorder(15,15,15,15));
	
	    	
	    	panelPrincipal.add(preparaPanelCheck());
	    	panelPrincipal.add(preparaPanelLlanta());
	    	panelPrincipal.add(preparaPanelColor());
	    	panelPrincipal.add(preparaPanelInf());
	    	
	    	// añadir paneles
	    	this.add(panelPrincipal);
	    	
	    }

	    // método que crea los check y prepara el panel con ellos
	    private JPanel preparaPanelCheck() {

	    	// Pedir memoria para los check
	    	this.diesel= new JCheckBox("Diesel", true);
	    	this.asientos = new JCheckBox("Asientos deportivos", true);
	    	this.tapiceria = new JCheckBox("Tapicería de cuero", true);
	    	this.tapiceria.setEnabled(false);
	    	
	    	this.llantas = new JCheckBox("Llantas de aleación", false);
	    	this.pintura = new JCheckBox("Pintura metalizada", true);
	    	
	    	JPanel p = new JPanel(new GridLayout(5,1));
	    	p.setBorder(new TitledBorder("Elija extras"));
	    	
	    	p.add(diesel);
	    	p.add(asientos);
	    	p.add(tapiceria);
	    	p.add(llantas);
	    	p.add(pintura);
	    	
	    	return p;
	    }

	    // Metodo que crea el combo de las llantas
	    private JPanel preparaPanelLlanta() {
	    	String [] array = {"Tres radios", "Cinco radios", "Siete radios", "Nueve radios"};
	    	
	    	// Pedir memoria para combo
	    	cbRadios = new JComboBox<String>(array);
	    	this.cbRadios.setEnabled(false);
	    	
	    	JPanel p = new JPanel();
	    	p.setBorder(new TitledBorder("Elija número de llantas"));
	    	
	    	p.add(cbRadios);
	    	
	    	return p;
	    }
	    
	    private JPanel preparaPanelColor() {
	    	// String [] array = {"Rojo", "Verde"};
	    	
	    	this.mapaColores = new HashMap<String, Color>();
	    	
	    	mapaColores.put("Rojo", Color.red);
	    	mapaColores.put("Verde", Color.green);
	    	mapaColores.put("Negro", Color.black);
	    	
	    	Vector<String> listaClaves = new Vector<String>(mapaColores.keySet());
	    	
	    	listaColores = new JList<String>(listaClaves);
	    	scrollLista = new JScrollPane(listaColores);
	    	scrollLista.setPreferredSize(new Dimension(80,35));
	    	
	    	JPanel p = new JPanel();
	    	p.setBorder(new TitledBorder("Elija color"));
	    	p.add(scrollLista);
	    	p.setPreferredSize(new Dimension(80,80));
	    	
	    	return p;
	    }
	    
	    private JPanel preparaPanelInf() {
	    	etiqueta = new JLabel("Información");
	    	etiqueta.setForeground(Color.blue);
	    	
	    	JPanel p = new JPanel();
	    	p.setBorder(new TitledBorder("Acciones realizadas"));
	    	p.add(etiqueta);   	
	    	
	    	return p;
	    	
	    }
	    
	    public void control(Controlador ctr) {
	    	// Añadir el control de eventos
	    	this.listaColores.addListSelectionListener(ctr);
	    	
	    	// si se va a programar varios elementos se crea un objeto en vez de hacerlo uno por uno
	    	this.diesel.addItemListener(ctr);
	    	this.asientos.addItemListener(ctr);
	    	this.tapiceria.addItemListener(ctr);
	    	this.llantas.addItemListener(ctr);
	    	this.pintura.addItemListener(ctr);
	    	
	    	this.cbRadios.addItemListener(ctr);
	    	
	    }

		public JCheckBox getDiesel() {
			return diesel;
		}

		public JCheckBox getAsientos() {
			return asientos;
		}

		public JCheckBox getTapiceria() {
			return tapiceria;
		}

		public JCheckBox getLlantas() {
			return llantas;
		}

		public JCheckBox getPintura() {
			return pintura;
		}

		public JComboBox<String> getCbRadios() {
			return cbRadios;
		}

		public JList<String> getListaColores() {
			return listaColores;
		}

		public JLabel getEtiqueta() {
			return etiqueta;
		}

		public JScrollPane getScrollLista() {
			return scrollLista;
		}

		public Map<String, Color> getMapaColores() {
			return mapaColores;
		}
	    
	    
}
