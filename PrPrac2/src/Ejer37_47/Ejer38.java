package Ejer37_47;

import java.util.Scanner;


public class Ejer38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//variables
		int num;
		char letra = 0;
	
		int factorial=1;
		int raiz = 0;
		
		//Lo vamos a hacer con do {   }while()
		while(letra!='T') {
			System.out.println("F: Calculará el factorial.\r\n"
					+ "R: Calculará la raíz cuadrada de un número si es positivo y si es negativo, dará un mensaje de error.\r\n"
					+ "C: Calculará el cuadrado de un número.\r\n"
					+ "T: Finalizará el algoritmo.");
			System.out.println();
			
			
			System.out.println("Introduzca un numero");
			num= sc.nextInt();
			
			sc.nextLine(); //EL NEXTLINE ES UN LIMPIADOR DE BUFFER 
			
			System.out.println("Introduce una letra de las anteriores. CUando quiera finalizar introduzcta T: ");
			letra = sc.nextLine().charAt(0);
			
			

			switch(letra) {
			case 'F' ->{ System.out.println("CALCULO DEL FACTORIAL");
					
				if(num<0) {
					System.out.println("No puede realizarse el factorial");
				}else {
					//segunda condicion 
					for (int cont=num; cont>0; cont-=1) {
						factorial = factorial *cont;
					}
				}
				System.out.println("EL factorial de "+num+" es = "+factorial);
			}
			case 'R' -> { System.out.println("CALCULO DE LA RAIZ CUADRADA");
			
			if(num<0) {
				System.out.println("No puede realizarse el factorial");
			}else {
				raiz= (int) Math.sqrt(num);
				}
			
			System.out.println("La raiz cuadrada "+num+" es = "+raiz);
			}
				
			case 'C' -> {System.out.println("CALCULO EL CUADRADO DE UN NUMERO");
				
				System.out.println("El cuadrado de "+num+" es: "+Math.pow(num, 2));	
			}
			
			case 'T' ->{
				System.out.println("EL programa finaliza");
			}
			
			default-> {
				System.out.println("letra introducida, no valida");
			}
			
			}
			
		}
		
		
		
		} 
		
}


