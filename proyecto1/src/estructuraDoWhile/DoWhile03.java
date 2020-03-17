package estructuraDoWhile;

import java.util.Scanner;

public class DoWhile03 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int cantidad1,cantidad2,cantidad3,suma;
		float peso;
		cantidad1=0;
		cantidad2=0;
		cantidad3=0;
		do {
			System.out.print("Ingrese el peso de la pieza (0 pera finalizar):");
			peso=teclado.nextInt();
			if (peso>10.2) {
				cantidad1++;
			} else {
				if (peso>=9.8) {
					cantidad2++;
				} else {
					if (peso>0) {
						cantidad3++;
					}
				}
			}
		} while (peso!=0);
		suma=cantidad1+cantidad2+cantidad3;
        System.out.print("Piezas aptas:");
        System.out.println(cantidad2);
        System.out.print("Piezas con un peso superior a 10.2:");
        System.out.println(cantidad1);
        System.out.print("Piezas con un peso inferior a 9.8:");
        System.out.println(cantidad3);
        System.out.print("Total de piezas procesadas:");
        System.out.println(suma);
	}
}
