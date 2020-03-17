package CondicionalesOperadoresLogicos;

import java.util.Scanner;

public class CondicionesCompuestas7 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int x,y;
		System.out.println("Ingrese valor de x:");
		x=teclado.nextInt();
		System.out.println("Ingrese valor de y:");
		y=teclado.nextInt();
		if (x>0&&y>0) {
			System.out.println("1 cuadrante");
		} else {
			if (x<0&&y>0) {
				System.out.println("2 cuadrante");
			} else {
				if (x<0&&y<0) {
					System.out.println("3 cuadrante");
				} else {
					System.out.println("4 cuadrante");
				}
			}
		}
	}	
}
