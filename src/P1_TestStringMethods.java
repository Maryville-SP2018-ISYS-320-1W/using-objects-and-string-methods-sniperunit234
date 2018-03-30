/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 Your expression predictions:
 
 1. Frodo Baggins
 2. a
 3. Gandalf the Gray
 4.Frodo
 
 5. baggins
 6.Frodo
 7. Frodao Baggins
 8. Frodo Baggins
 
 9. Gandalf the
 10. Gandalf the white
 11. Frodo
 
  
 */

/*
 Were you correct? Explain if you were not (what did you learn?)
 
 1.  
 2. 
 3. 
 4.
 
 5. 
 6.
 7. 
 8. 
 
 9. 
 10. 
 11. 
 
 */
public class P1_TestStringMethods {
	public static void main(String[] args) {
		String str1 = "Frodo Baggins";
		String str2 = "Gandalf the GRAY";
		System.out.println("REPLACE WITH YOUR EXPRESSION");
		str1.length();
		str1.charAt(7);
		str2.charAt(0);
		str1.indexOf("o");

		str2.toUpperCase();
		str1.toLowerCase();
		str1.substring(4);
		str2.substring(3, 14);
		
		str2.replace( "a", "oo");
		str2.replace("gray", "white");
		"str1".replace("r",  "range");
	}

}
