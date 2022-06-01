package practica4;

import java.util.Random;

public class Ejercicio5 {
	public static void main(String[] args) {

		double double_random=0; 
		
		int i = 1;
		double minimo = 0;
		double maximo = 0;
		
        do
        {
        	double_random =  Math.random();
        	System.out.println("Aleatorio " +i +"= " +double_random );
        	
        	if (i==1) {minimo = double_random;}
        	
        	if (minimo > double_random) {
        		minimo = double_random;
        	}
        	if (maximo < double_random) {
        		maximo = double_random;
        	}
            i++;
        }
        while (i < 11);		
        
        System.out.println("Mínimo= " +minimo );
        System.out.println("Maximo= " +maximo );
        
		
	}
}
