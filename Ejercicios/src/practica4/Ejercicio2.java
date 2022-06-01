package practica4;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		System.out.println("Introduce un número entero\n");
		Scanner teclado = new Scanner(System.in);
		int numint = teclado. nextInt();
		int pares = 0;
		int impares = 0;
		
		for (int i = 1;i<11;i++) {
			int resultado = +numint * i;
			System.out.println("Resultado " +numint +"*" +i +" = "   +resultado);
			
			if (resultado%2==0) {
				pares = pares + resultado;
			} else {
				impares = impares + resultado;
			}
		}
		
		System.out.println("Suma pares " +pares);
		System.out.println("Suma impares " +impares);
		
	}
}
