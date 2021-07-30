package exceptionsActivity;

import java.util.HashSet;
import java.util.Scanner;
class TeamNotFoundException extends Exception{
	
	public TeamNotFoundException(String s)
	{
		super(s);
	}
}

public class TeamException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String winner;
		String runnerUp;
		HashSet <String> set = new HashSet<String>();
	      set.add("Chennai Super Kings");
	      set.add("Sun Risers Hyderabad");
	      set.add("Delhi Capitals");
	      set.add("Kings XI Punjab");
	      set.add("Kolkata Knight Riders");
	      set.add("Mumbai Indians");
	      set.add("Rajasthan Royals");
	      set.add("Royal Challengers Bangalore");
	     try {
		System.out.println("Enter expected winner:");
		winner = sc.next();
		System.out.println("Enter expected runner-up:");
		runnerUp = sc.next();
		if(set.contains(winner) && set.contains(runnerUp))
		{
			System.out.println("Expected IPL Season 13 winner: "+winner);
	    	System.out.println("Expected IPL Season 13 runner: "+runnerUp);
		}else
		{
			throw new TeamNotFoundException("TeamNameNotFoundException: Entered team is not a part of IPL Season 13");
		}
	     }catch(Exception e)
	     {
	    	 System.out.println(e.getMessage());
	     }

	}

}
