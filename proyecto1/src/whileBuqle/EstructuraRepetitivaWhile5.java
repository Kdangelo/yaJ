package whileBuqle;

import java.util.Scanner;

public class EstructuraRepetitivaWhile5 {
	public static void main(String[] ar) {
		int x,conta1,conta2,nota;
		x=1;
		conta1=0;
		conta2=0;
		while (x<=10) {
			@SuppressWarnings("resource")
			Scanner teclado = new Scanner(System.in);
			System.out.println("Nota del alumno:");
			nota=teclado.nextInt();
			if (nota>=7) {
				conta1=conta1+1;
			}else {
				conta2=conta2+1;
			}
			x=x+1;
		}
		System.out.print("Cantidad de alumnos con notas mayores o iguales a 7:");
		System.out.println(conta1);
		System.out.print("Cantidad de alumons con notas menores a 7:");
		System.out.println(conta2);
	}
}
