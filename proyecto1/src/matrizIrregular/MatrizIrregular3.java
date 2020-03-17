package matrizIrregular;

import java.util.Scanner;

public class MatrizIrregular3 {
	private Scanner teclado;
	private String[] nombres;
	private int[][] dias;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		nombres = new String[3];
		dias = new int[3][];
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Ingrese el nombre del empleado:");
			nombres[i] = teclado.next();
			System.out.println("Cuantas días faltó el empleado:");
			int faltas = teclado.nextInt();
			dias[i] = new int[faltas];
			for (int j = 0; j < dias[i].length; j++) {
				System.out.println("Ingrese nro de día:");
				dias[i][j] = teclado.nextInt();
			}
		}
	}
	
	public void inasistencias() {
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i] + " faltó " + dias[i].length + " dias");
		}
	}
	
	public void empleadoMenosFalta() {
		int faltas = dias[0].length;
		String nom = nombres[0];
		for (int i = 0; i < dias.length; i++) {
			if (dias[i].length < faltas) {
			faltas = dias[i].length;
			nom = nombres[i];
			}
		}
		System.out.println("El empleado que faltó menos es " + nom + " con " + faltas + " faltas.");
	}
	
	public static void main(String[] args) {
		MatrizIrregular3 ma = new MatrizIrregular3();
		ma.cargar();
		ma.inasistencias();
		ma.empleadoMenosFalta();
	}
}
