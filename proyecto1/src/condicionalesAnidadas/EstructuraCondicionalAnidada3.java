package condicionalesAnidadas;

import java.util.Scanner;

public class EstructuraCondicionalAnidada3 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.print("Ingrese un valor entero:");
		num=teclado.nextInt();
		if(num==0) {
			System.out.print("Ingresò un cero");
		}else {
			if(num>0) {
				System.out.print("positivo");
			}else {
				System.out.print("negativo");
			}
		}
	}
}
