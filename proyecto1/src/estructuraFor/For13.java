package estructuraFor;

import java.util.Scanner;

public class For13 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int edad,sum1,sum2,sum3,prom1,prom2,prom3;
		sum1=0;
		sum2=0;
		sum3=0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("Ingrese edad:");
            edad=teclado.nextInt();
			sum1=sum1+edad;
		}
		prom1=sum1/5;
		System.out.print("Promedio de edades del turno mañana:");
        System.out.println(prom1);
		for (int i = 1; i <= 6; i++) {
			System.out.print("Ingrese edad:");
            edad=teclado.nextInt();
			sum2=sum2+edad;
		}
		prom2=sum2/6;
		System.out.print("Promedio de edades del turno tarde:");
        System.out.println(prom2);
		for (int i = 1; i <= 11; i++) {
			System.out.print("Ingrese edad:");
            edad=teclado.nextInt();
			sum3=sum3+edad;
		}
		prom3=sum3/11;
		System.out.print("Promedio de edades del turno noche:");
        System.out.println(prom3);
        if (prom1<prom2 && prom1<prom3) {
        	System.out.print("El turno mañana tiene un promedio menor de edades.");
		} else {
			if (prom2<prom3) {
				System.out.print("El turno tarde tiene un promedio menor de edades.");
			} else {
				System.out.print("El turno noche tiene un promedio menor de edades.");
            }
        }
	}
}
