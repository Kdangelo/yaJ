package claseString;

import java.util.Scanner;

public class Cadena3 {
	private Scanner teclado;
	private String cad;
	
	public Cadena3() {
		teclado = new Scanner(System.in);
		System.out.println("Ingrese una cadena:");
		cad = teclado.nextLine();
	}
	
	public void primerMitad() {
		String mitad;
		mitad = cad.substring(0, cad.length()/2);
		System.out.println("Primer mitad de caracteres: " + mitad);
	}
	
	public void ultimoCaracter() {
		char ultimo = cad.charAt(cad.length() -1);
		System.out.println("Ultimo caracter: " + ultimo);
	}
	
	public void formaInversa() {
		System.out.println("Impresión en forma inversa:");
		for (int i = cad.length() - 1; i >= 0; i--) {
			System.out.println(cad.charAt(i));
		}
	}
	
	public void conGuion() {
		System.out.println("Separado por guiones:");
		for (int i = 0; i < cad.length(); i++) {
			System.out.print(cad.charAt(i) + "-");
		}
		System.out.println();
	}
	
	public void cantidadVocales() {
		int cant = 0;
		for (int i = 0; i < cad.length(); i++) {
			if (cad.charAt(i) == 'a' || cad.charAt(i) == 'A' ||
				cad.charAt(i) == 'b' || cad.charAt(i) == 'B' ||
				cad.charAt(i) == 'c' || cad.charAt(i) == 'C' ||
				cad.charAt(i) == 'd' || cad.charAt(i) == 'D' ||
				cad.charAt(i) == 'e' || cad.charAt(i) == 'E') {
				cant++;
			}
		}
		System.out.println("Cantidad de vocales: " + cant);
	}
	
	public void esCapicua() {
		int cant = 0;
		for (int i = 0; i < cad.length()/2; i++) {
			if (cad.charAt(i) == cad.charAt(cad.length()-1-i)) {
				cant++;
			}
		}
		if (cant == cad.length()/2) {
			System.out.println("Es capicúa la cadena " + cad);
		} else {
			System.out.println("No es capicúa la cadena " + cad);
		}
	}
	
	public static void main(String[] args) {
		Cadena3 cad = new Cadena3();
		cad.primerMitad();
		cad.ultimoCaracter();
		cad.formaInversa();
		cad.conGuion();
		cad.cantidadVocales();
		cad.esCapicua();
	}
}
