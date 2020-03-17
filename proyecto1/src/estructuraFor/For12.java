package estructuraFor;

import java.util.Scanner;

public class For12 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int valor,negativos,positivos,cinco,pares;
		negativos=0;
		positivos=0;
		cinco=0;
		pares=0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("Ingrese valor:");
            valor=teclado.nextInt();
            if (valor>0) {
				positivos++;
			} else {
				negativos++;
			}
            if (valor%15==0) {
				cinco++;
			}
            if (valor%2==0) {
				pares++;
			}
		}
        System.out.print("Cantidad de valores negativos:");
        System.out.println(negativos);
        System.out.print("Cantidad de valores positivos:");
        System.out.println(positivos);
        System.out.print("Cantidad de valores múltiplos de 15:");
        System.out.println(cinco);
        System.out.print("Suma de los valores pares:");
        System.out.println(pares);
	}
}
