import java.util.*;
public class shuffle{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
	    int n=sc.nextInt();
	    int nums[]=new int[n];
        System.out.print("Enter " + n + " elements:");
        for(int i=0;i<=n;i++){
	        nums[i]=sc.nextInt();
	        } 
        int a[]=new int[2*n];
        for(int i=0;i<=n;i++)
            {
                a[2*i]=nums[i];
                a[2*i+1]=nums[n+i];
            }
        for(int i:a)
        {
            System.out.print(i+" ");
        }
        }
}
