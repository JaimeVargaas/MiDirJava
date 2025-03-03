package Arrays;

import java.util.Arrays;

public class Ejer2 {

	public static void main(String[] args) {
		int [] array = new int[20];
		int mayor = Integer.MIN_VALUE;
		int pos = 0, ult =0;
		
		 for (int i = 0;i<array.length;i++) {
			 array[i] = (int) (Math.random()*30);
	     }
		 
		 for (int i = 0;i<array.length;i++) {
			 if(array[i] > mayor) {
				 mayor = array[i];
				 pos = i;
				 ult = array[array.length-1];
			 }
	     }
		 
		 System.out.println(Arrays.toString(array));
		 
		 for (int i=0; i<array.length;i++) {
			 array[pos] = ult;
			 array[array.length-1] = mayor;
		 }
		 
		 System.out.println(Arrays.toString(array));
		
	}

}
