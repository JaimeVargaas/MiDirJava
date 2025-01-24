package claseArrays;

import java.util.Arrays;

// Prueba de equals

public class Ejemplo4 {

	public static void main(String[] args) {
		int [] a = {2,3,4,5,6};
		int [] b = {2,3,4,5,6};
		int [] c = a;
		
		System.out.println(a==b); //false
		System.out.println(Arrays.equals(a, b)); //true
		System.out.println(a==c); //true
		System.out.println(Arrays.equals(a,c)); //true

		
	}

}
