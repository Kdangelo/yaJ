package whileBuqle;

import java.util.Scanner;

public class EstructuraRepetitivaWhile7 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int x,n,conta1,conta2;
		float sueldo,gastos;
		x=1;
		conta1=0;
		conta2=0;
		gastos=0;
		System.out.print("Cuantos empleados tiene la empresa: ");
		n=teclado.nextInt();
		while (x<=n) {
			System.out.print("Ingrese el sueldo del empleado: ");
			sueldo=teclado.nextInt();
			if (sueldo<=300) {
				conta1=conta1+1;
			}else {
				conta2=conta2+1;
			}
			gastos=gastos+sueldo;
			x=x+1;
		}
		System.out.print("Cantidad de empleados con sueldos entre 100 y 300: ");
		System.out.println(conta1);
		System.out.print("Cantidad de empleados con sueldos mayor a 300: ");
		System.out.println(conta2);
		System.out.print("Gastos total de la empresa en sueldos:: ");
		System.out.println(gastos);
	}
}
