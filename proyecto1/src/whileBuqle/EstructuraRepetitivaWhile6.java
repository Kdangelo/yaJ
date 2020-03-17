package whileBuqle;

import java.util.Scanner;

public class EstructuraRepetitivaWhile6 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int n,x;
		float suma,altura,promedio;
		System.out.print("Cuantas personas hay:");
		n=teclado.nextInt();
		x=1;
		suma=0;
		while (x<=n) {
			System.out.print("Ingrese altura:");
			altura=teclado.nextFloat();
			suma=suma+altura;
			x=x+1;
		}promedio=suma/n;
		System.out.print("Altura promedio:");
		System.out.print(promedio);
	}
}
