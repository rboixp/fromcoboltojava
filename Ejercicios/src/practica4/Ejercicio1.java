package practica4;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		System.out.println("Introduce un número entero\n");
		Scanner teclado = new Scanner(System.in);
		int numint = teclado. nextInt();
		
		for (int i = 1;i<11;i++) {
			System.out.println("Resultado " +numint +"*" +i +" = "   +numint * i);
		}
		
	}
}
