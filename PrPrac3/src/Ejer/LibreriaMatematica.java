package Ejer;

// Librería matemática con métodos de clase, como son factorial,
// primo, combinatorio, perfecto, amigos, ...


public class LibreriaMatematica {

	
	// calcula el factorial de un número
	// Ejemplo: 4! = 4 x 3 x 2 x 1 
	//			0! = 1
	//			No existe el factorial de numeros negativosç
	
	
	// 
	/* Método al que pasándole un número nos devuelva un valor lógico, el cual indicará si el número es primo
	/* o no.
	 *  
	 */
	
	// Ejercicio a
	
	public static boolean isPrimo(int num) {
        int cont=1, total=0;

        while (cont < num +1) {
        	if (num % cont == 0) {
        		total++;
        	}
        	cont++;
        }
        if (total == 2) {
        	return true;
        }
        else {
        	return false;

        }

	}
	
	
	// Ejercicio b
	
	public static long factorial(int num) {
		long fact = 1;
		
		if (num<0) return -1;
		
		for (int cont = 2;cont<=num;cont++) {
			fact = fact * cont;
		}

		// Cuenta para atras
		// for (int cont=num;cont>=2;cont--) 

		
		
		return fact;

	}
	
	/* 
	 * Método que calcule el combinatorio de dos números dados, se debe tener en cuenta que para poder
	 *	calcular el combinatorio de dos números se debe cumplir que a ≥ b, a ≥ 0 y b ≥ 0.
	 *
	 */
	
	// Ejercicio c
	
	public static double combinatorio(int a, int b) {
		if ((a<0) || (a<b) || (a<b)) 
			return -1;
		else 
			return (double)factorial(a) / (factorial(b)* (factorial(a-b)));
		
//		if ((a>=b) && (a>=0) && (b>=0))
//			return factorial(a) / (factorial(b)* (factorial(a-b)));
//		else 
//			return -1;
			
	}
	
	
	/*Suma de divisiores*/
	private static int sumDiv(int num) {
		int resultado = 0;
		if (num < 0 )
			return -1;
		for (int cont = 1; cont<num;cont++)
			if (num % cont == 0) {
				resultado = resultado + cont;
			}
		return resultado;
	}
	
	/*
	 * Método para comprobar si un número es perfecto. Un número es perfecto cuando la suma de sus divisores
		excepto él mismo es igual al propio número. Por ejemplo, son números perfectos 6, 28, 496, …

	 */
	// Ejercicio d
	
	public static boolean perfecto(int num) {
		if (num == sumDiv(num)) {
			return true;
		}
		else 
			return false;
	}
	
	
	/*
	 * Método que compruebe si dos números son amigos, debe devolver un valor boolean. Dos números son
		amigos si la suma de los divisores del primero, excepto él mismo, es igual al segundo número y viceversa.
		Por ejemplo, son números amigos 6 y 6, 28 y 28, 220 y 284,…		
	 */
	// Ejercicio e
	
	public static boolean amigos(int num, int num2) {
		if (num2 == sumDiv(num)) {
			return true;
		}
		else 
			return false;
	}

	

	
	public static int calcularMCD(int a, int b) {
		while (b != 0) {
            int c = b;
            b = a % b;
            a = c;
        }
        return a;
	}
		
	
	public static boolean primosEntreSi(int a,int b) {
		return calcularMCD(a, b) == 1;
		
	} 
	
	public static int funcionEuler(int n) {
        int contador = 0;

        for (int i = 1; i < n; i++) {
            if (calcularMCD(i, n) == 1) {
                contador++; 
            }
        }

        return contador;
    }
	
	
	
	
	
}
	
	

