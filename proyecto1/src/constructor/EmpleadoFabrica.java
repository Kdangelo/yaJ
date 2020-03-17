package constructor;

import java.util.Scanner;

public class EmpleadoFabrica {
	private Scanner teclado;
	@SuppressWarnings("unused")
	private String nombre;
	private float sueldo;
	
	public EmpleadoFabrica() {
		teclado = new Scanner(System.in);
		System.out.println("Ingrese el nombre del empleado:");
		nombre = teclado.next();
		System.out.println("Ingrese su sueldo:");
		sueldo = teclado.nextFloat();
	}
	
	public void pagaImpuesto() {
		if (sueldo > 3000) {
			System.out.println("Debe abonar impuestos");
		} else {
			System.out.println("No paga impuestos");
		}
	}
	
	public static void main(String[] args) {
		EmpleadoFabrica empleado1;
		empleado1 = new EmpleadoFabrica();
		empleado1.pagaImpuesto();
	}
}
