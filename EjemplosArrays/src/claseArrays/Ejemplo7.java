package claseArrays;

import java.util.Arrays;

public class Ejemplo7 {

	public static void main(String[] args) {
		Alumno [] clase = new Alumno[3];
		clase [0] = new Alumno("Juan","Moreno","López",20);
		clase [1] = new Alumno("Ana","Martín","García",19);
		clase [2] = new Alumno("Antonio","Gil","González",22);
	
		System.out.println(Arrays.toString(clase));
		
		Alumno [] clase2 = {
				new Alumno("Ana","Martín","García",19),
				new Alumno("Antonio","Gil","González",22),
				new Alumno("Juan","Moreno","López",20),
				new Alumno("Jorge","Gil","García",22),
				new Alumno("Ana","Martín","García",19)
		};
		System.out.println(Arrays.toString(clase2));
		
		Alumno [] clase3 = {
				new Alumno("Ana","Martín","García",19),
				new Alumno("Antonio","Gil","González",22),
				new Alumno("Juan","Moreno","López",20),
				new Alumno("Jorge","Gil","García",22),
				new Alumno("Ana","Martín","García",19)
		};
		
		// Comparar arrays
		System.out.println(Arrays.equals(clase, clase2));
		System.out.println(Arrays.equals(clase2, clase3));
		
		// Comparar dos alumnos de uno de los arrays
		System.out.println(clase3[0].equals(clase3[4]));
		
		// Ordenar el array anterior
		Arrays.sort(clase3);
		System.out.println(Arrays.toString(clase3));
		
		// Recorrer el array con for-each y poniendolo en mayuscula
		for(Alumno elemento : clase3) {
			System.out.print(elemento.toString().toUpperCase());
		}
		
		// Recorrer el array mostrando los datos en mayuscula
		for (int cont = 0; cont<clase3.length;cont++) {
			System.out.print(clase3[cont].toString().toUpperCase());
		}
		
	}

}
