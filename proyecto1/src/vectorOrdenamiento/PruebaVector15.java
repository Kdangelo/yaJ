package vectorOrdenamiento;

import java.util.Scanner;

public class PruebaVector15 {
	private Scanner teclado;
	private int[] vec;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		System.out.println("Cuantos elementos tendrá el vector:");
		int cant;
		cant = teclado.nextInt();
		vec = new int[cant];
		for (int i = 0; i < cant; i++) {
			System.out.println("Ingrese elemento: ");
			vec[i] = teclado.nextInt();
		}
	}
	
	public void ordenar() {
		for (int i = 0; i < vec.length; i++) {
			for (int j = 0; j < vec.length-1-i; j++) {
				if (vec[j]>vec[j+1]) {
					int aux;
					aux = vec[j];
					vec[j] = vec[j+1];
					vec[j+1] = aux;
				}
			}
		}
	}
	
	public void imprimir() {
		System.out.println("Vector ordenados de menor a mayor.");
		for (int i = 0; i < vec.length; i++) {
			System.out.println(vec[i]);
		}
	}
	
	public static void main(String[] args) {
		PruebaVector15 pv = new PruebaVector15();
		pv.cargar();
		pv.ordenar();
		pv.imprimir();
	}
}
