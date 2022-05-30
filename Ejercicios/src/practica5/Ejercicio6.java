package practica5;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = new String();
		Scanner teclado = new Scanner(System.in);
	    System.out.println("Introducir texto ");
	    texto = teclado. nextLine();
	    for (int i = 0; i< texto.length();i++) {
	    	if (texto.charAt(i) == '0' ||
	    		texto.charAt(i) == '1' ||
	    		texto.charAt(i) == '2' ||
	    		texto.charAt(i) == '3' ||
	    		texto.charAt(i) == '4' ||
	    		texto.charAt(i) == '5' ||
	    		texto.charAt(i) == '6' ||
	    		texto.charAt(i) == '7' ||
	    		texto.charAt(i) == '8' ||
	    		texto.charAt(i) == '9'  ) {
	    		System.out.println("String " + texto  + " tiene el número " +texto.charAt(i) + " en la posición " +(i+1) );
	    		
	    	}
	    }
	    }
	}


