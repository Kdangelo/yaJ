package whileBuqle;

import java.util.Scanner;

public class EstructuraRepetitivaWhile3 {
	public static void main(String[] ar) {
		int x,suma,valor,promedio;
		x=1;
		suma=0;
		while (x<=10) {
			@SuppressWarnings("resource")
			Scanner teclado = new Scanner(System.in);
			System.out.println("Ingrese valor:");
			valor=teclado.nextInt();
			suma=valor+suma;
			x=x+1;
		}
		promedio=suma/10;
		System.out.println("La suma de los 10 valores es:");
		System.out.println(suma);
		System.out.println("El promedio de los 10 valores es:");
		System.out.println(promedio);
	}
}
