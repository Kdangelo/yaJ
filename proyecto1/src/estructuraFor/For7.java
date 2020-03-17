package estructuraFor;

import java.util.Scanner;

public class For7 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int valor,suma;
		suma=0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("Ingrese valor:");
			valor=teclado.nextInt();
			if (i>5) {
				suma=suma+valor;
			}
		}
		System.out.print("La suma de los últimos 5 valores es:");
        System.out.print(suma);
	}
}
