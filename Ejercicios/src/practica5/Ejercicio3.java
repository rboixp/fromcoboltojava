package practica5;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
	String nombre = new String();
	String apellido = new String();
		
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introducir nombre ");
    nombre = teclado. nextLine();
		
    System.out.println("Introducir apellido ");
    apellido = teclado. nextLine();
    

	String nombreApellido = new String();
	nombreApellido = nombre + ' ' + apellido;
	System.out.println(nombreApellido);
	}
	

}
