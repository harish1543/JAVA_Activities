import java.util.Scanner;
public class sumArrayPrime {
    static void sumPrimeArray(int arr[], int size)
    {
        if(size<0)
        {
            System.out.println("Invalid array size");
            return;
        }
        int sum=0;
        for(int i=0;i<size;i++)
        {
            boolean isprime=true;
            if (arr[i]<0)
            {
                System.out.println("Invalid input");
                return;
            }
            
            if(arr[i]<2)
            {
                isprime = false;
                continue;
            }
            
            for(int j=2;j<=arr[i]/2;j++)
            {
                if(arr[i]%j==0)
                {
                    isprime = false;
                    break;
                }
            }
            
            if(isprime)
            {
                sum+=arr[i];
            }
            
        }
        System.out.println("Sum:"+sum);
    }
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size;
      size = sc.nextInt();
      int arr[] = new int[size];
      for(int i=0;i<size;i++)
    {
     	arr[i] = sc.nextInt();
    }
      sumPrimeArray(arr,size);
    }
}