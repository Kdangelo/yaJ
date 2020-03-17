package vectorOrdenamientoParalelo;

import java.util.Scanner;

public class PruebaVector16 {
	private Scanner teclado;
	private String[] nombres;
	private int[] notas;
	
	public void cargar() {
		teclado =  new Scanner(System.in);
		nombres = new String[5];
		notas = new int[5];
		System.out.println("Carga de nombres y notas");
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Ingese el nombre del alumno:");
			nombres[i] = teclado.next();
			System.out.println("Ingrese la nota del alumno:");
			notas[i] = teclado.nextInt();
		}
	}
	
	public void ordenar() {
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas.length-1-i; j++) {
				if (notas[j]<notas[j+1]) {
					int auxNota;
					auxNota = notas[j];
					notas[j] = notas[j+1];
					notas[j+1] = auxNota;
					String auxNombre;
					auxNombre = nombres[j];
					nombres[j] = nombres[j+1];
					nombres[j+1] = auxNombre;
				}
			}
		}
	}
	
	public void imprimir() {
		System.out.println("Nombres de alumnos y notas de mayor a menor");
		for (int i = 0; i < notas.length; i++) {
			System.out.println(nombres[i] + - + notas[i]);			
		}
	}
	
	public static void main(String[] args) {
		PruebaVector16 pv = new PruebaVector16();
		pv.cargar();
		pv.ordenar();
		pv.imprimir();
	}
}
