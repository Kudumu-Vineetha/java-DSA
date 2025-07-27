import java.util.Scanner;
public class runningsum {
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
        for(int i=1;i<a.length;i++)
        {
            a[i]=a[i]+a[i-1];
        }
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}
