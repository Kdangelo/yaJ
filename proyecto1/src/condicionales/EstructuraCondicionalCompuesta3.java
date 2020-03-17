package condicionales;

import java.util.Scanner;

public class EstructuraCondicionalCompuesta3 {
	public static void main(String[] ar) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.print("Ingrese un valor entero de uno o dos digitos:");
		num=teclado.nextInt();
		if(num<10){
			System.out.print("Tiene un dìgito");
		}else{
			System.out.print("Tiene dos dìgitos");
		}
	}
}
