package claseString;

import java.util.Scanner;

public class Cadena5 {
	private Scanner teclado;
	private String[] nombre;
	private String[] mail;
	
	public Cadena5() {
		teclado = new Scanner(System.in);
		nombre = new String[2];
		mail = new String[2];
		for (int i = 0; i < nombre.length; i++) {
			System.out.println("Ingrese nombre: ");
			nombre[i] = teclado.nextLine();
			System.out.println("Ingrese mail: ");
			mail[i] = teclado.nextLine();
		}
	}
	
	public void listar() {
		for (int i = 0; i < nombre.length; i++) {
			System.out.println(nombre[i] + " - " + mail[i]);
		}
		System.out.println();
	}
	
	public void consultaMail() {
		String aux;
		System.out.println("Ingrese el nombre de la persona:");
		aux = teclado.nextLine();
		boolean existe = false;
		for (int i = 0; i < nombre.length; i++) {
			if (aux.equals(nombre[i])) {
				System.out.println("Mail de la persona:" + mail[i]);
				existe = true;
			}
		}
		if (existe == false) {
			System.out.println("No existe una persona con ese nombre.");
		}
		System.out.println();
	}
	
	public void sinArroba() {
		for (int i = 0; i < mail.length; i++) {
			boolean existe = false;
			for (int j = 0; j < mail[i].length(); j++) {
				if (mail[i].charAt(j) == '@') {
					existe = true;
				}
			}
			if (existe == false) {
				System.out.println(mail[i] + " no tiene @");
			}
		}
	}
	
	public static void main(String[] args) {
		Cadena5 cad = new Cadena5();
		cad.listar();
		cad.consultaMail();
		cad.sinArroba();
	}
}
