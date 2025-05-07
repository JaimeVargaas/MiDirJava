package PrPrac23;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.concurrent.Flow;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;


import Prac11.*;

public class Vista extends JPanel {
	
	// Panel norte variables
	private JLabel codigo, tipoPropiedad, precio, superficie, direccion, descripcion;
	private JTextField campoCodigo, campoPrecio, campoSuperficie;
	private JComboBox<String> cbTipoPropiedad;
	private JTextArea areaDireccion, areaDescripcion;
	
	// Panel centro variables
	private JLabel tipoVivienda, numDormitorios, numBaños;
	private JComboBox<String> cbTipoVivienda, cbNumBaños;
	private JComboBox<String> cbNumDormitorios;
	
	// Panel sur variables
	private JLabel tipoTerreno, suministroElectrico, suministroAgua, disponeVivienda;
	private JComboBox<String> cbTipoTerreno;
	private JRadioButton cbSi1, cbNo1, cbSi2, cbNo2,cbSi3, cbNo3;
	private ButtonGroup g1, g2,g3;
	
	// Panel boton variables
	private JButton guardar, consultar, borrar, limpiar;
	
	public Vista() {
		setLayout(new BorderLayout());
		add(panelNorte(), BorderLayout.NORTH);
		add(panelCentro(), BorderLayout.CENTER);
		add(panelBoton(), BorderLayout.SOUTH);
	}

 	public JPanel panelNorte() {

		// definir variables de instancia
		codigo = new JLabel("Código: ");
		campoCodigo = new JTextField(5);

		tipoPropiedad = new JLabel("Tipo de propiedad");

		String [] array = new String[5];
		array[0] = TipoPropiedad.aparcamiento.getDescripcion();
		array[1] = TipoPropiedad.finca.getDescripcion();		
		array[2] = TipoPropiedad.local.getDescripcion();		
		array[3] = TipoPropiedad.solar.getDescripcion();		
		array[4] = TipoPropiedad.vivienda.getDescripcion();		
		cbTipoPropiedad = new JComboBox<String>(array);

		precio = new JLabel("Precio: ");
		campoPrecio=new JTextField(10);

		superficie = new JLabel("Superficie: ");
		campoSuperficie = new JTextField(5);

		direccion = new JLabel("Dirección: ");
		areaDireccion = new JTextArea(1,50);	
		areaDireccion.setBorder(BorderFactory.createLineBorder(Color.blue));

		descripcion = new JLabel("Descripción: ");
		areaDescripcion = new JTextArea(5,50);
		areaDescripcion.setBorder(BorderFactory.createLineBorder(Color.blue));

		JPanel p = new JPanel(new BorderLayout());

		// Panel norte dentro de panel para que salga organizado como en la práctica
		JPanel pArriba = new JPanel(new FlowLayout());
		pArriba.add(codigo);
		pArriba.add(campoCodigo);
		pArriba.add(tipoPropiedad);
		pArriba.add(cbTipoPropiedad);
		pArriba.add(precio);
		pArriba.add(campoPrecio);
		pArriba.add(superficie);
		pArriba.add(campoSuperficie);

		p.add(pArriba, BorderLayout.NORTH);

		// panel centro
		JPanel pCentro = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pCentro.add(direccion);
		pCentro.add(areaDireccion);

		p.add(pCentro, BorderLayout.CENTER);

		// panel sur
		JPanel pSur = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pSur.add(descripcion); 
		pSur.add(areaDescripcion); 
		p.add(pSur, BorderLayout.SOUTH);

		p.setBorder(new TitledBorder("Datos Generales"));

		return p;

	}


	public JPanel panelCentro() {

		tipoVivienda = new JLabel("Tipo de vivienda: ");

		String [] array = new String[5];
		array[0] = TipoVivienda.ADOSADO.toString();
		array[1] = TipoVivienda.CASA.toString();
		array[2] = TipoVivienda.CHALET.toString();
		array[3] = TipoVivienda.DUPLEX.toString();
		array[4] = TipoVivienda.PISO.toString();
		cbTipoVivienda = new JComboBox<String>(array);
		cbTipoVivienda.setEnabled(false);

		numDormitorios = new JLabel("Número de dormitorios: ");
		String[] array2 = new String [10];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = String.valueOf(i+1);
		}
		cbNumDormitorios = new JComboBox<String>(array2);
		cbNumDormitorios.setEnabled(false);

		numBaños = new JLabel("Número de baños: ");
		String[] array3 = new String[7];
		for (int i = 0; i < array3.length; i++) {
			array3[i] = String.valueOf(i+1);
		}
		cbNumBaños = new JComboBox<String>(array3);
		cbNumBaños.setEnabled(false);

		JPanel p = new JPanel(new BorderLayout());
		JPanel pNorte = new JPanel();
		p.add(pNorte, BorderLayout.NORTH);

		pNorte.setBorder(new TitledBorder("Datos específicos para vivienda"));
		pNorte.add(tipoVivienda);
		pNorte.add(cbTipoVivienda);
		pNorte.add(numDormitorios);
		pNorte.add(cbNumDormitorios);
		pNorte.add(numBaños);
		pNorte.add(cbNumBaños);

		p.add(panelSur(), BorderLayout.SOUTH);
		
