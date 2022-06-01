package practica4;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String[] args) {

		Random rand = new Random(); 		
		double double_random=0; 
		double_random = rand.nextDouble();
		
		int i = 0;
		double suma = 0;
		double promedio = 0;
		
		while (i < 11) {
			double_random = rand.nextDouble();
			suma = suma  + double_random;	
			System.out.println("Aleatorio" +i +"= " +double_random );
		  i++;
		}
		promedio = suma/10;
		System.out.println("Suma: " +suma);
		System.out.println("Promedio: " +promedio);
	}
}
