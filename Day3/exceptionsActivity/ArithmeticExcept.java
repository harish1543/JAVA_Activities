package exceptionsActivity;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArithmeticExcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		int runScored;
		int overFaced;
		
		try {
			System.out.println("Enter runs Scored:");
			runScored = Integer.parseInt(Br.readLine());
			System.out.println("Enter over faced:");
			overFaced = Integer.parseInt(Br.readLine());
			
			System.out.println("Current run Rate:"+(float)(runScored/overFaced));
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
