package matrizYVectorParalelos;

import java.util.Scanner;

public class Matriz10 {
	private Scanner teclado;
	private String[] paises;
	private int[][] tempmen;
	private int[] temptri;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		paises = new String[4];
		tempmen = new int[4][3];
		for (int i = 0; i < paises.length; i++) {
			System.out.print("Ingrese el nombre del país:");
			paises[i] = teclado.next();
			for (int j = 0; j < tempmen[i].length; j++) {
				System.out.print("Ingrese temperatura mensual:");
				tempmen[i][j] = teclado.nextInt();
			}
		}
	}
	
	public void imprimirTempMensuales() {
		for (int i = 0; i < paises.length; i++) {
			System.out.print("Pais:" + paises[i] + ":");
			for (int j = 0; j < tempmen[i].length; j++) {
				System.out.print(tempmen[i][j] + " ");
			}
		}
		System.out.println();
	}
	
	public void calcularTemperaturaTri() {
		temptri = new int[4];
		for (int i = 0; i < tempmen.length; i++) {
			int suma = 0;
			for (int j = 0; j < tempmen[i].length; j++) {
				suma = tempmen[i][j] + suma;
			}
			temptri[i] = suma/3;
		}
		
	}
	
	public void imprimirTempTrimestrales() {
		System.out.println("Temperaturas trimestrales.");
		for (int i = 0; i < paises.length; i++) {
			System.out.println(paises[i] + temptri[i]);
		}
	}
	
	public void paisMayorTemperaturaTri() {
		int may = temptri[0];
		String nom = paises[0];
		for (int i = 0; i < temptri.length; i++) {
			if (temptri[i] > may) {
				may = temptri[i];
				nom = paises[i];
			}
		}
		System.out.println("Pais con temperatura trimestral mayor es " + nom + " que tiene una temperatura de " + may);
	}
	
	public static void main(String[] args) {
		Matriz10 ma = new Matriz10();
		ma.cargar();
		ma.imprimirTempMensuales();
		ma.calcularTemperaturaTri();
		ma.imprimirTempTrimestrales();
		ma.paisMayorTemperaturaTri();
	}
}
