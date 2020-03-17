package vectorOrdenamiento;

import java.util.Scanner;

public class PruebaVector14 {
	private Scanner teclado;
	private String[] paises;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		paises = new String[5];
		for (int i = 0; i < paises.length; i++) {
			System.out.println("Ingrese el nombre del país: ");
			paises[i] = teclado.next();
		}
	}
	
	public void ordenar() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4-i; j++) {
				if (paises[j].compareTo(paises[j+1])>0) {
					String aux;
					aux = paises[j];
					paises[j] = paises[j+1];
					paises[j+1] = aux;
				}
			}
		}
	}
	
	public void imprimir() {
		System.out.println("Paises ordenados en forma alfabética:");
		for (int i = 0; i < paises.length; i++) {
			System.out.println(paises[i]);
		}
	}
	
	public static void main(String[] args) {
		PruebaVector14 pv = new PruebaVector14();
		pv.cargar();
		pv.ordenar();
		pv.imprimir();
	}
}
