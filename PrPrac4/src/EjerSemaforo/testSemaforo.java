package EjerSemaforo;

public class testSemaforo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Semaforo miSemaforo = new Semaforo();
		Semaforo semaforoDeMiCalle = new Semaforo();
		Semaforo otroSemaforo = new Semaforo();
		
		miSemaforo.setColor("Rojo");
		otroSemaforo.setColor("Verde");
		
		System.out.println(otroSemaforo.getColor());
		System.out.println(semaforoDeMiCalle.getColor());
		
		if (miSemaforo.getColor().equals("Rojo"))
			System.out.println("No pasar");
		if (miSemaforo.puedoPasar() == true)
			System.out.println("Puedes pasar");
		else
			System.out.println("No puedes pasar");
		
		System.out.println("\n"+miSemaforo.toString());
		System.out.println("\n"+otroSemaforo.toString());
		System.out.println("\n"+semaforoDeMiCalle.toString());
	}

}
