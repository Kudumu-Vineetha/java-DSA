import java.util.*;
public class squares{
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
        int res[]=new int[n];
        for(int i=0;i<a.length;i++)
            {
                res[i]=a[i]*a[i];
            }
        Arrays.sort(res);
        System.out.print(Arrays.toString(res));
        }
}
