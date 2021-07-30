package HashsetActivity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class DistinctMOM {

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
			HashSet<String> set = new HashSet<String>(list);
			sc.close();
			System.out.println(set.size());
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
