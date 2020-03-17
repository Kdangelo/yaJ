package vectorTipoDato;

import java.util.Scanner;

public class PruebaVector6 {
	private Scanner teclado;
	private int[] cursoA;
	private int[] cursoB;
	/*private int[] vecSuma;*/
	
	public void cargar() {
		teclado = new Scanner(System.in);
		cursoA = new int[5];
		cursoB = new int[5];
		System.out.println("Carga de notas del curso A");
		for (int i = 0; i < 5; i++) {
			System.out.println("Ingrese nota:");
			cursoA[i] = teclado.nextInt();
		}
		System.out.println("Carga de notas del curso B");
		for (int i = 0; i < 5; i++) {
			System.out.println("Ingrese nota:");
			cursoB[i] = teclado.nextInt();
		}
	}
	
	public void calcularPromedios() {
		int suma1 = 0;
		int suma2 = 0;
		for (int i = 0; i < 5; i++) {
			suma1 = suma1 + cursoA[i];
			suma2 = suma2 + cursoB[i];
		}
		int promedioA = suma1/5;
		int promedioB = suma2/5;
		if (promedioA>promedioB) {
			System.out.println("El curso A tiene un promedio mayor.");
		} else {
			System.out.println("El curso B tiene un promedio mayor.");
		}
	}
	
	public static void main(String[] args) {
		PruebaVector6 pv = new PruebaVector6();
		pv.cargar();
		pv.calcularPromedios();
	}
}
