package estructuraFor;

import java.util.Scanner;

public class For5 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int n,cantidad,valor;
		cantidad=0;
		System.out.print("Cuantos valores ingresará:");
		n=teclado.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("Ingrese valor:");
			valor=teclado.nextInt();
			if (valor>=1000) {
				cantidad=cantidad+1;
			}
		}
		System.out.print("La cantidad de valores ingresados mayores o iguales a 1000 son:");
        System.out.print(cantidad);
	}
}
