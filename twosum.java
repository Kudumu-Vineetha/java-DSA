import java.util.*;
public class twosum{
    public static int[] two(int target,int a[])
    {
        for(int i=0;i<a.length;i++)
            {
                for(int j=i+1;j<a.length;j++)
                {
                    if(a[i]+a[j]==target)
                    {
                        return new int[]{i,j};
                    }
                }
            }
        return new int[]{-1,-1};
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
        System.out.print("Enter target: ");
        int target=sc.nextInt();
        int result[]=two(target,a);
        System.out.print(Arrays.toString(result));
    }
}
