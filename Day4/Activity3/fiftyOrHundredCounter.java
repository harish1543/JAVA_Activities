package Activity3;

import java.util.ArrayList;
import java.util.Scanner;

public class fiftyOrHundredCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			int match = sc.nextInt();
			int Hundreds =0;
			int fifty=0;
			ArrayList<Integer> List = new ArrayList<Integer>();
			for(int i=0;i<match;i++)
			{
				List.add(sc.nextInt());
			}
			for(int i:List)
			{
				if(i>=100)
				{
					Hundreds++;
					continue;
				}
				if(i>=50)
				{
					fifty++;
				}
			}
			System.out.println(Hundreds+"\n"+fifty);
			sc.close();
		}catch (Exception e)
		{
			System.out.println(e);
		}

	}

}
