package S5;

import java.util.Scanner;

public class Ex5 {

	 public static void main(String[] args) {
	      
	        Scanner scanner = new Scanner(System.in);

	        // Arreglos para almacenar asignaturas y promedios
	        String[] asignaturas = new String[5];
	        double[] promedios = new double[5];

	        // Ingreso asignaturas y promedios
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Ingrese el nombre de la asignatura " + (i + 1) + ": ");
	            asignaturas[i] = scanner.nextLine();

	            System.out.print("Ingrese el promedio de la asignatura " + asignaturas[i] + ": ");
	            promedios[i] = scanner.nextDouble();
	            scanner.nextLine(); 
	        }

	        // Calcular el promedio final
	        double sumaPromedios = 0;
	        for (int i = 0; i < promedios.length; i++) {
	            sumaPromedios += promedios[i];
	        }
	        double promedioFinal = sumaPromedios / promedios.length;

	        // Mostrar los resultados
	        System.out.println("\nAsignaturas y Promedios:");
	        for (int i = 0; i < 5; i++) {
	            System.out.println(asignaturas[i] + ": " + promedios[i]);
	        }

	        System.out.println("\nEl promedio final es: " + promedioFinal);
	        
	        // Cerrar el escáner
	        scanner.close();
	    }
}
