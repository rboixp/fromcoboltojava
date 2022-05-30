package practica5;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strOriginal  = new String();
		strOriginal  = "Hola Mundo";
		System.out.println ("Original:\t" +strOriginal);
		System.out.println ("Mayusculas:\t" +strOriginal.toUpperCase()  );
		System.out.println ("Minúsculas:\t" +strOriginal.toLowerCase()  );
		System.out.println ("Encriptado:\t" +strOriginal.replace('o', '2')  );

	}

}