		return p;

	}

	public JPanel panelSur() {

		
		// panel norte
		
		// ----------------------------------------------------------------------------
		// FINCAS RUSTICAS
		// ----------------------------------------------------------------------------
		tipoTerreno = new JLabel("Tipo Terreno");
		String [] array = new String[3];
		array [0] = TipoTerreno.OLIVOS.toString();
		array[1] = TipoTerreno.REGADIO.toString();
		array[2] = TipoTerreno.SECANO.toString();
		cbTipoTerreno = new JComboBox<String>(array);
		
		suministroElectrico = new JLabel("Suministro eléctrico");
		cbSi1 = new JRadioButton("Si", true);
		cbNo1 = new JRadioButton("No", false);
		g1 = new ButtonGroup();
		g1.add(cbSi1);
		g1.add(cbNo1);
		
		suministroAgua = new JLabel("Suministro de Agua");
		cbSi2 = new JRadioButton("Si", true);
		cbNo2 = new JRadioButton("No", false);
		g2 = new ButtonGroup();
		g2.add(cbSi2);
		g2.add(cbNo2);
		
		disponeVivienda = new JLabel("Dispone de vivienda");
		cbSi3 = new JRadioButton("Si", true);
		cbNo3 = new JRadioButton("No", false);
		g3 = new ButtonGroup();
		g3.add(cbSi3);
		g3.add(cbNo3);
		
		JPanel p = new JPanel(new GridLayout(4,1));
		JPanel pNorte = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p.add(pNorte);
		
		pNorte.add(tipoTerreno);
		pNorte.add(cbTipoTerreno);
		
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p.add(p1);
		
		p1.add(suministroElectrico);
		p1.add(cbSi1);
		p1.add(cbNo1);
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p.add(p2);
		
		p2.add(suministroAgua);
		p2.add(cbSi2);
		p2.add(cbNo2);
		
		JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p.add(p3);
		
		p3.add(disponeVivienda);
		p3.add(cbSi3);
		p3.add(cbNo3);
		
		p.setBorder(new TitledBorder("Datos específicos para fincas rústicas"));
		
		return p;
		
		
	}
	
	public JPanel panelBoton() {
		guardar = new JButton("Guardar");
		guardar.setPreferredSize(new Dimension(150,30));
		consultar = new JButton("Consultar");
		consultar.setPreferredSize(new Dimension(150,30));
		borrar = new JButton("Borrar");
		borrar.setPreferredSize(new Dimension(150,30));
		limpiar = new JButton("Limpiar");
		limpiar.setPreferredSize(new Dimension(150,30));
		
		JPanel p = new JPanel(new FlowLayout());
		p.add(guardar);
		p.add(consultar);
		p.add(borrar);
		p.add(limpiar);
		
		p.setBorder(new TitledBorder("Operaciones disponibles sobre propiedades"));
		
		return p;
	}

	public JButton getGuardar() {
		return guardar;
	}

	public void setGuardar(JButton guardar) {
		this.guardar = guardar;
	}

	public JButton getConsultar() {
		return consultar;
	}

	public void setConsultar(JButton consultar) {
		this.consultar = consultar;
	}

	public JButton getBorrar() {
		return borrar;
	}

	public void setBorrar(JButton borrar) {
		this.borrar = borrar;
	}

	public JButton getLimpiar() {
		return limpiar;
	}

	public void setLimpiar(JButton limpiar) {
		this.limpiar = limpiar;
	}

	public JLabel getCodigo() {
		return codigo;
	}

	public JLabel getTipoPropiedad() {
		return tipoPropiedad;
	}

	public JLabel getPrecio() {
		return precio;
	}

	public JLabel getSuperficie() {
		return superficie;
	}

	public JLabel getDireccion() {
		return direccion;
	}

	public JLabel getDescripcion() {
		return descripcion;
	}

	public JTextField getCampoCodigo() {
		return campoCodigo;
	}

	public JTextField getCampoPrecio() {
		return campoPrecio;
	}

	public JTextField getCampoSuperficie() {
		return campoSuperficie;
	}

	public JComboBox<String> getCbTipoPropiedad() {
		return cbTipoPropiedad;
	}

	public JTextArea getAreaDireccion() {
		return areaDireccion;
	}

	public JTextArea getAreaDescripcion() {
		return areaDescripcion;
	}

	public JLabel getTipoVivienda() {
		return tipoVivienda;
	}

	public JLabel getNumDormitorios() {
		return numDormitorios;
	}

	public JLabel getNumBaños() {
		return numBaños;
	}

	public JComboBox<String> getCbTipoVivienda() {
		return cbTipoVivienda;
	}

	public JComboBox<String> getCbNumBaños() {
		return cbNumBaños;
	}

	public JComboBox<String> getCbNumDormitorios() {
		return cbNumDormitorios;
	}

	public JLabel getTipoTerreno() {
		return tipoTerreno;
	}

	public JLabel getSuministroElectrico() {
		return suministroElectrico;
	}

	public JLabel getSuministroAgua() {
		return suministroAgua;
	}

	public JLabel getDisponeVivienda() {
		return disponeVivienda;
	}

	public JComboBox<String> getCbTipoTerreno() {
		return cbTipoTerreno;
	}

	public JRadioButton getCbSi1() {
		return cbSi1;
	}

	public JRadioButton getCbNo1() {
		return cbNo1;
	}

	public JRadioButton getCbSi2() {
		return cbSi2;
	}

	public JRadioButton getCbNo2() {
		return cbNo2;
	}

	public JRadioButton getCbSi3() {
		return cbSi3;
	}

	public JRadioButton getCbNo3() {
		return cbNo3;
	}

	public ButtonGroup getG1() {
		return g1;
	}

	public ButtonGroup getG2() {
		return g2;
	}

	public ButtonGroup getG3() {
		return g3;
	}
	
	
}

	
