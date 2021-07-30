package Activity2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class List1 {
	public static void main(String[] args)
	{
		try {
		ArrayList<String> list=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			list.add(sc.next());
		}
		int firstIndex=sc.nextInt();
		int secondIndex= sc.nextInt();
		Collections.swap(list, firstIndex,secondIndex);
		
		for(String s:list)
		{System.out.println(s);}
		
		sc.close();		
		
		}
		catch (IndexOutOfBoundsException e) {
            System.out.println("\nException thrown : " + e);
        }
		
	}

}