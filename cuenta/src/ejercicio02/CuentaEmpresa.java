package ejercicio02;

import java.time.LocalDate;

public class CuentaEmpresa extends Cuenta {

	//variables de instancia 
	private String nombre_empresa;
	private double suma_ingresos;
	private double suma_reintegros;
	private LocalDate fechaRegistro;
	
	
	
	//Constructor
	public CuentaEmpresa(String numCuenta, String nombre, double saldo, int numSecreto, String nombre_empresa) {
		super(numCuenta, nombre, saldo, numSecreto);
		this.nombre_empresa = nombre_empresa;
		this.suma_ingresos = 0.0;
		this.suma_reintegros = 0.0;
		this.fechaRegistro = LocalDate.now();
	}


	
	//metodos getter's and setter's


	public String getNombre_empresa() {
		return nombre_empresa;
	}

	public void setNombre_empresa(String nombre_empresa) {
		this.nombre_empresa = nombre_empresa;
	}

	public double getSuma_ingresos() {
		return suma_ingresos;
	}

	public void setSuma_ingresos(double suma_ingresos) {
		this.suma_ingresos = suma_ingresos;
	}

	public double getSuma_reintegros() {
		return suma_reintegros;
	}

	public void setSuma_reintegros(double suma_reintegros) {
		this.suma_reintegros = suma_reintegros;
	}

	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	// Sobreescritura del método imposicion para registrar ingresos
    @Override
    public void imposicion(double cantidad) {
        if (cantidad > 0) {
            super.imposicion(cantidad);  // Realiza la imposición usando la clase padre
            suma_ingresos += cantidad;   // Acumula el ingreso
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }
    
 // Sobreescritura del método reintegro para registrar reintegros
    @Override
    public void reintegro(double cantidad) {
        if (cantidad > 0 && cantidad <= getSaldo()) {
            super.reintegro(cantidad);  // Realiza el reintegro usando la clase padre
            suma_reintegros += cantidad; // Acumula el reintegro
        } else {
            System.out.println("Cantidad no válida para el reintegro.");
        }
    }
    
 // Método para reiniciar los totales de ingresos y reintegros y actualizar la fecha de registro
    public void reiniciarTotales() {
        this.suma_ingresos = 0.0;
        this.suma_reintegros = 0.0;
        this.fechaRegistro = LocalDate.now();  // Actualiza la fecha al momento del reinicio
        System.out.println("Los totales de ingresos y reintegros se han reiniciado.");
    }
    
    //metodo toString
    @Override 
    public String toString() {
    	return super.toString()+
    			"\nNombre empresa:"+this.nombre_empresa+
    			"\nTotal ingresos desde "+fechaRegistro+":"+suma_ingresos +
    			"\nTotal reintegros desde"+fechaRegistro+":"+suma_reintegros;
    			
    }
	
}
