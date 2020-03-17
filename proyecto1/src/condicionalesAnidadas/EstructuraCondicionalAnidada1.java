package condicionalesAnidadas;

import java.util.Scanner;

public class EstructuraCondicionalAnidada1 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num1,num2,num3;
		System.out.print("Ingrese primer nota:");
		num1=teclado.nextInt();
		System.out.print("Ingrese segunda nota:");
		num2=teclado.nextInt();
		System.out.print("Ingrese tercer nota:");
		num3=teclado.nextInt();
		int promedio;
		promedio=(num1+num2+num3)/3;
		if(promedio>=7) {
			System.out.print("Promocionado");
		}else {
			if(promedio>=4) {
				System.out.print("Regular");
			}else {
				System.out.print("Reprobado");
			}
		}
	}
}
