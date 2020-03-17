package metodos;

import java.util.Scanner;

public class TablaMultiplicar {
	public void cargarValor() {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int valor;
		do {
			System.out.println("Ingrese valor:");
			valor=teclado.nextInt();
			if (valor!=-1) {
				calcular(valor);
			}
		} while (valor!=-1);
	}
	public void calcular(int v) {
		for (int f = v; f < v*10; f=f+v) {
			System.out.print(f+"-");
		}
	}
	public static void main(String[] args) {
		TablaMultiplicar tabla;
		tabla= new TablaMultiplicar();
		tabla.cargarValor();
	}
}
