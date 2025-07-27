import java.util.*;
public class smallercurrent{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
	    int n=sc.nextInt();
	    int a[]=new int[n];
        int result[]=new int[n];
        System.out.print("Enter " + n + " elements:");
        for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    } 
    //Arrays.sort(a);
    //int count=0;
    for(int i=0;i<n;i++)
        {
        int count=0;
        for(int j=0;j<n;j++)
        {
            if(a[i]>a[j])
            {
                count++;
            }
          
        }
    result[i]=count;
    }
    System.out.print(Arrays.toString(result));
    }
}
