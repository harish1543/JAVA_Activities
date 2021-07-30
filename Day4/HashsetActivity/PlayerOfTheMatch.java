package HashsetActivity;

import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Scanner;
public class PlayerOfTheMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			int MOMnumber = sc.nextInt();
			ArrayList<String> list = new ArrayList<String>();
			for(int i=0;i<MOMnumber;i++)
			{
				list.add(sc.next());
			}
			TreeSet<String> set = new TreeSet<String>(list);
			sc.close();
			for(String i:set) {
			System.out.println(i);
			}
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}