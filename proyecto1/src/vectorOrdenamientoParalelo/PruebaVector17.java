package vectorOrdenamientoParalelo;

import java.util.Scanner;

public class PruebaVector17 {
	private Scanner teclado;
	private String[] paises;
	private int[] habitantes;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		paises = new String[5];
		habitantes = new int[5];
		System.out.println("Carga de paises y habitantes");
		for (int i = 0; i < paises.length; i++) {
			System.out.println("Ingrese nombre del pais:");
			paises[i] = teclado.next();
			System.out.println("Ingrese la cantidad de habitantes:");
			habitantes[i] = teclado.nextInt();
		}
	}
	
	public void ordenarPorNombres() {
		for (int i = 0; i < paises.length; i++) {
			for (int j = 0; j < paises.length-1-i; j++) {
				if (paises[j].compareTo(paises[j+1])>0) {
					String auxPais;
					auxPais = paises[j];
					paises[j] = paises[j+1];
					paises[j+1] = auxPais;
					int auxHabitante;
					auxHabitante = habitantes[j];
					habitantes[j] = habitantes[j+1];
					habitantes[j+1] = auxHabitante;
				}
			}
		}
	}
	
	public void ordenarPorHabitantes() {
		for (int i = 0; i < paises.length; i++) {
			for (int j = 0; j < paises.length-1-i; j++) {
				if (habitantes[j]<habitantes[j+1]) {
					String auxPais;
					auxPais = paises[j];
					paises[j] = paises[j+1];
					paises[j+1] = auxPais;
					int auxHabitante;
					auxHabitante = habitantes[j];
					habitantes[j] = habitantes[j+1];
					habitantes[j+1] = auxHabitante;
				}
			}
		}
	}
	
	public void imprimir() {
		for (int i = 0; i < paises.length; i++) {
			System.out.println(paises[i] + " - " + habitantes[i]);
		}
	}
	
	public static void main(String[] args) {
		PruebaVector17 pv = new PruebaVector17();
		pv.cargar();
		pv.ordenarPorNombres();
		System.out.println("Ordenados alfabéticamente");
		pv.imprimir();
		pv.ordenarPorHabitantes();
		System.out.println("Ordenados por cantidad de habitantes");
		pv.imprimir();
	}
}
