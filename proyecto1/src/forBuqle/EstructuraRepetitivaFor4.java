package forBuqle;

import java.util.Scanner;

public class EstructuraRepetitivaFor4 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int valor,mul3,mul5;
		mul3=0;
		mul5=0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Ingrese valor:");
			valor=teclado.nextInt();
			if (valor%3==0) {
				mul3=mul3+1;
			}
			if (valor%5==0) {
				mul5=mul5+1;
			}
		}
		System.out.print("Cantidad de valores ingresados múltiplos de 3:");
        System.out.println(mul3);
		System.out.print("Cantidad de valores ingresados múltiplos de 5:");
		System.out.println(mul5);
	}
}
