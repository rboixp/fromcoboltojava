package practica5;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mail = new String("gcasas1972@gmail.com");
		for (int i = 0; i< mail.length();i++) {
			if(mail.charAt(i) == '@') {
				System.out.println("posicion @: " +(i+1));
			}
		
		}
		System.out.println(mail.substring(0, 10));
		System.out.println(mail.substring(11, mail.length()));

	}

}
