package estructuraFor;

import java.util.Scanner;

public class For6 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int n,cantidad,base,altura,superficie;
		System.out.print("Cuantos triángulos procesará:");
		n=teclado.nextInt();
		cantidad=0;
		for (int i = 1; i <= n; i++) {
			System.out.print("Ingrese el valor de la base:");
            base=teclado.nextInt();
            System.out.print("Ingrese el valor de la altura:");
            altura=teclado.nextInt();
            superficie=base*altura/2;
            System.out.print("La superficie es:");
            System.out.println(superficie);
            if (superficie>=12) {
				cantidad=cantidad+1;
			}
		}
		System.out.print("La cantidad de triángulos con superficie superior a 12 son:");
        System.out.print(cantidad);
	}
}
