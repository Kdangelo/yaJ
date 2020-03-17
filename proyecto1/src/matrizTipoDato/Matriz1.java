package matrizTipoDato;

import java.util.Scanner;

public class Matriz1 {
	private Scanner teclado;
	private int[][] mat;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		mat = new int[3][5];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Ingrese componente:");
				mat[i][j] = teclado.nextInt();
			}
		}
	}
	
	public void imprimir() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Matriz1 ma = new Matriz1();
		ma.cargar();
		ma.imprimir();
	}
}
