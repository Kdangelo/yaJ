package CondicionalesOperadoresLogicos;

import java.util.Scanner;

public class CondicionesCompuestas2 {
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
		if (mes==1||mes==2||mes==3) {
			System.out.println("Corresponde al primer trimestre");
		}
	}
}
