package estructuraFor;

import java.util.Scanner;

public class For10 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int n,lado1,lado2,lado3,equilatero,isosceles,escaleno;
        System.out.print("Ingrese la cantidad de triángulos:");
        n=teclado.nextInt();
        equilatero=0;
        isosceles=0;
        escaleno=0;
        for (int i = 1; i <= n; i++) {
        	System.out.print("Ingrese lado 1:");
            lado1=teclado.nextInt();
            System.out.print("Ingrese lado 2:");
            lado2=teclado.nextInt();
            System.out.print("Ingrese lado 3:");
            lado3=teclado.nextInt();
            if (lado1==lado2 && lado1==lado3) {
            	System.out.println("Es un triángulo equilatero.");
            	equilatero++;
			} else {
				if (lado1==lado2 || lado1==lado3 || lado2==lado3) {
					System.out.println("Es un triángulo isósceles.");
					isosceles++;
				} else {
					System.out.println("Es un triángulo escaleno.");
					escaleno++;
				}
			}
		}
        System.out.print("Cantidad de triángulos equilateros:");
        System.out.println(equilatero);
        System.out.print("Cantidad de triángulos isósceles:");
        System.out.println(isosceles);
        System.out.print("Cantidad de triángulos escalenos:");
        System.out.println(escaleno);
        if (equilatero<isosceles && equilatero<escaleno) {
        	System.out.print("Hay menor cantidad de triángulos equilateros.");
		} else {
			if (isosceles<escaleno) {
				System.out.print("Han menor cantidad de triángulos isósceles");
			} else {
				System.out.print("Han menor cantidad de triángulos escalenos");
			}
		}
	}
}
