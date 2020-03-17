package claseString;

import java.util.Scanner;

public class Cadena6 {
	private Scanner teclado;
	private String oracion;
	
	public Cadena6() {
		teclado = new Scanner(System.in);
		System.out.println("Ingrese oración: ");
		oracion = teclado.nextLine();
	}
	
	public void imprimir() {
		for (int i = 0; i < oracion.length(); i++) {
			if (oracion.charAt(i) == ' ') {
				System.out.println();
			}else {
				System.out.print(oracion.charAt(i));
			}
		}
	}
	
	public static void main(String[] args) {
		Cadena6 cad = new Cadena6();
		cad.imprimir();
	}
}
