package testsubidagit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import stringutil.*;
import dateutil.*;

public class TestSubidaGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("Test");
		String texto = new String();
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introducir texto ");
	    texto = teclado. nextLine();
	    System.out.println("String contiene numeros " +StringUtil.containsNumber(texto));
	    System.out.println("String contiene dos espacios " +StringUtil.containsDobleSpace(texto));

	}

}
