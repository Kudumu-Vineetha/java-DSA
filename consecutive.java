import java.util.*;
public class consecutive{
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
        int maxcount=0;
        for(int j:a)
        {
            if(j==1)
            {
                count++;
                if(count>maxcount)
                {
                    maxcount=count;
                }
            }
            else{
                count=0;
            }           
        }
    System.out.print(maxcount);
    }
}
