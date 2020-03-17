package forBuqle;

import java.util.Scanner;

public class EstructuraRepetitivaFor2 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int suma,valor;
		float promedio;
		suma=0;
		for (int i = 0; i <= 10; i++) {
			System.out.println("Ingrese valor:");
			valor=teclado.nextInt();
			suma=suma+valor;
		}
		System.out.print("La suma es:");
        System.out.println(suma);
		promedio=suma/10;
		System.out.print("El promedio es:");
		System.out.println(promedio);
	}
}
