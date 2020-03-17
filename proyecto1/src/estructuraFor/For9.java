package estructuraFor;

import java.util.Scanner;

public class For9 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int n;
		System.out.print("Ingrese un valor entre 1 y 10:");
		n=teclado.nextInt();
		for (int i = n; i <= n * 12; i = i + n) {
			System.out.println(i);
		}
	}
}
