package stringutil;

public class StringUtil {
	
	public static boolean containsDobleSpace(String str){
		return str.contains("  ");
		
	}
	public static boolean containsNumber (String str){
		
		boolean switch_number = false;
		
		for (int i = 0; i< str.length();i++) {
 
			if ( Character.isDigit(str.charAt(i)) ) {
				switch_number = true;
			}
		
		}
		return switch_number;

		
	}
	
}
