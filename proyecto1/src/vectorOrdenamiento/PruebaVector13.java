package vectorOrdenamiento;

import java.util.Scanner;

public class PruebaVector13 {
	private Scanner teclado;
	private int[] sueldos;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		sueldos = new int[5];
		for (int i = 0; i < sueldos.length; i++) {
			System.out.println("Ingrese el sueldo:");
			sueldos[i] = teclado.nextInt();
		}
	}
	
	public void ordenar() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4-i; j++) {
				if (sueldos[j]>sueldos[j+1]) {
					int aux;
					aux = sueldos[j];
					sueldos[j] = sueldos[j+1];
					sueldos[j+1] = aux;
				}
			}
		}
	}
	
	public void imprimir() {
		System.out.println("Sueldos ordenados de menor a mayor.");
		for (int i = 0; i < sueldos.length; i++) {
			System.out.println(sueldos[i]);
		}
	}
	
	public static void main(String[] args) {
		PruebaVector13 pv = new PruebaVector13();
		pv.cargar();
		pv.ordenar();
		pv.imprimir();
	}
}
