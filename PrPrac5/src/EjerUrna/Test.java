package EjerUrna;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UrnaDeTresColores U1= new UrnaDeTresColores (10,11,12);
		
		while (U1.quedaMasDeUnaBola()== true) {
			if (U1.sacaBola()=='B' && U1.sacaBola()=='B') {
				U1.setNumRojo(U1.getNumRojo()+1);
			} // end if
			
			else if (U1.sacaBola()=='R' && U1.sacaBola()== 'R')
				U1.setNumRojo(U1.getNumRojo()+1);
			else if (U1.sacaBola() == 'N' && U1.sacaBola()=='N')
				U1.setNumNegro(U1.getNumNegro()+1);
			else 
				U1.setNumBlanco(U1.getNumBlanco()+1);
		} // end while
		
		System.out.println(U1.toString());
		
		
	}

}
