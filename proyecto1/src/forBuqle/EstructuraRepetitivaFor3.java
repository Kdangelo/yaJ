package forBuqle;

import java.util.Scanner;

public class EstructuraRepetitivaFor3 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int nota,aprobados,reprobados;
		aprobados=0;
		reprobados=0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Ingrese la nota:");
			nota=teclado.nextInt();
			if (nota>=7) {
				aprobados=aprobados+1;
			} else {
				reprobados=reprobados+1;
			}
		}
		System.out.print("Cantidad de aprobados:");
        System.out.println(aprobados);
		System.out.print("Cantidad de reprobados:");
		System.out.println(reprobados);
	}
}
