package forBuqle;

import java.util.Scanner;

public class EstructuraRepetitivaFor5 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int n,valor,cantidad;
		cantidad=0;
		System.out.println("Cuantos valores ingresará:");
		n=teclado.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Ingrese valor:");
			valor=teclado.nextInt();
			if (valor>=1000) {
				cantidad=cantidad+1;
			}
		}
		System.out.print("La cantidad de valores ingresados mayores o iguales a 1000 son:");
        System.out.println(cantidad);
	}
}
