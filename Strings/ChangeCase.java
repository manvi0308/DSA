package strings;
/* Given a string S, the task is to change the complete string to 
 * Uppercase or Lowercase depending upon the case for the first character.
*/
public class ChangeCase {
	 static String modify(String s){
	      //  char[] ch = s.toCharArray();
	        
	        if(Character.isUpperCase(s.charAt(0)))
	        {
	        	//flag = true; // L to U
	        	return s.toUpperCase();
	        	
	        }
	       
	        return s.toLowerCase();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "MANvi";
		System.out.println(modify(s));
	}

}
