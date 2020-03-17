package vectorTipoDato;

import java.util.Scanner;

public class PruebaVector3 {
	private Scanner teclado;
	private float[] turnoMan;
	private float[] turnoTar;
	
	public void cargar() {
		teclado=new Scanner(System.in);
		turnoMan=new float[4];
		turnoTar=new float[4];
		System.out.println("Sueldos de empleados del turno de la mañana.");
		for (int i = 0; i < 4; i++) {
			System.out.println("Ingrese sueldo:");
			turnoMan[i]=teclado.nextFloat();
		}
		System.out.println("Sueldos de empleados del turno de la tarde.");
		for (int i = 0; i < 4; i++) {
			System.out.println("Ingrese sueldo:");
			turnoTar[i]=teclado.nextFloat();
		}
	}
	
	public void calcularGastos() {
		float man=0;
		float tar=0;
		for (int i = 0; i < 4; i++) {
			man=man+turnoMan[i];
			tar=tar+turnoTar[i];
		}
		System.out.println("Total de gastos del turno de la mañana:"+man);
		System.out.println("Total de gastos del turno de la tarde:"+tar);
	}
	
	public static void main(String[] args) {
		PruebaVector3 pv = new PruebaVector3();
		pv.cargar();
		pv.calcularGastos();
	}
}
