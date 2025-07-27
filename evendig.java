import java.util.*;
public class evendig{
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
        int count=0;
        int digitcount=0;
        for(int i=0;i<a.length;i++)
        {
                int num=a[i];
                while(num>0)
                {
                    num=num/10;
                    count++;
                }
                if(count%2==0)
                {
                digitcount++;
                }
        }
    System.out.println(digitcount+" ");
    }
}

       