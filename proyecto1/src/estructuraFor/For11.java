package estructuraFor;

import java.util.Scanner;

public class For11 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int n,x,y,primer, segundo,tercer,cuarto;
		System.out.print("Ingrese cantidad de puntos a procesar:");
        n=teclado.nextInt();
        primer=0;
        segundo=0;
        tercer=0;
        cuarto=0;
        for (int i = 1; i <= n ; i++) {
        	System.out.print("Ingrese coordenada x:");
            x=teclado.nextInt();
            System.out.print("Ingrese coordenada y:");
            y=teclado.nextInt();
            if (x>0 && y>0) {
				primer++;
			} else {
				if (x<0 && y>0) {
					segundo++;
				} else {
					if (x<0 && y<0) {
						tercer++;
					} else {
						if (x>0 && y<0) {
							cuarto++;
						}
					}
				}
			}
        }
        System.out.print("Cantidad de puntos en el primer cuadrante:");
        System.out.println(primer);
        System.out.print("Cantidad de puntos en el segundo cuadrante:");
        System.out.println(segundo);
        System.out.print("Cantidad de puntos en el tercer cuadrante:");
        System.out.println(tercer);
        System.out.print("Cantidad de puntos en el cuarto cuadrante:");
        System.out.println(cuarto);
	}
}
