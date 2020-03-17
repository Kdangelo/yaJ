package condicionalesAnidadas;

import java.util.Scanner;

public class EstructuraCondicionalAnidada5 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int totalPreguntas,totalCorrectas;
		System.out.print("Ingrese total preguntas");
		totalPreguntas=teclado.nextInt();
		System.out.print("Ingrese total correctas");
		totalCorrectas=teclado.nextInt();
		int porcentaje=totalCorrectas*100/totalPreguntas;
		if (porcentaje>=90) {
			System.out.print("Nivel maximo");
		} else {
			if (porcentaje>=75) {
				System.out.print("Nivel medio");
			} else {
				if (porcentaje>=50) {
					System.out.print("Nivel regular");
				} else {
					System.out.print("Fuera de nivel");
				}
			}
		}
	}
}
