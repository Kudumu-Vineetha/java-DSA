import java.util.Scanner;

public class missing {
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
	    int n=sc.nextInt();
	    int a[]=new int[n];
        System.out.print("Enter " + n + " elements:");
        for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	        }
        int m=a.length;
        int totalsum=0;
        int arrsum=0;
        for(int i=0;i<m;i++)
        {
            totalsum=m*(m+1)/2;
        }
        for(int i=0;i<m;i++)
        {
            arrsum+=a[i];
        }
        System.out.print(totalsum-arrsum);
        
    }
    
}
