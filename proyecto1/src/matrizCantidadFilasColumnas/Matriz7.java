package matrizCantidadFilasColumnas;

import java.util.Scanner;

public class Matriz7 {
	private Scanner teclado;
	private int[][] mat;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		System.out.println("Cuantas filas tiene la matriz:");
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
	
	public void intercambiar() {
		for (int i = 0; i < mat.length; i++) {
			int aux = mat[0][i];
			mat[0][i] = mat[1][i];
			mat[1][i] = aux;
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
	
	public static void main(String[] args) {
		Matriz7 ma = new Matriz7();
		ma.cargar();
		ma.imprimir();
		System.out.println();
		ma.intercambiar();
		ma.imprimir();
	}
}
