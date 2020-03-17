package estructuraDoWhile;

import java.util.Scanner;

public class DoWhile02 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int valor,suma,promedio,cantidad;
		suma=0;
		cantidad=0;
		do {
			System.out.print("Ingrese un valor (0 para finalizar):");
			valor=teclado.nextInt();
			if (valor!=0) {
				suma=suma+valor;
				cantidad++;
			} 
		} while (valor!=0);
		if (cantidad!=0) {
			promedio=suma/cantidad;
			System.out.print("El promedio de los valores ingresados es:");
            System.out.print(promedio);
		} else {
			System.out.print("No se ingresaron valores.");
		}
	}
}
