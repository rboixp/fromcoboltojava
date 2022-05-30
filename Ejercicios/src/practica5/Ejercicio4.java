package practica5;

public class Ejercicio4 {
	public static void main(String[] args) {
		int numVocales = 0;
		int numConsonantes = 0;
		String texto = new String ("Esto es una prueba de la classe String");
		for (int i = 0; i< texto.length();i++) {
			if ( texto.toUpperCase().charAt(i) == 'A' ||
				 texto.toUpperCase().toUpperCase().charAt(i) == 'E' ||
				 texto.toUpperCase().charAt(i) == 'I' ||
				 texto.toUpperCase().charAt(i) == 'O' ||
				 texto.toUpperCase().charAt(i) == 'U' 
				 ) {
				 numVocales++;
			} else {
				if (texto.toUpperCase().charAt(i) != ' ') {
				numConsonantes++;
				}
			}
		}
		System.out.println("Vocales: " +numVocales);
		System.out.println("Consonantes: " +numConsonantes);
	}

}
