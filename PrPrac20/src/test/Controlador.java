package test;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Controlador implements ListSelectionListener, ItemListener{

	private Vista miVista;
	
	public Controlador(Vista v) {
		miVista = v;
	}
	
	// Método de la interfaz
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == miVista.getCbRadios()) {
			miVista.getEtiqueta().setText("Número de radios: " + miVista.getCbRadios().getSelectedItem());
			return;
		}
		
		// si continuamos en esta línea de código es porque se ha marcado/desmarcado un check
		// Guardar en variables locales el texto del check y su estado
		
		String textoCheck = ((JCheckBox)e.getSource()).getText();
		int estadoCheck = e.getStateChange(); // selected o deselected
		
		// mostrar en la etiqueta el texto del check activado
		miVista.getEtiqueta().setText(textoCheck);
		
		// programar los check de llantas, pintura y asientos
		if(e.getSource() == miVista.getLlantas()) {
			if(estadoCheck == ItemEvent.SELECTED) {
				miVista.getCbRadios().setEnabled(true);
			}
			else
				miVista.getCbRadios().setEnabled(false);
		}
		
		else if(e.getSource() == miVista.getPintura()) {
			if(estadoCheck == ItemEvent.SELECTED)
				miVista.getScrollLista().setVisible(true);
			else
				miVista.getScrollLista().setVisible(false);
		}
		else if(e.getSource() == miVista.getAsientos()) { 
			if(estadoCheck == ItemEvent.SELECTED) {
				miVista.getTapiceria().setEnabled(true);
				miVista.getTapiceria().setSelected(false);
			}
			else {
				miVista.getTapiceria().setEnabled(false);
				miVista.getTapiceria().setSelected(true);
			}
				

		}
	}

	// Método de la lista
	@Override
	public void valueChanged(ListSelectionEvent e) {
			miVista.getEtiqueta().setText("Color pintura: " + miVista.getListaColores().getSelectedValue());
			
			miVista.getEtiqueta().setForeground(miVista.getMapaColores().get(miVista.getListaColores().getSelectedValue()));
		}
	}
	
