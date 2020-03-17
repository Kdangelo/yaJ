package constructor;

import java.util.Scanner;

public class Operarios {
	private Scanner teclado;
	private int[] sueldos;
	
	public Operarios() {
		teclado = new Scanner(System.in);
		sueldos = new int[5];
		for (int i = 0; i < sueldos.length; i++) {
			System.out.println("Ingrese valor de la componente:");
			sueldos[i] = teclado.nextInt();
		}
	}
	
	public void imprimir() {
		for (int i = 0; i < sueldos.length; i++) {
			System.out.println(sueldos[i]);
		}
	}
	
	public static void main(String[] args) {
		Operarios op = new Operarios();
		op.imprimir();
	}
}
