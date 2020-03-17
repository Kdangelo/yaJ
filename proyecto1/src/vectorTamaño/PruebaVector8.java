package vectorTamaño;

import java.util.Scanner;

public class PruebaVector8 {
	private Scanner teclado;
	private int[] sueldos;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		System.out.println("Cuantos sueldos cargará:");
		int cant;
		cant = teclado.nextInt();
		sueldos = new int[cant];
		for (int i = 0; i < sueldos.length; i++) {
			System.out.println("Ingrese sueldo:");
			sueldos[i] = teclado.nextInt();
		}
	}
	
	public void imprimir() {
		for (int i = 0; i < sueldos.length; i++) {
			System.out.println(sueldos[i]);
		}
	}
}
