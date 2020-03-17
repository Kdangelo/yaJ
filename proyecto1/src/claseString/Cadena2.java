package claseString;

import java.util.Scanner;

public class Cadena2 {
	private Scanner teclado;
	private String mail;
	
	public Cadena2() {
		teclado = new Scanner(System.in);
		System.out.println("Ingrese un email:");
		mail = teclado.nextLine();
	}
	
	public void verificarArroba() {
		boolean existe = false;
		for (int i = 0; i < mail.length(); i++) {
			if (mail.charAt(i) == '@') {
				existe = true;
			}
		}
		if (existe == true) {
			System.out.println(mail + " contiene el caracter @");
		} else {
			System.out.println(mail + " no contiene el caracter @");
		}
	}
	
	public static void main(String[] args) {
		Cadena2 ca = new Cadena2();
		ca.verificarArroba();
	}
}
