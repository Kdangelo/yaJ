package matrizYVectorParalelos;

import java.util.Scanner;

public class Matriz9 {
	private Scanner teclado;
	private String[] empleados;
	private int[][] sueldos;
	private int[] sueldotot;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		empleados = new String[4];
		sueldos = new int[4][3];
		for (int i = 0; i < empleados.length; i++) {
			System.out.print("Ingrese el nombre del empleado:");
			empleados[i] = teclado.next();
			for (int j = 0; j < sueldos[i].length; j++) {
				System.out.println("Ingrese sueldo:");
				sueldos[i][j] = teclado.nextInt();
			}
		}
	}
	
	public void calcularSumaSueldos() {
		sueldotot = new int[4];
		for (int i = 0; i < sueldos.length; i++) {
			int suma = 0;
			for (int j = 0; j < sueldos[j].length; j++) {
				suma = suma + sueldos[i][j];
			}
			sueldotot[i] = suma;
		}
	}
	
	public void imprimirTotalPagado() {
		System.out.println("Total de sueldos pagados por empleado.");
		for (int i = 0; i < sueldotot.length; i++) {
			System.out.println(empleados[i] + " - " + sueldotot[i]);
		}
	}
	
	public void empleadoMayorSueldo() {
		int may = sueldotot[0];
		String nom = empleados[0];
		for (int i = 0; i < sueldotot.length; i++) {
			if (sueldotot[i]>may) {
				may = sueldotot[i];
				nom = empleados[i];
			}
		}
		System.out.println("El empleado con mayor sueldo es "+ nom + " que tiene un sueldo de "+may);
	}
	
	public static void main(String[] args) {
		Matriz9 ma = new Matriz9();
		ma.cargar();
		ma.calcularSumaSueldos();
		ma.imprimirTotalPagado();
		ma.empleadoMayorSueldo();
	}
}
