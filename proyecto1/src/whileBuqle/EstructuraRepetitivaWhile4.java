package whileBuqle;

import java.util.Scanner;

public class EstructuraRepetitivaWhile4 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int x,cantidad,n;
		float largo;
		x=1;
		cantidad=0;
		System.out.println("Pizas a procesar:");
		n=teclado.nextInt();
		while (x<=n) {
			System.out.println("Medida de la pieza:");
			largo=teclado.nextFloat();
			if (largo>=1.20&&largo<=1.30) {
				cantidad=cantidad+1;
			} x=x+1;
		}
		System.out.println("La cantidad de pezas a procesar:");
		System.out.println(cantidad);
	}
}
