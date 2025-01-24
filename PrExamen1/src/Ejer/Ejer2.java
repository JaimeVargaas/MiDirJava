package Ejer;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fijo=80, inv, precioinv ,fuente=100;
		float total, cakepops, donuts;
		char añadirCake, añadirDonuts, añadirFuente;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Indique el número de invitados al evento: ");
		inv = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("¿Desea añadir cake pops? ");
		añadirCake = sc.nextLine().charAt(0);
		
		
		System.out.print("¿Desea añadir donuts? ");
		añadirDonuts = sc.nextLine().charAt(0);
		
	
		System.out.print("¿Desea añadir una fuente de chocolate? ");
		añadirFuente = sc.nextLine().charAt(0);
		
		precioinv = inv * 1;
		cakepops = (float) (inv * 0.25);
		donuts = (float) (inv * 0.3);
		total = fijo + precioinv;
		
		if (añadirCake=='s')
			total = total +cakepops;
		if (añadirDonuts == 's')
			total = total+ donuts;
		if (añadirFuente=='s')
			total = (float)total + fuente;
		
		System.out.println("EL COSTE TOTAL DE LA MESA ASCIENDE A: " + total + "€");
		System.out.println("Coste montaje: " + fijo + "€");
		System.out.println("Número de invitados " + inv);
		
		if (añadirCake=='s')
			System.out.println("Cake pops: SI");
		else System.out.println("Cake pops: NO");
		
		if (añadirDonuts=='s')
			System.out.println("Donuts: SI");
		else System.out.println("Donuts: NO");
		
		if (añadirFuente=='s')
			System.out.println("Fuente chocolate: SI");
		else System.out.println("Fuente chocolate: NO");
		
	
		
		sc.close();
		
		
	}

}
