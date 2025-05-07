package PrPrac20;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Ejer2v2 extends JFrame {

    private JCheckBox diesel, asientos, tapiceria, llantas, pintura;
    private JComboBox<String> cbRadios;
    private JList<String> listaColores;
    private JLabel etiqueta;
    private JScrollPane scrollLista;
    
    private Map<String,Color> mapaColores;
    
    public Ejer2v2() {
    	
    	//Creamos un panel principal
    	JPanel panelPrincipal = new JPanel();
    	panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
    	panelPrincipal.setPreferredSize(new Dimension(300,350));
    	panelPrincipal.setBorder(new EmptyBorder(15,15,15,15));
    	
    	// Añadir al panel principal el panel con los check
    	// JPanel pCheck = preparaPanelCheck();
    	// panelPrincipal.add(pCheck);
    	
    	panelPrincipal.add(preparaPanelCheck());
    	panelPrincipal.add(preparaPanelLlanta());
    	panelPrincipal.add(preparaPanelColor());
    	panelPrincipal.add(preparaPanelInf());
    	
    	// añadir paneles
    	this.getContentPane().add(panelPrincipal);
    	
    	// Añadir el control de eventos
    	this.listaColores.addListSelectionListener(new ControlLista());
    	
    	// si se va a programar varios elementos se crea un objeto en vez de hacerlo uno por uno
    	ControlItem ci = new ControlItem();
    	this.diesel.addItemListener(ci);
    	this.asientos.addItemListener(ci);
    	this.tapiceria.addItemListener(ci);
    	this.llantas.addItemListener(ci);
    	this.pintura.addItemListener(ci);
    	
    	this.cbRadios.addItemListener(ci);
    	
    	// Config de ventana
    	pack();
    	setLocationRelativeTo(null);
    	setVisible(true);
    	setResizable(false);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
    
    
    public static void main(String[] args) {
    	new Ejer2v2();
    }
    
    
    // Clase que va a programar los eventos de las listas (JList) con la ayuda de la interfaz ListSelectionListener
    class ControlLista implements ListSelectionListener {

		@Override
		public void valueChanged(ListSelectionEvent e) {
			etiqueta.setText("Color pintura: " + listaColores.getSelectedValue());
			
			etiqueta.setForeground(mapaColores.get(listaColores.getSelectedValue()));
		}
    	
    } // Fin clase control lista

    
    // Clase para programar los eventos de tipo itemEvent, concretamente vamos a programar los checkbox y el combobox
    class ControlItem implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			// Comprobar si el componente que se ha activado es el JComboBox
			if(e.getSource() == cbRadios) {
				etiqueta.setText("Número de radios: " + cbRadios.getSelectedItem());
				return;
			}
			
			// si continuamos en esta línea de código es porque se ha marcado/desmarcado un check
			// Guardar en variables locales el texto del check y su estado
			
			String textoCheck = ((JCheckBox)e.getSource()).getText();
			int estadoCheck = e.getStateChange(); // selected o deselected
			
			// mostrar en la etiqueta el texto del check activado
			etiqueta.setText(textoCheck);
			
			// programar los check de llantas, pintura y asientos
			if(e.getSource() == llantas) {
				if(estadoCheck == ItemEvent.SELECTED) {
					cbRadios.setEnabled(true);
				}
				else
					cbRadios.setEnabled(false);
			}
			
			else if(e.getSource() == pintura) {
				if(estadoCheck == ItemEvent.SELECTED)
					scrollLista.setVisible(true);
				else
					scrollLista.setVisible(false);
			}
			else if(e.getSource() == asientos) { 
				if(estadoCheck == ItemEvent.SELECTED) {
					tapiceria.setEnabled(true);
					tapiceria.setSelected(false);
				}
				else {
					tapiceria.setEnabled(false);
					tapiceria.setSelected(true);
				}
					
	
			}
				
				
		}
    	
    } // Fin controlitem
    
} // Fin clase principal