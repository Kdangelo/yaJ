package estructuraDoWhile;

import java.util.Scanner;

public class DoWhile04 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int valor,suma;
		suma=0;
		do {
			System.out.print("Ingrese un valor:");
			valor=teclado.nextInt();
			if (valor!=9999) {
				suma=suma+valor;
			}
		} while (valor!=9999);
		System.out.print("El valor acumulado es ");
        System.out.println(suma);
        if (valor==0) {
        	System.out.println("El valor acumulado es cero.");
		} else {
			if (valor>0) {
				System.out.println("El valor acumulado es positivo.");
			} else {
				System.out.println("El valor acumulado es negativo");
			}
		}
	}
}
