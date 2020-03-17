package claseString;

import java.util.Scanner;

public class Cadena4 {
	private Scanner teclado;
	private String clave;
	
	public Cadena4() {
		teclado = new Scanner(System.in);
		System.out.println("Ingrese clave: ");
		clave = teclado.nextLine();
	}
	
	public void verificarClave() {
		if(clave.equals("123abc") == true) {
			System.out.println("Se ingresó la clave en forma correcta");
		}else {
			System.out.println("No se ingresó la clave en forma correcta");
		}
	}
	
	public static void main(String[] args) {
		Cadena4 cad = new Cadena4();
		cad.verificarClave();
	}
}
