package Activity2;
import java.util.Scanner;

abstract class Match{
	private int currentScore;
	private float currentOver;
	private int target;
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	public float getCurrentOver() {
		return currentOver;
	}
	public void setCurrentOver(float currentOver) {
		this.currentOver = currentOver;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}
	
	abstract float calculateRunRate();
	abstract int calculateBalls();
	abstract void display(double reqRunRate, int balls);
}

class ODIMatch extends Match{
	public float calculateRunRate() {
		return (remaining_runs()/((50-getCurrentOver())));
	}
	
	public int remaining_runs()
	{
		int score=getCurrentScore();
		int target=getTarget();
		int needed_runs=target-score;
		return needed_runs;
	}
	
	public  int calculateBalls() {
		int ballsBowled=6*(int)getCurrentOver();
		float value=getCurrentOver()*10;
		int v=(int)value%10;
		return 300-(ballsBowled+v);
		
	}
	
	public void display(double reqRunrate, int balls) {
	   System.out.println("Requirements:");
	   System.out.println("Needed "+remaining_runs()+" runs in "+calculateBalls()+" balls");
	   System.out.println("Required Runrate: "+String.format("%.2f",calculateRunRate()));
	}

	
}

class TestMatch extends Match{
	public float calculateRunRate() {
		return (remaining_runs()/((90-getCurrentOver())));
	}
	
	public int remaining_runs()
	{
		int score=getCurrentScore();
		int target=getTarget();
		int needed_runs=target-score;
		return needed_runs;
	}
	
	public  int calculateBalls() {
		int ballsBowled=6*(int)getCurrentOver();
		float value=getCurrentOver()*10;
		int v=(int)value%10;
		return 540-(ballsBowled+v);
		
	}
	
	public void display(double reqRunrate, int balls) {
	   System.out.println("Requirements:");
	   System.out.println("Needed "+remaining_runs()+" runs in "+calculateBalls()+" balls");
	   System.out.println("Required Runrate: "+String.format("%.2f",calculateRunRate()));
	}
	
}

class T20Match extends Match{
	public float calculateRunRate() {
		return (remaining_runs()/((20-getCurrentOver())));
	}
	
	public int remaining_runs()
	{
		int score=getCurrentScore();
		int target=getTarget();
		int needed_runs=target-score;
		return needed_runs;
	}
	
	public  int calculateBalls() {
		int ballsBowled=6*(int)getCurrentOver();
		float value=getCurrentOver()*10;
		int v=(int)value%10;
		return 120-(ballsBowled+v);
	}
	
	public void display(double reqRunrate, int balls) {
		System.out.println("Requirements:");
	   System.out.println("Needed "+remaining_runs()+" runs in "+calculateBalls()+" balls");
	   System.out.println("Required Runrate: "+String.format("%.2f",calculateRunRate()));
	}

	
}
public class MatchMain {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			ODIMatch odi;
			T20Match t20_match;
			TestMatch test_match;
			int ch;
			System.out.println("\nEnter the match format\n\n1. ODI\n2. T20\n3. Test");
			ch=sc.nextInt();
			switch(ch) {
			case 1:odi=new ODIMatch();
				   System.out.println("Enter the Current score");
				   odi.setCurrentScore(sc.nextInt());
				   System.out.println("Enter the Current Over");
				   odi.setCurrentOver(sc.nextFloat());
				   System.out.println("Enter Target Score");
				   odi.setTarget(sc.nextInt());
				   double rr=odi.calculateRunRate();
				   int balls=odi.calculateBalls();
				   odi.display(rr, balls);
				   break;
			case 2:t20_match=new T20Match();
				   System.out.println("Enter the Current score");
				   t20_match.setCurrentScore(sc.nextInt());
				   System.out.println("Enter the Current Over");
				   t20_match.setCurrentOver(sc.nextFloat());
				   System.out.println("Enter Target Score");
				   t20_match.setTarget(sc.nextInt());
				   double runr=t20_match.calculateRunRate();
				   int ball_s=t20_match.calculateBalls();
				   t20_match.display(runr, ball_s);
				   break;
			case 3:test_match=new TestMatch();
				   System.out.println("Enter the Current score");
				   test_match.setCurrentScore(sc.nextInt());
				   System.out.println("Enter the Current Over");
				   test_match.setCurrentOver(sc.nextFloat());
				   System.out.println("Enter Target Score");
				   test_match.setTarget(sc.nextInt());
				   double run_r=test_match.calculateRunRate();
				   int bal_s=test_match.calculateBalls();
				   test_match.display(run_r, bal_s);
			       break;	   
			default:
				System.out.println("Invalid Choice");
			
			}

}
}
