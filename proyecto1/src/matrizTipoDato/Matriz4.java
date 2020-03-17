package matrizTipoDato;

import java.util.Scanner;

public class Matriz4 {
	private Scanner teclado;
	private int[][] mat;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		mat = new int[2][5];
		System.out.println("Carga de la matriz por columna:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("Ingrese componente " + " de la fila " + j + " y la columna "+ i + " :");
				mat[j][i] = teclado.nextInt();
			}
		}
	}
	
	public void imprimir() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Matriz4 ma = new Matriz4();
		ma.cargar();
		ma.imprimir();
	}
}
