package CondicionalesOperadoresLogicos;

import java.util.Scanner;

public class CondicionesCompuestas3 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		@SuppressWarnings("unused")
		int dia,mes,a�o;
		System.out.println("Ingrese dia:");
		dia=teclado.nextInt();
		System.out.println("Ingrese mes:");
		mes=teclado.nextInt();
		System.out.println("Ingrese a�o:");
		a�o=teclado.nextInt();
		if (dia==25&&mes==12) {
			System.out.println("Navidad");
		}
	}
}
