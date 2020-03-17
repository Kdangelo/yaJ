package matrizCantidadFilasColumnas;

import java.util.Scanner;

public class Matriz8 {
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
	
	public void imprimirVertices() {
		System.out.println("V�rtice superior izquierdo:");
		System.out.println(mat[0][0]);
		System.out.println("V�rtice superior derecho:");
		System.out.println(mat[0][mat[0].length-1]);
		System.out.println("V�rtice inferior izquierdo:");
		System.out.println(mat[mat.length-1][0]);
		System.out.println("V�rtice inferior derecho:");
		System.out.println(mat[mat.length-1][mat[mat.length-1].length-1] );
	}
	
	public static void main(String[] args) {
		Matriz8 ma = new Matriz8();
		ma.cargar();
		ma.imprimirVertices();
	}
}
