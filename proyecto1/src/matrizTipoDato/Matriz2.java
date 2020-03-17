package matrizTipoDato;

import java.util.Scanner;

public class Matriz2 {
	private Scanner teclado;
	private int[][] mat;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		mat = new int[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("Ingrese componente:");
				mat[i][j] = teclado.nextInt();
			}
		}
	}
	
	public void imprimirDiagonalPrincipal() {
		for (int i = 0; i < 4; i++) {
			System.out.println(mat[i][i]);
		}
	}
	
	public static void main(String[] args) {
		Matriz2 ma = new Matriz2();
		ma.cargar();
		ma.imprimirDiagonalPrincipal();
	}
}
