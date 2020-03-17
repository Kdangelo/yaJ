package matrizIrregular;

import java.util.Scanner;

public class MatrizIrregular1 {
	private Scanner teclado;
	private int[][] mat;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		System.out.println("Cuantas filas tiene la matriz:");
		int filas = teclado.nextInt();
		mat = new int[filas][];
		for (int i = 0; i < mat.length; i++) {
			System.out.println("Cuantas elementos tiene la fila " + i + ":");
			int elementos = teclado.nextInt();
			mat[i] = new int[elementos];
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
	
	public static void main(String[] args) {
		MatrizIrregular1 ma = new MatrizIrregular1();
		ma.cargar();
		ma.imprimir();
	}
}
