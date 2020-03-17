package vectorTipoDato;

import java.util.Scanner;

public class PruebaVector1 {
	private Scanner teclado;
	private int[] sueldos;
	
	public void cargar() {
		teclado= new Scanner(System.in);
		sueldos= new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Ingrese valor de la componente:");
			sueldos[i]=teclado.nextInt();
		}
	}
	
	public void imprimir() {
		for (int i = 0; i < 5; i++) {
			System.out.println(sueldos[i]);
		}
	}
	
	public static void main(String[] args) {
		PruebaVector1 pv = new PruebaVector1();
		pv.cargar();
		pv.imprimir();
	}
}
 