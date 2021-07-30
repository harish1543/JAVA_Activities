import java.util.*;
class Player {
  public static void main(String[] args) {

   	String firstName;
   	String lastName;
	Scanner sc= new Scanner(System.in); 
	firstName= sc.next();    
	lastName= sc.next();    
	String firstChar = firstName.substring(0, 1);
    	String otherChar = firstName.substring(1, firstName.length());
	firstName = firstChar.toUpperCase() + otherChar.toLowerCase();
	lastName = lastName.toUpperCase();
    	System.out.println(firstName+" "+lastName);
	
  }
}
	
	