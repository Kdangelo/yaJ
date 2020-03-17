package condicionales;

import java.util.Scanner;

public class EstructuraCondicionalCompuesta1 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num1,num2;
		System.out.println("Ingrese primer número: ");
		num1=teclado.nextInt();
		System.out.println("Ingrese segundo número: ");
		num2=teclado.nextInt();
		if(num1>num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}
	}
}
