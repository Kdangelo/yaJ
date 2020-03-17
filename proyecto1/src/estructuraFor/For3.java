package estructuraFor;

import java.util.Scanner;

public class For3 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int aprobados,reprobados,nota;
		aprobados=0;
		reprobados=0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("Ingrese nota:");
			nota=teclado.nextInt();
			if (nota>=7) {
				aprobados=aprobados+1;
			} else {
				reprobados=reprobados+1;
			}
		}
		System.out.print("Cantidad de aprobados:");
        System.out.println(aprobados);
        System.out.print("Cantidad de reprobados:");
        System.out.print(reprobados);
	}
}
