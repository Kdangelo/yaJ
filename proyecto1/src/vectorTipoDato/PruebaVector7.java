package vectorTipoDato;

import java.util.Scanner;

public class PruebaVector7 {
	private Scanner teclado;
	private int[] vec;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		vec = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Ingrese elemento:");
			vec[i] = teclado.nextInt();
		}
	}
	
	public void verificarOrdenado() {
		int orden = 1;
		for (int i = 0; i < 9; i++) {
			if (vec[i+1]<vec[i]) {
				orden = 0;
			}
		}
		if (orden == 1) {
			System.out.println("Esta ordenado de menor a mayor");
		} else {
			System.out.println("No esta ordenado de menor a mayor");
		}
	}
	
	public static void main(String[] args) {
		PruebaVector7 pv = new PruebaVector7();
		pv.cargar();
		pv.verificarOrdenado();
	}
}
