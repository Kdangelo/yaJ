package CondicionalesOperadoresLogicos;

import java.util.Scanner;

public class CondicionesCompuestas9 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Ingrese primer valor:");
		num1=teclado.nextInt();
		System.out.println("Ingrese segundo valor:");
		num2=teclado.nextInt();
		System.out.println("Ingrese tercer valor:");
		num3=teclado.nextInt();
		if (num1<num2&&num1<num3) {
			System.out.println(num1);
		} else {
			if (num2<num3) {
				System.out.println(num2);
			} else {
				System.out.println(num3);
			}
		}
		System.out.println("-");
		if (num1>num2&&num1>num3) {
			System.out.println(num1);
		} else {
			if (num2>num3) {
				System.out.println(num2);
			} else {
				System.out.println(num3);
			}
		}
	}
}
