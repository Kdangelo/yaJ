package condicionales;

import java.util.Scanner;

public class EstructuraCondicionalSimple1 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		float sueldo;
		System.out.println("Ingrese el sueldo: ");
		sueldo=teclado.nextFloat();
		if (sueldo>3000) {
			System.out.println("Esta persona debe abonar impuestos");
		}
	}
}