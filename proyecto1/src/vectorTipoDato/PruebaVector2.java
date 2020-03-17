package vectorTipoDato;

import java.util.Scanner;

public class PruebaVector2 {
	private Scanner teclado;
	private float[] alturas;
	private float promedio;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		alturas=new float[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Ingrese la altura de la persona:");
			alturas[i]=teclado.nextFloat();
		}
	}
	
	public void calcularPromedio() {
		float suma;
		suma=0;
		for (int i = 0; i < 5; i++) {
			suma=suma+alturas[i];
		}
		promedio=suma/5;
		System.out.println("Promedio de alturas:"+promedio);
	}
	
	public void mayoresMenores() {
		int may,men;
		may=0;
		men=0;
		for (int i = 0; i < 5; i++) {
			if (alturas[i]>promedio) {
				may++;
			} else {
				if (alturas[i]<promedio) {
					men++;
				}
			}
		}
		System.out.println("Cantidad de personas mayores al promedio:"+may);
		System.out.println("Cantidad de personas menores al promedio:"+men);
	}
	
	public static void main(String[] args) {
		PruebaVector2 pv2 = new PruebaVector2();
		pv2.cargar();
		pv2.calcularPromedio();
		pv2.mayoresMenores();
	}
}
