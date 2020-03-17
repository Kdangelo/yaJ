package whileBuqle;

import java.util.Scanner;

public class EstructuraRepetitivaWhile2 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int n,x;
		System.out.println("Ingrese valor:");
		n=teclado.nextInt();
		x=1;
		while (x<=n) {
			System.out.println(x);
			System.out.println("-");
			x=x+1;
		}
	}
}
