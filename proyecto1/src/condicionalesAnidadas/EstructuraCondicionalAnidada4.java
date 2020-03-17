package condicionalesAnidadas;

import java.util.Scanner;

public class EstructuraCondicionalAnidada4 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.print("Ingrese valor de 3 hasta digitos");
		num=teclado.nextInt();
		if(num<10) {
			System.out.print("Tiene un digito");
		}else {
			if(num<100) {
				System.out.print("Tiene dos digitos");
			}else {
				if(num<1000) {
					System.out.print("Tiene tres digitos");
				}else {
					System.out.print("Error al ingresar digitos");
				}
			}
		}
	}
}
