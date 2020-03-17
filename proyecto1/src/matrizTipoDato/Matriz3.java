package matrizTipoDato;

import java.util.Scanner;

public class Matriz3 {
	private Scanner teclado;
	private int mat[][];
	
	public void cargar() {
		teclado = new Scanner(System.in);
		mat = new int[3][4];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("Ingrese componente:");
				mat[i][j] = teclado.nextInt();
			}
		}
	}
	
	public void primerFila() {
		System.out.println("Primer fila de la matriz:");
		for (int i = 0; i < 4; i++) {
			System.out.println(mat[0][i]);
		}
	}
	
	public void ultimaFila() {
		System.out.println("Ultima fila de la matriz:");
		for (int i = 0; i < 4; i++) {
			System.out.println(mat[2][i]);
		}
	}
	
	public void primeColumna() {
		System.out.println("Primer columna:");
		for (int i = 0; i < 3; i++) {
			System.out.println(mat[i][0]);
		}
	}
	
	public static void main(String[] args) {
		Matriz3 ma = new Matriz3();
		ma.cargar();
		ma.primerFila();
		ma.ultimaFila();
		ma.primeColumna();
	}
}
