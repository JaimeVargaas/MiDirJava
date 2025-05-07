package PrPrac23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Prac11.*;

public class Controlador implements ActionListener{
	private Vista miVista;
	
	public Controlador(Vista v) {
		miVista = v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ----------------------------------------------------------------------------
		// Accion guardar
		// ----------------------------------------------------------------------------
		
		if (miVista.getCbTipoPropiedad().getSelectedItem()==TipoPropiedad.vivienda) {
			miVista.getTipoVivienda().setEnabled(true);
			miVista.getCbNumDormitorios().setEnabled(true);
			miVista.getCbNumDormitorios().setEnabled(true);
		}
		else {
			miVista.getTipoVivienda().setEnabled(false);
			miVista.getCbNumDormitorios().setEnabled(false);
			miVista.getCbNumDormitorios().setEnabled(false);
		}
		
		if(e.getSource() == miVista.getGuardar()) {
			
			if (miVista.getCbTipoPropiedad().getSelectedItem()==TipoPropiedad.vivienda) {
			 Propiedad p;
			 p = new Vivienda(Integer.parseInt(miVista.getCodigo().toString()), TipoPropiedad.vivienda, miVista.getDescripcion().getText(), 
					 Double.parseDouble(miVista.getSuperficie().getText()),
					 miVista.getDescripcion().getText(), 
					 Double.parseDouble(miVista.getCampoPrecio().getText()), 
					 null, 
					 Integer.parseInt(miVista.getCbNumBaños().getSelectedItem().toString()) , 
					 Integer.parseInt(miVista.getCbNumDormitorios().getSelectedItem().toString()));
			
		}
			
		
		}
		
	}}
