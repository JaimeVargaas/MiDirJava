package Ejer1_4;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int dia, numinf, numadul;
	float entradasinf = 0, entradasadul= 0, total;
	char sn = 0;
		
	Scanner sc = new Scanner(System.in);
	
	
	while (sn !='s') {
	System.out.print("Que día de la semana desea la entradas ");
	dia = sc.nextInt();
	
	System.out.print("Número de entradas de adultos: ");
	numadul = sc.nextInt();
	
	System.out.print("Número de entradas infantiles: ");
	numinf = sc.nextInt();
	
	
	if (dia>0 && dia<6) {
		entradasinf = 2;
		entradasadul = 5;
	}// end if
	
	else if (dia>5 && dia<7) {
		entradasinf = 3;
		entradasadul = 7;
	} // end if
	
	total = (entradasinf * numinf)+(entradasadul+numadul);
	
	if (numinf>=3) {
		total = (total *10f)/100;
	}
	
	System.out.println("Total a pagar: " + total);
	} // end while
	
	
	
	
	
	sc.close();
		
		
	}

}
