package matrizCantidadFilasColumnas;

import java.util.Scanner;

public class Matriz5 {
	private Scanner teclado;
	private int[][] mat;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		System.out.println("Cuantas fila tiene la matriz:");
		int filas = teclado.nextInt();
		System.out.println("Cuantas columnas tiene la matriz:");
		int columnas = teclado.nextInt();
		mat = new int[filas][columnas];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.println("Ingrese componente:");
				mat[i][j] = teclado.nextInt();
			}
		}
	}
	
	public void imprimir() {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void ultimaFila() {
		System.out.println("Ultima fila de la matriz:");
		for (int i = 0; i < mat[mat.length-1].length; i++) {
			System.out.println(mat[mat.length-1][i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Matriz5 ma = new Matriz5();
		ma.cargar();
		ma.imprimir();
		ma.ultimaFila();
	}
}
