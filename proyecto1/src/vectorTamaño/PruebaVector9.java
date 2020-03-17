package vectorTamaño;

import java.util.Scanner;

public class PruebaVector9 {
	private Scanner teclado;
	private int[] vec;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		System.out.println("Cuantos elementos tiene el vector:");
		int n;
		n = teclado.nextInt();
		vec = new int[n];
		for (int i = 0; i < vec.length; i++) {
			System.out.println("Ingrese elemento:");
			vec[i] = teclado.nextInt();
		}
	}
	
	public void acumularElementos() {
		int suma = 0;
		for (int i = 0; i < vec.length; i++) {
			suma = suma + vec[i];
		}
		System.out.println("La suma de los elementos es:" + suma);
	}
	
	public static void main(String[] args) {
		PruebaVector9 pv = new PruebaVector9();
		pv.cargar();
		pv.acumularElementos();
	}
}
