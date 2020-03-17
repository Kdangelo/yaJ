package CondicionalesOperadoresLogicos;

import java.util.Scanner;

public class CondicionesCompuestas8 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		float sueldo;
		int antiguedad;
		System.out.println("Ingrese sueldo:");
		sueldo=teclado.nextInt();
		System.out.println("Ingrese antiguedad:");
		antiguedad=teclado.nextInt();
		if (sueldo<500&&antiguedad>=10) {
			System.out.print("Sueldo a pagar:");
			System.out.println(sueldo*1.2);
		} else {
			if (sueldo<500) {
				System.out.print("Sueldo a pagar:");
				System.out.println(sueldo*1.05);
			} else {
				System.out.print("Sueldo a pagar:");
				System.out.println(sueldo);
			}
		}
	}
}
