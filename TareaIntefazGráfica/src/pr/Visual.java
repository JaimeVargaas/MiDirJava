package pr;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.*;



public class Visual extends JFrame {
	
	private HashMap<String,String> cuenta;
	
	public Visual() {
		setTitle("Validación de usuarios");
		this.setIconImage(new ImageIcon("./recursos/logo-visual.png").getImage());
		
		
		JMenuBar menu = new JMenuBar();
		add(menu, BorderLayout.NORTH);
		
		// Submenu archivo
		JMenu archivo = new JMenu("Archivo");
		menu.add(archivo);
		
		// SubMenú antes del primer separador
		JMenuItem nuevoArchText = new JMenuItem("Nuevo Archivo de Texto");
		nuevoArchText.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		archivo.add(nuevoArchText);
		
		JMenuItem nuevoArch = new JMenuItem("Nuevo Archivo...");
		nuevoArch.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK | ActionEvent.ALT_MASK));
		archivo.add(nuevoArch);
		
		JMenuItem nuevaVentana = new JMenuItem("Nueva Ventana");
		nuevaVentana.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK | ActionEvent.SHIFT_MASK));
		archivo.add(nuevaVentana);
		
		// submenu de nueva ventana
		JMenu nuevaVentanaConPerfil = new JMenu("Nueva Ventana Con Perfil");
		archivo.add(nuevaVentanaConPerfil);
		
		JMenuItem nuevoPerfil = new JMenuItem("Nuevo Perfil..");
		nuevaVentanaConPerfil.add(nuevoPerfil);
		
		// Primer separador
		JSeparator sep1 = new JSeparator();
		archivo.add(sep1);
		
		// Submenu despues del primer separador
		JMenuItem abrirArch = new JMenuItem("Abrir Archivo...");
		abrirArch.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,ActionEvent.CTRL_MASK));
		archivo.add(abrirArch);
		
		JMenuItem abrirCarpeta = new JMenuItem("Abrir Carpeta...");
		abrirCarpeta.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,ActionEvent.CTRL_MASK));
		archivo.add(abrirCarpeta);
		
		JMenuItem abrirWorkspaceDesdeArch = new JMenuItem("Abrir Workspace Desde Archivo...");
		archivo.add(abrirWorkspaceDesdeArch);
		
		// Submenu de abrir reciente
		JMenu abrirReciente = new JMenu("Abrir Reciente");
		archivo.add(abrirReciente);
		
		JMenuItem reabrirVentanaCerrada = new JMenuItem("Reabrir Ventana Cerrada");
		reabrirVentanaCerrada.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK | ActionEvent.SHIFT_MASK));
		abrirReciente.add(reabrirVentanaCerrada);
		
		JSeparator sep2 = new JSeparator();
		abrirReciente.add(sep2);
		
		JMenuItem mas = new JMenuItem("Más...");
		abrirReciente.add(mas);
		
		JSeparator sep3 = new JSeparator();
		abrirReciente.add(sep3);
		
		JMenuItem cerrarRecienteAbierto = new JMenuItem("Cerrar Abierto Recientemente");
		abrirReciente.add(cerrarRecienteAbierto);
		
		// menu editar
		JMenu editar = new JMenu("Editar");
		menu.add(editar);
		
		JMenuItem deshacer = new JMenuItem("Deshacer");
		deshacer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,ActionEvent.CTRL_MASK));
		editar.add(deshacer);
		
		JMenuItem rehacer = new JMenuItem("Rehacer");
		rehacer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y,ActionEvent.CTRL_MASK));
		editar.add(rehacer);
		
		// Separador
		JSeparator sep4 = new JSeparator();
		editar.add(sep4);
		
		JMenuItem cortar = new JMenuItem("Cortar");
		cortar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
		editar.add(cortar);
		
		JMenuItem copiar = new JMenuItem("Copiar");
		copiar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
		editar.add(copiar);
		
		JMenuItem pegar = new JMenuItem("Pegar");
		pegar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,ActionEvent.CTRL_MASK));
		editar.add(pegar);
		
		
		// menu seleccion
		JMenu select = new JMenu("Selección");
		menu.add(select);
		
		JMenuItem selectAll = new JMenuItem("Seleccionar Todo");
		selectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.SHIFT_MASK));
		select.add(selectAll);
		
		// Modo oscuro
		JCheckBoxMenuItem oscuro = new JCheckBoxMenuItem("Modo oscuro", false);
		select.add(oscuro);
		

		// Iniciar sesion / registrarse
		JPanel pcentro = new JPanel(new GridLayout(3,3));
		add(pcentro, BorderLayout.CENTER);
		
		JLabel usu = new JLabel("Usuario");
		JLabel passwd = new JLabel("Contraseña");
		
		JTextField intrusu = new JTextField(15);
		JPasswordField intrpasswd = new JPasswordField();
		
		pcentro.add(usu);
		pcentro.add(intrusu);
		pcentro.add(passwd);
		pcentro.add(intrpasswd);
		
		JButton inciar = new JButton("Iniciar Sesión");
		JButton registrar = new JButton("Registrar");
		
		pcentro.add(inciar);
		pcentro.add(registrar);
		
		
		// panel este
		JPanel peste = new JPanel();
		add(peste, BorderLayout.EAST);
		
		JLabel esp = new JLabel("              ");
		peste.add(esp);
	
		// panel oeste
		JPanel poeste = new JPanel();
		add(poeste, BorderLayout.WEST);
		
		JLabel esp1 = new JLabel("              ");
		poeste.add(esp1);
		
		cuenta = new HashMap<String,String>();
		cuenta.put("Jaime", "12345");
		cuenta.put("Rosi", "pedroesp");
		cuenta.put("Alberto", "4321");
		
		// Panel sur
		JPanel psur = new JPanel();
		add(psur, BorderLayout.SOUTH);
		
		JLabel etiqueta = new JLabel("Inicia sesión o registrate para empezar a jugar");
		psur.add(etiqueta);
		
		// Accion de Iniciar sesion
		inciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String password = intrpasswd.getText();
				String usuario = intrusu.getText();
				
				if (cuenta.containsKey(usuario)&&cuenta.containsValue(password)) {
					new Ejer2();
					etiqueta.setText("Sesión iniciada correctamente");
					etiqueta.setForeground(Color.black);
					}
				else {
					etiqueta.setText("Contraseña incorrecta");
					etiqueta.setForeground(Color.red);
				}
				
		}});
		
		// Acción de registrarse
		registrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String password = intrpasswd.getText();
				String usuario = intrusu.getText();
				
				cuenta.put(usuario, password);
				
				new Ejer2();
				
				etiqueta.setText("Cuenta registrada");
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
		new Visual();
	}
	
	
}
