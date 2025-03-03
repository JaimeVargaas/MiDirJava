package Arrays;


public class Ejer1 {

	public static void main(String[] args) {
		
		int [][] marco = new int [5][15];
		
		for(int fil=0;fil<marco.length;fil++) {
			for(int col=0;col<marco[fil].length;col++) {
				
				if (fil==0|| col ==0 || fil == marco.length-1 || col == marco[fil].length-1)
					marco[fil][col] = 1;
				
				else 
					marco[fil][col] = 2;
					
			}
			
		}
		
		for(int fil=0;fil<marco.length;fil++) {
			for(int col=0;col<marco[fil].length;col++) {
			System.out.print(marco[fil][col] + " ");
					
			}
			System.out.println();
		}
		
		
		
	}

}
