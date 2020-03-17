package forBuqle;

import java.util.Scanner;

public class EstructuraRepetitivaFor6 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int n,base,altura,superficie,cantidad;
		System.out.println("Cuantos valores ingresará:");
		n=teclado.nextInt();
		cantidad=0;
		for (int i = 1; i <= n; i++) {
			System.out.println("Ingrese el valor de la base:");
			base=teclado.nextInt();
			System.out.println("Ingrese el valor de la altura:");
			altura=teclado.nextInt();
			superficie=base*altura/2;
			 System.out.print("La superficie es:");
		        System.out.println(superficie);
			if (superficie>12) {
				cantidad=cantidad+1;
			}
	    }
		System.out.print("La cantidad de triángulos con superficie superior a 12 son:");
        System.out.println(cantidad);
	}
}
