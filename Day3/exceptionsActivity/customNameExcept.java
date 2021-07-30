package exceptionsActivity;

import java.util.Scanner;

class customException extends Exception{
	public customException(String s)
	{
		super(s);
	}
}

public class customNameExcept {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		try {
			System.out.println("Enter name:");
			name = sc.next();
			System.out.println("Enter age:");
			age = sc.nextInt();
			sc.close();
			if(age<19) {
	        	throw new customException("customException: InvalidAgeRangeException"); 	
	        }
	        else {
	        	System.out.println("Player name : "+name);
	        	System.out.println("Player age : "+age);
	        }
		}catch(customException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
