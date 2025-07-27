import java.util.*;
public class pivotindex{
public static int pivot(int a[]){
    int tsum=0;
        for(int i:a)
        {
            tsum+=i;
        }
        int lsum=0;
        for(int i=0;i<a.length;i++)
        {
            if(lsum==tsum-lsum-a[i])
            {
                return i;
            }
            lsum+=a[i];
        }
    return -1;
    
    }
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
        
        System.out.print(pivot(a));
        }

}