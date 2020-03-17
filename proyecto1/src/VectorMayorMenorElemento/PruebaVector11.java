package VectorMayorMenorElemento;

import java.util.Scanner;

public class PruebaVector11 {
	private Scanner teclado;
	private String[] nombres;
	private float[] sueldos;
	
	public void cargar() {
		teclado = new Scanner(System.in);
		nombres = new String[5];
		sueldos = new float[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Ingrese el nombre del empleado:");
			nombres[i] = teclado.next();
			System.out.println("Ingrese el sueldo:");
			sueldos[i] = teclado.nextFloat();
		}
	}
	
	public void mayorSueldo() {
		float mayor;
		int pos;
		mayor = sueldos[0];
		pos = 0;
		for (int i = 1; i < nombres.length; i++) {
			if (sueldos[i]>mayor) {
				mayor = sueldos[i];
				pos = i;
			}
		}
		System.out.println("El empleado con sueldo mayor es "+nombres[pos]);
		System.out.println("Tiene un sueldo:"+mayor);
	}
	
	public static void main(String[] args) {
		PruebaVector11 pv = new PruebaVector11();
		pv.cargar();
		pv.mayorSueldo();
	}
}
