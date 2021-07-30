package exceptionsActivity;

import java.util.Scanner;

public class ArrayExcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int overs;
		int overNum;
		int runPerOver[];
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter number of overs:");
			overs = sc.nextInt();
			System.out.println("Enter runs scored in each over:");
			runPerOver = new int[overs];
			for(int i=0;i<overs;i++)
			{
				runPerOver[i] = sc.nextInt();
			}
			System.out.println("Enter the over number:");
			overNum = sc.nextInt();
			System.out.println("runs scored in this over:"+runPerOver[overNum]);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		sc.close();

}
}
