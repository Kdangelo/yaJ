package clasesObjetos;

import java.util.Scanner;

public class Empleado {
	private Scanner teclado;
	String nombre;
	float sueldo;
	
	public void inicializar() {
		teclado=new Scanner(System.in);
		System.out.print("Ingrese el nombre del empleado:");
        nombre=teclado.next();
        System.out.print("Ingrese su sueldo:");
        sueldo=teclado.nextFloat();
	}
	
	public void pagaImpuesto() {
		if (sueldo>3000) {
			System.out.print("Debe abonar impuestos");
		} else {
			System.out.print("No paga impuestos");
		}
	}
	
	public static void main(String[] ar) {
		Empleado empleado1;
		empleado1=new Empleado();
		empleado1.inicializar();
		empleado1.pagaImpuesto();
	}
}
