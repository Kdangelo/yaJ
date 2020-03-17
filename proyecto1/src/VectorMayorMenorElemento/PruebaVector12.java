package VectorMayorMenorElemento;

import java.util.Scanner;

public class PruebaVector12 {
	private Scanner teclado;
	private int[] vec;
	private int menor;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		System.out.println("Cuantos elementos tiene el vector:");
		int n;
		n = teclado.nextInt();
		vec = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Ingrese elemento:");
			vec[i] = teclado.nextInt();
		}
	}
	
	public void menorElemento() {
		menor = vec[0];
		for (int i = 1; i < vec.length; i++) {
			if (vec[i]<menor) {
				menor = vec[i];
			}
		}
		System.out.println("El elemento menor es: " + menor);
	}
	
	public void repiteMenor() {
		int cant = 0;
		for (int i = 0; i < vec.length; i++) {
			if (vec[i] == menor) {
				cant++;
			}
			if (cant > 1) {
				System.out.println("Se repite el menor en el vector.");
			} else {
				System.out.println("No se repite el menor en el vector.");
			}
		}
	}
	
	public static void main(String[] args) {
		PruebaVector12 pv = new PruebaVector12();
		pv.cargar();
		pv.menorElemento();
		pv.repiteMenor();
	}
}
