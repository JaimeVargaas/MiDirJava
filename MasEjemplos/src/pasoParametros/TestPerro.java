package pasoParametros;

class Perro {
	 String name;
	}
	public class TestPerro {
	 public static void main(String[] args) {
	 Perro miPerro = new Perro();
	 miPerro.name = "Fido";
	 cambiaNombre(miPerro);
	 System.out.println(miPerro.name); // Imprimirá "Buddy"
	 }
	 public static void cambiaNombre(Perro d) {
	 d.name = "Buddy"; // Cambia el atributo 'name' del mismo objeto
	 }
	} 
	