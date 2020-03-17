package matrizCantidadFilasColumnas;

import java.util.Scanner;

public class Matriz6 {
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
	
	public void imprimirMayor() {
		int mayor = mat[0][0];
		int filaMay= 0;
		int columnaMay = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j]>mayor) {
					mayor = mat[i][j];
					filaMay = i;
					columnaMay = j;
				}
			}
		}
		System.out.println("El elemento mayor es:"+mayor);
        System.out.println("Se encuentra en la fila:"+filaMay+ " y en la columna: "+columnaMay);
    }
	
	public static void main(String[] args) {
		Matriz6 ma = new Matriz6();
		ma.cargar();
		ma.imprimirMayor();
	}
}
