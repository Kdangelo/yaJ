package constructor;

import java.util.Scanner;

public class OperacionesCalculo {
	private Scanner teclado;
	private int valor1, valor2;
	
	public OperacionesCalculo() {
		teclado = new Scanner(System.in);
		System.out.println("Ingrese primer valor:");
		valor1 = teclado.nextInt();
		System.out.println("Ingrese segundo valor:");
		valor2 = teclado.nextInt();
	}
	
	public void sumar() {
		int suma;
		suma = valor1 + valor2;
		System.out.println("La suma es: " + suma);
	}
	
	public void restar() {
		int resta;
		resta = valor1 - valor2;
		System.out.println("La resta es: " + resta);
	}
	
	public void multiplicar() {
		int multiplicacion;
		multiplicacion = valor1 * valor2;
		System.out.println("La multiplicación es: " + multiplicacion);
	}
	
	public void dividir() {
		int division;
		division = valor1 / valor2;
		System.out.println("La división es: " + division);
	}
	
	public static void main(String[] args) {
		OperacionesCalculo op = new OperacionesCalculo();
		op.sumar();
		op.restar();
		op.multiplicar();
		op.dividir();
	}
}
