package whileBuqle;

import java.util.Scanner;

public class EstructuraRepetitivaWhile11 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int x,n,par,impar,valor;
		x=1;
		par=0;
		impar=0;
		System.out.println("Cuantos números ingresará: ");
		n=teclado.nextInt();
		while (x<=n) {
			System.out.print("Ingrese el valor: ");
			valor=teclado.nextInt();
			if (valor%2==0) {
				par=par+1;
			} else {
				impar=impar+1;
			}
			x=x+1;
		}
		System.out.print("Cantadad de pares: ");
		System.out.println(par);
		System.out.print("Cantidad de impares: ");
		System.out.println(impar);
	}
}
