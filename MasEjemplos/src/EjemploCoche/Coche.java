package EjemploCoche;

/**
 * Definición de la clase Coche
 */
public class Coche {

// Atributos o variables de instancia de la clase Coche
 String marca;
 String modelo;
int año;
 String color;
/**
 * Constructor para crear objetos Coche
 */
public Coche(String marca, String modelo, int año, String color) {  this.marca = marca;
 this.modelo = modelo;
 this.año = año;
 this.color = color;
 }
/**
 * Método para arrancar el coche
 */
public void arrancar() {
 System.out.println("El coche está arrancando.");
 }
/**
 * Método para detener el coche
 */
public void detener() {
 System.out.println("El coche se ha detenido.");
 }
} 
