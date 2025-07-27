import java.util.*;
public class mergeandsort{
public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of first array: ");
	    int n=sc.nextInt();
	    int a[]=new int[n];
        System.out.print("Enter the size of second array: ");
        int m=sc.nextInt();
	    int b[]=new int[m];
        System.out.print("Enter " + n + " elements:");
        for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	        }
        System.out.print("Enter " + m + " elements:");
        for(int i=0;i<m;i++){
	        b[i]=sc.nextInt();
	        }
                a=Arrays.copyOf(a,n+m);
                for(int i=0;i<m;i++)
                    {
                        a[n+i]=b[i];
                    }
            Arrays.sort(a);
            System.out.println("Merge and sort of two arrays:");
            System.out.print(Arrays.toString(a));
        }
}
