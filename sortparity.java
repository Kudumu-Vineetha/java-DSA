import java.util.*;
public class sortparity{
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
    for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
             System.out.print(a[i]+" ");
            }

        }
    for(int i=0;i<(n/2)+1;i++)
        {
            if(a[i]%2!=0)
            {
             System.out.print(a[i]+" ");
            }

        }
    }
}

